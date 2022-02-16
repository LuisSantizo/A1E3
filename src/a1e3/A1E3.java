import java.util.Scanner;

public class A1E3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //definir variables
        int PrimerNumero;
        int Doble;
        int Triple;
        
        //pedir el numero 
        System.out.print("Ingrese el numero, para calcular su doble y su triple: ");
        PrimerNumero = scanner.nextInt();
        
        //hacer las operaciones 
        Doble = 2 * PrimerNumero;
        Triple = 3 * PrimerNumero;

        System.out.println("El doble de " + PrimerNumero + " es: " + Doble);
        System.out.println("El triple de " + PrimerNumero + " es: " + Triple);
    }

}
