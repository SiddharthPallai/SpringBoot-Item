package com.epicminds.demo.repository;

import com.epicminds.demo.model.ItemType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sidharth
 */
@Repository
public interface ItemTypeRepo extends JpaRepository<ItemType, Integer> {
}
