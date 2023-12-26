package com.myapp.repositories;

import com.myapp.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {

    // Custom method to find an item by name
    Optional<Item> findByName(String name);

    // Custom method to delete an item by name
    void deleteByName(String name);
}
