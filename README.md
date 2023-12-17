# Projeto Final INFNET - Arquitetura de Microsserviços Java [23E4_3]
## - MS-RESTAURANTE
### author: Luiz Fernando de Oliveira Braz Silva

Este é um projeto Spring Boot que utiliza várias funcionalidades-chave para criar uma aplicação robusta e bem monitorada.
Esse é um dos microserviços, ms-restaurante, que tem como principal validar se o restaurante existe no seu banco de dados 
atraves no nome, sendo assim possivel realizar a reserva no ms-reversa.



## Características

- **Java Versão**: 17
- **Spring Boot Versão**: 3.1.6
- **Gerenciador de Dependências**: Maven

## Funcionalidades Implementadas

### Actuator

O projeto está configurado para usar o Spring Boot Actuator, que fornece recursos prontos para uso para monitorar a saúde e métricas da aplicação.

### Circuit Breaker com Resilience4J

Para garantir a resiliência da aplicação, implementamos o padrão Circuit Breaker utilizando a biblioteca Resilience4J. Isso ajuda a aplicação a lidar com falhas temporárias de maneira elegante.

### Swagger UI

A documentação da API RESTful está disponível através do Swagger UI. Para acessar a documentação, visite:

http://localhost:8081/swagger-ui/index.html#/

![Swagger](/imagens/swagger.png)

## Instruções para Execução

Para executar o projeto, siga os passos abaixo:

1. Clone o repositório para sua máquina local.
2. Navegue até a pasta do projeto.
3. Execute o comando `mvn spring-boot:run` para iniciar a aplicação.

Após iniciar a aplicação, você pode acessar as funcionalidades descritas acima através dos seus respectivos endpoints.

---

