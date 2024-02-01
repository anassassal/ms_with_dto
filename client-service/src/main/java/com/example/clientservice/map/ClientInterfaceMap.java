package com.example.clientservice.map;

import com.example.clientservice.dto.ClientReponseDTO;
import com.example.clientservice.dto.ClientRequestDTO;
import com.example.clientservice.ents.Client;

public interface ClientInterfaceMap {
    public Client clientRequestDTo2Client(ClientRequestDTO clientRequestDTO);
    public ClientReponseDTO client2ClientReponceDTO( Client client);
}
