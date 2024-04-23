import java.util.Scanner;

import A_AnálisisEvolución.Código_Java;
import B_DiseñoClasesAvanzado.Main_B;
import C_SimulaciónCompleja.Main_C;
import D_ModeladoObjComplejosYClases.Main_D;
import E_HerenciaYRelaciones.Main_E;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nPor favor, elige una opción:");
            System.out.println("1. Ejecutar Main_A");
            System.out.println("2. Ejecutar Main_B");
            System.out.println("3. Ejecutar Main_C");
            System.out.println("4. Ejecutar Main_D");
            System.out.println("5. Ejecutar Main_E");
            System.out.println("6. Salir");
            System.out.print("Opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Código_Java.main(args);
                    break;
                case 2:
                    Main_B.main(args);
                    break;
                case 3:
                    Main_C.main(args);
                    break;
                case 4:
                    Main_D.main(args);
                    break;
                case 5:
                    Main_E.main(args);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elige una opción del 1 al 6.");
                    break;
            }
        } while (opcion != 6);

        scanner.close();
    }
}