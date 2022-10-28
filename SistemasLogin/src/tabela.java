

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
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
        ctxREMOVE = new javax.swing.JButton();
        ctxFINISH = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        ctxREMOVE.setBackground(new java.awt.Color(255, 255, 0));
        ctxREMOVE.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ctxREMOVE.setText("REMOVER USER");
        ctxREMOVE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxREMOVEActionPerformed(evt);
            }
        });

        ctxFINISH.setBackground(new java.awt.Color(255, 51, 51));
        ctxFINISH.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        ctxFINISH.setText("SAIR");
        ctxFINISH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxFINISHActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("MOSTRAR DADOS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ctxFINISH, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(ctxREMOVE, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ctxREMOVE, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctxFINISH, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctxREMOVEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxREMOVEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxREMOVEActionPerformed
    private void mensagemErro(String erro){
            JOptionPane.showMessageDialog(null, erro, "Erro Validação", JOptionPane.ERROR_MESSAGE);
        }
    private void ctxFINISHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxFINISHActionPerformed
        //sair botão
        Login fr = new Login ();
        this.setVisible(false);
        fr.setVisible(true);  
    }//GEN-LAST:event_ctxFINISHActionPerformed

      public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tabela().setVisible(true);
            }
        });
    }
    
            

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ctxFINISH;
    private javax.swing.JButton ctxREMOVE;
    private javax.swing.JButton jButton3;
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
