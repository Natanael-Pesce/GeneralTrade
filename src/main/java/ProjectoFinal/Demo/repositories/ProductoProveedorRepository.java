package ProjectoFinal.Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface ProductoProveedorRepository extends JpaRepository{

    List<ProductosRepository> findByIdProductosProveedor(int idProductoProveedor);
    
}
