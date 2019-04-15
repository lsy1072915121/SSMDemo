package com.blog.web.controller;


import com.blog.common.Result;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/blog/api")
public class MainController {

    private Logger logger = Logger.getLogger ( MainController.class );
    @RequestMapping ( value = "/check", method = RequestMethod.POST )
    @ResponseBody
    @CrossOrigin
    public Result check () {
        logger.info("MainController run");
        Result result = new Result();
        result.setMessage("SSM vue前后端框架搭建成功");
        return result;
    }

}
