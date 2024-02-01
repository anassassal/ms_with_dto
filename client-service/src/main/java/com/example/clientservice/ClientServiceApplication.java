package com.example.clientservice;

import com.example.clientservice.ents.Client;
import com.example.clientservice.reps.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication

public class ClientServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ClientRepository clientRepository){
        return args -> {
            Client client=Client.builder().nom("ahmad").idProduit(1).ville("rabat").build();
            clientRepository.save(client);
            List<Client> clients=clientRepository.findAll();
            for (Client c:clients){
                System.out.println("----------------");
                System.out.println(c.getNom());
                System.out.println(c.getVille());
            }




        };

    }

}
