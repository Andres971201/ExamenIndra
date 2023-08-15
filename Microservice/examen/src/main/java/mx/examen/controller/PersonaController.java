package mx.examen.controller;
import mx.examen.entity.Persona;
import mx.examen.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
//Auqi se ejecuto los controladores respetando la regla de solo inyectar interfaces
@RestController
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    PersonaService personaService;

    @GetMapping("/{id}")
    public ResponseEntity<Object> personaPorId(@PathVariable Long id) {
        return personaService.pesonaPorId(id);
    }
    @GetMapping
    public List<Persona> obtenerToda(){
        return personaService.obtenerTodas();
    }
}
