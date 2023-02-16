package com.ZinnyBest.familyapp.repositories;

import com.ZinnyBest.familyapp.models.Family;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends CrudRepository<Family, Integer> {
}
