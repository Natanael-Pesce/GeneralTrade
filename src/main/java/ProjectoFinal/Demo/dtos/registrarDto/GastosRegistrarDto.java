package ProjectoFinal.Demo.dtos.registrarDto;

import java.time.LocalDateTime;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record GastosRegistrarDto(
    @NotNull LocalDateTime fechaHora,
    @NotNull String tipoMovimiento,
    @NotNull String categoriaMovimiento,
    @Positive int monto,
    String descripcion
) {}
