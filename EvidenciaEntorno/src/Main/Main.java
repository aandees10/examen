package Main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CuentaBancaria cb = new CuentaBancaria();
		try {
			cb.agregarSaldo(5000);
			cb.agregarSaldo(200);
			cb.agregarSaldo(300);
			cb.retirarSaldo(1000);
			cb.solicitarPrestamo(10000);
			cb.obtenerPrestamo();
		} catch (Exception e) {
		}
	}

}
