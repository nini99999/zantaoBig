package com.poshist.zantaoBig.service;

import com.poshist.zantaoBig.entity.Task;
import com.poshist.zantaoBig.repository.TaskDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by server on 17-5-12.
 */
@Service
@Transactional
public class TaskService {
    @Autowired
    private TaskDao taskDao;

    /**
     * 获取等待的task
     * @return
     */

    public List<Task> getWaitTask(){
        List<Task> list= taskDao.findByStatusAndDeletedOrderByLastediteddateDescOpeneddateDesc("wait","0");
        return removeDoneProject(list);

    }

    /**
     * 获取进行的Task
     * @return
     */
    public List<Task> getDoTask(){
        List<Task> list= taskDao.findByStatusAndDeletedOrderByLastediteddateDescOpeneddateDesc("doing","0");
        return  removeDoneProject(list);

    }
    /**
     * 获取已完成的Task
     * @return
     */
    public List<Task> getDoneTask(){
        List<Task> list= taskDao.findByStatusAndDeletedOrderByLastediteddateDescOpeneddateDesc("done","0");
        return removeDoneProject(list);

    }

    /**
     * 清除非进行中项目的任务
     * @param list
     */
    private List<Task> removeDoneProject (List<Task> list) {
        List<Task> newList=new ArrayList<Task>();
        if (null != list) {
            for (Task task : list) {
                if ("doing".equals(task.getProject().getStatus())) {
                    newList.add(task);
                }
            }
        }
        return newList;
    }
}
