package com.example.mckmiBackEndAPI;

public class Skill {

    private int skillId;
    private  String skillDescription;

    public Skill(int skillId, String skillDescription) {
       setSkillId(skillId);
       setSkillDescription(skillDescription);
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public void setSkillDescription(String skillDescription) {
        this.skillDescription = skillDescription;
    }

    public int getSkillId() {
        return skillId;
    }

    public String getSkillDescription() {
        return skillDescription;
    }

}
