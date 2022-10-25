package com.tutelary.example.tutelaryexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "hello")
    public String hello() {
        gameService.pause();
        return "Ok";
    }

}
