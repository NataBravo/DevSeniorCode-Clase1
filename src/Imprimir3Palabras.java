import java.util.Scanner;

public class Imprimir3Palabras {
    public static void main(String[] args) {
        var teclado = new Scanner(System.in);
        System.out.println("Por favor, introduzca la palabra 1: ");
        var palabra1 = teclado.nextLine();
        System.out.println("Por favor, introduzca la palabra 2: ");
        var palabra2 = teclado.nextLine();
        System.out.println("Por favor, introduzca la palabra 3: ");
        var palabra3 = teclado.nextLine();

        System.out.println(palabra1 + " " + palabra2 + " " +  palabra3);
    }
}
