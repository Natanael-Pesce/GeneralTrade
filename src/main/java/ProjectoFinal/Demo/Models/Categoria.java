package ProjectoFinal.Demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "Categoria")
@Builder
@Data
@AllArgsConstructor 
@NoArgsConstructor 
@EqualsAndHashCode (of = "idCategoria")
public class Categoria {
    
    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idCategoria;

    @Column(nullable = false)
    private String categoriaNombre;
}
