package com.example.mckmiBackEndAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SkillResponse {

    private ArrayList<Skill> Skills;
    public ArrayList<Skill> getSkills() {
        return Skills;
    }

    public void setSkills(List<Map<String, Object>>result){
        ArrayList<Skill> skills = new ArrayList<>();

        for (Map<String, Object>stringObjectMap : result){
            skills.add(new Skill(Integer.parseInt(stringObjectMap.get("SkillID").toString()), stringObjectMap.get("SkillDescription").toString()));
            }
        Skills = skills;
    }


    public void getSkillData(String skillId){

        String sql = "SELECT SkillID, SkillDescription " + "FROM Skill " + "WHERE SkillID = " + skillId;

        List<Map<String, Object>> result = new SQLStatementRunner().runQueryStmt(sql);

        setSkills(result);
    }


    public void getAllSkillData(){

        String sql = "SELECT SkillID, SkillDescription " + "FROM Skill ";

        List<Map<String, Object>> result = new SQLStatementRunner().runQueryStmt(sql);

        setSkills(result);
    }
}
