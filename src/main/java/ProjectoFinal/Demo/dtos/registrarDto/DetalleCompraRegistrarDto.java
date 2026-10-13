package ProjectoFinal.Demo.dtos.registrarDto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record DetalleCompraRegistrarDto(
    @NotNull int idCompra,
    @NotNull int idProducto,
    @Positive int cantidadRecibido,
    @Positive int precioUnitario
) {}
