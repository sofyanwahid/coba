package bengkel;

import java.sql.SQLException;

public class Bengkel {

    public static void main(String[] args) throws SQLException {
        tampilan tam = new tampilan();
        tam.setVisible(true);
        tam.setResizable(false);
        tam.setLocationRelativeTo(null);
        config con = new config();
        con.Open();
    }
    
}
