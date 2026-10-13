package ProjectoFinal.Demo.dtos.responseDto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record VentaResponseDto(
    @NotNull int idVenta,
    @Positive int numeroVenta,
    @NotNull LocalDateTime fechaHora,
    @NotBlank String formaPago,
    @NotNull int subTotal,
    @NotNull int descuentoTotal,
    @NotNull int montoTotal
) {}
