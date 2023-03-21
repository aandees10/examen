package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Main.CuentaBancaria;

class Pruebas {

	CuentaBancaria cb = new CuentaBancaria();

	@Test
	void test() {
		cb.agregarSaldo(5000);
        assertEquals(5000, cb.obtenerSaldo());
	}
	
	@Test
	void test1() throws Exception {
		cb.agregarSaldo(3000);
		cb.solicitarPrestamo(5000);
        assertEquals(8000, cb.obtenerSaldo());
	}
	
	@Test
	void test2() throws Exception {
		cb.agregarSaldo(2000);
		cb.solicitarPrestamo(1000);
		cb.agregarSaldo(300);
        assertEquals(3000, cb.obtenerSaldo());
	}

}
