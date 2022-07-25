package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Cobra extends Repetil{
    public Cobra(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void locomover() {
        super.locomover();
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo um rato...");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }
}
