package CursoVideo.Atividade.Biblioteca;

public class projetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Kawan", 22, "Masculino");
        p[1] = new Pessoa("Kyara", 6, "Feminino");

        l[0] = new Livro("Aprendedo Java", "José da Silva", 300, p[0]);

        l[1] = new Livro("POO para Iniciantes", "Pedro Paulo", 500, p[1]);

        l[2] = new Livro("Java Avançado", "Maria  Candido", 800, p[0]);


        System.out.println("");
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());
    }
}
