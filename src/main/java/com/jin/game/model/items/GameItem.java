package com.jin.game.model.items;

import javax.persistence.*;

@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
public abstract class GameItem {

   @Id
   @SequenceGenerator(name = "item_generator", sequenceName = "item_seq", allocationSize= 1)
   @GeneratedValue(strategy = GenerationType.SEQUENCE, generator="item_generator")
   private Long id;

   private static Long ItemId;

   @Column(name = "item_name")
   String itemName;

   @Column(name = "item_type", updatable = false)
   ItemType itemType;

   @Column(name="Is_Exchangeable")
   Boolean isExchangeable;

   @Column(name="Is_Disposable")
   Boolean isDisposable;

   public GameItem() {
   }

   public GameItem(String itemName, ItemType itemType, Boolean isExchangeable, Boolean isDisposable) {
      this.itemName = itemName;
      this.itemType = itemType;
      this.isExchangeable = isExchangeable;
      this.isDisposable = isDisposable;
   }

   public Long getId() {
      return id;
   }

   public String getItemName() {
      return itemName;
   }

   public void setItemName(String itemName) {
      this.itemName = itemName;
   }

   public ItemType getItemType() {
      return itemType;
   }

   public void setItemType(ItemType itemType) {
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

   public void setId(Long id) { this.id = id;}
}
