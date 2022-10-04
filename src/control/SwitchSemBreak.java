package control;

import java.util.Locale;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String faixa = "vermelha";

        switch (faixa.toLowerCase()){
            case "preta":
                System.out.println("Sei o Bassai-dai");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Tekki Godan");
                case "verde":
                System.out.println("Sei o Tekki Yodan");
                case "laranja":
                System.out.println("Sei o Tekki Sandan");
                case "vermelha":
                System.out.println("Sei o Tekki Nidan");
                case "amarela":
                System.out.println("Sei o Tekki Shodan");
        }
        int idade = 3;
        switch (idade) {
            case 3:
                System.out.println("Sabe programar");
            case 2:
                System.out.println("Sabe falar");
            case 1:
                System.out.println("Sabe andar");
            case 0:
                System.out.println("Sabe engatinhar");
        }
    }
}
