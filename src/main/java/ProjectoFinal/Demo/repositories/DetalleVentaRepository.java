package ProjectoFinal.Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjectoFinal.Demo.models.DetalleVenta;

@Repository 
public interface DetalleVentaRepository extends JpaRepository{
    
    List<DetalleVenta> findByIdDetalleVentas (int idDetalleVenta);
}
