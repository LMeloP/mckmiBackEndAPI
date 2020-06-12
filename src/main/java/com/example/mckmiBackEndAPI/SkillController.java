package com.example.mckmiBackEndAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SkillController {

    @GetMapping("/skill")
    public SkillResponse skill(@RequestParam(required = false, value="SkillId") String skillId){
        SkillResponse skillResponse = new SkillResponse();
        if(skillId!=null){
            skillResponse.getSkillData(skillId);
        }else{
            skillResponse.getAllSkillData();
        }
        return skillResponse;
    }
}
