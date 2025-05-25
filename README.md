# 💳 Agência Bancária em Java

Este projeto simula uma **agência bancária em terminal**, desenvolvida em **Java puro**, com funcionalidades essenciais como criação de contas, depósitos, saques, transferências e listagem de contas cadastradas. A aplicação é executada no console e tem como objetivo reforçar o aprendizado de programação orientada a objetos (POO) e estrutura básica de sistemas bancários.

---

## 📜 Funcionalidades

- Criar nova conta bancária
- Depositar valor em conta
- Sacar valor da conta
- Transferir entre contas
- Listar todas as contas cadastradas
- Interface simples via terminal

---

## 🧠 Conceitos aplicados

- Programação Orientada a Objetos (POO)
  - Classes: `Conta`, `Usuario`, `Utils`, `AgenciaBancaria`
  - Encapsulamento com `getters` e `setters`
  - Métodos construtores
- Manipulação de listas com `ArrayList`
- Formatação de valores monetários (`DecimalFormat`)
- Interação via terminal (`Scanner`)
- Estrutura de menus e controle com `switch case`

---

## 📁 Estrutura do Projeto

src/
├── Programa/
│ ├── AgenciaBancaria.java # Classe principal (main)
│ ├── Conta.java # Lógica de conta bancária
│ ├── Usuario.java # Representação de usuário
├── utilitarios/
│ └── Utils.java # Utilitário de formatação monetária

▶️ Como executar

1. Clone o repositório:

git clone https://github.com/luizeduardoritter1/projeto-agencia-bancaria.git

2. Compile os arquivos .java:

javac Programa/*.java utilitarios/*.java

3. Execute o programa principal:

java Programa.AgenciaBancaria

📸 Exemplo de uso

-------------Bem vindo a nossa Agência---------------
***** Selecione uma operação que deseja realizar *****
|   Opção 1 - Criar conta   |
|   Opção 2 - Depositar     |
|   Opção 3 - Sacar         |
|   Opção 4 - Transferir    |
|   Opção 5 - Listar        |
|   Opção 6 - Sair          |


🧱 Requisitos
JDK 8 ou superior

Terminal ou IDE Java (como Eclipse, IntelliJ ou VS Code com extensão Java)

👨‍💻 Autor
Desenvolvido por Luiz Eduardo Ritter Leal

Projeto educacional para reforço de lógica e POO com Java

⚠️ Aviso
Este sistema é apenas um protótipo educacional e não deve ser usado para fins bancários reais.
