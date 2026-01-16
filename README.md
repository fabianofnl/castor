# Sistema de Restaurante
README Técnico – Spring Boot

### Stack
- Java 17
- Spring Boot 3.2.x
- Flyway
- JPA / Hibernate
- Thymeleaf

---

## Requisitos de Ambiente

### Java
- Java 17

> O projeto foi desenvolvido utilizando recursos compatíveis com Java 11+, sendo Java 17 a versão recomendada para novos desenvolvimentos.

---

### Banco de Dados

- PostgreSQL — ambiente de estudo com banco externo

A escolha do banco pode ser alterada via configuração no `application.yml` ou `application.properties`.

---

## Principais Dependências

As principais dependências utilizadas no projeto são:

- Spring Boot Starter Web
- Spring Boot Starter Thymeleaf
- Spring Boot Starter Rest Client
- Spring Boot Starter Data JPA
- Banco de dados ( PostgreSQL )
- Driver JDBC ( PostgreSQL )

Gerenciamento de dependências realizado via **Spring Boot Starter Parent**.

---

## Gerenciamento de Build

- Maven
- `pom.xml` como arquivo central de configuração

---

## Compilação do Projeto

Para compilar o projeto:

```bash
cd castor (raiz do projeto)

mvn clean install -DskipTests

o uso de -DskipTests serve para pular os testes
```

Executar o projeto:

```bash
cd castor-web (acessar o modulo web)

mvn spring-boot:run
```

Executar o projeto após implantado:

```bash
java -jar target/castor-web-0.0.1.jar
```

Inicializar o Spring Boot em modo debug

```bash
MAVEN_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005" \
mvn spring-boot:run
```

## Acessar páginas

- Exemplo de acesso com parametro de pesquisa
- Sem parametro faz uma busca de todos os dados

```bash
http://localhost:8080/page?name=Maria
http://localhost:8080/page
```

- Exemplo de acesso a página de estilos Bootstrap

```bash
http://localhost:8080/style
```
