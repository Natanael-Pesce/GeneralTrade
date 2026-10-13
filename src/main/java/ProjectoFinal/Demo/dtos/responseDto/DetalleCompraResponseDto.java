package ProjectoFinal.Demo.dtos.responseDto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record DetalleCompraResponseDto(
    @NotNull int idDetalleCompra,
    @NotNull int idCompra,
    @NotNull int idProducto,
    @Positive int cantidadRecibido,
    @Positive int precioUnitario
) {}
