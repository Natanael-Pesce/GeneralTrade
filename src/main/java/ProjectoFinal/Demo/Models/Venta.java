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
@Table(name = "Venta")
@Builder
@Data
@AllArgsConstructor 
@NoArgsConstructor 
@EqualsAndHashCode (of = "idVenta")
public class Venta {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idVenta;

    @Column (nullable = false)
    private int numeroVenta;

    @Column (nullable = false)
    private LocalDateTime fechaHora;

    @Column (nullable = false)
    private String formaPago;

    @Column (nullable = false)
    private int subTotal;

    @Column (nullable = false)
    private int descuentotTotal;

    @Column (nullable = false)
    private int montoTotal;
    
}
