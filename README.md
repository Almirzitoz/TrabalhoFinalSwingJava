pt-br
Sistema de Corte de Cabelo
Este é um sistema de gerenciamento para um salão de cortes de cabelo desenvolvido em Java utilizando a biblioteca Swing para a criação da interface gráfica. O objetivo do sistema é permitir o registro de cortes de cabelo realizados, visualizar os registros em uma tabela e realizar cálculos financeiros relacionados ao pagamento de funcionários e ao lucro da operação.

Funcionalidades
Registrar Corte:

O usuário pode registrar um corte de cabelo selecionando o funcionário e os serviços realizados (Corte, Barba, Nevou).
O valor total é calculado automaticamente com base nos serviços selecionados.
Ver Tabela de Cortes:

Exibe uma tabela com todos os registros de cortes de cabelo, mostrando o nome do funcionário e o valor arrecadado.
Realizar Cálculos:

Realiza cálculos financeiros como:
Total arrecadado.
Total a pagar aos funcionários (40% do valor arrecadado).
Lucro da operação.
Valor que pode ser retirado (30% do lucro).
Valor restante no caixa.
Estrutura do Projeto
O projeto é composto pelas seguintes classes:

Principal: Gerencia a interface principal do sistema e permite a navegação entre as telas.
Tabela: Exibe a tabela com os registros de cortes de cabelo.
Registrar: Permite o registro dos cortes e cálculos relacionados aos serviços realizados.
Calcular: Realiza os cálculos financeiros do sistema.
Tecnologias Utilizadas
Java (JDK 8 ou superior)
Swing (para criação da interface gráfica)
Maven (se necessário para gerenciamento de dependências)
Instruções de Uso
Clonar o repositório:

bash
Copiar código
git clone https://github.com/seu-usuario/sistema-corte-cabelo.git
Compilar o código:

Abra o projeto em sua IDE preferida (como IntelliJ IDEA, Eclipse ou NetBeans).
Compile o código.
Executar o projeto:

Execute a classe Principal para iniciar o sistema.
Contribuições
Se você quiser contribuir para o projeto, sinta-se à vontade para abrir uma pull request. Todas as contribuições são bem-vindas!

Licença
Este projeto está licenciado sob a licença MIT.

English Version
Haircut Management System
This is a haircut management system developed in Java using the Swing library for graphical user interface creation. The system allows the registration of performed haircuts, displays the records in a table, and performs financial calculations related to employee payments and the profit of the operation.

Features
Register Haircut:

The user can register a haircut by selecting the employee and the services performed (Haircut, Beard, Nevou).
The total value is automatically calculated based on the selected services.
View Haircut Table:

Displays a table with all the haircut records, showing the employee's name and the amount earned.
Perform Calculations:

Performs financial calculations such as:
Total revenue.
Total to pay to employees (40% of the revenue).
Operation profit.
Amount that can be withdrawn (30% of the profit).
Remaining amount in the cash register.
Project Structure
The project consists of the following classes:

Principal: Manages the main interface of the system and allows navigation between the screens.
Tabela: Displays the table with haircut records.
Registrar: Allows the registration of haircuts and calculates the values related to the services performed.
Calcular: Performs the financial calculations of the system.
Technologies Used
Java (JDK 8 or higher)
Swing (for GUI creation)
Maven (if needed for dependency management)
Usage Instructions
Clone the repository:

bash
Copiar código
git clone https://github.com/your-username/haircut-management-system.git
Compile the code:

Open the project in your preferred IDE (like IntelliJ IDEA, Eclipse, or NetBeans).
Compile the code.
Run the project:

Run the Principal class to start the system.
Contributions
If you would like to contribute to the project, feel free to open a pull request. All contributions are welcome!

License
This project is licensed under the MIT License.
