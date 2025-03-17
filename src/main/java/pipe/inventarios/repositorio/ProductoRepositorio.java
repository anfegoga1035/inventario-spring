package pipe.inventarios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import pipe.inventarios.modelo.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {
}
