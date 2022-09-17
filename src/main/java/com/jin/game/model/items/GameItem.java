package com.jin.game.model.items;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="item_type", discriminatorType = DiscriminatorType.STRING)
public abstract class GameItem {
   @Id
   private BigInteger itemId;
   @Column
   String itemName;

   @Column(name = "item_type", updatable = false)
   itemType itemType;

   @Column(name="NPC_Sell_Price")
   BigInteger npcSellPrice;

   @Column(name="NPC_Buy_Price")
   BigInteger npcBuyPrice;

   @Column(name="Is_Exchangeable")
   Boolean isExchangeable;

   @Column(name="Is_Disposable")
   Boolean isDisposable;

   public itemType getItemType() {
      return itemType;
   }

   public GameItem() {
   }


   public BigInteger getItemId() {
      return itemId;
   }

   public void setItemId(BigInteger itemId) {
      this.itemId = itemId;
   }

   public String getItemName() {
      return itemName;
   }

   public void setItemName(String itemName) {
      this.itemName = itemName;
   }
}
