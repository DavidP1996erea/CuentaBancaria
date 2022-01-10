package principal;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cuenta cuenta1 = new Cuenta("David","1545",8, 500 );

        cuenta1.ingresar(500);

        System.out.println(cuenta1.getSaldo());

        cuenta1.reintegro(200);

        System.out.println(cuenta1.getSaldo());



    }
}
