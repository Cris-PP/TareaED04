package cuentas;

/**
 * La clase Main es la clase principal de la aplicación. Ejecuta una operativa de cuenta
 * en una instancia de la clase CCuenta.
 */
public class Main {

    /**
     * Método principal que ejecuta la operativa de cuenta.
     * @param args argumentos de la línea de comandos (no se utilizan)
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    /**
     * Ejecuta una operativa de cuenta en una instancia de la clase CCuenta.
     * @param cantidad cantidad a ingresar en la cuenta
     */
   private static void operativa_cuenta(float cantidad) {
      CCuenta miCuenta;
      double saldoActual;
      
      miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
      saldoActual = miCuenta.estado();
      System.out.println("El saldo actual es "+ saldoActual );
      
      try {
         miCuenta.retirar(2300);
      } catch (Exception e) {
         System.out.print("Fallo al retirar");
      }
      try {
         System.out.println("Ingreso en cuenta");
         miCuenta.ingresar(695);
      } catch (Exception e) {
         System.out.print("Fallo al ingresar");
      }
   }
}
