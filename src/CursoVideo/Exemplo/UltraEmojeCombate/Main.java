package CursoVideo.Exemplo.UltraEmojeCombate;

public class Main {
    public static void main(String[] args) {

        Lutador L [] = new Lutador[6];

        L[0] = new Lutador ( "Pretty Boy", "França", 31, 1.75f, 68.9f, 11,2,1);
        L[1] = new Lutador( "Putscript", "Brasil", 29, 1.68f, 57.8f, 14,2,3);
        L[2] = new Lutador( "Snapshadow", "EUA", 35, 1.65f, 80.9f, 12,2,1);
        L[3] = new Lutador( "Dead Code", "Austrália", 28, 1.93f, 81.6f, 13,0,2);
        L[4] = new Lutador( "Ufocobol", "Brasil", 37, 1.70f, 119.3f, 5,4,3);
        L[5]= new Lutador( "Nerdaard", "EUA", 30, 1.81f, 105.7f, 12,2,4);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(L[2],L[3]);
        UEC01.lutar();
        System.out.println("");
        System.out.println(" ==============");
        System.out.println("");
        L[2].status();
        L[3].status();
    }
}
