package com.myapp.controllers;

import com.myapp.models.Item;
import com.myapp.services.WarehouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/warehouse")
public class WarehouseController {

    @Autowired
    private WarehouseService warehouseService;

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return warehouseService.getAllItems();
    }

    @PostMapping("/add")
    public void addItem(@RequestBody Item item) {
        warehouseService.addItem(item);
    }

    @RequestMapping(value = "/remove/{itemName}", method = RequestMethod.DELETE)
    public void removeItem(@PathVariable String itemName) {
        warehouseService.removeItem(itemName);
    }
}
