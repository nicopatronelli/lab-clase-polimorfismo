package medievalworld.armas;

import medievalworld.Guerrero;

public class Hacha implements Arma{
	@Override
	public void restarPuntos(Guerrero atacante, Guerrero rival) {
		rival.recibirDanio(20);
		atacante.recibirDanio(5);
	}
}
