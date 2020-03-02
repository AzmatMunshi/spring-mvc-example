FROM maven:3.5-jdk-8 as BUILD
COPY src /usr/src/spring-mvc-example/src/main
COPY pom.xml /usr/src/spring-mvc-example
RUN mvn -f /usr/src/spring-mvc-example/pom.xml clean package


FROM jboss/wildfly
COPY --from=BUILD /usr/src/spring-mvc-example/target/spring-mvc-example.war /opt/jboss/wildfly/standalone/deployments/spring-mvc-example.war


