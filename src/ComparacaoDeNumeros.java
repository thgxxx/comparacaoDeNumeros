import java.util.Scanner;

public class ComparacaoDeNumeros {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);

        System.out.println("Olá! Seja bem-vindo(a) ao programa Qual número é maior!");
        System.out.println("Quer começar o programa? Sim/Não");
        String simOuNao = ask.nextLine();

        if (simOuNao.equalsIgnoreCase("sim")) {
            System.out.println("Perfeito! vamos lá! Press Enter");

            ask.nextLine(); //esse scanner é só para prevenir um bug, e tbm achei daora a estetica do press enter haha

            System.out.println("Digite o primeiro número: ");
            int numberOne = ask.nextInt();
            System.out.println("Digite o segundo número:");
            int numberTwo = ask.nextInt();

            if (numberOne > numberTwo) {
                System.out.println("O Primeiro número: " + numberOne + ". É maior! pois o segundo é: " + numberTwo + ".");
            } else if (numberOne < numberTwo) {
                System.out.println("O segundo número: " +numberTwo + ". É maior! pois o primeiro é: " +numberOne+ ".");
            } else {
                System.out.println("Os números são iguais!");
            }

        } else {
            System.out.println("Que pena! Nos vemos numa próxima!");
        }

        ask.close();

    }
}
