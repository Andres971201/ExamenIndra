package mx.examen.service;

import mx.examen.entity.Persona;
import mx.examen.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    PersonaRepository personaRepository;
   //Este metodo solo retorna la lista sin preguntar a cual se busca
    @Override
    public List<Persona> obtenerTodas() {
        return personaRepository.findAll();
    }
    // Metodo que solo Obtiene una perona pero si existe
    // en caso contrario retorna una Lista de los que si existen
    @Override
    public ResponseEntity<Object> pesonaPorId(Long id) {

        Optional<Persona> siExiste=personaRepository.findById(id);
        if (siExiste.isPresent()) {
            return ResponseEntity.ok(siExiste.get());
        } else {
            List<Persona> todasLasPersonas = obtenerTodas();  // Obtener todas las personas
            return ResponseEntity.ok(todasLasPersonas);
        }
    }
}
