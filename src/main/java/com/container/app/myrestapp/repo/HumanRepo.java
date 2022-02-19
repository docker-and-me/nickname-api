package com.container.app.myrestapp.repo;

import com.container.app.myrestapp.entity.Human;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepo extends CrudRepository<Human, Integer> {
}
