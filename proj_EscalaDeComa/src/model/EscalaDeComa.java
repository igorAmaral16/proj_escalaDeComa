package model;

public class EscalaDeComa {
    
    private String variavel;
    private Integer score;

    public String getVariavel() {
        return variavel;
    }

    public void setVariavel(String variavel) {
        this.variavel = variavel;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
    
    public int calcularScore(int aberturaOcular, int respostaVerbal, int respostaMotora, int respostaOcular){
        
        return aberturaOcular + respostaVerbal + respostaMotora + respostaOcular;
    }
    
    
}
