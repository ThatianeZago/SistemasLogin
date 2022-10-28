

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class tabela extends javax.swing.JFrame {

       public tabela() {
        initComponents();
        preencheTabela();
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tab = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tab.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Nome", "E-mail", "Morada", "Telefone", "NIF", "Login", "Password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tab);

        jLabel1.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        jLabel1.setText("Tabela");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

      public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabela().setVisible(true);
            }
        });
    }
    
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tab;
    // End of variables declaration//GEN-END:variables

    private void preencheTabela() {
       
        try{
            //java.sql.Connection conexao;
        Connection conexao = LIgaBD.Ligacao();
        PreparedStatement ps = null;
        ResultSet rs = null;
    DefaultTableModel dtm = (DefaultTableModel) tab.getModel();
      //  DefaultTableMode1 modelo =   (DefaultTableMode1) tab.getModel();
            //Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/rhcencal?useSSL=false&serverTimezone=UTC");
            ps = conexao.prepareStatement("select * from utilizador");   
            rs = ps.executeQuery();
            rs.first();
         int rowCount = dtm.getRowCount();
         for(int i = rowCount - 1; i >= 0; i--){
             dtm.removeRow(i);
         }
         do{
             dtm.addRow(new Object[]{rs.getInt("idUtilizador"),rs.getString("nome"), rs.getString("email"), rs.getString("morada"), rs.getInt("telefone"), rs.getInt("nif"), rs.getString("login"), rs.getString("password")});
         }while(rs.next());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
