package persistence;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private Connection conexao;
    
    public Connection abrirConexao() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/proj_escalacoma?userTimezone=true&serverTimezone=UTC";
        String user = "root";
        String password = "";
        
        conexao = DriverManager.getConnection(url, user, password);
        
        return conexao;
    }
    
    public Connection fecharConexao() throws SQLException{
       conexao.close();
       
       return conexao;
    }
}
