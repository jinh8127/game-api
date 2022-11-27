package com.jin.game.service;

import com.jin.game.model.items.GameItem;
import com.jin.game.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.Optional;

@Service
public class GameItemService {

    private ItemRepository itemRepository;

    @Autowired
    public GameItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public GameItem retrieveGameItem(BigInteger id) {
        Optional<GameItem> itemOptional = itemRepository.findById(id);
        return itemOptional.orElseThrow(
                ()->new NotFoundException("Item with id "+ id + " is not found"));
    }

    public GameItem createGameItem(GameItem gameItem){
        return itemRepository.save(gameItem);
    }

    public GameItem updateGameItem(BigInteger id, GameItem gameItem){
        Optional<GameItem> itemOptional = itemRepository.findById(id);

        if (!itemOptional.isPresent()) {
            throw new NotFoundException("Item with id "+ id + " is not found");
        }
        gameItem.setId(id);
        return itemRepository.save(gameItem);
    }

    public void deleteGameItem(BigInteger id) {
        itemRepository.deleteById(id);
    }

}
