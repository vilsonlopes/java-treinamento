import java.util.Locale;
import java.util.Scanner;

public class ValorTerreno {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double frenteTerreno;
        double cumprimentoTerreno;
        double valorMetroTerreno;
        double areaTerreno;
        double valorTerreno;

        System.out.println("Qual tamanho da frente do terreno? ");
        frenteTerreno = sc.nextDouble();
        System.out.println("Qual o cumprimento do terreno? ");
        cumprimentoTerreno = sc.nextDouble();
        System.out.println("Qual o valor do metro quadrado? ");
        valorMetroTerreno = sc.nextDouble();

        System.out.println("Valores inseridos: ");
        System.out.printf("Frente = %.1f metros%n", frenteTerreno);
        System.out.printf("Cumprimento = %.1f metros%n", cumprimentoTerreno);
        System.out.printf("Valor do metro quadrado = R$-%.2f reais%n", valorMetroTerreno);

        areaTerreno = frenteTerreno * cumprimentoTerreno;
        valorTerreno = areaTerreno * valorMetroTerreno;

        System.out.println();
        System.out.printf("AREA do terreno: %.2f metros²%n", areaTerreno);
        System.out.printf("PRECO do terreno: R$-%.2f reais%n", valorTerreno);

    }
}