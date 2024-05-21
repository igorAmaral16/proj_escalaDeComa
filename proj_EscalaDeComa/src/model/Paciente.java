package model;

public class Paciente {

    private Integer ID;
    private String nome;
    private String sobrenome;
    private String idade;
    private String cpf;
    private String escalaDeComa;
    
    public Paciente(){
        
    }
    
    public Paciente(String nome, String sobrenome, String idade, String cpf, String escalaDeComa){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.cpf = cpf;
        this.escalaDeComa = escalaDeComa;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getEscalaDeComa() {
        return escalaDeComa;
    }

    public void setEscalaDeComa(String escalaDeComa) {
        this.escalaDeComa = escalaDeComa;
    }
            
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
