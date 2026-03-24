# 🛒 Simulação de Lojinha Online - Arquitetura de Software

Este projeto consiste em uma simulação funcional de um sistema de vendas online, desenvolvido para a disciplina de Arquitetura de Software.

---

## Estrutura do Projeto

A aplicação foi construída em Java utilizando o paradigma de Orientação a Objetos. A estrutura reflete um modelo cliente-servidor monolítico, onde a lógica de negócio, gestão de produtos e processamento de pagamentos residem na mesma aplicação servidora.

### Principais Funcionalidades:

- **Identificação Estática:** O sistema inicia com a identificação de um cliente criado de forma estática no código, conforme solicitado.  
- **Navegação e Listagem:** Simula a navegação do usuário pelo catálogo de produtos disponíveis.  
- **Gestão de Carrinho:** Permite a adição e a remoção de itens, refletindo a lógica de gerenciamento de estado antes da compra.  
- **Processamento de Pedido:** Integra os dados do cliente e do carrinho para gerar uma venda com ID, data e valor total.  

---



### 1. Diagrama de Atividades (UML)




### 2. Diagrama Entidade-Relacionamento (DER)


---

## 🛠️ Decisões Arquiteturais e Padrões

### Padrão de Projeto: Singleton

O requisito obrigatório de comunicação com o sistema externo de pagamento foi implementado utilizando o padrão Singleton na classe `SistemaPagamento.java`.

- **Onde foi aplicado:** Na classe responsável pela comunicação com o gateway de pagamento.  
- **Justificativa:** O Singleton garante que exista apenas uma instância dessa classe durante a execução, evitando múltiplas conexões e ajudando a manter o controle das transações.

---

## 🧩 Arquitetura Monolítica e API

A aplicação não possui interface gráfica, funcionando apenas via console. Todas as partes do sistema estão no mesmo projeto, o que facilita a comunicação entre os componentes.

---

## 🏃 Como executar a simulação

1. Tenha o JDK instalado.  
2. Importe os arquivos `.java` na IDE (ex: IntelliJ).  
3. Execute a classe `MAIN.java`.  
4. Veja o fluxo no console (login, carrinho e pagamento).  



