package ProjectoFinal.Demo.dtos.responseDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProveedorResponseDto(
    @NotNull int idProveedor,
    @NotBlank String nombreProveedor,
    @NotNull Long cuitProveedor,
    @NotBlank String telefonoProveedor,
    @NotBlank String correoProveedor,
    @NotBlank String direccionProveedor
) {
    
}
