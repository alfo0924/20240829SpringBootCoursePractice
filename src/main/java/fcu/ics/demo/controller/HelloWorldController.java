package fcu.ics.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello, World!";
    }
    @GetMapping("/eats1")
    public String hlo()
    {
        return"hlo";
    }

    @GetMapping("/hello/{name}")
    public String greeting(@PathVariable String name){
        return "<h1> Hi " + name + "</h1>";
    }
}