/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muni.fi.pa165.survive.rest.client.services.impl;

import com.muni.fi.pa165.dto.WeaponDto;
import com.muni.fi.pa165.survive.rest.client.dto.CustomerResource;
import com.muni.fi.pa165.survive.rest.client.services.BaseRestService;
import com.muni.fi.pa165.survive.rest.client.services.CustomRestService;

import java.util.List;

import javax.ws.rs.client.Entity;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Auron
 */
public class WeaponServiceImpl extends BaseRestService implements CustomRestService<WeaponDto, CustomerResource> {

    static final String WEB_TARGET_JSON = "customers/json/";
    static final String WEB_TARGET = "customers/";
    static final String ACCEPT = "accept";
    static final String HEADER_JSON = "application/json";
    static final String HEADER_XML = "application/XML";
    static final String HEADER_TEXT = "application/Plain";

    public Response create(WeaponDto dto) {
            WebTarget resourceWebTarget = webTarget.path(WEB_TARGET);
            Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.APPLICATION_XML);
            invocationBuilder.header(ACCEPT, HEADER_XML);
            CustomerResource cust = new CustomerResource();
            cust.setId("99");
            cust.setName("Dougy");
            cust.setOccupation("Mastermind");
            cust.setSurname("Oosthuizen");
            cust.setInvention("Life");
            Response response = invocationBuilder.post(Entity.entity(cust, MediaType.APPLICATION_XML));
        return response;
    }

    public Response getById(Long id) {
        WebTarget resourceWebTarget = webTarget.path(WEB_TARGET_JSON + id.toString());
        Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.APPLICATION_JSON);
        invocationBuilder.header(ACCEPT, HEADER_JSON);
        Response response = invocationBuilder.get();
        //Object entity = response.getEntity();
        return response;
    }

    public Response update(WeaponDto dto) {
        WebTarget resourceWebTarget = webTarget.path(WEB_TARGET);
        Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.APPLICATION_XML);
        invocationBuilder.header(ACCEPT, HEADER_XML);
        CustomerResource cust = new CustomerResource();
        cust.setId("99");
        cust.setName("Bill");
        cust.setOccupation("The absolute greatest person in the whole world");
        cust.setSurname("Dolphin");
        cust.setInvention("Life");
        Response response = invocationBuilder.put(Entity.entity(cust, MediaType.APPLICATION_XML));
        return response;
    }

    public Response delete(Long id) {
        WebTarget resourceWebTarget = webTarget.path(WEB_TARGET+ id.toString());
        Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.TEXT_PLAIN);
        invocationBuilder.header(ACCEPT, HEADER_JSON);
        Response response = invocationBuilder.delete();
        return response;
    }

    public Response getAll() {
        WebTarget resourceWebTarget = webTarget.path(WEB_TARGET);
        Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.TEXT_PLAIN);
        //invocationBuilder.header(ACCEPT, HEADER_JSON);
        Response response = invocationBuilder.get();
        return response;
    }


    public List<CustomerResource> getDtoList() {
        WebTarget resourceWebTarget = webTarget.path(WEB_TARGET);
        Invocation.Builder invocationBuilder = resourceWebTarget.request(MediaType.APPLICATION_XML);
        List<CustomerResource> customers = invocationBuilder               
                .accept(MediaType.APPLICATION_XML)
                .get(new GenericType<List<CustomerResource>>() {
        });
        return customers;


    }
}