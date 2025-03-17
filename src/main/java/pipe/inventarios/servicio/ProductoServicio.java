package pipe.inventarios.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pipe.inventarios.modelo.Producto;
import pipe.inventarios.repositorio.ProductoRepositorio;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> listarProductos() {
        return productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        Producto producto =  productoRepositorio.findById(idProducto).orElse(null);
        return producto;
    }

    @Override
    public Producto guardarProducto(Producto producto) {
       return productoRepositorio.save(producto);

    }

    @Override
    public void eliminarProductoPorId(Integer idProducto) {
        productoRepositorio.deleteById(idProducto);

    }

}
