package org.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
@Getter
public class ItemOrders {
    @Id
    private Integer itemOrdersId;
    @OneToOne
    @JoinColumn(name = "barcode")
    private Product barcode;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "ordersId")
    @JsonIgnore
    private Orders orders;
}