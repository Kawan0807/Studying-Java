package CursoVideo.Exemplo.Caneta;

public class Caneta {

    // Atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    //Metodos
    public void status(){
        System.out.println("Sobre a caneta:");
        System.out.println("Modelo:" + this.modelo);
        System.out.println("Cor:" + this.cor);
        System.out.println("Ponta:" + this.ponta);
        System.out.println("Carga:" + this.carga);
        System.out.println("Esta tampada? " + this.tampada);

    }


    public void rabiscar(){
       if(this.tampada==true){
           System.out.println("Erro: Não posso rabiscar!");
       }else{
           System.out.println("Rabiscando...");
       }
    }

    public void tampar(){

        this.tampada =true;
    }
    public void destampar(){

        this.tampada =false;
    }
    public void pintar(){

    }
    public void escrever(){

    }


    // Geters e seters


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
}
