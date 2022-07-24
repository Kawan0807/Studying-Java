package CursoVideo.Exemplo.Arvore;

public class Bolsista extends Aluno{
    private String bolsa;

    public Bolsista(String nome, int idade, String sexo, int matricula, String curso, String bolsa) {
        super(nome, idade, sexo, matricula, curso);
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){

    }
    public void pafarMensalidade(){

    }

    public String getBolsa() {
        return bolsa;
    }

    public void setBolsa(String bolsa) {
        this.bolsa = bolsa;
    }

    @Override
    public String toString() {
        return "Bolsista{" +
                "bolsa='" + bolsa + '\'' +
                "} " + super.toString();
    }
}
