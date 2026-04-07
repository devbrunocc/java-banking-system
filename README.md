# Bank Account Simulator 💰

Um simulador de operações bancárias desenvolvido em Java para praticar os pilares da **Programação Orientada a Objetos (POO)**, com foco em encapsulamento e regras de negócio.

## 📌 Funcionalidades
* **Abertura de Conta:** Registro de ID e titular com suporte a diferentes fluxos de entrada.
* **Depósito Inicial Opcional:** O sistema permite criar uma conta com saldo zero ou realizar um aporte inicial.
* **Operações de Depósito:** Atualização dinâmica e segura do saldo da conta.
* **Sistema de Saque:** Implementação de retiradas com aplicação de regras de negócio (como taxas de transação).
* **Proteção de Dados:** Uso de modificadores de acesso para garantir que o saldo não seja alterado externamente.

## 🛠️ Conceitos Técnicos Aplicados
Neste projeto, foquei em demonstrar o domínio sobre:
* **Encapsulamento:** Atributos protegidos e acesso controlado via métodos `get` e `set`.
* **Sobrecarga de Construtores:** Implementação de múltiplos construtores para lidar com a presença ou ausência de depósito inicial.
* **Manipulação de Scanner:** Gerenciamento de buffer de teclado (`sc.nextLine()`) para evitar erros de leitura após a entrada de números.
* **Formatação de Dados:** Sobrescrita do método `toString()` para exibição elegante das informações do usuário.
* **Lógica de Caracteres:** Tratamento de entradas do usuário com `charAt(0)` e conversão para caixa alta com `Character.toUpperCase`.

## 🚀 Como Executar
1. Clone o repositório:
   ```bash
   git clone [https://github.com/SEU_USUARIO/bank-account-simulator.git](https://github.com/SEU_USUARIO/bank-account-simulator.git)
2. Certifique-se de ter o JDK 11 ou superior instalado.
3. Compile e execute a classe Main.java dentro da pasta application.

<img width="505" height="219" alt="image" src="https://github.com/user-attachments/assets/7f2d5d7b-f917-4ad9-91dc-c15866aa9dbf" />
