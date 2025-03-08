package edu.Felipe.segundasemana;
import java.util.Scanner;

public class BoletimEstudantil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){    
            limparTela();        
            System.out.print("Digite a média final: "); 
            float mediaFinal = scanner.nextFloat();
            if (mediaFinal == -1)
                break;
            if (mediaFinal < 6)
                System.out.println("Reprovado.");
            else if (mediaFinal == 6)
                System.out.println("Exame de recuperação");
            else
                System.out.println("Aprovado.");

            System.out.println("Pressione Enter para continuar...");
            scanner.nextLine();
            scanner.nextLine();
            limparTela();
        }
        scanner.close();
        System.out.println("Programa encerrado.");
    }

    public static void limparTela() {
        try {
            if (System.getProperty("os.name").contains("Windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }
}
