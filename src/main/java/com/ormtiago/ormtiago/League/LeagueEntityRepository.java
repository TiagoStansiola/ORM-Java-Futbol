package com.ormtiago.ormtiago.League;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LeagueEntityRepository extends JpaRepository<LeagueEntity, Long>{

}
