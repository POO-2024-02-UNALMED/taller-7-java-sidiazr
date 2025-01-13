package comunicacion;

public class Fabula extends Escrito {
	
	private String enseñanzas;
	private String interpretacion;
	
	public Fabula (String origen, String titulo, String autor, int paginas, 
					String enseñanzas, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.enseñanzas = enseñanzas;
		this.interpretacion = interpretacion;
	}

	@Override
	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina;
	}

	@Override
	String interpretacion() {
		// TODO Auto-generated method stub
		return interpretacion;
	}

	@Override
	public String toString() {
		return  this.getOrigen() + "\n" +
				this.getTitulo() + "\n" +
				this.getAutor() + "\n" +
				this.getPaginas() + "\n" +
				this.getEnseñanzas();
	}

	public String getEnseñanzas() {
		return enseñanzas;
	}

	public void setEnseñanzas(String enseñanzas) {
		this.enseñanzas = enseñanzas;
	}

}
