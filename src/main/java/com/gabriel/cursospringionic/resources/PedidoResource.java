package com.gabriel.cursospringionic.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabriel.cursospringionic.domain.Pedido;
import com.gabriel.cursospringionic.services.PedidoService;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<Pedido> findById(@PathVariable Integer id) {	
		Pedido obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
}