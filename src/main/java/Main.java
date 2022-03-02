import auto.Auto;
import utility.KeyboardInput;
import utility.Zklavesnice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int vek = Zklavesnice.readInt("Zadajte vek");
        System.out.println("Vek zklavesnice je:"+vek);

        System.out.println("----------------------------------");

//        vek = KeyboardInput.readInt("Zadajte vek",2);
//        System.out.println("Vek keyboardinput:" + vek);
//
//        System.out.println("------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadajte vek:");
        vek = scanner.nextInt();
        System.out.println("Vek scanner:" + vek);

    }
}
