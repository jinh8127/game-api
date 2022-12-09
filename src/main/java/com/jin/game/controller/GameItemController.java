package com.jin.game.controller;

import com.jin.game.model.items.GameItem;
import com.jin.game.service.GameItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("api/v1/items")
public class GameItemController {
    
    private GameItemService itemService;

    @GetMapping
    public ResponseEntity<List<GameItem>> getGameItems(){
        List<GameItem> accounts = itemService.retrieveAllGameItems();
        return ResponseEntity.ok().body(accounts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameItem> getGameItemById(@PathVariable("id") long id) {
        GameItem account = itemService.retrieveGameItem(id);
        return ResponseEntity.ok(account);
    }

    @PostMapping("/userGameItem")
    public ResponseEntity<GameItem> createUserGameItem(@RequestBody GameItem userGameItem) {
        GameItem createdGameItem = itemService.createGameItem(userGameItem);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdGameItem.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdGameItem);
    }

    @PostMapping("/AdminGameItem")
    public ResponseEntity<GameItem> createAdminGameItem(@RequestBody GameItem GameItem) {
        GameItem createdGameItem = itemService.createGameItem(GameItem);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(createdGameItem.getId())
                .toUri();
        return ResponseEntity.created(location).body(createdGameItem);
    }

    @PutMapping("GameItem/{id}")
    public ResponseEntity<GameItem> updateGameItem(@PathVariable("id") long id,
                                                  @RequestBody GameItem acc) {
        GameItem updatedGameItem = (GameItem) itemService.updateGameItem(id, acc);
        return ResponseEntity.ok(updatedGameItem);
    }

    @DeleteMapping("/{id}")
    public void deleteGameItem(@PathVariable("id") long id) {
        itemService.deleteGameItem(id);
    }
    
    
}
