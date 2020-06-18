package com.example.mckmiBackEndAPI;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class ClientController {

    @GetMapping("/client")
    public ArrayList<Client> client(@RequestParam(required = false, value="ClientId") String clientId){


          ClientResponse clientResponse = new ClientResponse();
          if(clientId!=null){
             return clientResponse.getClientData(clientId);
          }else{
              return clientResponse.getAllClientData();
          }

    }

    @PostMapping("/client")
    public void addClient(@RequestBody Client client){

        ClientResponse.insertClient(client.getClientName());
    }

}



