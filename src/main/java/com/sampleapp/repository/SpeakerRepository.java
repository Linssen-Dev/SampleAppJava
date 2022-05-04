package com.sampleapp.repository;

import com.sampleapp.model.Speaker;

import java.util.List;

/**
 * Interface is used to define the shape of the Data
 * and to achieve abstraction
 */
public interface SpeakerRepository {
    List<Speaker> findAll();
}
