package com.serg.cardetails.repositories;

import com.serg.cardetails.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    User findByLogin(String login);

}
