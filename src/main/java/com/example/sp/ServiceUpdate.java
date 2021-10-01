package com.example.sp;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceUpdate {
    @Autowired
    private UpdateRepo updateRepo;

    public List<Integer> batch(){
        List<Integer> returns;
        returns=updateRepo.batch();

        //if(true)throw new RuntimeException();

        return returns;
    }
}
