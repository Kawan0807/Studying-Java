package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Tartaruga extends Mamifero{
    public Tartaruga(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    @Override
    public void locomover() {

        System.out.println("Andando beeeeem devagar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo algas...");
    }

    @Override
    public void emitirSom() {
        super.emitirSom();
    }
}
