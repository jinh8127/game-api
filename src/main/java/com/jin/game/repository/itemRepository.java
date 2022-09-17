package com.jin.game.repository;

import com.jin.game.model.items.GameItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;

public interface itemRepository extends JpaRepository<GameItem, BigInteger> {
}
