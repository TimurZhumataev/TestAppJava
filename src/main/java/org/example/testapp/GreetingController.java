package org.example.testapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greet")
public class GreetingController {

    @GetMapping
    public String greet(@RequestParam("name") String name) {
        return "Hello " + name;
    }

    @GetMapping("/full")
    public String full(@RequestParam("name") String name,
                       @RequestParam("surname") String surname){
        return "Hello " + name + " " + surname;
    }

    @GetMapping("/{name}")
    public String greet2(@PathVariable String name){
        return "Hello " + name;
    }
}
