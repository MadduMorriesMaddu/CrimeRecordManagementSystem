import java.sql.*;
import java.util.Scanner;
import com.mysql.*;
import javax.swing.JOptionPane;

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
        System.out.println("\033[0m********************************************************************");
        System.out.println("\033[31m|*          CRIME RECORD MANAGEMENT SYSTEM                      *|");
        System.out.println("\033[0m********************************************************************");

        System.out.println("|\u001B[35m************************\u001B[0m|");
        System.out.println("|\u001B[32m  New Register or login \u001B[0m|");
        System.out.println("|\u001B[32m1.Registration\u001B[0m          |");
        System.out.println("|\u001B[32m2.login\u001B[0m                 |");
        System.out.println("|\u001B[35m************************\u001B[0m|");
        System.out.print("\u001B[33mEnter your option:\u001B[0m");

        int option = Integer.parseInt(scanner.nextLine());

        if (option == 1) {
            System.out.println("-----------------------");
            System.out.println("|\u001B[31m1.Admin    |");
            System.out.println("|\u001B[34m2.User     |");
            System.out.println("|\u001B[32m3.Policeman|");
            System.out.println("-----------------------");
            System.out.print("\u001B[33mEnter your choice:\u001B[0m");

            int Choice = Integer.parseInt(scanner.nextLine());

            switch (Choice) {

                case 1:

                    System.out.println("\033[31mAdmin_Name:\033[0m");
                    String Admin_Name = scanner.nextLine();

                    System.out.println("\033[31mAdmin_id:\033[0m");
                    String Admin_id = scanner.nextLine();

                    System.out.println("\033[31mPhone Number:\033[0m");
                    int Admin_phonenumber = Integer.parseInt(scanner.nextLine());

                    System.out.println("\033[31mPassword:\033[0m");
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

                    System.out.println("\033[34mUser_Name:\033[0m");
                    String User_Name = scanner.nextLine();

                    System.out.println("\033[34mUser_id:\033[0m");
                    String User_id = scanner.nextLine();

                    System.out.println("\033[34mPhone Number:\033[0m");
                    int User_phonenumber = Integer.parseInt(scanner.nextLine());
                    ;

                    System.out.println("\033[34mPassword:\033[0m");
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
                    System.out.println("\033[32mPolice_Name:\033[0m");
                    String Police_Name = scanner.nextLine();

                    System.out.println("\033[32mPolice_id:\033[0m");
                    String Police_id = scanner.nextLine();

                    System.out.println("\033[32mPhone Number:\033[0m");
                    int Police_phonenumber = Integer.parseInt(scanner.nextLine());
                    ;

                    System.out.println("\033[32mPassword:\033[0m");
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
                    System.out.println("\033[0;31mInvalid Choice");
            }
        } else if (option == 2) {
            System.out.println("-----------------------");
            System.out.println("|\u001B[31m1.Admin    |");
            System.out.println("|\u001B[34m2.User     |");
            System.out.println("|\u001B[32m3.Policeman|");
            System.out.println("-----------------------");
            System.out.print("\u001B[33mEnter your choice:\u001B[0m");

            int Choice = Integer.parseInt(scanner.nextLine());

            switch (Choice) {
                case 1:
                    Boolean login = false;
                    System.out.println("\033[31mAdmin_Name:\033[0m");
                    String Admin_Name = scanner.nextLine();
                    System.out.println("\033[31mPassword:\033[0m");
                    String Password = scanner.nextLine();
                    String sql = "SELECT * FROM adminlogin WHERE Admin_Name='" + Admin_Name + "' AND Password='"
                            + Password
                            + "'";
                    Connection conn = sqlconnect();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);
                    if (rs.next()) {
                        login = true;
                        System.out.println("\u001B[32mLogin Successful!\u001B[0m");

                        ResultSet resultSet2 = stmt.executeQuery("SELECT * FROM Entry");
                        System.out.println(resultSet2);
                        while (resultSet2.next()) {
                            System.out.println(resultSet2.getInt(1) + "\t" + resultSet2.getString(2) + "\t"
                                    + resultSet2.getInt(3) + "\t" + resultSet2.getString(4) + "\t"
                                    + resultSet2.getString(5));

                        }
                        ResultSet resultSet4 = stmt.executeQuery("SELECT * FROM Police");
                        System.out.println(resultSet4);
                        while (resultSet4.next()) {
                            System.out.println(resultSet4.getString(1) + "\t"
                                    + resultSet4.getString(2) + "\t"
                                    + resultSet4.getInt(3) + "\t" + resultSet4.getString(4));

                        }
                        if (Choice == 1) {
                            // Admin login code here
                        
                            if (login) {
                                System.out.println("Select table to delete from:");
                                System.out.println("1. Entry");
                                System.out.println("2. Police");
                                System.out.print("Enter your choice: ");
                                int deleteChoice = Integer.parseInt(scanner.nextLine());
                        
                                switch (deleteChoice) {
                                    case 1:
                                        System.out.print("Enter the Entry_case_id to delete: ");
                                        int deleteEntryCaseId = Integer.parseInt(scanner.nextLine());
                                        Connection connDelete1 = sqlconnect();
                                        PreparedStatement deleteStatement1 = connDelete1.prepareStatement("DELETE FROM Entry WHERE Entry_case_id = ?");
                                        deleteStatement1.setInt(1, deleteEntryCaseId);
                                        int rowsDeleted1 = deleteStatement1.executeUpdate();
                                        if (rowsDeleted1 > 0) {
                                            System.out.println("Entry record deleted successfully!");
                                        } else {
                                            System.out.println("Entry record not found.");
                                        }
                                        connDelete1.close();
                                        break;
                        
                                    case 2:
                                        System.out.print("Enter the Pol_Name to delete: ");
                                        String deletePolName = scanner.nextLine();
                                        Connection connDelete2 = sqlconnect();
                                        PreparedStatement deleteStatement2 = connDelete2.prepareStatement("DELETE FROM Police WHERE Pol_Name = ?");
                                        deleteStatement2.setString(1, deletePolName);
                                        int rowsDeleted2 = deleteStatement2.executeUpdate();
                                        if (rowsDeleted2 > 0) {
                                            System.out.println("Police record deleted successfully!");
                                        } else {
                                            System.out.println("Police record not found.");
                                        }
                                        connDelete2.close();
                                        break;
                        
                                    default:
                                        System.out.println("Invalid choice.");
                                        break;
                                }
                            }
                        }
                        
                    } else {
                        System.out.println("\u001B[31mInvalid Login\u001B[0m");
                    }
                    conn.close();
                    break;

                case 2:
                    Boolean login1 = false;
                    System.out.println("\033[34mUser_Name:\033[0m");
                    String User_Name = scanner.nextLine();
                    System.out.println("\033[34mPassword:\033[0m");
                    String Password1 = scanner.nextLine();
                    String sql1 = "SELECT * FROM Userlogin WHERE User_Name='" + User_Name + "' AND Password='"
                            + Password1
                            + "'";
                    Connection conn1 = sqlconnect();
                    Statement stmt1 = conn1.createStatement();
                    ResultSet rs1 = stmt1.executeQuery(sql1);
                    if (rs1.next()) {
                        login1 = true;
                        System.out.println("\u001B[32mLogin Successful!\u001B[0m");

                        System.out.println("\u001B[33mEntry_case_id:\u001B[0m");
                        int Entry_case_id = Integer.parseInt(scanner.nextLine());

                        System.out.println("\u001B[33mEntry_Name:\u001B[0m");
                        String Entry_Name = scanner.nextLine();

                        System.out.println("\u001B[33mPhone Number:\u001B[0m");
                        int Entry_phonenumber = Integer.parseInt(scanner.nextLine());

                        System.out.println("\u001B[33mEntry_crime:\u001B[0m");
                        String Entry_crime = scanner.nextLine();

                        System.out.println("\u001B[33mEntry_date:\u001B[0m");
                        String Entry_date = scanner.nextLine();

                        Connection conn4 = sqlconnect();

                        PreparedStatement statement1 = conn4.prepareStatement(
                                "INSERT INTO Entry (Entry_case_id,Entry_Name,Entry_phonenumber,Entry_crime,Entry_date) VALUES (?, ?, ?, ?, ?)");

                        statement1.setInt(1, Entry_case_id);
                        statement1.setString(2, Entry_Name);
                        statement1.setInt(3, Entry_phonenumber);
                        statement1.setString(4, Entry_crime);
                        statement1.setString(5, Entry_date);

                        int rowsInserted1 = statement1.executeUpdate();
                        if (rowsInserted1 > 0) {
                            System.out.println("A new entry was inserted successfully!");
                        }

                        ResultSet resultSet1 = statement1.executeQuery("SELECT * FROM Entry");
                        System.out.println(resultSet1);
                        while (resultSet1.next()) {
                            System.out.println(resultSet1.getInt(1) + "\t" + resultSet1.getString(2) + "\t"
                                    + resultSet1.getInt(3) + "\t" + resultSet1.getString(4) + "\t"
                                    + resultSet1.getString(5));
                        }
                        conn4.close();

                    } else {
                        System.out.println("\u001B[31mInvalid Login\u001B[0m");
                    }
                    conn1.close();
                    break;

                case 3:
                    Boolean login2 = false;
                    System.out.println("\u001B[35mPolice_Name:");
                    String Police_Name = scanner.nextLine();
                    System.out.println("\033[32mPassword:\033[0m");
                    String Password2 = scanner.nextLine();
                    String sql2 = "SELECT * FROM Policelogin WHERE Police_Name='" + Police_Name + "' AND Password='"
                            + Password2
                            + "'";
                    Connection conn2 = sqlconnect();
                    Statement stmt2 = conn2.createStatement();
                    ResultSet rs2 = stmt2.executeQuery(sql2);
                    if (rs2.next()) {
                        login2 = true;
                        System.out.println("\u001B[32mLogin Successful!\u001B[0m");

                        System.out.println("\u001B[32mPol_Name:");
                        String Pol_Name = scanner.nextLine();

                        System.out.println("\u001B[33mstatus:");
                        String status = scanner.nextLine();

                        System.out.println("\033[0;35mEntry_case_id:");

                        int Entry_case_id = Integer.parseInt(scanner.nextLine());

                        System.out.println("\u001B[32mPol_Rank:");
                        String Pol_Rank = scanner.nextLine();

                        Connection conn4 = sqlconnect();

                        PreparedStatement statement2 = conn4.prepareStatement(
                                "INSERT INTO Police (Pol_Name,status,Entry_case_id,Pol_Rank) VALUES (?, ?, ?, ?)");

                        statement2.setString(1, Pol_Name);
                        statement2.setString(2, status);
                        statement2.setInt(3, Entry_case_id);
                        statement2.setString(4, Pol_Rank);

                        int rowsInserted1 = statement2.executeUpdate();
                        if (rowsInserted1 > 0) {
                            System.out.println("A new entry was inserted successfully!");

                        }

                        ResultSet resultSet1 = statement2.executeQuery("SELECT * FROM Police");
                        System.out.println(resultSet1);
                        while (resultSet1.next()) {
                            System.out.println(resultSet1.getString(1) + "\t" + resultSet1.getString(2) + "\t"
                                    + resultSet1.getInt(3) + resultSet1.getString(4));
                        }
                        conn4.close();

                    } else {
                        System.out.println("\u001B[31mInvalid Login\u001B[0m");
                    }
                    conn2.close();
                    break;

                default:
                    System.out.println("\033[0;31mInvalid Choice");

            }

        }

    }
}
