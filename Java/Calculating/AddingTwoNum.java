import java.util.Scanner;

public class AddingTwoNum {
    
    public int num;
    public int num2;
    public int soma;

    public void numero1(int x) {
        num = x;
    }

    public void numero2(int y) {
        num2 = y;
    }

    public int resultado() {
        soma = num + num2;
        return soma;
    }

    public static void main(String[] args) {
        
        AddingTwoNum conta = new AddingTwoNum();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor de n1: ");
        conta.numero1(scanner.nextInt());
        System.out.println("Informe o valor de n2: ");
        conta.numero2(scanner.nextInt());
        System.out.println("O resultado da soma entre " + conta.num + " e " + conta.num2 + 
        " é: " + conta.resultado());

        scanner.close();

    }

}
