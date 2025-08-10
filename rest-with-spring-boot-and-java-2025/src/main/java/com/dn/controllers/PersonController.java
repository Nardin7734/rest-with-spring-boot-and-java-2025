package com.dn.controllers;

import com.dn.model.Person;
import com.dn.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping( "/person" )
@RestController
public class PersonController
{
    @Autowired
    private PersonServices service;

    @GetMapping( produces = MediaType.APPLICATION_JSON_VALUE )
    public List<Person> findAll()
    {
        return service.findAll();
    }

    @GetMapping( value = "/{id}",
                    produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findById( @PathVariable( "id" ) Long id ) throws Exception
    {
        return service.findById( id );
    }

    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE )
    public Person create( @RequestBody Person person )
    {
        return service.create( person );
    }

    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE )
    public Person update( @RequestBody Person person ) throws Exception
    {
        return service.update( person );
    }

    @DeleteMapping( value = "/{id}" )
    public ResponseEntity<?> delete(@PathVariable( "id" ) Long id ) throws Exception
    {
        service.delete( id );
        return ResponseEntity.noContent().build();
    }
}
