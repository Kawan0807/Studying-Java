package CursoVideo.Exemplo.Caneta;

public class Carteira {

    String modelo;
    String cor;
    String Tecido;
    Boolean estado;

    public void escrever(){
        System.out.println("<<< Carteira(s) >>>");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Tecido: " + this.Tecido);
        System.out.println("Está fechada? " + this.estado);
    }

    public void guardar(){
           if(this.estado == true){
               System.out.println("Não posso guardar dinheiro, a carteira não está aberta");
           }else{
               System.out.println("Guardando o dinheiro!...");
           }
    }
    public void fechada(){
         this.estado = true;
    }
    public void abertar(){
       this.estado = false;
    }


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

    public String getTecido() {
        return Tecido;
    }

    public void setTecido(String tecido) {
        Tecido = tecido;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
