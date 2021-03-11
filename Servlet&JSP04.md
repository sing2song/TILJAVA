# 모델1

![image-20210311100403949](C:%5CUsers%5C32153256%5CAppData%5CRoaming%5CTypora%5Ctypora-user-images%5Cimage-20210311100403949.png)

Cannot change version of project facet Dynamic Web Module to 2.5.

One or more constraints have not been satisfied.

Cannot change version of project facet Dynamic Web Module to 2.5.



insert /delete 할때는 redirect 처리하고 나서 보여줘야할 화면이 있다면 redirect다!



 <servlet>
    <servlet-name>EmaillistServlet</servlet-name>
    <servlet-class>com.soltlux.emaillist.controller.EmaillistServlet</servlet-class>
  </servlet>

  <servlet-mapping>
    <servlet-name>EmaillistServlet</servlet-name>
    <url-pattern>/el</url-pattern>
  </servlet-mapping>