package CursoVideo.Exemplo.Caneta;

public class Main {
    public static void main(String[] args) {



        Caneta C1 = new Caneta("BIC", "Azul",0.5f,80, true);
        System.out.println(" ");
        C1.setCor("AZUL");
        C1.setModelo("BIC");
        C1.setPonta(0.5f);
        C1.setCarga(80);
        C1.setTampada(true);


        System.out.println("" + C1.getModelo());



    }
}