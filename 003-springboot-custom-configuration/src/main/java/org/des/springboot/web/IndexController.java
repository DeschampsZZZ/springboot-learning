package org.des.springboot.web;

import org.des.springboot.model.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: Des
 * @Description:
 * @Date: Created in 16:29 2020/11/23
 */
@Controller
public class IndexController {
    
    @Value("${school.name}")
    private String schoolName;
    
    @Value("${website}")
    private String website;
    
    @Autowired
    private City city;
    
    @RequestMapping(value = "/index")
    public @ResponseBody
    Object index() {
        
        return "schoolName=" + schoolName + ",website=" + website;
    }
    @RequestMapping(value = "/city")
    public @ResponseBody
    Object city() {
        
        return "cityName=" + city.getName() + ",city.website=" + city.getWebsite();
    }
}
