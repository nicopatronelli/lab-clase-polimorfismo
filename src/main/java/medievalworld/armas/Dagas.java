package medievalworld.armas;

import lombok.AllArgsConstructor;
import medievalworld.Guerrero;

@AllArgsConstructor
public class Dagas implements Arma {
	private Integer cantidadDagas;

	@Override
	public void restarPuntos(Guerrero atacante, Guerrero rival) {
		if (cantidadDagas > 0) {
			rival.recibirDanio(5);
			cantidadDagas--;
			if (cantidadDagas == 0) atacante.arma(null);
		}
	}
}
