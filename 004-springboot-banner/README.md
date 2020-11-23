# 004-springboot-banner

在resources文件夹放banner.txt

　　
这里有几个定制banner的网站，文字、图片都可以秀起来，怎么秀就看你的骚操作了

　　http://patorjk.com/software/taag

　　http://www.network-science.de/ascii/

　　http://www.degraeve.com/img2txt.php

　　　banner.txt配置
  
  　　${AnsiColor.BRIGHT_RED}：设置控制台中输出内容的颜色
  
  　　${application.version}：用来获取MANIFEST.MF文件中的版本号
  
  　　${application.formatted-version}：格式化后的${application.version}版本信息
  
  　　${spring-boot.version}：Spring Boot的版本号
  
  　　${spring-boot.formatted-version}：格式化后的${spring-boot.version}版本信息
  
   
