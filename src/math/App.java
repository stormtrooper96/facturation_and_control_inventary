/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math;
import java.sql.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**CUSTOMER
 *
 * @author japar
 */
public class App {
 private final String url = "jdbc:postgresql://localhost/postgres";
    private final String user = "postgres";
    private final String password = "postgres";
 public Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM inventario");
            while ( rs.next() ) {
                //String tipo = rs.getString("tipo");
               // String precio =rs.getString ("precio");
              //  System.out.println(tipo);
            //    System.out.println(precio);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return conn;

    }
 public static DefaultTableModel buildTableModel(ResultSet rs)
        throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<>();
    while (rs.next()) {
        Vector<Object> vector;
        vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
public Statement getdata()
        
{
     Statement get=null ;
        try {
            Connection conn = connect();
            Statement stmt = conn.createStatement();
            ResultSet rs;
            rs = stmt.executeQuery("SELECT * FROM inventario");
           
           
               JTable table = new JTable(buildTableModel(rs));
               JOptionPane.showMessageDialog(null, new JScrollPane(table));
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
 
        return get;
}


 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        App app = new App();
        app.connect();
                
        

    }

}
