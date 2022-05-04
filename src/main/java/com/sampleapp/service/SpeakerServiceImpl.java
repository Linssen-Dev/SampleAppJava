package com.sampleapp.service;

import com.sampleapp.model.Speaker;
import com.sampleapp.repository.HibernateSpeakerRepositoryImpl;
import com.sampleapp.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Override
    public List<Speaker> findAll(){

        return repository.findAll();
    }

    /**
     *
     * @param repository
     * This is used to inject the Repository (Model) / Data Access Layer
     * In this service class
     */
    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
