# Projeto Banco Simulado

## Introdução
Este projeto é uma simulação de um sistema bancário desenvolvido em Java. Ele permite a criação de contas bancárias, realização de transferências entre contas e consulta de saldos. O objetivo é aplicar e praticar conceitos de programação orientada a objetos e armazenamento de dados em memória. Este projeto é um ponto de partida para entender como sistemas bancários funcionam em um nível básico.

## Tecnologias Utilizadas
- **Java**: Linguagem de programação principal utilizada no projeto.
- **Coleções do Java**: Utilização de `HashMap` para armazenar as contas bancárias.
- **Scanner**: Para leitura de entrada do usuário no console.

## Estrutura do Projeto
O projeto é composto por três classes principais:

### 1. Classe `Banco`
A classe `Banco` gerencia as contas bancárias e as operações associadas a elas.

#### Funcionalidades da Classe
- **Criar Conta**: Gera um novo número de conta, cria uma nova instância de `ContaBancaria` e a adiciona ao `HashMap`.
- **Realizar Transferência**: Permite a transferência de saldo entre duas contas existentes, verificando a existência das contas e se há saldo suficiente.
- **Obter Conta**: Recupera uma conta específica com base no número da conta.

#### `HashMap`
- Utilizada para armazenar as contas bancárias. A chave é o número da conta (um inteiro) e o valor é um objeto da classe `ContaBancaria`.
- Permite acesso rápido e eficiente às contas bancárias através do número da conta.

### 2. Classe `ContaBancaria`
A classe `ContaBancaria` representa uma conta bancária com atributos básicos e métodos para operações de depósito e saque.

#### Funcionalidades da Classe
- **Atributos**: Número da conta, nome do titular e saldo.
- **Operações**: Métodos para depositar e sacar dinheiro da conta.
- **Inicialização**: Toda conta é iniciada com um saldo padrão de 300 unidades monetárias.

### 3. Classe `SimuladorBanco`
A classe `SimuladorBanco` é a classe principal que contém o método `main` e fornece uma interface de linha de comando para interagir com o sistema bancário.

#### Funcionalidades da Classe
- **Menu Interativo**: Um loop infinito que apresenta opções ao usuário, como criar uma conta, realizar transferências, verificar saldo e sair.
- **Operações de Conta**: Chama métodos da classe `Banco` para executar as operações escolhidas pelo usuário.
- **Saída do Sistema**: Permite ao usuário encerrar o programa de forma limpa.

#### `Scanner`
- Utilizado para ler a entrada do usuário a partir do console.
- Permite que os usuários interajam com o sistema escolhendo opções no menu, inserindo dados do titular da conta, números das contas e valores para transferências.

## Conclusão
Este projeto é uma simulação básica de um sistema bancário que demonstra o uso de coleções Java, orientação a objetos e manipulação de entrada do usuário. Ele mostra como armazenar dados em memória usando `HashMap` e como interagir com o usuário usando `Scanner`. É uma excelente forma de praticar conceitos fundamentais de desenvolvimento de software.

## Contribuição 

Este é um projeto de código aberto, então sinta-se à vontade para contribuir com sugestões, correções de bugs ou até mesmo novas funcionalidades. Todas as contribuições são bem-vindas!

## Licença 

Este projeto está licenciado sob a Licença MIT. Para mais detalhes, consulte o arquivo [LICENSE](LICENSE).

---

