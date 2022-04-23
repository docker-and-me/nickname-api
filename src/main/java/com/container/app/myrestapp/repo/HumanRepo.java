package com.container.app.myrestapp.repo;

import com.container.app.myrestapp.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HumanRepo extends JpaRepository<Human, Integer> {
}
