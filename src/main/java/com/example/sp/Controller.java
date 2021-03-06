package com.example.sp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

@RestController
public class Controller {
    @Autowired
    ServiceUpdate serviceUpdate;

    @GetMapping("/update")
    public List<Integer> update(){
        return serviceUpdate.batch();
    }
}
