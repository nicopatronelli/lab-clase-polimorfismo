package medievalworld;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import medievalworld.armas.Arma;
import medievalworld.armas.Escudo;
import medievalworld.armas.Punios;

@AllArgsConstructor
@Getter @Accessors(fluent = true)
public class Guerrero {
	private int hp;
	private final String casa;
	@Setter private Arma arma;

	public void atacarA(Guerrero rival) {
		this.arma.restarPuntos(this, rival);
	}

	public void recibirDanio(int puntosARestar) {
		// Acá pondríamos lógica para validar que los hp no queden con un valor inválido
		this.hp -= puntosARestar;
	}

	public void desarmar() {
		this.arma = new Punios();
	}

	public boolean tieneEscudo() {
		return this.arma instanceof Escudo;
	}
}
