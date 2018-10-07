FROM store/oracle/serverjre:8
MAINTAINER kenneth.cootauco2@loblaw.ca
RUN mkdir /opt/spring
COPY spring.testing-0.0.1-SNAPSHOT.jar /opt/spring
ENTRYPOINT ["/usr/bin/java"]
CMD ["-jar", "/opt/spring/spring.testing-0.0.1-SNAPSHOT.jar"]
EXPOSE 8090
