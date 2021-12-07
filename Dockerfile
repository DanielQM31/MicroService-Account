FROM openjdk:11
COPY "./target/account-0.0.1-SNAPSHOT.jar" "account-0.0.1-SNAPSHOT.jar"
EXPOSE 8012
ENTRYPOINT ["java","-jar","account-0.0.1-SNAPSHOT.jar"]