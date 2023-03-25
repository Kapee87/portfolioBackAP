FROM amazoncorretto:17-alpine-jdk
MAINTAINER Kapeeh
COPY target/namontaner-0.0.1-SNAPSHOT.jar portfolio-ap.kapeeh.jar
ENTRYPOINT ["java","-jar","/portfolio-ap.kapeeh.jar"]