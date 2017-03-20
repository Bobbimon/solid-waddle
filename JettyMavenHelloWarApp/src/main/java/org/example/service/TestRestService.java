package org.example.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("testRestService")
@RequestMapping("/test")
public class TestRestService {

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String getTest() {
        return "pong";
    }

}
