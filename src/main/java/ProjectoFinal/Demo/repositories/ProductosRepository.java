package ProjectoFinal.Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjectoFinal.Demo.models.Producto;

@Repository 
public interface ProductosRepository extends JpaRepository {

    List<Producto> findByIdProductos (int idProductos);

    List<Producto> findByNombreProductos (String nombreProductos);
    
}
