package com.remote.controller;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    @PostMapping(value="/getXmlMsg")
    public String restXmlTemplate() {
        try {
            String url = "http://localhost:8080/learn/listLearnResoucesForXml";
            ResponseEntity<String> forEntity = restTemplate.getForEntity(url, String.class);
            //获取3方接口返回的数据通过entity.getBody();它返回的是一个字符串；
            System.err.println(forEntity);
            return forEntity.toString();
        } catch (Exception e) {
            return "Fail";
        }

    }
}