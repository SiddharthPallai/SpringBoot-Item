package com.epicminds.demo.repository;

import com.epicminds.demo.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sidharth
 */
@Repository
public interface ItemRepo extends JpaRepository<Item, Integer> {
}
