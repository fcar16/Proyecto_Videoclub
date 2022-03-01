package interfaces;

public interface IClient {
	// Obtiene el id del cliente
	String getId();

	// Setea el id del cliente
	void setId(String id);

	// Obtiene el nombre del cliente
	String getName();

	// Setea el nombre del cliente
	void setName(String name);

	// Obtiene el n�mero de tel�fono del cliente
	String getPhone();

	// Setea el n�mero de tel�fono del cliente
	void setPhone(int phone);

	// Obtiene la fecha y hora de alta del cliente
	String getTime();

	// Setea el n�mero de tel�fono del cliente
	void setTime(String time);

	// Compara la existencia de un cliente por el atributo Id
	boolean equals(Object o);

	// Obtiene el hash de un cliente
	int hashCode();

	// Obtiene los datos de un cliente
	String toString();
}
