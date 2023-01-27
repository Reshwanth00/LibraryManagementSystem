package com.example.library.Repository;
import com.example.library.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CardRepository extends JpaRepository<Card,Integer> {
}