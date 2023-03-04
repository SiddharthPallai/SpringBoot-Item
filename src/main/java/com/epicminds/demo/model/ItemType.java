package com.epicminds.demo.model;

import lombok.*;

import javax.persistence.*;

/**
 * @author Sidharth
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="item-type")
public class ItemType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;

    @Column(name="type")
    String type;

    @OneToOne(mappedBy = "itemType")
    Item item;

}
