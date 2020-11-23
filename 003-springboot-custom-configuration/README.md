# 003-springboot-custom-configuration

### @value注解

　第一种方式@Value("${}"):在使用Springboot项目搭建的项目时，
配置文件application.properties中已经被加载到了项目中,
在项目中可以通过该注解获取配置文件中的信息

　第二种方式@Value("#{}"):两种的注解区别在值上的区别为：
　　　　@Value的值有两类：

　　　　① ${ property : default_value }

　　　　② #{ obj.property? :default_value }

第一个注入的是外部配置文件对应的property，
第二个则是SpEL表达式对应的内容。
那个default_value，就是前面的值为空时的默认值。
注意二者的不同，#{}里面那个obj代表对象。

### @ConfigurationProperties注解

为每个要捕获的外部属性提供一个带有字段的类。请注意以下几点:

* 前缀定义了哪些外部属性将绑定到类的字段上
* 根据 Spring Boot 宽松的绑定规则，类的属性名称必须与外部属性的名称匹配
* 我们可以简单地用一个值初始化一个字段来定义一个默认值
* 类本身可以是包私有的
* 类的字段必须有公共 setter 方法


    解决使用@ConfigurationProperties 注解出现警告的问题
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-configuration-processor</artifactId>
      <optional>true</optional>
    </dependency>
