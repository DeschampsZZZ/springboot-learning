package org.des.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Des
 * @Description:
 * @Date: Created in 20:12 2020/11/23
 */
@Controller
public class IndexController {
    
    @RequestMapping(value = "/index")
    public String index(Model model) {
        model.addAttribute("data", "SpringBoot框架集成Jsp页面");
        return "index";
    }
}
