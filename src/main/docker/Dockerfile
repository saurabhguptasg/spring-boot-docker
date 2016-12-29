FROM java:8
VOLUME /tmp
ADD spring-docker-0.0.1-SNAPSHOT.jar /app.jar
# RUN ["sh", "-c", "'touch /app.jar'"]
EXPOSE 8080
ENV JAVA_OPTS=""
# ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
