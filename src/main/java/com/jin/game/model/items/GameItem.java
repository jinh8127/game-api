package com.jin.game.model.items;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class GameItem {

   @Id
   @SequenceGenerator(name = "item_generator", sequenceName = "item_seq", allocationSize= 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="item_generator")
   @Column(name = "item_id", nullable = false)
   private BigInteger id;

   private static BigInteger ItemId;

   @Column(name = "item_name")
   String itemName;

   @Column(name = "item_type", updatable = false)
   itemType itemType;

   @Column(name="Is_Exchangeable")
   Boolean isExchangeable;

   @Column(name="Is_Disposable")
   Boolean isDisposable;

   public GameItem() {
   }

   public GameItem(String itemName, com.jin.game.model.items.itemType itemType, Boolean isExchangeable, Boolean isDisposable) {
      this.itemName = itemName;
      this.itemType = itemType;
      this.isExchangeable = isExchangeable;
      this.isDisposable = isDisposable;
   }

   public BigInteger getId() {
      return id;
   }

   public String getItemName() {
      return itemName;
   }

   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   public com.jin.game.model.items.itemType getItemType() {
      return itemType;
   }

   public void setItemType(com.jin.game.model.items.itemType itemType) {
      this.itemType = itemType;
   }

   public Boolean getExchangeable() {
      return isExchangeable;
   }

   public void setExchangeable(Boolean exchangeable) {
      isExchangeable = exchangeable;
   }

   public Boolean getDisposable() {
      return isDisposable;
   }

   public void setDisposable(Boolean disposable) {
      isDisposable = disposable;
   }
}
