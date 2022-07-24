package CursoVideo.Atividade.Escola;

import java.util.Scanner;

public class Funcionario extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public Funcionario(String nome, int idade, String sexo, String setor, boolean trabalhando) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public void mudarTrabalho(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o seu novo trabalho: ");
        this.setor = entrada.nextLine();

    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "setor='" + setor + '\'' + ", trabalhando=" + trabalhando +
                "} " + super.toString();
    }
}
