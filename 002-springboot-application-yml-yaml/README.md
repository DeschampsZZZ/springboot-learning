# 002-springboot-application-yml-yaml
 
 ### 配置文件application
 
application.properties
 
application.yml 

application.yaml

一般只有一个，若多个，以application.properties为准

 ### 工程多环境

子环境核心配置文件的名称是以：application-xxx.properties
主核心配置文件只能有一个：application properties
在核心配置文件指定一个配置文件生效，通过spring.profiles.active=xxx名称


application-dev.properties
开发环境
 
application-test.properties 
测试环境
 
application-ready.properties
准生产环境
 
application-product.properties
生产环境
