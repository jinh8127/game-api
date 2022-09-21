package com.jin.game.model.player;

import com.jin.game.model.items.*;

import javax.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private Integer currentLevel;

    private Integer playerStr;

    private Integer playerDex;

    private Integer playerLuk;

    private Integer playerInt;

    private Integer playerHP;

    private Integer playerMP;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Glove_itemId", referencedColumnName = "itemId")
    private Glove equippedGlove;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Helmet_itemId", referencedColumnName = "itemId")
    private Helmet equippedHelmet;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Shoes_itemId", referencedColumnName = "itemId")
    private Shoes equippedShoes;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Topwear_itemId", referencedColumnName = "itemId")
    private TopWear equippedTopWear;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "Bottomwear_itemId", referencedColumnName = "itemId")
    private BottomWear equippedBottomWear;


    public Helmet getEquippedHelmet() {
        return equippedHelmet;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayerStr() {
        return playerStr;
    }

    public void setPlayerStr(Integer playerStr) {
        this.playerStr = playerStr;
    }

    public Integer getPlayerDex() {
        return playerDex;
    }

    public void setPlayerDex(Integer playerDex) {
        this.playerDex = playerDex;
    }

    public Integer getPlayerLuk() {
        return playerLuk;
    }

    public void setPlayerLuk(Integer playerLuk) {
        this.playerLuk = playerLuk;
    }

    public Integer getPlayerInt() {
        return playerInt;
    }

    public void setPlayerInt(Integer playerInt) {
        this.playerInt = playerInt;
    }

    public Integer getPlayerHP() {
        return playerHP;
    }

    public void setPlayerHP(Integer playerHP) {
        this.playerHP = playerHP;
    }

    public Integer getPlayerMP() {
        return playerMP;
    }

    public void setPlayerMP(Integer playerMP) {
        this.playerMP = playerMP;
    }

    public Integer getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Glove getequippedGlove() {
        return equippedGlove;
    }

    public void setequippedGlove(Glove equippedGlove) {
        this.equippedGlove = equippedGlove;
    }

    public Helmet getequippedHelmet() {
        return equippedHelmet;
    }

    public void setequippedHelmet(Helmet equippedHelmet) {
        this.equippedHelmet = equippedHelmet;
    }

    public Shoes getequippedShoes() {
        return equippedShoes;
    }

    public void setequippedShoes(Shoes equippedShoes) {
        this.equippedShoes = equippedShoes;
    }

    public TopWear getequippedTopWear() {
        return equippedTopWear;
    }

    public void setequippedTopWear(TopWear equippedTopWear) {
        this.equippedTopWear = equippedTopWear;
    }

    public BottomWear getequippedBottomWear() {
        return equippedBottomWear;
    }

    public void setequippedBottomWear(BottomWear equippedBottomWear) {
        this.equippedBottomWear = equippedBottomWear;
    }

    public void recoverHpByAmount(Integer recoveryAmount){
        Integer currentHP = this.getPlayerHP();
        this.setPlayerHP(currentHP + recoveryAmount);
    }

    public void recoverMpByAmount(Integer recoveryAmount){
        Integer currentMP = this.getPlayerMP();
        this.setPlayerMP(currentMP + recoveryAmount);
    }

}
