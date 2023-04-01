package com.mortimyrrh.mycelia.item.custom;

import com.mortimyrrh.mycelia.item.ModCreativeModeTab;
import net.minecraft.world.item.*;

public class FierceDeitySword extends SwordItem {

    public FierceDeitySword() {
        super(Tiers.DIAMOND, 10, 5f, new Item.Properties()
                .rarity(Rarity.RARE)
                .tab(ModCreativeModeTab.MYCELIA_TAB)
                .stacksTo(1)
                .fireResistant());
    }
}


// give entity myceiliay decay on hit
