package medievalworld.armas;

import medievalworld.Guerrero;

public class Lanza implements Arma {
	@Override
	public void restarPuntos(Guerrero atacante, Guerrero rival) {
		rival.recibirDanio(30);
		atacante.desarmar();
	}
}
