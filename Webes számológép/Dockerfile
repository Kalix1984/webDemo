FROM arm32v7/tomcat:9.0.37-jdk11-adoptopenjdk-hotspot
RUN rm -rf /usr/local/tomcat/webapps/*
COPY ./webapp.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
EXPOSE 8443
CMD ["catalina.sh", "run"]
