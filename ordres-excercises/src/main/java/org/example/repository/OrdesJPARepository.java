package org.example.repository;

import org.example.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdesJPARepository extends
        JpaRepository<Orders,Integer> {
}
