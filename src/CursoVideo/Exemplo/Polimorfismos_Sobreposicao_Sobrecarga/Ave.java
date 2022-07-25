package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Ave extends Animal{

    private String corPena;

    public Ave(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }
    public void fazerNinho(){
        System.out.println("Construindo o ninho...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}
