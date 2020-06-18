package com.example.mckmiBackEndAPI;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ConsultantController {

    //test new branch
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/consultant")
    public ArrayList<Consultant> consultant(@RequestParam(required = false, value="ConsultantId") String consultantId){
        ConsultantResponse consultantResponse = new ConsultantResponse();
        if(consultantId!=null){
            return consultantResponse.getConsultantData(consultantId);
        }else{
            return consultantResponse.getAllConsultantData();
        }

    }
}
