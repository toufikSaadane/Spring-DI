package com.toufik.pets;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"dog", "default"})
public class DogService implements PetService {
    public String getPetType() {
        return "=========================Dogs are the best!";
    }
}

