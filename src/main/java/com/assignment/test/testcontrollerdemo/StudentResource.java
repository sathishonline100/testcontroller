package com.assignment.test.testcontrollerdemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/student")
public class StudentResource {

    @GetMapping()
    public String testStudent(){
        String test="This is a test";
        return test;
    }

}
