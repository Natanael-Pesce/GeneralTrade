package ProjectoFinal.Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjectoFinal.Demo.models.Proveedor;

@Repository 
public interface ProveedorRepository extends JpaRepository {
    
    List<Proveedor> findByIdProveedors (int idProveedor);

    List<Proveedor> findByNombreProveedors (String nombreProveedor);
}
