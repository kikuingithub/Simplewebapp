FROM tomcat:8.5.34-jre8-alpine

ADD target/SimpleWebApp1.war /usr/local/tomcat/webapps/SimpleWebApp1.war

EXPOSE 8080
