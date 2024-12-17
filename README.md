version: '3.8'

services:
  eureka-server:
    build: ./eureka-server
    ports:
      - "8761:8761"
    networks:
      - app-network

  api-gateway:
    build: ./api-gateway
    ports:
      - "8080:8080"
    environment:
      - EUREKA_SERVER=http://eureka-server:8761/eureka/
    depends_on:
      - eureka-server
    networks:
      - app-network

  doctor-service:
    build: ./doctor-service
    ports:
      - "8081:8081"
    environment:
      - EUREKA_SERVER=http://eureka-server:8761/eureka/
    depends_on:
      - eureka-server
    networks:
      - app-network

networks:
  app-network:
    driver: bridge
