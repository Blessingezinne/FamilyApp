package com.ZinnyBest.familyapp.services;

import com.ZinnyBest.familyapp.models.Family;
import com.ZinnyBest.familyapp.repositories.FamilyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FamilyService {
    @Autowired private FamilyRepository familyRepository;

    public List<Family> getAll(){
        return (List<Family>) familyRepository.findAll();
    }
    public Optional<Family> getOne(Integer Id){
        return familyRepository.findById(Id);
    }
    public void addNew(Family family){
        familyRepository.save(family);
    }
    public void update(Family family){
        familyRepository.save(family);
    }
    public void delete(Integer Id){
        familyRepository.deleteById(Id);
    }
}

