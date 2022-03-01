package interfaces;

public interface IItem {
	// Obtiene el nombre del item
	String getName();

	// Setea el nombre del item
	void setName(String name);

	// Obtiene la descripci�n del item
	String getDescription();

	// Setea la descripci�n del item
	void setDescription(String description);

	// Obtiene el precio del item
	float getPrice();

	// Setea el precio del item
	void setPrice(float prize);
	
	// Compara la existencia de un item por el atributo name
	boolean equals(Object o);

	// Obtiene el hash de un item
	int hashCode();

	// Obtiene los datos de un item
	String toString();
}
