# Use the official OpenJDK 21 image as the base image
FROM openjdk:21-jdk

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml file and the source code to the container
COPY pom.xml .
COPY src ./src

# Run Maven to build the project
RUN ./mvnw clean package -DskipTests

# Expose the port the application runs on
EXPOSE 8080

# Specify the command to run the Spring Boot application
CMD ["java", "-jar", "target/user-service-0.0.1-SNAPSHOT.jar"]