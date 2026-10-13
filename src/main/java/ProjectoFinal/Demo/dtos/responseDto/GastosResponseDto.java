package ProjectoFinal.Demo.dtos.responseDto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record GastosResponseDto(
    @NotNull int idGastos,
    @NotNull LocalDateTime fechaHora,
    @NotNull String tipoMovimiento,
    @NotNull String categoriaMovimiento,
    @Positive int monto,
    String descripcion
) {}
