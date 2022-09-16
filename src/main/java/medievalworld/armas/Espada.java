package medievalworld.armas;

import medievalworld.Guerrero;

public class Espada implements Arma {
	@Override
	public void restarPuntos(Guerrero atacante, Guerrero rival) {
		if (rival.tieneEscudo()) rival.recibirDanio(5);
		else rival.recibirDanio(10);
	}
}
