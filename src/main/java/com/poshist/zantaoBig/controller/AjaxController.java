package com.poshist.zantaoBig.controller;

import com.poshist.zantaoBig.service.ProjectService;
import com.poshist.zantaoBig.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by poshist on 17-5-23.
 */
@Controller("/ajax/")
public class AjaxController {
    @Autowired
    private TaskService taskService;
    @Autowired
    private ProjectService projectService;
//    @RequestMapping("/")
//    public String index() {
//
//        return "/indexAjax";
//    }
}
