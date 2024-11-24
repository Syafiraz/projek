/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Auriga
 */
public class ManageData {
    private Connection connection;

    public ManageData() throws ClassNotFoundException, SQLException {
        connection = Koneksi.konek(); 
    }

    public void loadMembers(DefaultTableModel model) throws SQLException {
        model.setRowCount(0); 
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM members");

        while (rs.next()) {
            String MemberID = rs.getString("MemberID");
            String Name = rs.getString("Name");
            String Address = rs.getString("Address");
            String Contact = rs.getString("Contact");
            String Email = rs.getString("Email");

            model.addRow(new Object[]{MemberID, Name, Address, Contact, Email});
        }
    }

    public void saveMember(String MemberID, String Name, String Address, String Contact, String Email) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("INSERT INTO members (MemberID, Name, Address, Contact, Email) VALUES (?, ?, ?, ?, ?)");
        ps.setString(1, MemberID);
        ps.setString(2, Name);
        ps.setString(3, Address);
        ps.setString(4, Contact);
        ps.setString(5, Email);
        ps.executeUpdate();
    }

    public void updateMember(String MemberID, String Name, String Address, String Contact, String Email) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("UPDATE members SET Name = ?, Address = ?, Contact = ?, Email = ? WHERE MemberID = ?");
        ps.setString(1, Name);
        ps.setString(2, Address);
        ps.setString(3, Contact);
        ps.setString(4, Email);
        ps.setString(5, MemberID);
        ps.executeUpdate();
    }

    public void deleteMember(String MemberID) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("DELETE FROM members WHERE MemberID = ?");
        ps.setString(1, MemberID);
        ps.executeUpdate();
    }
    
    public void loadBooks(DefaultTableModel model) throws SQLException {
        model.setRowCount(0);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM books");

        while (rs.next()) {
            String BookID = rs.getString("BookID");
            String Title = rs.getString("Title");
            String Publish = rs.getString("Publish");
            String PYear = rs.getString("PYear");
            String Stock = rs.getString("Stock");

            model.addRow(new Object[]{BookID, Title, Publish, PYear, Stock});
        }
    }

    public void saveBook(String BookID, String Title, String Publish, String PYear, String Stock) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "INSERT INTO books (BookID, Title, Publish, PYear, Stock) VALUES (?, ?, ?, ?, ?)"
        );
        ps.setString(1, BookID);
        ps.setString(2, Title);
        ps.setString(3, Publish);
        ps.setString(4, PYear);
        ps.setString(5, Stock);
        ps.executeUpdate();
    }

    public void updateBook(String BookID, String Title, String Publish, String PYear, String Stock) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "UPDATE books SET Title = ?, Publish = ?, PYear = ?, Stock = ? WHERE BookID = ?"
        );
        ps.setString(1, Title);
        ps.setString(2, Publish);
        ps.setString(3, PYear);
        ps.setString(4, Stock);
        ps.setString(5, BookID);
        ps.executeUpdate();
    }

    public void deleteBook(String BookID) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("DELETE FROM books WHERE BookID = ?");
        ps.setString(1, BookID);
        ps.executeUpdate();
    }

    public void loadBorrows(DefaultTableModel model) throws SQLException {
        model.setRowCount(0);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM borrows");

        while (rs.next()) {
            String BookID = rs.getString("BookID");
            String MemberID = rs.getString("MemberID");
            Date BorrowDate = rs.getDate("BorrowDate");
            Date DueDate = rs.getDate("DueDate");

            model.addRow(new Object[]{BookID, MemberID, BorrowDate, DueDate});
        }
    }

    public void saveBorrow(String BookID, String MemberID, String BorrowDate, String DueDate) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "INSERT INTO borrows (BookID, MemberID, BorrowDate, DueDate) VALUES (?, ?, ?, ?)"
        );
        ps.setString(1, BookID);
        ps.setString(2, MemberID);
        ps.setDate(3, Date.valueOf(BorrowDate));
        ps.setDate(4, Date.valueOf(DueDate));
        ps.executeUpdate();
    }

    public void updateBorrow(String BookID, String MemberID, String BorrowDate, String DueDate) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
        "UPDATE borrows SET BorrowDate = ?, DueDate = ? WHERE BookID = ? AND MemberID = ?"
        );
        ps.setDate(1, java.sql.Date.valueOf(BorrowDate)); // Pastikan formatnya benar
        ps.setDate(2, java.sql.Date.valueOf(DueDate)); // Pastikan formatnya benar
        ps.setString(3, BookID);
        ps.setString(4, MemberID);
        ps.executeUpdate();
    }

    public void deleteBorrow(String BookID, String MemberID) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "DELETE FROM borrows WHERE BookID = ? AND MemberID = ?"
        );
        ps.setString(1, BookID);
        ps.setString(2, MemberID);
        ps.executeUpdate();
    }

    // Operasi untuk Pengembalian
    public void loadReturns(DefaultTableModel model) throws SQLException {
        model.setRowCount(0);
        Statement st = connection.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM returns");

        while (rs.next()) {
            String BookID = rs.getString("BookID");
            String MemberID = rs.getString("MemberID");
            Date ReturnDate = rs.getDate("ReturnDate");
            Date DueDate = rs.getDate("DueDate");

            model.addRow(new Object[]{BookID, MemberID, ReturnDate, DueDate});
        }
    }

    public void saveReturn(String BookID, String MemberID, String ReturnDate, String DueDate) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "INSERT INTO returns (BookID, MemberID, ReturnDate, DueDate) VALUES (?, ?, ?, ?)"
        );
        ps.setString(1, BookID);
        ps.setString(2, MemberID);
        ps.setDate(3, Date.valueOf(ReturnDate));
        ps.setDate(4, Date.valueOf(DueDate));
        ps.executeUpdate();
    }

    public void updateReturn(String BookID, String MemberID, String ReturnDate, String DueDate) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "UPDATE returns SET ReturnDate = ?, DueDate = ? WHERE BookID = ? AND MemberID = ?"
        );
        ps.setDate(1, Date.valueOf(ReturnDate));
        ps.setDate(2, Date.valueOf(DueDate));
        ps.setString(3, BookID);
        ps.setString(4, MemberID);
        ps.executeUpdate();
    }

    public void deleteReturn(String BookID, String MemberID) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "DELETE FROM returns WHERE BookID = ? AND MemberID = ?"
        );
        ps.setString(1, BookID);
        ps.setString(2, MemberID);
        ps.executeUpdate();
    }


    public boolean isBookAvailable(String BookID) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "SELECT Stock FROM books WHERE BookID = ?"
        );
        ps.setString(1, BookID);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            int stock = rs.getInt("Stock");
            return stock > 0;
        }
        return false;
    }

    public void decreaseBookStock(String BookID) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "UPDATE books SET Stock = Stock - 1 WHERE BookID = ?"
        );
        ps.setString(1, BookID);
        ps.executeUpdate();
    }

    public void increaseBookStock(String BookID) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(
            "UPDATE books SET Stock = Stock + 1 WHERE BookID = ?"
        );
        ps.setString(1, BookID);
        ps.executeUpdate();
    }
}


