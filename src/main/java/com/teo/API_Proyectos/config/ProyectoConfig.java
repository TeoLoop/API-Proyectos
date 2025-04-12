package com.teo.API_Proyectos.config;


import com.teo.API_Proyectos.model.Project;
import com.teo.API_Proyectos.repository.ProjectRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ProyectoConfig {

    @Bean
    CommandLineRunner commandLineRunner(ProjectRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                Project p1 = new Project(
                        null,
                        "Chat en tiempo real con React",
                        "Aplicación de mensajería instantánea usando React, WebSockets y Node.js.",
                        "React, Node.js, Socket.IO",
                        "https://github.com/TeoLoop/ChatGo-React",
                        List.of("/chat-react.png")
                );

                Project p2 = new Project(
                        null,
                        "To Do List con React",
                        "Gestor de tareas simple e intuitivo para organizar tu día.",
                        "React, CSS",
                        "https://github.com/TeoLoop/ToDo-List-React",
                        List.of("/todo-list.png")
                );

                Project p3 = new Project(
                        null,
                        "Carrito de compras con React",
                        "Simulación de un e-commerce con funcionalidad de carrito y filtros.",
                        "React, Context API",
                        "https://github.com/TeoLoop/ShoppingCart-React",
                        List.of("/carrito.png")
                );

                Project p4 = new Project(
                        null,
                        "Chat en tiempo real con Angular",
                        "Aplicación de chat desarrollada con Angular y backend con WebSockets.",
                        "Angular, Node.js, Socket.IO",
                        "https://github.com/TeoLoop/ChatGo",
                        List.of("/chat-angular.png")
                );

                Project p5 = new Project(
                        null,
                        "App de clima con React",
                        "Consulta del clima en tiempo real usando APIs externas.",
                        "React, API REST, CSS",
                        "https://github.com/TeoLoop/ClimaApp-React",
                        List.of("/clima.png")
                );

                Project p6 = new Project(
                        null,
                        "App de películas con React",
                        "Explorador de películas consumiendo la API de TheMovieDB.",
                        "React, Axios, TheMovieDB",
                        "https://github.com/TeoLoop/AppPeliculas-react",
                        List.of("/peliculas.png")
                );

                Project p7 = new Project(
                        null,
                        "Landing Page HTML y CSS",
                        "Página de presentación simple, estática y responsive.",
                        "HTML, CSS",
                        "https://github.com/TeoLoop/Manage-Website",
                        List.of("/landing.png")
                );

                Project p8 = new Project(
                        null,
                        "Portafolio Personal",
                        "Portafolio web desarrollado con React y Java Spring Boot, donde presento mis proyectos como desarrollador FullStack. Incluye integración con una API propia, diseño moderno y enfoque responsive.",
                        "React, Java, Spring Boot, CSS, HTML, H2",
                        "https://github.com/TeoLoop/PortfolioMateoLopez",
                        List.of("/portafolio.png")
                );

                repository.saveAll(List.of(p1, p2, p3, p4, p5, p6, p7));
            }

        };
    }
}
