package ProjectoFinal.Demo.dtos.registrarDto;

import jakarta.validation.constraints.NotBlank;

public record CategoriaRegistrarDto( @NotBlank String nomreCategoria) {}
