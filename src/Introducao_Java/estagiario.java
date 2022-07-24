package Introducao_Java;

public class estagiario extends Colaborador implements Funcoes{

    public estagiario(String paramentroNome, int paramentroIdade, String paramentroFormacao) {
        super(paramentroNome, paramentroIdade, paramentroFormacao);
    }

    String cargo;
    String salario;


    @Override
    public void retornaImposto() {

    }
}
