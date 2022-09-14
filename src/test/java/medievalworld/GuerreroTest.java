package medievalworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerreroTest {
	@Test
	void test_un_guerrero_ataca_con_una_espada_a_un_oponente_con_una_lanza() {
		Guerrero unGuerrero = new Guerrero(100, "Lannister", "espada", 0);
		Guerrero otroGuerrero = new Guerrero(100, "Stark", "lanza", 0);
		unGuerrero.atacarA(otroGuerrero);
		unGuerrero.atacarA(otroGuerrero);

		assertEquals(80, otroGuerrero.hp());
	}

	@Test
	void test_un_guerrero_ataca_con_una_espada_a_un_oponente_con_un_escudo() {
		Guerrero unGuerrero = new Guerrero(100, "Lannister", "espada", 0);
		Guerrero otroGuerrero = new Guerrero(100, "Stark", "escudo", 0);
		unGuerrero.atacarA(otroGuerrero);

		assertEquals(95, otroGuerrero.hp());
	}

	//	Otros tests
}
