package CursoVideo.Exemplo.Polimorfismos_Sobreposicao_Sobrecarga;

public class Cachorro extends Lobo{

    public Cachorro(double peso, int idade, int membros, String corPelo) {
        super(peso, idade, membros, corPelo);
    }

    /* Polimorfismos de sobrecarga */

    public void reagir(String frase){
        if((frase=="toma comida") || (frase=="Olá")){
            System.out.println("Abanar e Latir");
        }else{
            System.out.println("Rosnar");
        }
    }
    public void reagir(int hora, int min){
        if(hora<12){
            System.out.println("Abanar");
        }else if(hora>=18){
            System.out.println("Ignorar");
        }else{
            System.out.println("Abanar e Latir");
        }
    }
    public void reagir(Boolean dono){
       if(dono == true){
           System.out.println("Abanar");
       }else{
           System.out.println("Rosnar e Latir");
       }
    }
    public void reagir(int idade, double peso){
        if(idade<5){
            if(peso<10){
                System.out.println("Abanar");
            }else{
                System.out.println("Latir");
            }
        }
        else{
            if(peso<10){
                System.out.println("Rosnar");
            }else{
                System.out.println("Ignorar");
            }
        }
    }
    /* Polimorfismos de sobreposição */
    public void enterrarOsso(){
        System.out.println("Enterrando osso...");
    }
    public void abanarRabo(){
        System.out.println("Abanando o rabo...");
    }

    @Override
    public void locomover() {
        super.locomover();
    }

    @Override
    public void alimentar() {
        super.alimentar();
    }

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au! Au!");
    }
}
