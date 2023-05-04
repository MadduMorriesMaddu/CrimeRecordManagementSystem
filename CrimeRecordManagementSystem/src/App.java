import java.sql.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.mysql.*;

public class App {
    static Connection sqlconnect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crime", "root",
                    "Morries123@");
            return connection;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("********");
        System.out.println("*   CRIME RECORD MANAGEMENT SYSTEM   *");
        System.out.println("********");

        System.out.println(" New Register or login");
        System.out.println("1.Registration");
        System.out.println("2.login");
        System.out.println("********************");
        System.out.print("Enter your option:");

        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) {

            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("3.Policeman");
            System.out.print("Enter your choice:");

            int Choice = Integer.parseInt(scanner.nextLine());

            switch (Choice) {
                case 1:

                    System.out.println("Admin_Name:");
                    String Admin_Name = scanner.nextLine();

                    System.out.println("Admin_id:");
                    String Admin_id = scanner.nextLine();

                    System.out.println("Phone Number:");
                    int Admin_phonenumber = Integer.parseInt(scanner.nextLine());
                    ;

                    System.out.println("Password:");
                    String Password = scanner.nextLine();

                    Connection connection = sqlconnect();

                    PreparedStatement statement = connection.prepareStatement(
                            "INSERT INTO Adminlogin (Admin_Name,Admin_id,Admin_phonenumber,Password) VALUES (?, ?, ?, ?)");

                    // Step 5: Set the values for the PreparedStatement
                    statement.setString(1, Admin_Name);
                    statement.setString(2, Admin_id);
                    statement.setInt(3, Admin_phonenumber);
                    statement.setString(4, Password);

                    int rowsInserted = statement.executeUpdate();
                    if (rowsInserted > 0) {
                        System.out.println("A new user was inserted successfully!");
                    }

                    ResultSet resultSet = statement.executeQuery("SELECT * FROM Adminlogin");
                    System.out.println(resultSet);
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString(1) + "\t" + resultSet.getString(2) + "\t"
                                + resultSet.getInt(3) + "\t" + resultSet.getString(4));
                    }
                    break;
                case 2:

                    System.out.println("User_Name:");
                    String User_Name = scanner.nextLine();

                    System.out.println("User_id:");
                    String User_id = scanner.nextLine();

                    System.out.println("Phone Number:");
                    int User_phonenumber = Integer.parseInt(scanner.nextLine());
                    ;

                    System.out.println("Password:");
                    String Password1 = scanner.nextLine();

                    Connection conn = sqlconnect();

                    PreparedStatement statement1 = conn.prepareStatement(
                            "INSERT INTO Userlogin (User_Name,User_id,User_phonenumber,Password) VALUES (?, ?, ?, ?)");

                    statement1.setString(1, User_Name);
                    statement1.setString(2, User_id);
                    statement1.setInt(3, User_phonenumber);
                    statement1.setString(4, Password1);

                    int rowsInserted1 = statement1.executeUpdate();
                    if (rowsInserted1 > 0) {
                        System.out.println("A new user was inserted successfully!");
                    }

                    ResultSet resultSet1 = statement1.executeQuery("SELECT * FROM Userlogin");
                    System.out.println(resultSet1);
                    while (resultSet1.next()) {
                        System.out.println(resultSet1.getString(1) + "\t" + resultSet1.getString(2) + "\t"
                                + resultSet1.getInt(3) + "\t" + resultSet1.getString(4));
                    }
                    conn.close();
                    break;

                case 3:
                    System.out.println("Police_Name:");
                    String Police_Name = scanner.nextLine();

                    System.out.println("Police_id:");
                    String Police_id = scanner.nextLine();

                    System.out.println("Phone Number:");
                    int Police_phonenumber = Integer.parseInt(scanner.nextLine());
                    ;

                    System.out.println("Password:");
                    String Password2 = scanner.nextLine();

                    Connection conn1 = sqlconnect();

                    PreparedStatement statement2 = conn1.prepareStatement(
                            "INSERT INTO Policelogin (Police_Name,Police_id,Police_phonenumber,Password) VALUES (?, ?, ?, ?)");

                    statement2.setString(1, Police_Name);
                    statement2.setString(2, Police_id);
                    statement2.setInt(3, Police_phonenumber);
                    statement2.setString(4, Password2);

                    int rowsInserted2 = statement2.executeUpdate();
                    if (rowsInserted2 > 0) {
                        System.out.println("A new user was inserted successfully!");
                    }

                    ResultSet resultSet2 = statement2.executeQuery("SELECT * FROM Userlogin");
                    System.out.println(resultSet2);
                    while (resultSet2.next()) {
                        System.out.println(resultSet2.getString(1) + "\t" + resultSet2.getString(2) + "\t"
                                + resultSet2.getInt(3) + "\t" + resultSet2.getString(4));
                    }
                    conn1.close();
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }
        else if(option==2){
            System.out.println("1.Admin");
            System.out.println("2.User");
            System.out.println("3.Policeman");
            System.out.print("Enter your choice:");

            int Choice = Integer.parseInt(scanner.nextLine());

            

        }

    }

}
