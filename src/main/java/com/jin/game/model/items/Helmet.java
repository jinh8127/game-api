package com.jin.game.model.items;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "Helmet")
public class Helmet extends EquipItem implements Wearable {

    public Helmet() {
    }

}
