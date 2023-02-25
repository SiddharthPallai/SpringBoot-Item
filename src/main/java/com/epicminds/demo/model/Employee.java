package com.epicminds.demo.model;

import lombok.*;

import javax.persistence.*;

/**
 * @author Sidharth
 */

@Entity
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table (name="Emp_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    String name;
    Double salary;
}
