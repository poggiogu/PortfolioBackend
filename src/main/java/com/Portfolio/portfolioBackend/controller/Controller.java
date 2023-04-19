package com.Portfolio.portfolioBackend.controller;

import com.Portfolio.portfolioBackend.model.service.IEducacionService;
import com.Portfolio.portfolioBackend.model.service.IExperienciaService;
import com.Portfolio.portfolioBackend.model.service.IProyectoService;
import com.Portfolio.portfolioBackend.modelo.Educacion;
import com.Portfolio.portfolioBackend.modelo.Experiencia;
import com.Portfolio.portfolioBackend.modelo.Proyecto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    
    //Conexiones*****************************************
    @Autowired
    public IExperienciaService expServ;
    @Autowired
    public IEducacionService eduServ;
    @Autowired
    public IProyectoService proServ;
    
    //métodos de proyectos********************************
    @PostMapping("/proyectos/crear")
    public void crearProyecto(@RequestBody Proyecto proy){
        proServ.crearProyecto(proy);
    }
    
    @GetMapping("/proyectos/traer/{id}")
    @ResponseBody
    public Proyecto traerProyecto(@PathVariable Long id){
        return proServ.traerProyecto(id);
    }
    
    @GetMapping("/proyectos/traertodos")
    @ResponseBody
    public List<Proyecto> traerProyectos(){
        return proServ.traerProyectos();
    }
    
    @PutMapping("/proyectos/editar/{id}")
    public void editarProyecto(@PathVariable Long id,
                               @RequestBody Proyecto proy){
        Proyecto proyecto = traerProyecto(id);
        proyecto.setId_project(id);
        proyecto.setNombre_project(proy.getNombre_project());
        proyecto.setUrl_project(proy.getUrl_project());
        proyecto.setDescripcion(proy.getDescripcion());
        proServ.crearProyecto(proyecto);
    }
    
    @DeleteMapping("/proyectos/borrar/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proServ.borrarProyecto(id);
    }
    
    //métodos Experiencias*************************************
    @PostMapping("/experiencias/crear")
    public void crearExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/experiecias/traer/{id}")
    @ResponseBody
    public Experiencia traerExperiencia(@PathVariable Long id){
        return expServ.traerExperiencia(id);
    }
    
    @GetMapping("/experiencias/traertodos")
    @ResponseBody
    public List<Experiencia> traerExperiencias(){
        return expServ.traerExperiencias();
    }
    
    @PutMapping("/experiencias/editar/{id}")
    public void editarExperiencia(@PathVariable Long id,
                               @RequestBody Experiencia exp){
        Experiencia experiencia = traerExperiencia(id);
        experiencia.setNombre(exp.getNombre());
        experiencia.setPuesto(exp.getPuesto());
        experiencia.setUrl_logo(exp.getUrl_logo());
        experiencia.setPeriodo(exp.getPeriodo());
        experiencia.setDescripcion(exp.getDescripcion());
        
        expServ.crearExperiencia(experiencia);
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    //Métodos de Educacion***************************************
    @PostMapping("/educacion/crear")
    public void crearEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/educacion/traer/{id}")
    @ResponseBody
    public Educacion traerEducacion(@PathVariable Long id){
        return eduServ.traerEducacion(id);
    }
    
    @GetMapping("/educacion/traertodos")
    @ResponseBody
    public List<Educacion> traerEducaciones(){
        return eduServ.traerEducaciones();
    }
    
    @PutMapping("/educacion/editar/{id}")
    public void editarEducacion(@PathVariable Long id,
                               @RequestBody Educacion edu){
        Educacion educacion = traerEducacion(id);
        educacion.setNombre_edu(edu.getNombre_edu());
        educacion.setTipo_formato(edu.getTipo_formato());
        educacion.setUrl_logo_institucion(edu.getUrl_logo_institucion());
        educacion.setUrl_certificacion(edu.getUrl_certificacion());
        educacion.setDescripcion(edu.getDescripcion());
        
        eduServ.crearEducacion(educacion);
    }
    
    @DeleteMapping("/educacion/borrar/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
}
