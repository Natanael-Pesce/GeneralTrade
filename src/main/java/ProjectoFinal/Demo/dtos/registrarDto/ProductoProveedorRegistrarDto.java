package ProjectoFinal.Demo.dtos.registrarDto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record ProductoProveedorRegistrarDto(
    @NotNull int idProducto,
    @NotNull int idProveedor,
    @Positive  int precioCostoOfrecido,
    @NotNull LocalDate fechaUltimaActualizacion
) {}
