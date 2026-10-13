package ProjectoFinal.Demo.dtos.registrarDto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ProveedorRegistrarDto(
    @NotBlank String nombreProveedor,
    @NotNull Long cuitProveedor,
    @NotBlank String telefonoProveedor,
    @NotBlank String correoProveedor,
    @NotBlank String direccionProveedor
) {}
