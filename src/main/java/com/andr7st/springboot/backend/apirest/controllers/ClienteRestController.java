package com.andr7st.springboot.backend.apirest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.andr7st.springboot.backend.apirest.models.entity.Cliente;
import com.andr7st.springboot.backend.apirest.models.service.IClienteService;

@CrossOrigin(origins={"http://localhost:8080/api/clientes"})
@RestController
@RequestMapping("/api")
public class ClienteRestController {
	
	@Autowired
	private IClienteService clienteService;
	
	@GetMapping("clientes")
	public List<Cliente> index() {

		return clienteService.findAll();
	}

}
