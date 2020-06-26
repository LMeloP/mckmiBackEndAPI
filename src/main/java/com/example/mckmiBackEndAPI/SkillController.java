package com.example.mckmiBackEndAPI;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class SkillController {

  @CrossOrigin(origins = "http://localhost:3000")
  @GetMapping("/skill")
  public ArrayList<Skill> skill(@RequestParam(required = false, value = "SkillId") String skillId) {

      SkillResponse skillResponse = new SkillResponse();
    if (skillId != null) {
      return skillResponse.getSkillData(skillId);
    } else {
      return skillResponse.getAllSkillData();
    }
  }
  }


