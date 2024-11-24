/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Auriga
 */
public class Test {
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan username: ");
        String uname = input.nextLine();
        System.out.print("Masukkan password: ");
        String passwd = input.nextLine();
        try {
            Connection connection = Koneksi.konek();
            System.out.println("Koneksi berhasil!");

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM users WHERE username = '" + uname + "' AND password = '" + passwd+"'";
            System.out.println(query);
            ResultSet resultSet = statement.executeQuery(query);

            
            if(resultSet.next()){
                System.out.println("Login berhasil");
            }else{
                System.out.println("Username atau password salah");
            }
            
            
            resultSet.close();
            statement.close();
            connection.close();
            
            
//           String sql = "SELECT * FROM petugas WHERE username = ? AND password = ?";
//
//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                preparedStatement.setString(1, username);
//                preparedStatement.setString(2, password);
//
//                try (ResultSet resultSet = preparedStatement.executeQuery()) {
//                    if (resultSet.next()) {
            

            // Menutup koneksi dan statement
            

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);

        }
        
    }  
}
