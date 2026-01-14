# Sistema de Restaurante
README Técnico – Spring Boot

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
mvn clean package ( ou clean install )

use no final -DskipTests para pular os testes se necessário
```

Executar o projeto:

```bash
mvn spring-boot:run
```

Executar o projeto após implantado:

```bash
java -jar target/restaurante-0.0.1-SNAPSHOT.jar
```

Acessar o sistema no navegador:

```bash
http://localhost:8080
```

## Acessar páginas

Exemplo de acesso com parametro

```bash
http://localhost:8080/page?name=QualquerValor
```

Exemplo de acesso a página de estilos Bootstrap

```bash
http://localhost:8080/style
```
