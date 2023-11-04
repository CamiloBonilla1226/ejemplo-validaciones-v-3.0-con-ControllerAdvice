package co.edu.unicauca.distribuidos.core.proyecto.services.DTO;

import java.util.Date;

import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SolicitudDTO {

    private Integer id;
    @PastOrPresent(message = "{application.date.past}")
    private Date fecha;
    @Size(min = 5, max = 45, message = "{application.file.length}")
    private String archivo;
    private String comentarios;
}
