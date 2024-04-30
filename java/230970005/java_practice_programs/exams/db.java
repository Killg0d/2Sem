import java.util.Scanner;
import java.sql.*;
//itemname, itemno, stock, unit price
public class db {
    Connection con;

    db() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:vmorcl", "MCA2020", "vm");

    }

    

    public void read() throws Exception {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM item");
        while (rs.next())
            System.out.println(rs.getString(1) + "  " + rs.getInt(2) + "  " + rs.getInt(3) + " " + rs.getDouble(4));
    }

    public void insert() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item name:");
        String itemName = sc.next();
        System.out.println("Enter item number:");
        int itemNo = sc.nextInt();
        System.out.println("Enter stock:");
        int stock = sc.nextInt();
        System.out.println("Enter unit price:");
        double unitPrice = sc.nextDouble();
        
        PreparedStatement pstmt = con.prepareStatement("INSERT INTO item VALUES (?, ?, ?, ?)");
        pstmt.setString(1, itemName);
        pstmt.setInt(2, itemNo);
        pstmt.setInt(3, stock);
        pstmt.setDouble(4, unitPrice);
        
        int rowsInserted = pstmt.executeUpdate();
        if (rowsInserted > 0) {
            System.out.println("Item inserted successfully!");
        }
    }

    public void delete() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item number to delete:");
        int itemNo = sc.nextInt();
        
        PreparedStatement pstmt = con.prepareStatement("DELETE FROM item WHERE itemno = ?");
        pstmt.setInt(1, itemNo);
        
        int rowsDeleted = pstmt.executeUpdate();
        if (rowsDeleted > 0) {
            System.out.println("Item deleted successfully!");
        } else {
            System.out.println("Item not found!");
        }
    }

    public void update() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter item number to update:");
        int itemNo = sc.nextInt();
        System.out.println("Enter new stock:");
        int newStock = sc.nextInt();
        
        PreparedStatement pstmt = con.prepareStatement("UPDATE item SET stock = ? WHERE itemno = ?");
        pstmt.setInt(1, newStock);
        pstmt.setInt(2, itemNo);
        
        int rowsUpdated = pstmt.executeUpdate();
        if (rowsUpdated > 0) {
            System.out.println("Item updated successfully!");
        } else {
            System.out.println("Item not found!");
        }
    }


    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        db d = new db();
        int ch;
        do {
            System.out.println("1.insert\n2.display\n3.delete\n4.update\n5.Exit\nEnter your choice:");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    d.insert();
                    break;
                case 2:
                    d.read();
                    break;
                case 3:
                    d.delete();
                    break;
                case 4:
                    d.update();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while (ch != 5);

    }
}
