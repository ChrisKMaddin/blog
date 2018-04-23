package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    // This is the simplest way to test a get request from the controller
    @GetMapping("/hello")
    // ResponseBody makes sure you always get plain text in return and displayed in the browser
    @ResponseBody
    public String sayHello(){
        return  "Hello World";
    }

    // This is how you get access to the url params like: /hello/fer
    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHelloF(@PathVariable String name){
        return  "Hello " + name + "!" ;
    }

    @GetMapping("/hello/{name}/{lastname}")
    @ResponseBody
    public String sayHelloFL(@PathVariable String name, @PathVariable String lastname){
        return  "Hello " + name + " " + lastname;
    }

    @GetMapping("/logmeout")
    @ResponseBody
    public String logout(){
        return "you have been logged out";
    }

    // This is another way to create a method that listen for a get request
    @RequestMapping(path = "/lights/{mode}", method = RequestMethod.GET)
    @ResponseBody
    public String lights(@PathVariable String mode){
        return "Lights " + mode;
    }

    @PostMapping("/postExample")
    @ResponseBody
    public String testPost(@RequestParam String name){
        return "Test Post successful, name: " + name;
    }

}