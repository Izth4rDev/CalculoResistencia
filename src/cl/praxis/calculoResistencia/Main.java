package cl.praxis.calculoResistencia;
import java.util.Scanner;
import java.awt.desktop.SystemEventListener;
import java.sql.SQLOutput;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        float r1;
        float r2;
        float r3;

        Scanner sc = new Scanner(System.in);

        do {

            System.out.println("ingrese la primera resistencia");
            r1 = sc.nextFloat();

            if(r1<0){
                System.out.println("debe ser mayor a 0");
            }

        }while(r1<0);

        do {

            System.out.println("ingrese la segunda resistencia");
            r2 = sc.nextFloat();

            if(r2<0){
                System.out.println("debe ser mayor a 0");
            }

        }while(r2<0);

        do {
            System.out.println("ingrese la tercera resistencia");
            r3 = sc.nextFloat();

            if(r3<0){
                System.out.println("debe ser mayor a 0");
            }

        }while(r3<0);

        //calculo resistencia

        float resultado = 1/((1/r1)+(1/r2)+(1/r3));

        System.out.println("La resistencia total es de: "+resultado);
    }
}