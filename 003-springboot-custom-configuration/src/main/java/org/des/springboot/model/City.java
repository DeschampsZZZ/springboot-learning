package org.des.springboot.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author: Des
 * @Description:
 * @Date: Created in 16:53 2020/11/23
 */
@Component // 将此类加载到spring容器里
@ConfigurationProperties(prefix = "city")
public class City {
    
    private String name;
    private String website;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getWebsite() {
        return website;
    }
    
    public void setWebsite(String website) {
        this.website = website;
    }
}
