package com.dn.services;

import com.dn.exception.ResourceNotFoundException;
import com.dn.model.Person;
import com.dn.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices
{
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger( PersonServices.class.getName() );

    @Autowired
    PersonRepository repository;

    public Person findById(Long id ) throws Exception
    {
        logger.info( "Finding one Person" );

        return repository.findById( id )
                .orElseThrow(() -> new ResourceNotFoundException( "No records found for this ID" ) );
    }

    public List<Person> findAll()
    {
        logger.info( "Finding all" );
        return repository.findAll();
    }

    public Person create( Person person )
    {
        logger.info( "Creating one Person" );
        return repository.save( person );
    }

    public Person update( Person person ) throws Exception
    {
        logger.info( "Updating one Person" );
        Person entity = repository.findById( person.getId() )
                                .orElseThrow(() -> new ResourceNotFoundException( "No records found for this ID" ) );

        entity.setFirstName(person.getFirstName() );
        entity.setLastName( person.getLastName() );
        entity.setAddress( person.getAddress() );
        entity.setGender(person.getGender() );

        return repository.save( entity );
    }

    public void delete( Long id ) throws Exception
    {
        logger.info( "Deleting one Person" );
        Person entity = repository.findById( id )
                .orElseThrow(() -> new ResourceNotFoundException( "No records found for this ID" ) );

        repository.delete( entity );
    }
}
