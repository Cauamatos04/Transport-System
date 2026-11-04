# 📦 Sistema de Gestão de Itens

Este projeto prático foi desenvolvido como atividade avaliativa para a disciplina de **Programação Orientada a Objetos (POO)**, sob a orientação da **Professora Samara Sonale**, no curso de **Sistemas de Informação** da **Unifacisa**.

## 🎯 O que é o projeto?

O sistema simula um modelo de gestão de produtos (itens) logísticos e comerciais. O objetivo principal é automatizar regras de negócios distintas — como cálculos fiscais e protocolos de segurança física — com base na categoria específica de cada produto gerenciado pelo sistema.

O projeto serve como um laboratório prático para demonstrar como o desenvolvimento de software pode mapear cenários do mundo real utilizando as melhores práticas da engenharia de software orientada a objetos.

---

## 🏗️ Estrutura e Arquitetura do Sistema

O projeto foi dividido em pacotes organizados para separar as definições de comportamento das representações dos objetos de negócio:

*   **Pacote de Interfaces (`interfaces`):** Funciona como o livro de regras e contratos do sistema. Ele isola comportamentos específicos que não pertencem a todos os itens. Aqui estão definidas as regras de cobrança de taxas e os critérios de gerenciamento de risco para cargas que oferecem perigo.
*   **Pacote de Modelos (`model`):** Contém a estrutura dos objetos de dados. Ele define o molde genérico de um produto e suas variações especializadas, como produtos literários, eletrônicos e materiais combustíveis.

---

## 🚀 Conceitos de POO Aplicados e Avaliados

A arquitetura do código foi projetada para aplicar rigorosamente os pilares da Programação Orientada a Objetos:

*   **Abstração:** Uma classe base abstrata foi criada para representar o conceito geral de um produto. Ela impede que o sistema crie um item genérico "fantasma", forçando que todo produto cadastrado pertença a uma categoria real e específica.
*   **Herança:** As categorias específicas de produtos herdam as características básicas (como nome, peso e valor monetário) da classe mãe. Isso evita a repetição desnecessária de código e garante padronização.
*   **Polimorfismo:** Permite que o sistema trate diferentes produtos de maneira uniforme, embora cada um execute suas tarefas de forma personalizada. Por exemplo, o comando para calcular taxas reage de forma completamente diferente se o item for um livro (isento) ou um eletrônico (taxado).
*   **Interfaces (Contratos):** Utilizadas para acoplar comportamentos opcionais aos produtos. Nem todo item é taxável e nem todo item é perigoso; as interfaces permitem que apenas as classes relevantes assinem e cumpram essas obrigações legais e de segurança.
*   **Encapsulamento:** Os atributos internos dos objetos são protegidos e controlados, permitindo que apenas as classes autorizadas e suas extensões herdeiras manipulem os dados diretamente, garantindo a integridade das informações.

---

## 🎓 Contexto Acadêmico

*   **Instituição:** Centro Universitário Unifacisa
*   **Curso:** Bacharelado em Sistemas de Informação
*   **Disciplina:** Programação Orientada a Objetos (POO)
*   **Docente:** Profa. Samara Sonale
