package com.sampleapp.service;

import com.sampleapp.model.Speaker;
import com.sampleapp.repository.HibernateSpeakerRepositoryImpl;
import com.sampleapp.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){

        return repository.findAll();
    }
}
