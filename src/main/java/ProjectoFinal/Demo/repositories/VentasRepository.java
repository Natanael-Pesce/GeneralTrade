package ProjectoFinal.Demo.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ProjectoFinal.Demo.models.Venta;

@Repository 
public interface VentasRepository extends JpaRepository{

    List<Venta> findByIdVentas (int idVentas);
    
}
