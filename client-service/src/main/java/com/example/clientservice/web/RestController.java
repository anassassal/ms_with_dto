package com.example.clientservice.web;

import com.example.clientservice.dto.ClientReponseDTO;
import com.example.clientservice.dto.ClientRequestDTO;
import com.example.clientservice.reps.ClientRepository;
import com.example.clientservice.service.ClientServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@org.springframework.web.bind.annotation.RestController
public class RestController {
   @Autowired
    ClientRepository clientRepository;
   @Autowired
    ClientServiceInterface clientServiceInterface;
   @GetMapping("/clients")
    public List<ClientReponseDTO> gwtAll(){return clientServiceInterface.listerClients();}
    @GetMapping("/clients/(id)")
    public ClientReponseDTO getId(@PathVariable("id") Integer id){return  clientServiceInterface.clientById(id);}
    @DeleteMapping("/clients/(id)")
    public void supprimer(@PathVariable("id") Integer id){clientServiceInterface.supprim(id);}
    @PostMapping("/clients/(id)")
    public void save(@RequestBody ClientRequestDTO c){clientServiceInterface.add(c);}
    @PutMapping("/Clients/(id)")
    public void modify(@PathVariable("id") Integer id ,@RequestBody ClientRequestDTO c){clientServiceInterface.update(id,c);}
}
