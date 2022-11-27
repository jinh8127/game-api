package com.jin.game.model.character;

import com.jin.game.model.inventory.CharacterInventory;
import com.jin.game.model.user.User;

import javax.persistence.*;

@Entity
public class GameCharacter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String characterName;
    private Integer characterLevel;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Embedded
    private CharacterInventory inventory;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public Integer getCharacterLevel() {
        return characterLevel;
    }

    public void setCharacterLevel(Integer characterLevel) {
        this.characterLevel = characterLevel;
    }

    public CharacterInventory getInventory() {
        return inventory;
    }

    public void setInventory(CharacterInventory inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", characterName='" + characterName + '\'' +
                ", characterLevel=" + characterLevel +
                ", inventoryId=" + inventory.getId() +
                '}';
    }
}
