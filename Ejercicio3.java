import java.util.Scanner;

    public class Ejercicio3{
        public static void main(String[] args){
            int numero, factorial = 1, x = 1;
            Scanner entrada = new Scanner(System.in);
            System.out.print("Ingrese un valor: ");
            numero = entrada.nextInt();
            if(numero < 0){
                System.out.println("El valor ingresado no se puede calcular.");
            } else {
                while(x <= numero){
                    factorial = factorial * x;
                    x = x+1;
                }
                System.out.println("El factorial del número " + numero + " = " + factorial);

            }
        }
    }