# Sistema de Vendas em Java — Programação II

Projeto desenvolvido como atividade prática da disciplina **Programação II**, com foco na aplicação de **Programação Orientada a Objetos (POO)**, em especial os conceitos de **herança** e **polimorfismo**.

## 📚 Objetivo

Implementar um sistema de vendas simples, via console, que permita:

- Cadastro de produtos eletrônicos e alimentícios.
- Listagem e consulta de produtos.
- Realização e listagem de vendas.

O sistema faz uso de classes, herança, sobrescrita de métodos, construtores com sobrecarga e arrays para armazenamento de dados.

---

## 🛠️ Funcionalidades

- ✅ Cadastrar até 10 produtos (eletrônicos ou alimentícios)
- ✅ Listar todos os produtos cadastrados
- ✅ Consultar produtos por nome
- ✅ Realizar até 10 vendas (com produto e quantidade)
- ✅ Listar todas as vendas realizadas
- ✅ Exibir as informações formatadas via `toString()` com polimorfismo

---

## 🧱 Estrutura do Projeto

O sistema utiliza exatamente **5 classes**, conforme exigido na atividade:

- `Produto` (classe base)
- `ProdutoEletronico` (herda de Produto)
- `ProdutoAlimenticio` (herda de Produto)
- `Venda`
- `SistemaVendas` (classe principal com `main`)

---

## 🧠 Conceitos Aplicados

- ✅ Classes e objetos  
- ✅ Getters e setters  
- ✅ Arrays (vetores)  
- ✅ Construtores (com e sem parâmetros – sobrecarga)  
- ✅ Herança  
- ✅ Sobrescrita de métodos (`toString`)  
- ✅ Polimorfismo por sobrescrita  

---

## Considerações finais
De acordo com o objetivo proposto, o código embora possua funcionalidades totalmente usuais e coesas, ainda utiliza uma forma estática (vetor) e com isso o software fica extremamente limitado para o uso pragmático do qual se propõe a funcionar. Deixando claro que foi feito o que foi pedido!
