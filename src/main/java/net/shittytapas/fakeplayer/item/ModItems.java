package net.shittytapas.fakeplayer.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.shittytapas.fakeplayer.ShittyFakePlayer;

public class ModItems {

    public static final Identifier FAKE_PLAYER_ID =
            Identifier.of(ShittyFakePlayer.MOD_ID, "fake_player");

    public static final RegistryKey<Item> FAKE_PLAYER_KEY =
            RegistryKey.of(Registries.ITEM.getKey(), FAKE_PLAYER_ID);

    public static final Item FAKE_PLAYER = Registry.register(
            Registries.ITEM,
            FAKE_PLAYER_ID,
            new Item(new Item.Settings().registryKey(FAKE_PLAYER_KEY))
    );

    public static void registerModItems() {
        ShittyFakePlayer.LOGGER.info("Registering items for " + ShittyFakePlayer.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS)
                .register(entries -> entries.add(FAKE_PLAYER));
    }
}
