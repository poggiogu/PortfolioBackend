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
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin(origins = "http://localhost:4200")
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
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/proyectos/crear")
    public ResponseEntity<?> crearProyecto(@RequestBody Proyecto proy){
        proServ.crearProyecto(proy);
        return new ResponseEntity(new Mensaje("proyecto creado"), HttpStatus.OK);
    }
    
    @GetMapping("/proyectos/{id}")
    @ResponseBody
    public ResponseEntity<Proyecto> traerProyecto(@PathVariable Long id){
        Proyecto proyecto = proServ.traerProyecto(id);
        return new ResponseEntity(proyecto, HttpStatus.OK);
    }
    
    @GetMapping("/proyectos/traerTodos")
    @ResponseBody
    public ResponseEntity<List<Proyecto>> traerProyectos(){
        List lista = proServ.traerProyectos();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/proyectos/{id}")
    public void editarProyecto(@PathVariable Long id,
                               @RequestBody Proyecto proy){
        Proyecto proyecto = proServ.traerProyecto(id);
        proyecto.setId_project(id);
        proyecto.setNombre(proy.getNombre());
        proyecto.setDescripcion(proy.getDescripcion());
        proyecto.setFecha(proy.getFecha());
        proyecto.setUrlImagen(proy.getUrlImagen());
        proyecto.setUrlRepositorio(proy.getUrlRepositorio());
        
        proServ.crearProyecto(proyecto);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/proyectos/{id}")
    public void borrarProyecto(@PathVariable Long id){
        proServ.borrarProyecto(id);
    }
    
    //métodos Experiencias******************************************************
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/experiencias/crear")
    public void crearExperiencia(@RequestBody Experiencia exp){
        expServ.crearExperiencia(exp);
    }
    
    @GetMapping("/experiecias/{id}")
    @ResponseBody
    public Experiencia traerExperiencia(@PathVariable Long id){
        return expServ.traerExperiencia(id);
    }
    
    @GetMapping("/experiencias/traertodos")
    @ResponseBody
    public List<Experiencia> traerExperiencias(){
        return expServ.traerExperiencias();
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/experiencias/{id}")
    public void editarExperiencia(@PathVariable Long id,
                               @RequestBody Experiencia exp){
        Experiencia experiencia = traerExperiencia(id);
        experiencia.setText(exp.getText());
        experiencia.setCargo(exp.getCargo());
        experiencia.setDescripcion(exp.getDescripcion());
        experiencia.setDates(exp.getDates());
        experiencia.setBrandLogoUrl(exp.getBrandLogoUrl());
        
        expServ.crearExperiencia(experiencia);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id){
        expServ.borrarExperiencia(id);
    }
    
    
    
    //Métodos de Educacion******************************************************
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/educacion/crear")
    public void crearEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping("/educacion/{id}")
    @ResponseBody
    public Educacion traerEducacion(@PathVariable Long id){
        return eduServ.traerEducacion(id);
    }
    
     
    @GetMapping("/educacion/traertodos")
    @ResponseBody
    public ResponseEntity<List<Educacion>> traerEducaciones(){
        List lista = eduServ.traerEducaciones();
        return new ResponseEntity(lista, HttpStatus.OK);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/educacion/{id}")
    public void editarEducacion(@PathVariable Long id,
                               @RequestBody Educacion edu){
        Educacion educacion = traerEducacion(id);
        educacion.setTitle(edu.getTitle());
        educacion.setCourse(edu.getCourse());
        educacion.setDescripcion(edu.getDescripcion());
        educacion.setYear(edu.getYear());
        educacion.setInstLogoUrl(edu.getInstLogoUrl());
        educacion.setCertificadoUrl(edu.getCertificadoUrl());
        
        eduServ.crearEducacion(educacion);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id){
        eduServ.borrarEducacion(id);
    }
    
    //Métodos de Perfil******************************************************
    //@PreAuthorize("hasRole('ADMIN')")
    
   
    @PostMapping("/perfil/crear")
    public void crearPerfil(@RequestBody Perfil perfil){
        perfilServ.crearPerfil(perfil);
    }
    
    @GetMapping("/perfil/{id}")
    @ResponseBody
    public Perfil traerPerfil(@PathVariable Long id){
        return perfilServ.traerPerfil(id);
    }
    
    @GetMapping("/perfil/traertodos")
    @ResponseBody
    public List<Perfil> traerPerfiles(){
        return perfilServ.traerPerfiles();
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/perfil/{id}")
    public void editarPerfil(@PathVariable Long id,
                               @RequestBody Perfil perfil){
        Perfil perf = traerPerfil(id);
        perf.setNombre(perfil.getNombre());
        perf.setTitulo(perfil.getTitulo());
        perf.setAcercaDeMi(perfil.getAcercaDeMi());
        perf.setUrlImagenPerfil(perfil.getUrlImagenBanner());
        perf.setUrlImagenBanner(perfil.getUrlImagenBanner());
        
        perfilServ.crearPerfil(perf);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/perfil/{id}")
    public void borrarPerfil(@PathVariable Long id){
        perfilServ.borrarPerfil(id);
    }
    
    //Métodos de Skills******************************************************
    //@PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/skill/crear")
    public void crearSkill(@RequestBody Skill skill){
        skillServ.crearSkill(skill);
    }
    
    @GetMapping("/skill/{id}")
    @ResponseBody
    public Skill traerSkill(@PathVariable Long id){
        return skillServ.traerSkill(id);
    }
    
    @GetMapping("/skill/traertodos")
    @ResponseBody
    public List<Skill> traerSkills(){
        return skillServ.traerSkills();
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/skill/{id}")
    public void editarSkill(@PathVariable Long id,
                               @RequestBody Skill skill){
        Skill ski = traerSkill(id);
        ski.setTitulo(skill.getTitulo());
        ski.setColor(skill.getColor());
        ski.setPorcentaje(skill.getPorcentaje());
        ski.setImagen(skill.getImagen());
        
        skillServ.crearSkill(ski);
    }
    
    //@PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/skill/{id}")
    public void borrarSkill(@PathVariable Long id){
        skillServ.borrarSkill(id);
    }
    
    //************************************************************************
}
