//Importando uma biblioteca para usar entrada de dados
import java.util.Scanner;

//Abrindo uma classe obrigatória na linguagem Java
public class CalculoMedia{
  
  public static void main(String[] args){
    //Criando um objeto da classe
    Scanner scanner = new Scanner(System.in);

    //Informativo de cabeçalho
    System.out.println("--Calculadora de média de 3 números--");

    //Primeiro número
    System.out.print("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();

    //Segundo número
    System.out.print("Digite o segundo número: ");
    double num2 = scanner.nextDouble();

    //Terceiro número
    System.out.print("Digite o terceiro número: ");
    double num3 = scanner.nextDouble();

    double media = (num1+num2+num3)/3;

    System.out.print("Esse é a média dos 3 números: "+media);

    scanner.close();
  }

}
