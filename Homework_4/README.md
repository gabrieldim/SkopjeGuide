# Homework 4

- Added Java Docs for every class and method
- Added microservice for searching the database with a provided name parameter
- Added Service layer 
- Added Dockerfile files for containirizing the services

---

## Design Patterns

We are using the MVC design pattern pattern in our backend and in our microservices.


## React App
https://skopjeguidedocker.netlify.app/

The React application is deployed on the Netlify CDN and it communicates with the API deployed on a Docker Container.

--- 

## Spring Boot API Endpoints

The Spring Boot API is deployed on Docker Server behind an NGINX proxy server running on Ubuntu 18.04.

The restaurants microservice in the microservices folder sits behind the same NGINX proxy and is deployed on a Docker container.

The skopjeguidesearch microservice is configured to be deployed on a Docker container.

API Base URL: https://skopjeguide.francecentral.cloudapp.azure.com

API Endpoints:

**GET** /api/attractions

Returns all attractions.

--- 

**GET**  /api/caffes

Returns all caffes.

--- 

**GET**  /api/exchangeOffices

Returns all exchange offices.

--- 

**GET** /api/fountains

Returns all fountains.

--- 

**GET**  /api/hospitals

Returns all hospitals.

--- 

**GET**  /api/hostels

Returns all hostels.

--- 

**GET**  /api/hotels

Returns all hotels.

--- 

**GET** /api/motels

Returns all motels.

--- 

**GET**  /api/parkings

Returns all parking locations.

--- 

**GET**  /api/pubs

Returns all pubs.

--- 

**GET**  /api/restaurants

Returns all restaurants.


