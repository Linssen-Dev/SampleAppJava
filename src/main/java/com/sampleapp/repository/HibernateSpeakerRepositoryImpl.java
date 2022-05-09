package com.sampleapp.repository;

import com.sampleapp.model.Speaker;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


/**
 * Repository Data Access Layer
 *
 */
@Repository("speakerRepository")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        // Creates a List of Speaker(Object)
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Linssen");
        speaker.setLastName("Diocares");

        speakers.add(speaker);

        return speakers;
    }
}
