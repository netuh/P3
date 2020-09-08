package logica;

public enum DiasDaSemana{
	DOMINGO(2),
	SEGUNDA(1),
	TERCA(1),
	QUARTA(1),
	QUINTA(1),
	SEXTA(1),
	SABADO(1.5F);
	
	private float multiplicador;
	
	DiasDaSemana (float multi){
		multiplicador = multi;
	}
	
	public float getMultiplicadorHora() {
		return multiplicador;
	}
}