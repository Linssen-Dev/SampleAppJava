package com.sampleapp.repository;

import com.sampleapp.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
