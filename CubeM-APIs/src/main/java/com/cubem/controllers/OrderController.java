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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	
	public ResponseEntity buyProduct(@RequestBody Product product) {
		return null;
	}

}
