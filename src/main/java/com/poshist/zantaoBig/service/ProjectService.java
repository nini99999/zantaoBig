package com.poshist.zantaoBig.service;

import com.poshist.zantaoBig.entity.Project;
import com.poshist.zantaoBig.repository.ProjectDao;
import com.poshist.zantaoBig.repository.TaskDao;
import com.poshist.zantaoBig.utils.ColorUtils;
import com.poshist.zantaoBig.vo.ProjectVO;
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
public class ProjectService {
    @Autowired
    private ProjectDao projectDao;
    @Autowired
    private TaskDao taskDao;

    /**
     * 获取项目进度
     * @return
     */
    public List<ProjectVO> getProjectProgress(){
         List<Project> list=projectDao.findAllByDeleted("0");
         List<ProjectVO> vos=new ArrayList<ProjectVO>();
         long i=0;
         for(Project project:list){
             ProjectVO vo=new ProjectVO();
             vo.setName(project.getName());


             vo.setWaitSum(taskDao.countByStatusAndDeletedAndProject("wait","0",project));
             vo.setDoingSum(taskDao.countByStatusAndDeletedAndProject("doing","0",project));
             vo.setDoneSum(taskDao.countByStatusAndDeletedAndProject("done","0",project));
             vo.setCancelSum(taskDao.countByStatusAndDeletedAndProject("cancel","0",project));
             vo.setClosedSum(taskDao.countByStatusAndDeletedAndProject("closed","0",project));
             vo.setColor(ColorUtils.getprogressColor(i));
             i++;
             vos.add(vo);
         }
         return vos;
    }
}
