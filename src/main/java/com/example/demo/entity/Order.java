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

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "t_order")
public class Order {

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
}
