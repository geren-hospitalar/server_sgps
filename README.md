# Api Restful server-sgps

**Prerequisito:** 
* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

## Getting Started

Para instalar o exemplo, executar os seguintes comandos:

```bash
git clone https://github.com/juliocesarprieto/server-restful.git
cd server-restful
```

Isto vai fazer uma copia do projeto localmente. Para instalar e executar as aplicações, seguir as seguintes instruções:

Para executar o server, execute o comando `cd serverSgps` no `prompt` pra ficar dentro da pasta `serverSgps`` e executar o seguinte comando: 
 
```bash
mvnw spring-boot:run
```

Para configurar a conexão com o Banco de Dados abrir o arquivo application.properties dentro server/src/main/resources/application.properties

```properties
spring.datasource.driverClassName=com.mysql.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/sgps
spring.datasource.username=root
spring.datasource.password=
```

Para ver o api-doc Restful:


* [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)