package pipe.inventarios.controlador;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pipe.inventarios.modelo.Producto;
import pipe.inventarios.servicio.ProductoServicio;

import java.util.List;

@RestController
@RequestMapping("/inventario-app")
@CrossOrigin(value = "http://localhost:4200") //puerto de angular
public class ProductoControlador {
    private static final Logger logger = LoggerFactory.getLogger(ProductoControlador.class);

    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        List<Producto> productos = productoServicio.listarProductos();
        logger.info("Productos obtenidos");
        productos.forEach(producto -> logger.info(producto.toString()));
        return productos;
    }

    @PostMapping("/productos")
    public Producto agregarProducto(@RequestBody Producto producto) {
        logger.info("Producto a agregar" + producto);

        return productoServicio.guardarProducto(producto);
    }

}
