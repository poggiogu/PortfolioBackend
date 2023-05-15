package com.Portfolio.portfolioBackend.controller;

import com.Portfolio.portfolioBackend.model.service.EducacionService;
import com.Portfolio.portfolioBackend.model.service.ExperienciaService;
import com.Portfolio.portfolioBackend.model.service.PerfilService;
import com.Portfolio.portfolioBackend.model.service.ProyectoService;
import com.Portfolio.portfolioBackend.model.service.SkillService;
import com.Portfolio.portfolioBackend.modelo.Educacion;
import com.Portfolio.portfolioBackend.modelo.Experiencia;
import com.Portfolio.portfolioBackend.modelo.Mensaje;
import com.Portfolio.portfolioBackend.modelo.Perfil;
import com.Portfolio.portfolioBackend.modelo.Proyecto;
import com.Portfolio.portfolioBackend.modelo.Skill;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/portfolio")
public class Controller {
    
    //Conexiones*****************************************
    @Autowired
    ExperienciaService expServ;
    
    @Autowired
    EducacionService eduServ;
    
    @Autowired
    ProyectoService proServ;
    
    @Autowired
    SkillService skillServ;
    
    @Autowired
    PerfilService perfilServ;
    
    //métodos de proyectos****************************************************
   
    @PostMapping("/proyectos/crear")
    public ResponseEntity<?> crearProyecto(@RequestBody Proyecto proy){
        proServ.crearProyecto(proy);
        return new ResponseEntity(new Mensaje("proyecto creado correctamente!"), HttpStatus.OK);
    }
    
    @GetMapping("/proyectos/{id}")
    @ResponseBody
    public ResponseEntity<Proyecto> traerProyecto(@PathVariable Long id){
        Proyecto proyecto = proServ.traerProyecto(id);
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @GetMapping("/proyectos/traertodos")
    @ResponseBody
    public ResponseEntity<List<Proyecto>> traerProyectos(){
        List lista = proServ.traerProyectos();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
  
    @PutMapping("/proyectos/{id}")
    public ResponseEntity<?>editarProyecto(@PathVariable Long id,
                               @RequestBody Proyecto proy){
        Proyecto proyecto = proServ.traerProyecto(id);
        proyecto.setId(id);
        proyecto.setNombre(proy.getNombre());
        proyecto.setDescripcion(proy.getDescripcion());
        proyecto.setFecha(proy.getFecha());
        proyecto.setUrlImagen(proy.getUrlImagen());
        proyecto.setUrlRepositorio(proy.getUrlRepositorio());
        
        proServ.crearProyecto(proyecto);
        
        return new ResponseEntity(new Mensaje("proyecto editado correctamente!"), HttpStatus.OK);
    }
    
   
    @DeleteMapping("/proyectos/{id}")
    public ResponseEntity<?>borrarProyecto(@PathVariable Long id){
        proServ.borrarProyecto(id);
        return new ResponseEntity(new Mensaje("proyecto eliminado correctamente!"), HttpStatus.OK);
    }
    
    //métodos Experiencias******************************************************

    @PostMapping("/experiencia/crear")
    
    public ResponseEntity<?>crearExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
        return new ResponseEntity(new Mensaje("experiencia creada correctamente!"), HttpStatus.OK);
    }
    
    @GetMapping("/experiecia/{id}")
    @ResponseBody
    public ResponseEntity<Experiencia> traerExperiencia(@PathVariable Long id){
        Experiencia exp = expServ.traerExperiencia(id);
        return new ResponseEntity(exp, HttpStatus.OK);
    }
    
    @GetMapping("/experiencia/traertodos")
    @ResponseBody
    public ResponseEntity<List<Experiencia>> traerExperiencias(){
        List lista = expServ.traerExperiencias();
        return new ResponseEntity(lista,HttpStatus.OK);
    }
    

    @PutMapping("/experiencia/{id}")
    
    public ResponseEntity<?>editarExperiencia(@PathVariable Long id,
                               @RequestBody Experiencia exp){
        Experiencia experiencia = expServ.traerExperiencia(id);
        experiencia.setText(exp.getText());
        experiencia.setCargo(exp.getCargo());
        experiencia.setDescripcion(exp.getDescripcion());
        experiencia.setDates(exp.getDates());
        experiencia.setBrandLogoUrl(exp.getBrandLogoUrl());
        
        expServ.crearExperiencia(experiencia);
        
        return new ResponseEntity(new Mensaje("experiencia editada correctamente!"), HttpStatus.OK);
    }
    
  
    @DeleteMapping("/experiencia/{id}")
    
    public ResponseEntity<?> borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
        return new ResponseEntity(new Mensaje("experiencia eliminada correctamente!"), HttpStatus.OK);
    }
    
    
    //Métodos de Educacion******************************************************

    @PostMapping("/educacion/crear")
    
