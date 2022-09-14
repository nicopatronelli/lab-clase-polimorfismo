package medievalworld.armas;

import medievalworld.Guerrero;

// Null Object Pattern: https://en.wikipedia.org/wiki/Null_object_pattern
public class Punios implements Arma{
	@Override
	public void restarPuntos(Guerrero atacante, Guerrero rival) {
		rival.recibirDanio(1);
	}
}
