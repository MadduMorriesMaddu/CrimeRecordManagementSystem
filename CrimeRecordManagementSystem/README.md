## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

CRIME RECORD MANAGEMENT SYATEM

The code is a Crime Record Management System implemented in Java using a MySQL database for storing and retrieving data. It allows users to register and login as different types of users, namely Admin, User, and Policeman.

The sqlconnect() method establishes a connection with the MySQL database using the JDBC driver. It returns a Connection object that can be used for executing SQL queries.

The main method is the entry point of the program. It starts by displaying a menu with options for registration or login. The user is prompted to enter their choice.

If the user chooses registration (option 1), they are further prompted to select their role (Admin, User, or Policeman). Depending on the role chosen, the user is asked to provide specific information such as name, ID, phone number, and password. The user's information is then inserted into the respective table in the database using prepared statements.

If the user chooses login (option 2), they are again prompted to select their role. After providing their name and password, the program executes a SQL query to check if the provided credentials match the records in the corresponding table. If the login is successful, the user is shown a success message and specific functionalities based on their role. For example, an admin can view the existing entries and delete records from the Entry and Police tables.

The program also includes code related to the admin's ability to delete records from the Entry and Police tables.

Overall, the code demonstrates basic functionality for user registration, login, and interaction with a MySQL database for storing and retrieving crime records. It utilizes JDBC for database connectivity and prepared statements for secure SQL queries.


# OUTPUT
sample output for creating new user and allowing admin to access to see all details
shown in 1,2,3.png
