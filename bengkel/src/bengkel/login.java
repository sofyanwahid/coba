package bengkel;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class login {
    public void login(String username, String password, tampilan tampil) {
        try {
            Connection con = config.Open();
            Statement stm = con.createStatement();
            ResultSet rss = stm.executeQuery("select * from pegawai where username ='"+username+"' and password = '"+password+"'");
            if(rss.next()){
                tampil.transisi(rss.getString(1), rss.getString(2));
            }else{
                JOptionPane.showMessageDialog(null, "Username dan Password Salah!!");  
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}