package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Item;

public interface ItemRepository extends JpaRepository<Item, Long> {

}
