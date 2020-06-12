package com.example.mckmiBackEndAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultantController {

    //test new branch
    @GetMapping("/consultant")
    public ConsultantResponse consultant(@RequestParam(required = false, value="ConsultantId") String consultantId){
        ConsultantResponse consultantResponse = new ConsultantResponse();
        if(consultantId!=null){
            consultantResponse.getConsultantData(consultantId);
        }else{
            consultantResponse.getAllConsultantData();
        }
        return consultantResponse;
    }
}
