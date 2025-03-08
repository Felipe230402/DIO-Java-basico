package edu.Felipe.Primeirasemana;
public class Myclass {
    public static void main(String[] args) {
        String primeiroNome = "Felipe";
        String segundoNome = "Ribeiro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
