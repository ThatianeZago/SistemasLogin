
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class LIgaBD {
    public static Connection Ligacao(){
       String url = "jdbc:mysql://localhost:3306/rhcencal?useSSL=false&serverTimezone=UTC";
       String user = "root";
       String password = "";
       Connection liga = null;
        try {
            liga = DriverManager.getConnection(url,user,password);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Erro na tentativa de ligação à base de dados");
            //Logger.getLogger(LigaBD.class.getName()).log(Level.SEVERE, null, ex);
        }
      return liga;
    }
    public static void registaUtilizador(String nome, String email, String morada, int telefone, 
            int nif, String login, String password) throws SQLException{
        
        String query = "INSERT INTO utilizador"
                + "(nome, email,morada,telefone,nif,login,password)" 
                + "VALUES (?,?,?,?,?,?,?)";
        Connection liga = Ligacao();
        PreparedStatement ps = liga.prepareStatement(query);
        ps.setString(1, nome);
        ps.setString(2, email);
        ps.setString(3, morada);
        ps.setInt(4, telefone);
        ps.setInt(5, nif);
        ps.setString(6, login);
        ps.setString(7, password);
        ps.execute();
        
        
    }

    static void atualizaUtilizador(String nome, String email, String morada, String telefone, String NIF, String login, String password) throws SQLException {
    Connection conn = LIgaBD.Ligacao();
       String sql = "UPDATE utilizador SET nome=?, email=?,morada=?,telefone=?,NIF=?,password=? WHERE login = ? ";
       PreparedStatement ps = conn.prepareStatement(sql);
        ps = conn.prepareStatement(sql);
        ps.setString(1, nome);
        ps.setString(2, email);
        ps.setString(3, morada);
        ps.setInt(4, Integer.parseInt(telefone));
        ps.setInt(5, Integer.parseInt(NIF));
     //   ps.setString(6, login);
        ps.setString(6, password);
        ps.setString(7, login);
        //Executa a instrução
        int retorno = ps.executeUpdate();
        if(retorno > 0){
            System.out.printf("Novo registro alterado: ");
        }else{
            System.out.println("Não foi possível alterar os registros!");
}   
    
    }

    static void remove(int p) {
        try {
            PreparedStatement ps=null;
            Connection conexao = LIgaBD.Ligacao();
            ps = conexao.prepareStatement("DELETE FROM utilizador WHERE login ='" +Login.login+"'");
            ps.executeUpdate();
            //pstmnt.executeBatch();
            System.out.println("Removed User :" + Login.login);
        } catch (SQLException e) {System.out.println("Error: " + e.getMessage()); }
    }
 }
