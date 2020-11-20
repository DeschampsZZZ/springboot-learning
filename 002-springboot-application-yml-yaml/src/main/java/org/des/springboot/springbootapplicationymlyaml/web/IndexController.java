package org.des.springboot.springbootapplicationymlyaml.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Des
 * @Description:
 * @Date: Created in 17:02 2020/11/20
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public @ResponseBody Object index() {
        return "Hello SpringBoot Web Project!";
    }
}
