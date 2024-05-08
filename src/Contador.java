import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        int firstNumber = 0;
        int secondNumber = 0;

        try {
            System.out.println("what is your first number ?");
            firstNumber = scan.nextInt();

            System.out.println(("what is your second number ?"));
            secondNumber = scan.nextInt();

        }catch (InputMismatchException e) {
            System.out.println("some input is inválid, please, type the correct int number");
        }

        try {
            contar(firstNumber,secondNumber);

        }catch (ParametrosInvalidosException e) {
            System.out.println("sorry, but the first number is bigger than second number");
            e.printStackTrace();
        }
    }

    static void contar(int firstNumber, int secondNumber) throws ParametrosInvalidosException {
        if(firstNumber > secondNumber) throw new ParametrosInvalidosException();

        int contagem = secondNumber - firstNumber;

        for(int c = 1; c <= contagem; c++) {
            System.out.println(c);
        }

    }
}