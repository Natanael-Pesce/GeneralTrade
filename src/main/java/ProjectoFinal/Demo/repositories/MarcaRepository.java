package ProjectoFinal.Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjectoFinal.Demo.models.Marca;

@Repository 
public interface MarcaRepository extends JpaRepository{
    
    List<Marca> findByIdMarcas (int idMarca);

    List<Marca> findByNombreMarcas (String nombreMarca);
}