    public ResponseEntity<?> crearEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
        return new ResponseEntity(new Mensaje("curso creado correctamente!"), HttpStatus.OK);
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public ResponseEntity<Educacion> traerEducacion(@PathVariable Long id){
        Educacion curso = eduServ.traerEducacion(id);
        return new ResponseEntity(curso, HttpStatus.OK);
    }
    
     
    @GetMapping("/educacion/traertodos")
    @ResponseBody
    public ResponseEntity<List<Educacion>> traerEducaciones(){
        List lista = eduServ.traerEducaciones();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    

    @PutMapping("/educacion/{id}")
    public ResponseEntity<?> editarEducacion(@PathVariable Long id,
                               @RequestBody Educacion edu){
        Educacion educacion = eduServ.traerEducacion(id);
        educacion.setTitle(edu.getTitle());
        educacion.setCourse(edu.getCourse());
        educacion.setDescripcion(edu.getDescripcion());
        educacion.setYear(edu.getYear());
        educacion.setInstLogoUrl(edu.getInstLogoUrl());
        educacion.setCertificadoUrl(edu.getCertificadoUrl());
        
        eduServ.crearEducacion(educacion);
        
        return new ResponseEntity(new Mensaje("curso editado correctamente!"), HttpStatus.OK);
        
    }
    

    @DeleteMapping("/educacion/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
        return new ResponseEntity(new Mensaje("curso eliminado correctamente!"), HttpStatus.OK);
    }
    
    //Métodos de Perfil******************************************************
 
    
   
    @PostMapping("/perfil/crear")
    public ResponseEntity<?> crearPerfil(@RequestBody Perfil perfil){
        perfilServ.crearPerfil(perfil);
        return new ResponseEntity(new Mensaje("perfil creado correctamente!"), HttpStatus.OK);
    }
    
    @GetMapping("/perfil/{id}")
    @ResponseBody
    public ResponseEntity<Perfil> traerPerfil(@PathVariable Long id){
        Perfil perf = perfilServ.traerPerfil(id);
        return new ResponseEntity(perf, HttpStatus.OK);
    }
    
    @GetMapping("/perfil/traertodos")
    @ResponseBody
    public ResponseEntity<List<Perfil>> traerPerfiles(){
        List<Perfil> lista = perfilServ.traerPerfiles();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
    
    @PutMapping("/perfil/{id}")
    public ResponseEntity<?> editarPerfil(@PathVariable Long id,
                               @RequestBody Perfil perfil){
        Perfil perf = perfilServ.traerPerfil(id);
        perf.setNombre(perfil.getNombre());
        perf.setTitulo(perfil.getTitulo());
        perf.setAcercaDeMi(perfil.getAcercaDeMi());
        perf.setUrlImagenPerfil(perfil.getUrlImagenPerfil());
        perf.setUrlImagenBanner(perfil.getUrlImagenBanner());
        
        perfilServ.crearPerfil(perf);
        
        return new ResponseEntity(new Mensaje("perfil editado correctamente!"), HttpStatus.OK);
    }
    
    
    @DeleteMapping("/perfil/{id}")
    public ResponseEntity<?> borrarPerfil(@PathVariable Long id){
        perfilServ.borrarPerfil(id);
        
        return new ResponseEntity(new Mensaje("perfil eliminado correctamente!"), HttpStatus.OK);
    }
    
    
    //Métodos de Skills******************************************************
   
    @PostMapping("/skill/crear")
    public ResponseEntity<?>crearSkill(@RequestBody Skill skill){
        skillServ.crearSkill(skill);
        return new ResponseEntity(new Mensaje("skill creada correctamente!"), HttpStatus.OK);
    }
    
    @GetMapping("/skill/{id}")
    @ResponseBody
    public ResponseEntity<Skill> traerSkill(@PathVariable Long id){
        Skill ski = skillServ.traerSkill(id);
        return new ResponseEntity(ski, HttpStatus.OK);
    }
    
    @GetMapping("/skill/traertodos")
    @ResponseBody
    public ResponseEntity<List<Skill>> traerSkills(){
        List<Skill> lista = skillServ.traerSkills();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
   
    @PutMapping("/skill/{id}")
    public ResponseEntity<?> editarSkill(@PathVariable Long id,
                               @RequestBody Skill skill){
        Skill ski = skillServ.traerSkill(id);
        ski.setTitulo(skill.getTitulo());
        ski.setColor(skill.getColor());
        ski.setPorcentaje(skill.getPorcentaje());
        ski.setImagen(skill.getImagen());
        
        skillServ.crearSkill(ski);
        
        return new ResponseEntity(new Mensaje("skill editada correctamente!"), HttpStatus.OK);
    }
    
  
    @DeleteMapping("/skill/{id}")
    public ResponseEntity<?> borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
        return new ResponseEntity(new Mensaje("skill eliminada correctamente!"), HttpStatus.OK);
    }
    
    //************************************************************************
}
