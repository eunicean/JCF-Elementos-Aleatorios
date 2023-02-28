package project;

public class videogame {
	private String id;
	private String Nombre;
	private String price;
	
	public videogame(String id, String nombre, String price) {
		this.id = id;
		this.Nombre = nombre;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
	
	
}
