/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lease.restapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lease.payload.InvokeOkHttps;
import java.io.IOException;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
/**
 *
 * @author Prasenjit
 */
@Path("invoicecreation")
public class InvoiceCreation {
    
    // http://localhost:8080/Al-MiskIntegrations/webresources/invoicecreation/v1

    
    @Context
    private UriInfo context;

    /**
     * Creates a new instance of InvoiceCreation
     */
    public InvoiceCreation() {
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
//        throw new UnsupportedOperationException();
        return null;
    }
    
    /**
     * PUT method for updating or creating an instance of InvoiceCreation
     *
     * @param content representation for the resource
     */
    @Path("/v1")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createInvoice(String body) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InvBodyDeserialization bodyData = objectMapper.readValue(body, InvBodyDeserialization.class);
        InvokeOkHttps invokeWebService = new InvokeOkHttps();
        String resultstatus = invokeWebService.invoiceInterface(bodyData);
            return Response.ok()
                    .header("Access-Control-Allow-Origin", "*")
                    .header("Access-Control-Allow-Methods", "POST, GET, PUT, UPDATE, OPTIONS")
                    .header("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With").entity(invokeWebService.responseToRest(resultstatus)).build();
    }
 
        public String responseToRest(String result) throws JSONException {
            JSONObject json = new JSONObject();
            json.put("result", result);
            return json.toString();
        }
    
    
}
