package com.sonata.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sonata.model.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {

}
