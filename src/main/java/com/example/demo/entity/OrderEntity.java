package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_order")
public class OrderEntity {

    @Id
    @GeneratedValue(generator = "guid-generator")
    @GenericGenerator(name="guid-generator",strategy = "com.example.demo.GUIDGenerator")
    private String id;

    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastUpdatedBy;
    @CreationTimestamp
    private Date creationDate;
    @UpdateTimestamp
    private Date lastUpdatedDate;

    private Integer activeFlag;

    private String buyId;
    private String OrderNo;
    private String buyerName;
    @OneToMany(mappedBy = "order",fetch = FetchType.LAZY)
    List<OrderLineEntity> orderLineEntities;

}
