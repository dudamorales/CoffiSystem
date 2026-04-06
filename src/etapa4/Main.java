package etapa4;

import java.sql.Connection; 

public class Main {
    
    public static void main(String[] args) {
        
        Connection conn = Conexao.conectar();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
           
        });   
    }
}
