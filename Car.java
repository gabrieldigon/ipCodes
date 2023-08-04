import javax.lang.model.util.ElementScanner6;

public class Car{
    private String placa;
    private boolean motor;
    private int velocidade;

    public String getPlaca(){
        return this.placa;
    }

    public boolean getMotor(){
        return this.motor;
    }

    public int getVelocidade(){
        return this.velocidade;
    }

    public void setPlaca(String placaInputada){
        this.placa = placaInputada;
    }

    public void setMotor(boolean hasMotor){
        this.motor = hasMotor;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    public void digaEstado(){
         String estadoMotor = "zero"; 
        if (getMotor() == false){
            estadoMotor = "Desligado";
        }
        else{
            estadoMotor = "Ligado";
        }
        System.out.println("Eu sou o carro: " + getPlaca() + " ,meu Motor esta: " + estadoMotor + "  atualmente estou a: " + getVelocidade() + "km/hr");
    }

    public void acelerar(){
        setVelocidade(getVelocidade() + 10); 
    }
    public void frear(){
        setVelocidade(getVelocidade() - 10); 
    }
    public void ignicao(){
        if (getMotor() == true){
            setMotor(false);
            System.out.println("crcrcrcrccrr");
        }
        else{
            setMotor(true);
            System.out.println("VRummmmmmm");
        }
        
        
    }
}


//set sao void pq nao retornam nada
// os outros retornam ent tu tem que falar