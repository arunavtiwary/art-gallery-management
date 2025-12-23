Art Gallery Management System
(Arunav Tiwary , 12302361)

## Overview
The **Art Gallery Management System** is a Spring Boot–based RESTful application developed to manage the core operations of an art gallery, including artists, artworks, artwork details, and exhibitions.  
The project demonstrates the use of **REST APIs, Spring Data JPA, Hibernate ORM, and proper entity relationships** to model real-world scenarios.
It follows a clean layered architecture and supports environment-based configuration using Spring Profiles.

## Key Objectives
- Implement full CRUD operations using REST APIs  
- Model real-world relationships using JPA annotations  
- Write custom and derived queries involving entity relationships  
- Configure multiple environments using Spring Profiles  
- Monitor application health using Spring Boot Actuator  

## Technologies & Tools
- **Java**
- **Spring Boot**
- **Spring Data JPA (Hibernate)**
- **RESTful Web Services**
- **Maven**
- **H2 Database** (Development)
- **MySQL Database** (Production)
- **Spring Boot Actuator**
- **Lombok**
- **Postman** (API testing)

## Project Architecture
src/main/java
└── com.artgallery.art_gallery
├── controller // REST Controllers
├── service // Business Logic
├── repository // Data Access Layer
├── entity // JPA Entities
└── enumtype // Enums

## Domain Model & Relationships
- **Artist → Artwork**  
  *One artist can create multiple artworks* (OneToMany / ManyToOne)
- **Artwork ↔ ArtworkDetail**  
  *Each artwork has a single detailed record* (OneToOne)
- **Exhibition ↔ Artwork**  
  *An exhibition can display multiple artworks and an artwork can appear in multiple exhibitions* (ManyToMany)

## Core Features
- Full CRUD operations for all entities  
- More than **10 custom queries** using derived methods and JPQL  
- Relationship-based data retrieval  
- Environment-specific configuration:
  - `dev` profile → H2 in-memory database  
  - `prod` profile → MySQL database  
- Application monitoring using Spring Boot Actuator  
- Clean, maintainable code structure

## Supported Queries (Examples)
- Fetch artworks by artist  
- Fetch artworks by medium or status  
- Count artworks per artist  
- Find artworks with the highest price  
- Find the most exhibited artworks  
- Retrieve upcoming exhibitions  
- Fetch exhibitions within a date range  
