package com.distibution.controller;


import com.distibution.domain.LearnResouce;
import com.distibution.service.LearnService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


/**
 * Created by caokuang on 2017/3/13.
 */
@Controller
@RequestMapping("/learn")
public class LearnController {
    @Autowired
    private LearnService learnService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("")
    public String learn(){
        return "learn-resource";
    }

    @GetMapping(value="/listLearnResoucesForXml",produces= MediaType.APPLICATION_XML_VALUE)
    @ResponseBody
    public  List<LearnResouce>  queryLearnResoucesForXml(){
     return learnService.queryLearnResouces();
    }

    @GetMapping(value="/listLearnResoucesForJson",produces= MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public  List<LearnResouce>  queryLearnResoucesForJson(){
        return learnService.queryLearnResouces();
    }
}