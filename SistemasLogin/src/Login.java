
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {

  
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    public static String login;
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        ctxlogin = new javax.swing.JTextField();
        ctxPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        INICIAR = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Login");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("LOGIN");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setText("PASSWORD");

        ctxlogin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ctxlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxloginActionPerformed(evt);
            }
        });

        ctxPassword.setToolTipText("");
        ctxPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctxPasswordActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/loginLogo.png"))); // NOI18N

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Registra-se");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        INICIAR.setBackground(new java.awt.Color(0, 153, 255));
        INICIAR.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        INICIAR.setForeground(new java.awt.Color(255, 255, 255));
        INICIAR.setText("Iniciar Sessão");
        INICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INICIARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(182, 182, 182)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(INICIAR))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(164, 164, 164)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ctxlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(18, 18, 18)
                                    .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabel4)))
                .addContainerGap(196, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ctxlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ctxPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(INICIAR, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(78, 78, 78))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ctxloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxloginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctxloginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      
         FormRegisto fr = new FormRegisto();
        this.setVisible(false);
        fr.setVisible(true);   
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ctxPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctxPasswordActionPerformed
        // TODO add your handling code here:
        /*validação através da recolha e comparação de passwrod e login
        1º verificar se existe ficheiro "login.txt"
        2º verificar de a password corresponde a pass que está no ficheiro
        se sim, segue para a JFrame form MenuOpções*/
        // se login e passaword corretos faz isto que se segue 
       MenoOpcoes mo = new MenoOpcoes(); 
       this.setVisible(false);
       mo.setVisible(true);
        //senão, lanca um alert de dados de login incorretos
        
    }//GEN-LAST:event_ctxPasswordActionPerformed
private void mensagemErro(String erro){
            JOptionPane.showMessageDialog(null, erro, "Erro Validação", JOptionPane.ERROR_MESSAGE);
        }
    private void INICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INICIARActionPerformed
    //comparar as password 

    String password = ctxPassword.getText();
    login = ctxlogin.getText();
    
    File ficheiro = new File (login+".txt");
    if(!ficheiro.exists()){
            mensagemErro ("O Login não é valido !");   
            }else{
                  try{
                      int count = 0;
                FileReader fr = new FileReader (ficheiro);
                BufferedReader br = new BufferedReader (fr);
                while (br.ready()){
                    String linha = br.readLine (); count ++;
                    if (count == 1){
                        if (password.equals(linha)){
                            MenoOpcoes mo = new MenoOpcoes ();
                        this.setVisible(false);
                        mo.setVisible(true);    
                        }else{
                            mensagemErro ("Password inválida !"); 
                        }
                    }
                }
                br.close();
                br.close();
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ioe) {
                
            }
                    }
    
            
    }//GEN-LAST:event_INICIARActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton INICIAR;
    private javax.swing.JPasswordField ctxPassword;
    private javax.swing.JTextField ctxlogin;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

  
}
