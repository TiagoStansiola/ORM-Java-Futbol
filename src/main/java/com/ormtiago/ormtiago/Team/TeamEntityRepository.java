package com.ormtiago.ormtiago.Team;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamEntityRepository extends JpaRepository<TeamEntity, Long>{

}
