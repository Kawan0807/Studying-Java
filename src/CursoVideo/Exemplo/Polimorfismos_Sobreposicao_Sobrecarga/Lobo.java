package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Lobo extends Mamifero{
    public Lobo(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void locomover() {
        super.locomover();
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo um alce fresquinho...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuu!");
    }
}
