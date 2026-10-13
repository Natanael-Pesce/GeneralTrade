package ProjectoFinal.Demo.dtos.responseDto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Positive;

public record CompraProveedorResponseDto(
    @NotNull int idCompraProveedor,
    @NotNull int idProveedor,
    @NotNull int numeroRemito,
    @NotNull @Past LocalDate fechaCompra,
    @Positive int montoTotalCompra,
    String observaciones
) {}
