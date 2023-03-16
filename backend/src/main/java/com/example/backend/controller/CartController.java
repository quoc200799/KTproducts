package com.example.backend.controller;

import com.example.backend.model.CartItem;
import com.example.backend.model.dto.CartItemDto;
import com.example.backend.request.UpdateCount;
import com.example.backend.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping("/products")
    public ResponseEntity<?> getCourse() {
        ArrayList<CartItemDto> usersDtos = cartService.finAllCartItem();
        return ResponseEntity.status(HttpStatus.OK).body(usersDtos);
    }

    @DeleteMapping("/products/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    public CartItem deleteItem(@PathVariable Integer id) {
        return cartService.deleteItem(id);
    }

    @PutMapping("/products/{id}/increment")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    public ResponseEntity<?> incrementItem(@PathVariable Integer id, @RequestBody UpdateCount request) {
         cartService.incrementItem(id, request);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
    @PutMapping("/products/{id}/decrement")
    @ResponseStatus(HttpStatus.NO_CONTENT) // 204
    public ResponseEntity<?> decrementItem(@PathVariable Integer id, @RequestBody UpdateCount request) {
         cartService.decrementItem(id, request);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
