package ProjectoFinal.Demo.dtos.registrarDto;

import java.time.LocalDate;

import ProjectoFinal.Demo.models.Categoria;
import ProjectoFinal.Demo.models.Marca;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

public record ProductoRegistrarDto (
    @NotBlank String nombreProducto,
    @NotNull  Marca marca,
    @NotNull Categoria categoria,
    @Positive  int precioCosto,
    @PositiveOrZero int margenGanancia,
    @PositiveOrZero int stock,
    @PositiveOrZero  int stockMin,
    @NotNull @Future LocalDate fechaVencimiento
) {}
