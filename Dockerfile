FROM maven:3.8-eclipse-temurin-19

# Set the working directory inside the container
WORKDIR /DockerDemoProject

# Copy the Maven project files into the container
COPY pom.xml .
COPY src ./src

# Build the Maven project
RUN mvn clean install -DskipTests

# Expose any necessary ports
EXPOSE 8082

#docker exec -it dockerdemoproject-mysqldb-1  mysql -u root -p to check the db from the command prompt

# Specify the command to run on container startup
CMD ["java", "-jar", "target/DockerDemoProject-0.0.1-SNAPSHOT.jar"]