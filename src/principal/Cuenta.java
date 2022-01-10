package principal;

public class Cuenta {

    private String nombre;
    private String numeroCuenta;
    private double tipoInteres;
    private double saldo;


    // Constructor por defecto

   public Cuenta(){

    }


    // Constructor con todos los parámetros

    public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo){

        this.nombre=nombre;
        this.numeroCuenta=numeroCuenta;
        this.tipoInteres=tipoInteres;
        this.saldo=saldo;

    }


    // Método ingreso
    public void ingresar(double importe){

    if(importe<0){

        System.out.println("Operación cancelada.");
    }else{

        System.out.println("Operación realizada correctamente.");
        saldo=saldo+importe;
    }
   }


   // Método reintegro
    public void reintegro(double importe){

       if(importe>saldo){

           System.out.println("Operación cancelada");
       }else{
           System.out.println("Operación realizada correctamente");
           saldo=saldo-importe;
       }

    }


    // Método transferencia
    public void transferencia(double importe){




    }



    // Métodos getters/setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getTipoInteres() {
        return tipoInteres;
    }

    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
