package comunicacion;

import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	
	private String[] letras = new String [] {
			"A", "B", "C", "D", "E", "F", "G", "H",
			"I", "J", "K", "L", "M", "N", "O", "P",
			"Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
	
	private String interpretacion;
	
	public Alfabeto (String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		
		ArrayList<String> abecedario = new ArrayList<String>();
		
		for (String letra : letras) {
			if (letra.equals("Z")) {
				abecedario.add(letra);
			} else {
				abecedario.add(letra + ", ");
			}
			
		}
		String retorno = String.join(", ", letras);
		
		return retorno;
		
	}
	
	
	public int cantidadLetras() {
		return letras.length;
	}

 	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

}
