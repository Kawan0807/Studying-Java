package CursoVideo.Exemplo.Arvore;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Danilo", 26, "Masculino", 222, "Javascript");
        Bolsista b1 = new Bolsista("Kawan", 22,"Masculino", 333, "Selenium","50%");
        a1.pagarMensalidade();
        b1.pagarMensalidade();
        b1.renovarBolsa();

    }
}
