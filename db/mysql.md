1 解析的字符串太长使用 javac的方式无法正常的解析，需要将编译的方式改为eclipse  但是在链接数据库的时候报错    
eclipse 报错java.lang.ClassNotFoundException: com.mysql.jdbc.Drive...

其实就是对接的MySQL的版本的问题

<dependency>
  <groupId>mysql</groupId>
  <artifactId>mysql-connector-java</artifactId>
  <version>5.1.18</version>
</dependency>
