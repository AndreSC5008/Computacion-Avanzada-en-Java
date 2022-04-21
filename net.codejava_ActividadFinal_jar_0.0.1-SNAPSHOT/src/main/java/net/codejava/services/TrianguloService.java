/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package net.codejava.services;

import java.util.List;
import net.codejava.entity.Triangulo;
import net.codejava.repositories.TrianguloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author ansan
 */
@Service
@Transactional
public class TrianguloService {
    @Autowired
    private TrianguloRepository repo;
	
	public List<Triangulo> listAll() {
		return repo.findAll();
	}
	
	public void save(Triangulo triangulo) {
		repo.save(triangulo);
	}
	
	public Triangulo get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}

