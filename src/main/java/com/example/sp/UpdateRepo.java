package com.example.sp;

import java.util.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UpdateRepo extends JpaRepository<Transaction,Integer> {
    @Query(value = "CALL batch()", nativeQuery = true)
    List<Integer> batch();
}
