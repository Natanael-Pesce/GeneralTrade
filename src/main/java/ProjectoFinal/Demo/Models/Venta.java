package ProjectoFinal.Demo.models;

import java.sql.Date;

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
@Table(name = "Producto")
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
    private Date fechaHora;

    @Column (nullable = false)
    private String formaPago;

    @Column (nullable = false)
    private int subTotal;

    @Column (nullable = false)
    private int descuentotTotal;

    @Column (nullable = false)
    private int montoTotal;
    
}
