package com.jin.game.repository;

import com.jin.game.model.items.GameItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepository extends JpaRepository<GameItem, Long> {
}
