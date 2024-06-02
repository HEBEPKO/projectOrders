package org.example.controlller;

import org.example.entity.ItemOrders;
import org.example.entity.Orders;
import org.example.service.ItemOrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/item")
public class ItemOrdersController {
    @Autowired
    private ItemOrdersService itemOrdersService;

    //CRUD -> READ
    @GetMapping()
    public List<ItemOrders> getItemOrdersList() {
        return itemOrdersService.getItemOrders();
    }
}
