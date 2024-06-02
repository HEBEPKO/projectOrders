package org.example.service.impl;

import org.example.entity.Orders;
import org.example.repository.OrdesJPARepository;
import org.example.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class OrdesServiceImpl implements OrdersService {
    @Autowired
    private OrdesJPARepository ordesRepository;

    @Override
    public List<Orders> getOrdersList() {
        return ordesRepository.findAll();
    }
}
