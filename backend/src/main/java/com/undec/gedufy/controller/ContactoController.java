package com.undec.gedufy.controller;

import com.undec.gedufy.dto.ContactoDTO;
import com.undec.gedufy.dto.Response;
import com.undec.gedufy.model.Curso;
import com.undec.gedufy.service.ContactoService;
import com.undec.gedufy.service.CursoService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author etorrielli
 */
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/contactos")
@Tag(name = "Contacto", description = "Toda la info de Contacto")
public class ContactoController {

    @Autowired
    private ContactoService contactoService;


    @PostMapping
    public ResponseEntity<Response> post(@RequestBody ContactoDTO contacto) throws Exception {
        Response response = contactoService.save(contacto);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}