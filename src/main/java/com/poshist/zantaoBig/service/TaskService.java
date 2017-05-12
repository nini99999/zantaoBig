package com.poshist.zantaoBig.service;

import com.poshist.zantaoBig.entity.Task;
import com.poshist.zantaoBig.repository.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by server on 17-5-12.
 */
@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskDao taskDao;
    /*
      获取等待的task
     */
    public List<Task> getWaitTask(){
      return taskDao.findByStatusAndDeleted("wait","0");
    }
}
