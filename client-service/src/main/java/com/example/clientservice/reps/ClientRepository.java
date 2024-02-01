package com.example.clientservice.reps;

import com.example.clientservice.ents.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
