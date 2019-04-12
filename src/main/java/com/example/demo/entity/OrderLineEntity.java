package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_order_line")
public class OrderLineEntity {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id",referencedColumnName = "id")
    private OrderEntity order;
    @CreationTimestamp
    private Date creationDate;
    @UpdateTimestamp
    private Date lastUpdatedDate;

    private double price;
}
