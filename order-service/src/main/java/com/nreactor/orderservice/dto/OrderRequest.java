package com.nreactor.orderservice.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderRequest {
    private Long id;
    private String orderNumber;
    private List<OrderLineItemsDto> orderLineItemsDtoList;
}
