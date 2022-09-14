package medievalworld;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Getter @Accessors(fluent = true)
public class Guerrero {
	private int hp;
	private final String casa;
	private String arma;
	private int cantidadDagas;

	public void atacarA(Guerrero oponente) {
		if (this.arma.equals("espada")) {
			if (oponente.arma.equals("escudo")) oponente.recibirDanio(5);
			else oponente.recibirDanio(10);
		} else if (this.arma.equals("hacha")) {
			oponente.recibirDanio(20);
			this.recibirDanio(5);
		} else if (this.arma.equals("lanza")) {
			oponente.recibirDanio(30);
			this.desarmar();
		} else if (this.arma.equals("dagas")) {
			if (cantidadDagas > 0) {
				oponente.recibirDanio(5);
				cantidadDagas--;
			}
		} else if (this.arma.equals("punios"))
			oponente.recibirDanio(1);
	}

	private void recibirDanio(int danio) {
		this.hp -= danio;
	}

	private void desarmar() {
		this.arma = "punios";
	}
}
