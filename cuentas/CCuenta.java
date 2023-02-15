package cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria con un saldo, un titular, un
 * número de cuenta y un tipo de interés.
 */
public class CCuenta {

   /**
    * Nombre del titular de la cuenta.
    */
   private String nombre;

   /**
    * Número de cuenta de la cuenta.
    */
   private String cuenta;

   /**
    * Saldo actual de la cuenta.
    */
   private double saldo;

   /**
    * Tipo de interés aplicado a la cuenta.
    */
   private double tipoInterés;

   /**
    * Constructor por defecto de la clase CCuenta. Inicializa todas las
    * variables a 0 o null.
    */
   public CCuenta() {
   }

   /**
    * Constructor de la clase CCuenta que recibe los valores iniciales para el
    * nombre, la cuenta y el saldo. El tipo de interés se inicializa a 0.
    *
    * @param nom nombre del titular de la cuenta
    * @param cue número de cuenta de la cuenta
    * @param sal saldo inicial de la cuenta
    */
   public CCuenta(String nom, String cue, double sal) {
      nombre = nom;
      cuenta = cue;
      saldo = sal;
   }

   /**
    * Constructor de la clase CCuenta que recibe los valores iniciales para el
    * nombre, la cuenta, el saldo y el tipo de interés.
    *
    * @param nom nombre del titular de la cuenta
    * @param cue número de cuenta de la cuenta
    * @param sal saldo inicial de la cuenta
    * @param tipo tipo de interés aplicado a la cuenta
    */
   public CCuenta(String nom, String cue, double sal, double tipo) {
      nombre = nom;
      cuenta = cue;
      saldo = sal;
      tipoInterés = tipo;
   }

   /**
    * Obtiene el nombre del titular de la cuenta.
    *
    * @return nombre del titular de la cuenta
    */
   public String getNombre() {
      return nombre;
   }

   /**
    * Establece el nombre del titular de la cuenta.
    *
    * @param nombre nuevo nombre del titular de la cuenta
    */
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   /**
    * Obtiene el número de cuenta de la cuenta.
    *
    * @return número de cuenta de la cuenta
    */
   public String getCuenta() {
      return cuenta;
   }

   /**
    * Establece el número de cuenta de la cuenta.
    *
    * @param cuenta nuevo número de cuenta de la cuenta
    */
   public void setCuenta(String cuenta) {
      this.cuenta = cuenta;
   }

   /**
    * Obtiene el saldo actual de la cuenta.
    *
    * @return saldo actual de la cuenta
    */
   public double getSaldo() {
      return saldo;
   }

   /**
    * Establece el saldo actual de la cuenta.
    *
    * @param saldo nuevo saldo actual de la cuenta
    */
   public void setSaldo(double saldo) {
      this.saldo = saldo;
   }

   /**
    * Obtiene el tipo de interés aplicado a la cuenta.
    *
    * @return tipo de interés aplicado a la cuenta
    */
   public double getTipoInterés() {
      return tipoInterés;
   }

   /**
    * Establece el tipo de interés aplicado a la cuenta.
    *
    * @param tipoInterés nuevo tipo de interés aplicado a la cuenta
    */
   public void setTipoInterés(double tipoInterés) {
      this.tipoInterés = tipoInterés;
   }

   /**
    * Devuelve el saldo actual de la cuenta.
    *
    * @return saldo actual de la cuenta
    */
   public double estado() {
      return getSaldo();
   }

   /**
    * Ingresa una cantidad de dinero en la cuenta.
    *
    * @param cantidad cantidad de dinero a ingresar
    *
    * @throws Exception si la cantidad es negativa
    */
   public void ingresar(double cantidad) throws Exception {
      if (cantidad < 0) {
         throw new Exception("No se puede ingresar una cantidad negativa");
      }
      setSaldo(getSaldo() + cantidad);
   }

   /**
    * Retira una cantidad de dinero de la cuenta.
    *
    * @param cantidad cantidad de dinero a retirar
    *
    * @throws Exception si la cantidad es negativa o mayor que el saldo actual
    */
   public void retirar(double cantidad) throws Exception {
      if (cantidad <= 0) {
         throw new Exception("No se puede retirar una cantidad negativa o nula");
      }
      if (getSaldo() < cantidad) {
         throw new Exception("No hay suficiente saldo en la cuenta");
      }
      setSaldo(getSaldo() - cantidad);
   }
}
