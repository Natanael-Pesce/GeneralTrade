package ProjectoFinal.Demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ProjectoFinal.Demo.models.Categoria;
import java.util.List;

@Repository 
public interface CategoriaRepository extends JpaRepository {

    List<Categoria> findByIdCategorias(int idCategoria);

    List<Categoria> findByCategoriaNombre(String categoriaNombre);

    
}
