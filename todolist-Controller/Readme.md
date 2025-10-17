# Projeto Todolist em Java com Spring Boot

Este é um projeto de API para um gerenciador de tarefas (To-do List), desenvolvido como parte dos meus estudos em Java e Spring Boot. O objetivo é criar um backend robusto para gerenciar tarefas, usuários e outras funcionalidades.

## ✨ Tecnologias Utilizadas

* **Java**: Linguagem principal do projeto.
* **Spring Boot**: Framework para criação de APIs de forma rápida e robusta.
* **Maven**: Gerenciador de dependências e build do projeto.

## 📂 Estrutura do Projeto

A organização das pastas segue o padrão do Spring Boot para garantir que o *Component Scan* funcione corretamente e o servidor encontre todas as classes anotadas.

A principal classe de controle da API, `MinhaPrimeiraController.java`, onde as rotas (endpoints) são definidas, está localizada no seguinte caminho:

```
todolist
└── src
    └── main
        └── java
            └── br
                └── com
                    └── nicolas
                        └── todolist
                            ├── controller/
                            │   └── MinhaPrimeiraController.java  <-- ✅ As rotas da API estão aqui
                            └── TodolistApplication.java          <-- 🚀 Classe principal que inicia o servidor
```

Qualquer novo Controller deve ser criado dentro do pacote `controller` (ou em um sub-pacote de `br.com.nicolas.todolist`) para que o Spring Boot o encontre automaticamente.
