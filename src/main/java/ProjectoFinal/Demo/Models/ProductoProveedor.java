package ProjectoFinal.Demo.Models;

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
@EqualsAndHashCode (of = "idProductoProveedor")
public class ProductoProveedor {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idProductoProveedor;
    
    @Column (nullable = false)
    private int idProducto;

    @Column (nullable = false)
    private int idProveedor;

    @Column (nullable = false)
    private int precioCostoOfrecido;

    @Column (nullable = false)
    private Date fechaUltimaActualizacion;
}
