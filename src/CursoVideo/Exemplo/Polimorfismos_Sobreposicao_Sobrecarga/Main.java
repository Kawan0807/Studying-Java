package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Main {
    public static void main(String[] args) {
        Canguru m1 = new Canguru(85.2, 3, 4,"Marrom");
        Lobo l = new Lobo(6.0, 5, 4,"Preto");
        Cachorro m2 = new Cachorro(5.0, 3, 4,"Branca");
        Cobra r1 = new Cobra(1.5, 6,0, "Verde");
        Tartaruga r2 = new Tartaruga(0.200, 4,4, "Marrom claro");
        Goldfish p = new Goldfish(0.015, 2,3,"Dourado");
        Arara a = new Arara(2.0,4,4, "Amarela com verde ");

        System.out.println(" <<<<< Canguru >>>>>>");
        m1.alimentar();
        m1.locomover();
        m1.emitirSom();
        m1.usarBolsa();
        System.out.println("");
        System.out.println("");

        /* Polimorfismo sobrecarga*/
        System.out.println(" <<<<< Cachorro >>>>>>");
        m2.alimentar();
        m2.emitirSom();
        m2.abanarRabo();
        m2.locomover();
        m2.enterrarOsso();
        System.out.println("<<<<< Reagindo >>>>>>");
        System.out.println("");
        m2.reagir("Olá");
        m2.reagir("Vai apanhar");
        m2.reagir(11,45);
        m2.reagir(21,00);
        m2.reagir(true);
        m2.reagir(false);
        m2.reagir(2,12.4);
        m2.reagir(17, 4.5);
        System.out.println("");
        System.out.println("================");
        System.out.println("");
        System.out.println("");
        System.out.println(" <<<<< Lobo >>>>>>");
        l.locomover();
        l.alimentar();
        l.emitirSom();
        System.out.println("");
        System.out.println("");
        System.out.println(" <<<<< Cobra >>>>>>");
        r1.alimentar();
        r1.emitirSom();
        r1.locomover();
        System.out.println("");
        System.out.println("");
        System.out.println(" <<<<< Tartaruga >>>>>>");
        r2.alimentar();
        r2.emitirSom();
        r2.locomover();
        System.out.println("");
        System.out.println("");
        System.out.println(" <<<<< Peixe dourado >>>>>>");
        p.alimentar();
        p.emitirSom();
        p.locomover();
        System.out.println("");
        System.out.println("");
        System.out.println(" <<<<< Arara >>>>>>");
        a.alimentar();
        a.emitirSom();
        a.locomover();



/*

        m.alimentar();
        m.emitirSom();
        m.locomover();
        System.out.println("");
        r.alimentar();
        r.emitirSom();
        r.locomover();
        System.out.println("");
        p.alimentar();
        p.soltarBolha();
        p.locomover();
        p.emitirSom();
        System.out.println("");
        a.locomover();
        a.fazerNinho();
        a.alimentar();
        a.emitirSom();
*/

    }
}
