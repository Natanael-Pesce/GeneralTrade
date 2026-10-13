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
@Table(name = "Proveedor")
@Builder
@Data
@AllArgsConstructor 
@NoArgsConstructor 
@EqualsAndHashCode (of = "idProveedor")
public class Proveedor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int idProveedor; 

    @Column (nullable = false)
    private String nombreProveedor;

    @Column (nullable = false)
    private Long cuitProveedor;

    @Column (nullable = false)
    private String telefonoProveedor;

    @Column (nullable = false)
    private String correoProveedor;

    @Column (nullable = false)
    private String direccionProveedor;
    
}