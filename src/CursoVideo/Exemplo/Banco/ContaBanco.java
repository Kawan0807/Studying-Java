package CursoVideo.Exemplo.Banco;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    public Boolean status;
    public void estadoAtual(){
        System.out.println(" ------------------------------");
        System.out.println("Conta :" + this.getNumConta());
        System.out.println("Tipo :" + this.getTipo());
        System.out.println("Dono :" + this.getDono());
        System.out.println("Saldo :" + this.getSaldo());
        System.out.println("Status :" + this.getStatus());
    }


    public void abrirConta(String t){
           this.setTipo(t);
           this.setStatus(true);
           if(t == "CC"){
               this.setSaldo(50);
           }else if( t == "CP"){
               this.setSaldo(150);
           }
    }
    public void fechaConta(){
        if(this.getSaldo()>0){
            System.out.println("Conta com dinheiro!");
        }else if(this.getSaldo()<0){
            System.out.println("Conta está em débito!");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }

    }
    public void depositar(Double v){
        if(this.getStatus() == true){
            this.setSaldo(this.getSaldo()+v);
            System.out.println("Deposito realizado com sucessa na conto do " + this.getDono());
        }else{
            System.out.println("É impossivel depositar, conta fechada! ");
        }
    }
    public void sacar(Double v){

        if(getStatus()==true){
            if(getSaldo()>= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque realizado na conta de " + this.getDono());
            }
            else{
                System.out.println("Saldo insuficiente para sacar!");
            }
        } else{
            System.out.println("Impossivel sacar de uma conta fechada! ");
        }

    }
    public void pagarMensal(){
        double v = 0;
         if(this.getTipo()== "CC"){
             v=12;
         }else if (this.getTipo()== "CP"){
             v=20;
         }else if (this.getStatus()==true){
           if(this.getSaldo() > v){
               this.setSaldo(this.getSaldo()-v);
               System.out.println("Mensalidade paga com sucesso! por " + this.getDono());
           }else{
               System.out.println("Saldo insuficiente! ");
           }
        }
         else{
             System.out.println("Impossível pagar! ");
         }
    }


    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
