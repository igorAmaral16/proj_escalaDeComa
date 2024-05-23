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
           
           pacientes.add(paciente);
           
        }
        declaracao.close();
        resposta.close();
        
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
    public void atualizarPaciente(Paciente paciente) throws Exception{
         System.out.println("atualizando o paciente: " + paciente.getNome() + paciente.getSobrenome() + paciente.getIdade() + paciente.getCpf() + paciente.getEscalaDeComa());
               
        String sql = "UPDATE paciente SET nome = ?, sobrenome = ?, idade = ?, cpf = ?, escalaDeComa = ? WHERE id_paciente = ?";

        PreparedStatement ps = conexao.prepareStatement(sql);
        
        ps.setString(1, paciente.getNome());
        ps.setString(2, paciente.getSobrenome());
        ps.setString(3, paciente.getIdade());
        ps.setString(4, paciente.getCpf());
        ps.setString(5, paciente.getEscalaDeComa());
        ps.setInt(6, paciente.getID());

        ps.executeUpdate();

        ps.close();
        conexao.close();
    }

    @Override
    public ArrayList<Paciente> buscarPaciente(String cpf) throws Exception{
        ArrayList<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM paciente WHERE cpf = ?";
        
        PreparedStatement declaracao = conexao.prepareStatement(sql);
        declaracao.setString(1, cpf);
        ResultSet resposta = declaracao.executeQuery();
        
        while (resposta.next()) {
            Paciente paciente = new Paciente();
            
            int id = resposta.getInt("id_paciente");
            int idade = resposta.getInt("idade");
            
            paciente.setID(id);
            paciente.setNome(resposta.getString("nome"));
            paciente.setSobrenome(resposta.getString("sobrenome"));
            paciente.setIdade(String.valueOf(idade));
            paciente.setCpf(resposta.getString("cpf"));
            paciente.setEscalaDeComa(resposta.getString("escalaDeComa"));
            
            pacientes.add(paciente);
        }
        
        resposta.close();
        declaracao.close();
        
        return pacientes;
    }
    
    @Override
    public ArrayList<Paciente> buscarPacienteID(int idBusca) throws Exception{
        ArrayList<Paciente> pacientes = new ArrayList<>();
        String sql = "SELECT * FROM paciente WHERE id_paciente = ?";
        
        PreparedStatement declaracao = conexao.prepareStatement(sql);
        declaracao.setInt(1, idBusca);
        ResultSet resposta = declaracao.executeQuery();
        
        while (resposta.next()) {
            Paciente paciente = new Paciente();
            
            int id = resposta.getInt("id_paciente");
            int idade = resposta.getInt("idade");
            
            paciente.setID(id);
            paciente.setNome(resposta.getString("nome"));
            paciente.setSobrenome(resposta.getString("sobrenome"));
            paciente.setIdade(String.valueOf(idade));
            paciente.setCpf(resposta.getString("cpf"));
            paciente.setEscalaDeComa(resposta.getString("escalaDeComa"));
            
            System.out.println("PACIENTE COM ID: " + paciente.getID());
            pacientes.add(paciente);
        }
        
        resposta.close();
        declaracao.close();
        
        return pacientes;
    }
    
}
