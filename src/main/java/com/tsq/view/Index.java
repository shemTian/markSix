package com.tsq.view;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by tsq on 2:15.
 * VERSION 1.0.0
 */
@Controller
public class Index {
    @GetMapping({"/","index","index.ftl","index.htm"})
    public String index() {
        return "index";
    }
}
