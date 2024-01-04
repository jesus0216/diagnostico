package utez.edu.mx.Diagnostico.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import utez.edu.mx.Diagnostico.Dto.dtopersona;
import utez.edu.mx.Diagnostico.entidades.benpersona;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v4/persona")
public class controllerpersona {
    private final idpersona;

    @GetMapping("/")
    public List<benpersona> getManager(){ return personaService.findAll();}

    @GetMapping("/{id}")
    public benpersona getManagerById(@PathVariable Integer id){ return personaService.findById(id);}

    @DeleteMapping("/{id}")
    public void deleteManager(@PathVariable Integer id){
        benpersona beanManager = personaService.findById(id);
        personaService.delete(beanManager);
    }

    @PostMapping("/")
    public dtopersona saveManager(@RequestBody dtopersona dtoManager){
        BeanManager beanManager = managerService.save(dtoManager);
        return dtopersona.builder().build().builder()
                .idpersonba(beanManager.getIdpersona())
                .nombre(beanManager.getnombre())
                .build();
    }

    @PutMapping("/")
    public dtopesona updateManager(@RequestBody dtopersona dtoManager){
        benpersona beanManager = dtopersona.save(dtoManager);
        return dtopersona.builder()
                .idPersona(beanManager.getIdPersona())
                .nombre(beanManager.getNombre())
                .build();
    }



}
}
