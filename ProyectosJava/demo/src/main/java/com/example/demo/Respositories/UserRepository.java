package com.example.demo.Respositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Users;
@Repository
public  interface UserRepository extends CrudRepository<Users, Long> {

  public Users getByEmail(String email);
  
}
