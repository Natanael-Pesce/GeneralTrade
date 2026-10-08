package ProjectoFinal.Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjectoFinal.Demo.models.DetalleCompra;

@Repository 
public interface DetalleCompraRepository extends JpaRepository {
    
    List<DetalleCompra> findByIdDetalleCompras (int idDetalleCompras);

    List<DetalleCompra> findByCompras (int idCompra);

}
