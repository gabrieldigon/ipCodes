public class Main {

    public static void main(String[] args){
        Car carro01 = new Car();

        //sets
        carro01.setPlaca("phj1234");
        carro01.setMotor(false);
        carro01.setVelocidade(0);

        //gets
        System.out.println("Placa:" + carro01.getPlaca());
        System.out.println("Motor:"+ carro01.getMotor());
        System.out.println("Velocidade:"+ carro01.getVelocidade());
        carro01.digaEstado();

        carro01.ignicao();
        carro01.digaEstado();

        carro01.acelerar();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.acelerar();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.acelerar();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.acelerar();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.acelerar();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.acelerar();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");

        carro01.frear();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.frear();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.frear();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.frear();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.frear();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");
        carro01.frear();
        System.out.println("minha nova velocidade apos acelerar: " + carro01.getVelocidade() + "km/hr");

        carro01.ignicao();
        carro01.digaEstado();
    }

}