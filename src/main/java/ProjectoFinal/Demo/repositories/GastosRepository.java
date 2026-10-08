package ProjectoFinal.Demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ProjectoFinal.Demo.models.Gastos;

@Repository 
public interface GastosRepository extends JpaRepository{
    
    List<Gastos> findByIdGastos (int idGastos);
}
