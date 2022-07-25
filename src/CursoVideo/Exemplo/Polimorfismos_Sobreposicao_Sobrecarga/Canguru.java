package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Canguru extends Mamifero{

    public Canguru(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }
    public void usarBolsa(){
        System.out.println("Guardando filhote na bolsa...");
    }
    @Override
    public void locomover() {
        System.out.println("Saltando...");
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
