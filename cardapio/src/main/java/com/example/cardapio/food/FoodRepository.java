package com.example.cardapio.food;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
    
    public Food findById(Integer id);
    public Food findByTitle(String title);

}
