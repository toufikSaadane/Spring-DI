package com.toufik.pets;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cat")
public class CatService {
    public String getPetType() {

        return "=========================Cats are the best!";
    }
}
