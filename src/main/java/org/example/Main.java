package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer contadorBueno = 0;
        Integer contadorMalo = 0;
        String contraUsuario;
        Integer numContra = 0;
        Integer contadorIntentos = 0;

        System.out.print("Digita el numero de contrasenas: ");
        numContra = scanner.nextInt();

        do {
            contadorIntentos = contadorIntentos + 1;
            System.out.println("Digite la contrasena: ");
            contraUsuario = scanner.next();
            Integer contadorLetras = contraUsuario.length();
            if (contadorLetras >= 8) {
                contadorBueno = contadorBueno + 1;
            } else {
                contadorMalo = contadorMalo + 1;
            }

        } while (contadorIntentos < numContra);

        System.out.println("El numero de contrasenas buenas es: " + contadorBueno);
        System.out.println("El numero de contrasenas malas es: " + contadorMalo);
    }

}