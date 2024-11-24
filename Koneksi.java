/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Auriga
 */
public class Koneksi {
private static Connection konek;

    public static Connection konek() throws SQLException, ClassNotFoundException {
        try {
            if (konek == null || konek.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/tos", "root", ""); 
                System.out.println("Koneksi berhasil!");
            }
            return konek;
        } catch (SQLException e) {
            System.err.println("Error: Koneksi tidak berhasil! " + e.getMessage());
            throw e; 
        }
    }
    
}
