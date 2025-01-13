package comunicacion;

public class Fabula extends Escrito {
	
	private String ensenanzas;
	private String interpretacion;
	
	public Fabula (String origen, String titulo, String autor, int paginas, 
					String ensenanzas, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanzas = ensenanzas;
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina;
	}

	@Override
	public String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		return  this.getOrigen() + "\n" +
				this.getTitulo() + "\n" +
				this.getAutor() + "\n" +
				this.getPaginas() + "\n" +
				this.getEnsenanza();
	}

	public String getEnsenanza() {
		return ensenanzas;
	}

	public void setEnsenanzas(String ensenanzas) {
		this.ensenanzas = ensenanzas;
	}

}
