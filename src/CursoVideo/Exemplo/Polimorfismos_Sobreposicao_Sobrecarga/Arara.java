package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Arara extends Ave{
    public Arara(double peso, int idade, int membros, String corPena) {
        super(peso, idade, membros, corPena);
    }

    @Override
    public void fazerNinho() {
        super.fazerNinho();
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
