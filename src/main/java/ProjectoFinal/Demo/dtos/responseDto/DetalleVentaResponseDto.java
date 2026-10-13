package ProjectoFinal.Demo.dtos.responseDto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record DetalleVentaResponseDto(
    @NotNull int idDetalleVenta,
    @NotNull int idVenta,
    @NotNull int idProducto,
    @Positive int cantidad,
    @Positive int precioUnitarioMomento
) {}
