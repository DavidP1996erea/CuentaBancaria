package principal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cuenta cuenta1 = new Cuenta("David","1545",8, 500 );
        Cuenta cuenta2 = new Cuenta("Ruben", "7878", 9, 13500 );
        Cuenta cuentaCopia =(cuenta1);


        cuenta1.ingresar(500);

        System.out.println(cuenta1.getSaldo());

        cuenta1.reintegro(250);
        System.out.println(cuenta1.getSaldo());

        cuenta2.transferencia(cuenta2,cuenta1, 13000);

        System.out.println(cuenta1.getSaldo());
        System.out.println(cuenta2.getSaldo());
        System.out.println(cuentaCopia.getSaldo());





    }
}
