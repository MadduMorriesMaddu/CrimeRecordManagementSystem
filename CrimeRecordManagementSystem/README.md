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

In this project we are gathering crimanls information. Here we have 3 interfaces

1. Before going in we are  creating 5 tables in mysql and connect to VScode. First table is Adminlogin where we insert admin details like name,id,password,phone number we created name and password for Admin to login.  Second table is Userlogin where we insert user details like name,id,password,phone number we created name and password for police to login.Third table is Police login where we insert police details like name,id,password,phone number we created name and password for Police to login.
2. After creating the login tables we need create other two tables one is for user giving a complaint and other table for police man taking the complaintand writing the case progress and inchare who took the case.
3. After creating the required tables in coding part first we are showing options that new to rgister or login option.
4. If we select option 1 it redirect to new registration again it show 3 options that you want register as Admin, User ,Policeman.
5. If you select one of the them, then it ask your details and store in respected login tables.
6. After completing the registration go to option 2 that is Login part.
7. There again shows 3 options want to login as Admin, User, Police man. If your name and password is correct
it opens the Admin has access to see all the User details and police man details. The User can only file a complain . Policeman access the incharge and gives the case status .


