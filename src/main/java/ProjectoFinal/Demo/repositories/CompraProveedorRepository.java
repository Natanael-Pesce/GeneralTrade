package ProjectoFinal.Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjectoFinal.Demo.models.CompraProveedor;

@Repository 
public interface CompraProveedorRepository extends JpaRepository{

    List<CompraProveedor> findByIdCompraProveedors (int idCompraProveedor);

    List<CompraProveedor> findByNumeroRemito (int numeroRemito);
}
