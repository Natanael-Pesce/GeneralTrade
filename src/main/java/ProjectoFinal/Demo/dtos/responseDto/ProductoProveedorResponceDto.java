package ProjectoFinal.Demo.dtos.responseDto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductoProveedorResponceDto(    
    @NotNull int idProductoProveedor,
    @NotNull int idProducto,
    @NotNull int idProveedor,
    @Positive int precioCostoOfrecido,
    @NotNull LocalDate fechaUltimaActualizacion) {
    
}
