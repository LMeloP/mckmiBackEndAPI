package com.example.mckmiBackEndAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class ClientResponse {





    public  ArrayList<Client> setClients(List<Map<String, Object>> result) {

        ArrayList<Client> clients = new ArrayList<>();

        for (Map<String, Object> stringObjectMap : result) {
            clients.add(new Client(Integer.parseInt(stringObjectMap.get("ClientID").toString()),
                    stringObjectMap.get("ClientName").toString()));
           // System.out.println( stringObjectMap.get("ClientID").toString() + "  " +
           //         stringObjectMap.get("ClientName").toString());
        }

        return clients;
    }




    public ArrayList<Client> getClientData(String clientId){
        //System.out.println("calling getClientData(String clientId)");
        String sql = "SELECT ClientID, ClientName " +
                "FROM Client " +
                "WHERE ClientID = " + clientId;

        List<Map<String, Object>> result = new SQLStatementRunner().runQueryStmt(sql);

        return setClients(result);
    }


    public ArrayList<Client> getAllClientData(){
        //System.out.println("Calling getClientData()");
        String sql = "SELECT ClientID, ClientName " +
                "FROM Client ";

        List<Map<String, Object>> result = new SQLStatementRunner().runQueryStmt(sql);

       return setClients(result);
    }

    public static void insertClient(String clientName){
        String sql = "INSERT INTO " +
                        "Client (ClientName, CreatedDateTime, UpdateDateTime) " +
                        "values ('"+ clientName + "', GETDATE(), GETDATE())";
        SQLStatementRunner runInsert = new SQLStatementRunner();
        runInsert.runStmt(sql);
    }




}
