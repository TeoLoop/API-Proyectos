# Usa una imagen base de OpenJDK
FROM openjdk:17-jdk-slim

# Establece el directorio de trabajo en el contenedor
WORKDIR /app

# Copia todos los archivos del proyecto al contenedor
COPY . /app

# Da permisos de ejecución al archivo mvnw
RUN chmod +x ./mvnw

# Ejecuta el comando para construir el proyecto usando Maven
RUN ./mvnw clean install

# Expone el puerto en el que correrá tu aplicación (ajusta si es necesario)
EXPOSE 8080

# Ejecuta el comando para iniciar la aplicación Java
CMD ["java", "-jar", "target/your-app.jar"]
