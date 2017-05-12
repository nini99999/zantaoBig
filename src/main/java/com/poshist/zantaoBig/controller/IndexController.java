package com.poshist.zantaoBig.controller;

import com.poshist.zantaoBig.entity.Task;
import com.poshist.zantaoBig.service.ProjectService;
import com.poshist.zantaoBig.service.TaskService;
import com.poshist.zantaoBig.vo.ProjectVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by server on 17-5-9.
 */
@Controller("/")
public class IndexController {
    @Autowired
    private TaskService taskService;
@Autowired
private ProjectService projectService;
    @RequestMapping("/")
    public String index(Model model) {
       List<Task> wait=taskService.getWaitTask();

       List<Task> doing=taskService.getDoTask();
       List<Task> done=taskService.getDoneTask();
        model.addAttribute("wait",wait);
        model.addAttribute("doing",doing);
        model.addAttribute("done",done);
        List<ProjectVO> projects=projectService.getProjectProgress();
        model.addAttribute("projects",projects);
       return "/index";
    }
}
