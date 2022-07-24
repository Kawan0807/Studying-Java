package CursoVideo.Exemplo.Banco;

public class executando {
    public static void main(String[] args) {
         ContaBanco p1 = new ContaBanco();
         p1.setNumConta(111);
         p1.setDono("Jubileu");
         p1.abrirConta("CC");

         ContaBanco p2 = new ContaBanco();
         p2.setNumConta(222);
         p2.setDono("Creuza");
         p2.abrirConta("CP");

         p1.depositar(100.0);
         p2.depositar(500.0);

         p1.sacar(150.0);
         p2.sacar(200.0);
         p1.fechaConta();
         p1.estadoAtual();
         p2.estadoAtual();
    }
}
