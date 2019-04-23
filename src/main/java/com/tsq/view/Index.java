package com.tsq.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by tsq on 2:15.
 * VERSION 1.0.0
 */
@Controller
public class Index {

    @Autowired
    Environment environment;
    @GetMapping({"/","index","index.ftl","index.htm"})
    @ResponseBody
    public String index() {
        String property = environment.getProperty("server.port");
        return property;
    }
}
