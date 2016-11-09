package com.xy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xyduan on 11/7/16.
 */
@Controller
public class HomeContorller {
    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
