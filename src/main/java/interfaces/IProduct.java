package interfaces;

public interface IProduct {
	// Obtiene la clave del producto
	String getKey();

	// Setea la clave del producto
	void setKey(String key);

	// Obtiene el nombre del producto
	String getName();

	// Setea el nombre del producto
	void setName(String name);

	// Compara la existencia de un producto por el atributo key
	boolean equals(Object o);

	// Obtiene el hash de un producto
	int hashCode();

	// Obtiene los datos de un producto
	String toString();
}
