package com.ormtiago.ormtiago.Player;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerEntityRepository extends JpaRepository<PlayerEntity, Long>{

}
