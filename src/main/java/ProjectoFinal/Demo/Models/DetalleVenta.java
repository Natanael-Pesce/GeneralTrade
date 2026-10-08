package ProjectoFinal.Demo.models;

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
@EqualsAndHashCode (of = "idDetalleVenta")
public class DetalleVenta {

    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetalleVenta;

    @Column (nullable = false)
    private int idVenta;

    @Column (nullable = false)
    private int idProducto;

    @Column (nullable = false)
    private int cantidad;

    @Column (nullable = false)
    private int precioUnitarioMomento;
    
    @Column (nullable = false)
    private float subTotalLinea = cantidad * precioUnitarioMomento;
}
