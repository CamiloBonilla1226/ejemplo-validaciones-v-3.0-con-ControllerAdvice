package co.edu.unicauca.distribuidos.core.proyecto.services.DTO;

import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DireccionDTO {

	private Integer id;
	@Size(min = 5, max = 45, message = "{addres.street.length}")
	private String calle;
	@Size(min = 5, max = 30, message = "{addres.city.length}")
	private String ciudad;
	@Size(min = 5, max = 50, message = "{addres.country.length}")
	private String pais;
}
