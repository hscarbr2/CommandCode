package hayden.me.mccommand.command;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tickets";
        String user = "TB";
        String password = "Password123";

        try (Connection con = DriverManager.getConnection(url,user,password)) {
            System.out.println("Successfully connected to MariaDB");

        } catch (SQLException e) {
            System.out.println("Connection Failed!!!");
            e.printStackTrace();
        }
    }
}
