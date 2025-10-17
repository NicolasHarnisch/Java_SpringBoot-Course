## 📂 Estrutura do Projeto

A organização das pastas segue o padrão do Spring Boot para garantir que o *Component Scan* funcione corretamente e o servidor encontre todas as classes anotadas.

Os arquivos principais para a funcionalidade de usuário, como o `UserController` e o `UserModel`, estão localizados no seguinte caminho:

```
todolist
└── src
    └── main
        └── java
            └── br
                └── com
                    └── nicolas
                        └── todolist
                            ├── user/
                            │   ├── UserController.java   <-- ✅ Controla as rotas relacionadas a usuários
                            │   └── UserModel.java        <-- 🧩 Define a estrutura do modelo de usuário
                            └── TodolistApplication.java  <-- 🚀 Classe principal que inicia o servidor
```

Qualquer nova funcionalidade relacionada a usuários deve ser criada dentro do pacote `user` para manter a organização e o escopo do projeto.
