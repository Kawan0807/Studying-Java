package Introducao_Java;

public class Colaborador implements Funcoes{
    private String nome;
    public int idade;
    public String formacao;

    public Colaborador(String paramentroNome, int paramentroIdade, String paramentroFormacao) {
        this.nome = paramentroNome;
        this.idade = paramentroIdade;
        this.formacao = paramentroFormacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }


    @Override
    public void retornaImposto() {

    }
}
