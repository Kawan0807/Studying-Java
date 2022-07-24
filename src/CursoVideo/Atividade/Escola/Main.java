package CursoVideo.Atividade.Escola;

public class Main {
    public static void main(String[] args) {

        Pessoa mae = new Pessoa("Fatima", 45, "Femenino");
        Aluno p1 = new Aluno("Kawan", 22, "Masculino",222, "HTML");
        Professor p2 = new Professor("João", 30, "Masculino","HTML", 2500);
        Funcionario p3 = new Funcionario("Raissa", 25, "Feminino", "Secretaria", true);
        p1.fazerAniv();

        p2.receberAum();

        System.out.println(" <<< Mãe de todos >>");
        System.out.println(mae.toString());
        System.out.println("");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


        System.out.println("");
        System.out.println("Mudando trabalho!");
        System.out.println("");
        p2.fazerAniv();
        p3.fazerAniv();
        p3.mudarTrabalho();
        p1.cancelarMatr();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());




    }
}
