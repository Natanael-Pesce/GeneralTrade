package ProjectoFinal.Demo.dtos.registrarDto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

public record MarcaRegistrarDto(
    @NotNull  int idMarca,
    @NotEmpty  String MarcaNombre
) {}
