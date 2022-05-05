package com.undec.gedufy.service;

import com.undec.gedufy.dto.ContactoDTO;

import com.undec.gedufy.dto.PersonaDTO;
import com.undec.gedufy.dto.Response;
import com.undec.gedufy.model.Contacto;

import com.undec.gedufy.model.Persona;
import com.undec.gedufy.repository.ContactoRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author etorrielli
 */
@Service
public class ContactoService {

    static final Logger LOGGER = LoggerFactory.getLogger(ContactoService.class);
    @Autowired
    private ContactoRepository contactoRepository;


    public Response save(ContactoDTO input) throws Exception {
        Response response = new Response();
        try {
            Contacto contacto = new ContactoDTO().getContacto(input);
            contacto = contactoRepository.save(contacto);
            response.setData(contacto);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return response;
    }


}