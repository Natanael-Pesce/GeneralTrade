package ProjectoFinal.Demo.models;

import java.time.LocalDateTime;

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
@Table(name = "Gastos")
@Builder
@Data
@AllArgsConstructor 
@NoArgsConstructor 
@EqualsAndHashCode (of = "idGastos")
public class Gastos {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idGastos;

    @Column (nullable = false)
    private LocalDateTime fechaHora;

    @Column (nullable = false)
    private String tipoMovimiento;

    @Column (nullable = false)
    private String categoriaMovimiento;

    @Column (nullable = false)
    private float monto;

    @Column (nullable = false)
    private String descripcion;
    
}
