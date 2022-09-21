package com.jin.game.model.items.useable;

import com.jin.game.model.items.EquipItem;
import com.jin.game.model.player.Player;


interface Usable<T> {

    void use(T t);
}
