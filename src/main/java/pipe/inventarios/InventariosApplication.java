package pipe.inventarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pipe.inventarios.modelo.Producto;

@SpringBootApplication
public class InventariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventariosApplication.class, args);


		Producto producto = new Producto();
		producto.setDescripcion("Camisa azul");
		producto.setPrecio(100.0);
		producto.setExistencia(10);

		System.out.println(producto);
	}
}
