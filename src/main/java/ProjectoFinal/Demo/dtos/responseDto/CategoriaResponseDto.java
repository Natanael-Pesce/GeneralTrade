package ProjectoFinal.Demo.dtos.responseDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record CategoriaResponseDto(
    @Positive  int idCategoria,
    @NotBlank String nomreCategoria) {}
