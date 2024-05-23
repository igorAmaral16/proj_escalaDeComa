
package interfaces;

import java.util.ArrayList;
import model.Paciente;

public interface Paciente_JDBC_Interface {
    
    public void inserirPaciente(Paciente paciente) throws Exception;
    public ArrayList<Paciente> listarPacientes() throws Exception;
    public void deletarPaciente()throws Exception;
    public void atualizarPaciente(Paciente paciente)throws Exception;
    public ArrayList<Paciente> buscarPaciente( String cpf) throws Exception;
    public ArrayList<Paciente> buscarPacienteID( int id) throws Exception;
    
}
