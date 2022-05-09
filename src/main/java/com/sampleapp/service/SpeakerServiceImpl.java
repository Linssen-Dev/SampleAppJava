package com.sampleapp.service;

import com.sampleapp.model.Speaker;
import com.sampleapp.repository.HibernateSpeakerRepositoryImpl;
import com.sampleapp.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Service("speakerService") Autowire the SpeakerServiceImpl.
 * Replace the Constructor / Setter Injection
 * and also the @Scope(value = BeanDefinition.SCOPE_SINGLETON)
 */
@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

   // private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();
    private SpeakerRepository repository;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    /**
     * Constructor Injection
     * @param speakerRepository
     */
    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
        System.out.println("SpeakerServiceImpl repository constructor");
        repository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){

        return repository.findAll();
    }

    /**
     * Setter Injection
     * @param repository
     * This is used to inject the Repository (Model) / Data Access Layer
     * In this service class
     *
     * Replace the HibernateSpeakerRepositoryImpl() instance
     *
     *   @Autowired
     *   - Autowiring will not require to use Setter injections and constructor injection
     */

//    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter");
        this.repository = repository;
    }
}
