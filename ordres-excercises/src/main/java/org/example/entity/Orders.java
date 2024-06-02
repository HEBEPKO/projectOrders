package org.example.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Orders {
    @Id
    private int ordersId;
    private Date receiptDate;

    @OneToMany(mappedBy = "orders")
    private List<ItemOrders> itemOrders;
}
