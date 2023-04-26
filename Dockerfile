# Dockerfile for Spring Boot API
# Use an official Java runtime as a parent image
FROM adoptopenjdk:17-jdk-hotspot 
# Set the working directory to /app
WORKDIR /portfolioBackend
# Copy the current directory contents into the container at /app
COPY . /portfolioBackend
# Expose port 8080 to the host
EXPOSE 8080 
# Run the application when the container launches
CMD ["java", "-jar", "/portfolioBackend-0.0.1-SNAPSHOT.jar"]