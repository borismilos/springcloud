FROM fabric8/java-alpine-openjdk8-jdk
ENV JAVA_APP_JAR springcloud-1.0.jar
ENV AB_OFF true
ADD target/springcloud-1.0.jar /deployments/