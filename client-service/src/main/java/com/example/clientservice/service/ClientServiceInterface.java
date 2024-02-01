package com.example.clientservice.service;

import com.example.clientservice.dto.ClientReponseDTO;
import com.example.clientservice.dto.ClientRequestDTO;

import java.util.List;

public interface ClientServiceInterface {
    public void add(ClientRequestDTO clientRequestDTO );
    public List<ClientReponseDTO> listerClients();
    public ClientReponseDTO clientById(Integer id);
    public void update(Integer id ,ClientRequestDTO clientRequestDTO);
    public void supprim(Integer id );
}
