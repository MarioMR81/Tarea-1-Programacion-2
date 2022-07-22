import java.util.Scanner;

public class Nombre {

    public static void main(String[] args){

        Scanner ingreso = new Scanner(System.in);
        String n,p;
        System.out.println("Ingrese Primer Nombre");

        n = ingreso.nextLine();
        System.out.println("Ingrese Primer Apellido");
        p = ingreso.nextLine();
        System.out.println("Bienvenido a Programacion 2 2022 " + n + " " + p );


    }

}
