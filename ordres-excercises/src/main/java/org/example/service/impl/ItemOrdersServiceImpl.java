package org.example.service.impl;

import org.example.entity.ItemOrders;
import org.example.repository.ItemOrdersJPARepository;
import org.example.service.ItemOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemOrdersServiceImpl implements ItemOrdersService {
    /**
     * @return
     */
    @Autowired
    private ItemOrdersJPARepository itemOrdersJPARepositiry;
    @Override
    public List<ItemOrders> getItemOrders() {
        return itemOrdersJPARepositiry.findAll();
    }
}
