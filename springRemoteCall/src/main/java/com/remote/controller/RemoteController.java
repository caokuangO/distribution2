package com.remote.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * Created by caokuang on 2017/3/13.
 */
@Controller
@RequestMapping("/rest")
public class RemoteController {
    @Autowired
    private RestTemplate restTemplate;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    /**
     * 调用者
     *
     * @return
     */
    @ResponseBody
    @GetMapping(value="/getMsg/{returnFormat}")
    public String restXmlTemplate(@PathVariable("returnFormat") String returnFormat) {
        try {
            String url ="";
            if(returnFormat.equals("format1")) {
                url = "http://localhost:8080/learn/listLearnResoucesForXml";
            }else{
                url = "http://localhost:8080/learn/listLearnResoucesForJson";
            }
            ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
            //获取3方接口返回的数据通过entity.getBody();它返回的是一个字符串；
            logger.info("remoteContent:"+forEntity);
            return forEntity.toString();
        } catch (Exception e) {
            return "Fail";
        }

    }
}