package mx.examen.repository;

import mx.examen.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//Aqui hice uso de jpa para conectarlo a la base de datos ver en el propites para aser cambios para poder correrlo
//desde sus computadoras
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {

}
