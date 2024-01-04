package utez.edu.mx.Diagnostico.entidades;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="persona")

public class benpersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Integer idPersona;

    @Column(name = "nombre")
    private  String Nombre;

    @Column(name = "apellidos")
    private String Apellidos;

    @Column(name = "Fechanacimiento")
    private String fechanacimeinto;

    @Column(name = "CURP")
    private String curp;




}
