package persistence;

import interfaces.Paciente_JDBC_Interface;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import model.Paciente;

public class Paciente_JDBC implements Paciente_JDBC_Interface{
    
    Connection conexao;
    
    public Paciente_JDBC(Connection conexao){
        this.conexao = conexao;
    }

    @Override
    public void inserirPaciente(Paciente paciente) throws Exception{
        String sql = "{CALL proc_inserirPaciente(?, ?, ?, ?, ?)}";
        PreparedStatement ps;
        
        ps = this.conexao.prepareStatement(sql);
        
        ps.setString(1, paciente.getNome());
        ps.setString(2, paciente.getSobrenome());
        ps.setString(3, paciente.getIdade());
        ps.setString(4, paciente.getCpf());
        ps.setString(5, paciente.getEscalaDeComa());
        ps.execute();
        
        System.out.println("Procedure executada com sucesso!");
        
    }

    @Override
    public ArrayList<Paciente> listarPacientes() throws Exception{
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        
        String sql = "SELECT * FROM paciente";
        
        Statement declaracao = conexao.createStatement();
        ResultSet resposta = declaracao.executeQuery(sql);
        
        while(resposta.next()){
           Paciente paciente = new Paciente();
           
           int id = resposta.getInt("id_paciente");
           int idadeInt = resposta.getInt("idade");
           String idadeString = String.valueOf(idadeInt);
           
           paciente.setID(id);
           paciente.setNome(resposta.getString("nome"));
           paciente.setSobrenome(resposta.getString("sobrenome"));
           paciente.setIdade(idadeString);
           paciente.setCpf(resposta.getString("cpf"));
           paciente.setEscalaDeComa(resposta.getString("escalaDeComa"));
           
           System.out.println("PACIENTE:" + paciente.getID() + paciente.getNome() + paciente.getSobrenome() + paciente.getIdade() + paciente.getCpf() + paciente.getEscalaDeComa());
           
           pacientes.add(paciente);
           
           
           for(Paciente pacientee : pacientes){
               System.out.println(pacientee);
           }
           
        }
        
        return pacientes;
    }

    @Override
    public void deletarPaciente() throws Exception{
        String sql = "DELETE FROM paciente";
        
        PreparedStatement ps;
        
        ps = this.conexao.prepareStatement(sql);
        ps.execute();
        
    }

    @Override
    public String atualizarPaciente(Paciente paciente) throws Exception{
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
