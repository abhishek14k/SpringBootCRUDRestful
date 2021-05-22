package com.org.crud.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.org.crud.rest.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
}
