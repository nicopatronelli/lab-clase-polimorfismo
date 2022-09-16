package medievalworld;

import java.util.stream.IntStream;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import medievalworld.armas.Dagas;
import medievalworld.armas.Escudo;
import medievalworld.armas.Espada;
import medievalworld.armas.Hacha;
import medievalworld.armas.Lanza;
import medievalworld.armas.Punios;

import static org.junit.jupiter.api.Assertions.*;

class GuerreroTest {
	@Test
	@DisplayName("Cuando un guerrero con espada ataca a otro con escudo le quita 5 puntos de hp")
	void test_un_guerrero_con_espada_ataca_dos_veces_a_otro_con_escudo() {
		Guerrero atacante = new Guerrero(100, "Stark" , new Espada());
		Guerrero rival = new Guerrero(100, "Lannister", new Escudo());

		atacante.atacarA(rival);
		atacante.atacarA(rival);

		assertEquals(90, rival.hp());
	}

	@Test
	@DisplayName("Cuando un guerrero con lanza ataca a otro con dagas le quita 30 hp y pierde la lanza")
	void test_un_guerrero_con_lanza_ataca_a_otro_con_dagas() {
		Guerrero atacante = new Guerrero(100, "Stark", new Lanza());
		Guerrero rival = new Guerrero(100, "Lannister", new Dagas(2));

		atacante.atacarA(rival);

		assertEquals(70, rival.hp());
		assertTrue(atacante.arma() instanceof Punios);
	}

	@Test
	@DisplayName("Cuando un guerrero con espada ataca a otro con escudo cinco veces seguidas le quita 25 hp")
	void un_guerrero_con_hacha_ataca_cinco_veces_a_otro_con_escudo() {
		Guerrero atacante = new Guerrero(150, "Stark", new Hacha());
		Guerrero rival = new Guerrero(120, "Lannister", new Escudo());

		IntStream.rangeClosed(1, 5).forEach(__ -> atacante.atacarA(rival));

		assertEquals(125, atacante.hp());
		assertEquals(20, rival.hp());
	}

	@Test
	@DisplayName("Cuando un guerrero con dos dagas ataca dos veces a otro le quita 10 puntos de hp y queda desarmado")
	void un_guerrero_con_dos_dagas_ataca_dos_veces_a_otro_con_lanza() {
		Guerrero atacante = new Guerrero(100, "Lannister", new Dagas(2));
		Guerrero rival = new Guerrero(100, "Stark", new Lanza());

		atacante.atacarA(rival);
		atacante.atacarA(rival);

		assertEquals(90, rival.hp());
		assertTrue(atacante.arma() instanceof Punios);
	}

	// Otros tests
}
