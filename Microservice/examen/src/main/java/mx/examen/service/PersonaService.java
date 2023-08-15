package mx.examen.service;

import mx.examen.entity.Persona;
import org.springframework.http.ResponseEntity;
import java.util.List;
//Aqui declare todos mi metodos abstractos para despues solo inyectarlo en el controller
public interface PersonaService {
    List<Persona> obtenerTodas();
    ResponseEntity<Object> pesonaPorId(Long id);

}
