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
@EqualsAndHashCode (of = "idCompraProveedor")

public class CompraProveedor {

    @Id 
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idCompraProveedor;

    @Column (nullable = false)
    private int idProveedor;

    @Column (nullable = false)
    private int numeroRemito;

    @Column (nullable = false)
    private Date fechaCompra;

    @Column (nullable = false)
    private int montoTotalCompra;

    @Column (nullable = false)
    private String observaciones;
}
