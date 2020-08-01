package com.example.kakeibo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.kakeibo.entity.Category;
import com.example.kakeibo.repository.CategoryRepository;

@Service
public class MoneyService {
	
	@Autowired
	CategoryRepository categoryRepository;
	
	public List<Category> getCategory() {
		return categoryRepository.findAll();
	}
}
