package ProjectoFinal.Demo.dtos.registrarDto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record DetalleVentaRegistrarDto(
    @NotNull int idVenta,
    @NotNull int idProducto,
    @Positive int cantidad,
    @Positive int precioUnitarioMomento
) {}
