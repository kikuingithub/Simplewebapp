FROM tomcat:8.5.34-jre8-alpine

ADD target/SimpleWebApp.war /usr/local/tomcat/webapps/SimpleWebApp.war

EXPOSE 8080
