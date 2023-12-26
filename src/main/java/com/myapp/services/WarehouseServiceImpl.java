package com.myapp.services;

import com.myapp.models.Item;
import com.myapp.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WarehouseServiceImpl implements WarehouseService {

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @Override
    public void addItem(Item item) {
        itemRepository.save(item);
    }

    @Override
    @Transactional
    public void removeItem(String itemName) {
        try {
            itemRepository.deleteByName(itemName);
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace(); // Print the exception details to the console for now
        }
    }
}
