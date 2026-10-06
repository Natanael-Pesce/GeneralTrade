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
@Table(name = "Producto")
@Builder
@Data
@AllArgsConstructor 
@NoArgsConstructor 
@EqualsAndHashCode (of = "idDetalleCompra")
public class DetalleCompra {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idDetalleCompra;

    @Column (nullable = false)
    private int idCompra;

    @Column (nullable = false)
    private int idProducto;

    @Column (nullable = false)
    private int cantidadRecibido;

    @Column(nullable = false)
    private int precioUnitario;
    
}
