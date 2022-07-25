package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Goldfish extends Peixe{
    public Goldfish(double peso, int idade, int membros, String corEscama) {
        super(peso, idade, membros, corEscama);
    }

    @Override
    public void soltarBolha() {
        super.soltarBolha();
    }

    @Override
    public void locomover() {
        super.locomover();
    }

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }
}
