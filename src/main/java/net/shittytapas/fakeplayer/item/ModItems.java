package net.shittytapas.fakeplayer.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.shittytapas.fakeplayer.ShittyFakePlayer;

public class ModItems {
    public static final Item FAKE_PLAYER = registerItem("fake_player", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(ShittyFakePlayer.MOD_ID, name), item);
    }

    public static void registerModItems(){
        ShittyFakePlayer.LOGGER.info("Registering items for " + ShittyFakePlayer.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries ->{
            entries.add(FAKE_PLAYER);
        });
    }
}
