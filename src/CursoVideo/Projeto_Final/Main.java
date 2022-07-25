package CursoVideo.Projeto_Final;

import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {

        Video[] v = new Video[3];
        v[0] = new Video("Java Web");
        v[1] = new Video("Java API");
        v[2] = new Video("Java Back-End");

        Gafanhoto[] g = new Gafanhoto[2];
        g[0] = new Gafanhoto("Kawan",22,"Masculino","kawanmelofernandes@gmail.com");
        g[1] = new Gafanhoto("Kyara",6,"Feminino","kyaramelofernandes@gmail.com");

        Visualizacao[] vis = new Visualizacao[5];

        vis[0] = new Visualizacao(g[0], v[0]); // Kawan assiste Jav Web
        vis[0].avaliar(95.0f);
        v[0].like();
        v[0].play();
        System.out.println(vis[0].toString());

        System.out.println("");

        vis[1] = new Visualizacao(g[0],v[1]); // Kawan assiste Jav API
        vis[1].avaliar();
        v[1].like();
        v[0].play();
        System.out.println(vis[1].toString());
        /*System.out.println(" <<< Videos >>> ");
        System.out.println("");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("");
        System.out.println(" <<< Gafanhotos >>>> ");;
        System.out.println(" ");
        System.out.println(g[0].toString());
        System.out.println("");
        System.out.println(g[1].toString());
*/


    }
}
