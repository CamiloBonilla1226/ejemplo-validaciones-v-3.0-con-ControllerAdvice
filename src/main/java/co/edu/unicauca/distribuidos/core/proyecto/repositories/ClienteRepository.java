
package co.edu.unicauca.distribuidos.core.proyecto.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import co.edu.unicauca.distribuidos.core.proyecto.models.ClienteEntity;

public interface ClienteRepository extends CrudRepository<ClienteEntity, Integer> {
    @Query("SELECT count(*) FROM ClienteEntity c  WHERE c.email=?1")
    Integer contarClientesConCorreo(String email);

}
