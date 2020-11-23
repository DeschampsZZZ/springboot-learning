package org.des.springboot;

import org.springframework.boot.Banner;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class SpringBoot004 {

    public static void main(String[] args) {
        // SpringApplication.run(SpringBoot004.class, args);
        // 启动颜色格式化
        // 这不是唯一启动颜色格式的方式，有兴趣的同学可以查看源码
        /**
         * 1. AnsiOutput.setEnabled(AnsiOutput.Enabled.ALWAYS);
         * 2. 在`src/main/resources`目录下新建文件`application.properties`,
         *    内容为：`spring.output.ansi.enabled=always`
         *
         * 重要：如果配置第二种方式，第一种方式就不会起作用
         */
        // ${AnsiColor.BRIGHT_RED}：设置控制台中输出内容的颜色，可以自定义，具体参考org.springframework.boot.ansi.AnsiColor
        // ${application.version}：用来获取MANIFEST.MF文件中的版本号，这就是为什么要在Application.java中指定 SpringVersion.class
        // {application.formatted-version}：格式化后的{application.version}版本信息
        // ${spring-boot.version}：Spring Boot的版本号
        // {spring-boot.formatted-version}：格式化后的{spring-boot.version}版本信息
    
        AnsiOutput.setEnabled(AnsiOutput.Enabled.ALWAYS);
        new SpringApplicationBuilder(SpringBoot004.class)//
                .main(SpringVersion.class) // 这个是为了可以加载 Spring 版本
                .bannerMode(Banner.Mode.CONSOLE)// 控制台打印
                .run(args);
    }

}
