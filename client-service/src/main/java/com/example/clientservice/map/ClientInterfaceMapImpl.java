package com.example.clientservice.map;

import com.example.clientservice.dto.ClientReponseDTO;
import com.example.clientservice.dto.ClientRequestDTO;
import com.example.clientservice.ents.Client;
import org.springframework.beans.BeanUtils;

public class ClientInterfaceMapImpl implements ClientInterfaceMap{
    @Override
    public Client clientRequestDTo2Client(ClientRequestDTO clientRequestDTO) {
        Client c=new Client();
        BeanUtils.copyProperties(clientRequestDTO,c);
        return c;
    }

    @Override
    public ClientReponseDTO client2ClientReponceDTO(Client client) {
        ClientReponseDTO c=new ClientReponseDTO();
        BeanUtils.copyProperties(client,c);
        return c;
    }
}
