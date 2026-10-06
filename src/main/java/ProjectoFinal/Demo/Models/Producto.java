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
@EqualsAndHashCode (of = "idProducto")
public class Producto {
    
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProducto;

    @Column(nullable = false)
    private String nombreProducto;

    @Column (nullable = false)
    private Marca marca;

    @Column (nullable = false)
    private Categoria categoria;

    @Column (nullable = false)
    private int precioCosto;

    @Column (nullable = false)
    private int margenGanancia;

    @Column (nullable = false)
    private int stock;

    @Column (nullable = false)
    private int stockMin;

    @Column (nullable = false)
    private Date fechaVencimiento;

    @Column (nullable = false)
    private float precioVenta = precioCosto * (1 + margenGanancia / 100);

    @Builder.Default
    @Column(nullable = false) 
    private Boolean estaActivo = true;
}
