package com.example.Hotel_Mangement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CommonRepository<E, ID> extends JpaRepository<E, ID> {

}
