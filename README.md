# 🚗 Estoque de Carros - CRUD Java com MySQL

Este projeto é um sistema simples de gerenciamento de estoque de carros. Ele permite **Cadastrar, Listar, Atualizar e Deletar** veículos de um banco de dados MySQL, utilizando Java e Maven.

## 🛠️ Tecnologias Utilizadas

- Java 17+
- MySQL 8+
- JDBC (via `mysql-connector-java`)
- Maven
- IntelliJ IDEA (recomendado)

## 📁 Estrutura do Projeto

```
estoqueCarrosCRUD_Maven/
├── pom.xml
├── README.md
└── src/
    └── main/
        └── java/
            ├── Carro.java
            ├── CarroDAO.java
            ├── Conexao.java
            ├── Main.java
            └── TesteConexao.java
```

## ⚙️ Configuração do Banco de Dados

```sql
CREATE DATABASE estoqueCarrosDB;

USE estoqueCarrosDB;

CREATE TABLE estoqueCarros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    marca VARCHAR(100) NOT NULL,
    ano INT NOT NULL,
    preco DECIMAL(10,2) NOT NULL
);
```

## 🔌 Configurando a Conexão

No arquivo `Conexao.java`, a senha usada para conectar ao MySQL é:

```java
private static final String PASSWORD = "5062";
```

## ▶️ Executando o Projeto

1. Abra o projeto no IntelliJ IDEA como um projeto Maven.
2. Aguarde o IntelliJ importar as dependências do `pom.xml`.
3. Execute a classe `TesteConexao.java` para validar a conexão com o banco.
4. Execute `Main.java` para realizar operações de CRUD.
5. Verifique a saída no console para confirmar as ações realizadas.

## 📝 Funcionalidades

- Inserção de novos carros
- Listagem de todos os carros
- Atualização de dados de um carro
- Exclusão de carro por ID

## 🤝 Contribuições

Fique à vontade para fazer fork, abrir issues ou pull requests!

## 📄 Licença

Este projeto está sob a licença MIT.
