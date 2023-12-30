package com.nreactor.inventoryservice.controller;

import com.nreactor.inventoryservice.service.InventoryService;
import dto.InventoryResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventoryController {
    private final InventoryService inventoryService;

    //http://localhost:8082/api/inventory/iphone-13,iphone13-red (pathvariable)
    //http://localhost:8082/api/inventory?sku-code=iphone13&sku-code=phone13-red
    //request param
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isInStock(skuCode);
    }

}
