package com.epicminds.demo.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
@Table(name="item_type")
public class ItemType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="type")
    private String type;

    //For 1:1 UND and Source
//    @OneToOne(cascade = CascadeType.ALL)
//    //@JoinColumn(name = "item_id")
//    private Item item;

    //For 1:1 BND
//    @JsonBackReference
//
//    @OneToOne(mappedBy = "itemType")
//    private Item item;

}
