package com.example.mckmiBackEndAPI;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ConsultantResponse {



    public ArrayList<Consultant> setConsultants(List<Map<String, Object>> result) {

        ArrayList<Consultant> consultants = new ArrayList<>();

        for (Map<String, Object> stringObjectMap : result) {
            consultants.add(new Consultant(Integer.parseInt(stringObjectMap.get("ConsultantID").toString()),
                    stringObjectMap.get("ConsultantName").toString(),
                    stringObjectMap.get("ConsultantStatus").toString(),
                    stringObjectMap.get("ConsultantRole").toString(),
                    Integer.parseInt(stringObjectMap.get("ClientID").toString()) ));
        }
        return consultants;

    }




    public ArrayList<Consultant> getConsultantData(String consultantId){

        String sql =    "SELECT ConsultantID " +
                ",ConsultantName " +
                ",ConsultantStatus " +
                ",ConsultantRole " +
                ",ClientID " +
                "FROM Consultant " +
                "WHERE ConsultantID = " + consultantId;

        List<Map<String, Object>> result = new SQLStatementRunner().runQueryStmt(sql);
        return setConsultants(result);

    }



    public ArrayList<Consultant> getAllConsultantData(){

        String sql = "SELECT ConsultantID " +
                ",ConsultantName " +
                ",ConsultantStatus " +
                ",ConsultantRole " +
                ",ClientID " +
                "FROM Consultant ";

        List<Map<String, Object>> result = new SQLStatementRunner().runQueryStmt(sql);
        return setConsultants(result);
    }
}
