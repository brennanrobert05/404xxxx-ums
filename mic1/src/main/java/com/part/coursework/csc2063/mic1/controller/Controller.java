package com.part.coursework.csc2063.mic1.controller;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.springframework.web.client.RestTemplate;
import com.part.coursework.csc2063.mic1.dto.StudentDto;
import com.part.coursework.csc2063.mic1.dto.LecturerDto;

@Path("/")
public class Controller {
    private final RestTemplate restTemplate = new RestTemplate();
    
    private final String mic2url = "http://localhost:8082";
    private final String mic3url = "http://localhost:8083";
    
    
    @GET
    @Path("/test")
    @Produces(MediaType.TEXT_PLAIN)
    public String test() {
        return "JAX-RS test endpoint OK";
    }
    
    @GET
    @Path("/alive")
    @Produces(MediaType.TEXT_PLAIN)
    public String alive() {
        return "mic1 is alive";
    }
    
    // --- Student Endpoints ---
    
    @POST
    @Path("/students/add/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addStudent(@PathParam("id") String id) {
        String url = mic2url + "/add/" + id;
        String result = restTemplate.postForObject(url, null, String.class);
        return Response.ok(result).build();
    }
    
    @GET
    @Path("/students/findbyid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findStudentById(@PathParam("id") String id) {
        String url = mic2url + "/findbyid/" + id;
        StudentDto student = restTemplate.getForObject(url, StudentDto.class);
        return Response.ok(student).build();
    }
    
    @POST
    @Path("/students/{id}/enrol/{moduleCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response enrol(@PathParam("id") String id, @PathParam("moduleCode") String moduleCode) {
        String url = mic2url + "/" + id + "/enrol/" + moduleCode;
        String result = restTemplate.postForObject(url, null, String.class);
        return Response.ok(result).build();
    }
    
    @DELETE
    @Path("/students/{id}/enrol/{moduleCode}")
    public void unenrol(@PathParam("id") String id, @PathParam("moduleCode") String moduleCode) {
        String url = mic2url + "/" + id + "/enrol/" + moduleCode;
        restTemplate.delete(url);
    }
    
    @POST
    @Path("/students/{id}/grade/{moduleCode}/{value}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response setGrade(@PathParam("id") String id, @PathParam("moduleCode") String moduleCode, @PathParam("value") int value) {
        String url = mic2url + "/" + id + "/grade/" + moduleCode + "/" + value;
        String result = restTemplate.postForObject(url, null, String.class);
        return Response.ok(result).build();
    }
    
    @DELETE
    @Path("/students/{id}/grade/{moduleCode}")
    public void delGrade(@PathParam("id") String id, @PathParam("moduleCode") String moduleCode) {
        String url = mic2url + "/" + id + "/grade/" + moduleCode;
        restTemplate.delete(url);
    }
    
    // --- Lecturer Endpoints ---
    
    @POST
    @Path("/lecturers/add/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addLecturer(@PathParam("id") String id) {
        String url = mic3url + "/add/" + id;
        String result = restTemplate.postForObject(url, null, String.class);
        return Response.ok(result).build();
    }
    
    @GET
    @Path("/lecturers/findbyid/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findLecturer(@PathParam("id") String id) {
        String url = mic3url + "/findbyid/" + id;
        // Updated to return the DTO correctly
        LecturerDto lecturer = restTemplate.getForObject(url, LecturerDto.class);
        return Response.ok(lecturer).build();
    }
    
    @POST
    @Path("/lecturers/{id}/module/{moduleCode}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response addModuleToLecturer(@PathParam("id") String id, @PathParam("moduleCode") String moduleCode) {
        String url = mic3url + "/" + id + "/module/" + moduleCode;
        String result = restTemplate.postForObject(url, null, String.class);
        return Response.ok(result).build();
    }

    @DELETE
    @Path("/lecturers/{id}/module/{moduleCode}")
    public void removeModuleFromLecturer(@PathParam("id") String id, @PathParam("moduleCode") String moduleCode) {
        String url = mic3url + "/" + id + "/module/" + moduleCode;
        restTemplate.delete(url);
    }
}

