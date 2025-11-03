package progresa.relacionalclase.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteDTO {
    @NotBlank
    private String nombre;
    private DireccionDto direccion;
    private CategoriaDto categoria;
    private ListadoImagenesDto imagenes; // cambiar este por
    // private Set<ListadoImagenesDTO> imagenes;
}
