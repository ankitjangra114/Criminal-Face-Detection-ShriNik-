
package ShriNik;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CommonSQL {
    Connection con;
    Statement stm;

    CommonSQL() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306/commondatabase", "root", "");
            this.stm = this.con.createStatement();
        } catch (Exception var2) {
            var2.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new CommonSQL();
    }
}
