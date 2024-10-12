//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numeros numeros = new Numeros(10, 5, "return a + b");

        try {
            Class<?> numerosClass = numeros.getClass();
            Method operarMethod = numerosClass.getMethod("operar");
            Method setScriptMethod = numerosClass.getMethod("setScript", String.class);
            boolean salir = false;

            while(!salir) {
                System.out.println("\n--- Menú de Opciones ---");
                System.out.println("1. Imprimir valores de 'a' y 'b'");
                System.out.println("2. Realizar operación (Suma/Resta)");
                System.out.println("3. Cambiar operación (Suma <-> Resta)");
                System.out.println("4. Salir");
                System.out.print("Selecciona una opción: ");
                switch (scanner.nextLine()) {
                    case "1":
                        System.out.println("Valor de 'a': " + numeros.getA());
                        System.out.println("Valor de 'b': " + numeros.getB());
                        break;
                    case "2":
                        int resultado = (Integer)operarMethod.invoke(numeros);
                        String operacionActual = numeros.getScript().contains("+") ? "Suma" : "Resta";
                        PrintStream var10000 = System.out;
                        String var10001 = operacionActual.toLowerCase();
                        var10000.println("Resultado de la " + var10001 + ": " + resultado);
                        break;
                    case "3":
                        String operacionNueva = numeros.getScript().contains("+") ? "Resta" : "Suma";
                        String nuevoScript = operacionNueva.equals("Suma") ? "return a + b" : "return a - b";
                        setScriptMethod.invoke(numeros, nuevoScript);
                        System.out.println("Operación cambiada a: " + operacionNueva);
                        break;
                    case "4":
                        salir = true;
                        System.out.println("¡Hasta luego!");
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
                }
            }
        } catch (Exception var17) {
            Exception e = var17;
            e.printStackTrace();
        } finally {
            scanner.close();
        }

    }
}
