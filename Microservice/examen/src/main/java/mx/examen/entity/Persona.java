package mx.examen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
//Aqui solo mape la entidad o modelo
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellidos;
    private String rfc;
    private String curp;
    private Integer edad;
    private String sexo;
    private String nacionalidad;
}
