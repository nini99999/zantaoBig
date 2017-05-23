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
 * Created by poshist on 17-5-23.
 */
@Controller("/ajax/")
public class AjaxController {
    @Autowired
    private TaskService taskService;
    @Autowired
    private ProjectService projectService;
    @RequestMapping("/")
    public String index() {

        return "/indexAjax";
    }
}
