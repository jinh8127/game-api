package com.jin.game.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
abstract class gameItem {
   @Id
   String itemId;
   @Column
   String itemName;
}
