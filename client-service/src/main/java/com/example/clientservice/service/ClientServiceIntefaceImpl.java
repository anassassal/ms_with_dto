package com.example.clientservice.service;

import com.example.clientservice.dto.ClientReponseDTO;
import com.example.clientservice.dto.ClientRequestDTO;
import com.example.clientservice.ents.Client;
import com.example.clientservice.map.ClientInterfaceMap;
import com.example.clientservice.reps.ClientRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@Transactional
public class ClientServiceIntefaceImpl implements ClientServiceInterface{
    @Autowired
    ClientRepository clientRepository;
    @Autowired
    ClientInterfaceMap clientInterfaceMap;
    @Override
    public void add(ClientRequestDTO clientRequestDTO) {
        Client c=new Client();
        c=clientInterfaceMap.clientRequestDTo2Client(clientRequestDTO);
        clientRepository.save(c);

    }

    @Override
    public List<ClientReponseDTO> listerClients() {
        List<Client> l=new ArrayList<Client>();
        l=clientRepository.findAll();
        List<ClientReponseDTO> liste=new ArrayList<ClientReponseDTO>();
        for (Client c:l){
            liste.add(clientInterfaceMap.client2ClientReponceDTO(c));
        }
        return liste;
    }

    @Override
    public ClientReponseDTO clientById(Integer id) {
        ClientReponseDTO c=new ClientReponseDTO();
        c=clientInterfaceMap.client2ClientReponceDTO(clientRepository.findById(id).get());
        return c;
    }

    @Override
    public void update(Integer id, ClientRequestDTO r) {
        Client c=clientRepository.findById(id).get();
        if(r.getNom()!=null) c.setNom(r.getNom());
        if(r.getVille()!=null)c.setVille(r.getVille());
        clientRepository.save(c);

    }

    @Override
    public void supprim(Integer id) {
        clientRepository.deleteById(id);

    }
}
