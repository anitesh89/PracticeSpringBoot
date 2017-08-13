/**
 * 
 */
package com.cubem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cubem.entity.Order;
import com.cubem.entity.Product;


/**
 * @author anitesh
 *
 */
@Controller
@RequestMapping("cubem")
public class OrderController {
	
	
	
	@GetMapping("order")
	public ResponseEntity<List<Order>> getAllOrders(){
		return null;
	}
	
	@PostMapping("buyProduct")
	public ResponseEntity buyProduct(@RequestParam int productId) {
		
		return null;
	}

}
