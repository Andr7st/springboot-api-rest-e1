package com.andr7st.springboot.backend.apirest.models.service;

import java.util.List;

import com.andr7st.springboot.backend.apirest.models.entity.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
}