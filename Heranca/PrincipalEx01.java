package Heranca;

public class PrincipalEx01 {
    public static void main(String[] args) {
        Automovel carro = new Automovel("Toyota", "Corolla", 2022, "Prata", 4, "1.8 Flex");
        System.out.println("Automóvel:");
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Portas: " + carro.getNumeroPortas());
        System.out.println("Motor: " + carro.getMotor());

        System.out.println();

        Moto moto = new Moto("Honda", "CG 160", 2023, "Vermelha", 160);
        System.out.println("Moto:");
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano: " + moto.getAno());
        System.out.println("Cor: " + moto.getCor());
        System.out.println("Cilindrada: " + moto.getCilindrada());
    }
}