package org.shakespeare.mystats;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.util.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyStatsTab implements TabCompleter {

    private final List<String> statsList = Arrays.asList("ANIMALS_BRED", "ARMOR_CLEANED", "AVIATE_ONE_CM", "BANNER_CLEANED",
            "BEACON_INTERACTION", "BELL_RING", "BOAT_ONE_CM", "BREAK_ITEM",
            "BREWINGSTAND_INTERACTION", "CAKE_SLICES_EATEN", "CAULDRON_FILLED",
            "CAULDRON_USED", "CHEST_OPENED", "CLEAN_SHULKER_BOX", "CLIMB_ONE_CM",
            "CRAFT_ITEM", "CRAFTING_TABLE_INTERACTION", "CROUCH_ONE_CM",
            "DAMAGE_ABSORBED", "DAMAGE_BLOCKED_BY_SHIELD", "DAMAGE_DEALT",
            "DAMAGE_DEALT_ABSORBED", "DAMAGE_DEALT_RESISTED", "DAMAGE_RESISTED",
            "DAMAGE_TAKEN", "DISPENSER_INSPECTED", "DROP", "DROP_COUNT",
            "DROPPER_INSPECTED", "ENDERCHEST_OPENED", "ENTITY_KILLED_BY",
            "FALL_ONE_CM", "FISH_CAUGHT", "FLOWER_POTTED", "FLY_ONE_CM",
            "FURNACE_INTERACTION", "HOPPER_INSPECTED", "HORSE_ONE_CM",
            "INTERACT_WITH_ANVIL", "INTERACT_WITH_BLAST_FURNACE",
            "INTERACT_WITH_CAMPFIRE", "INTERACT_WITH_CARTOGRAPHY_TABLE",
            "INTERACT_WITH_GRINDSTONE", "INTERACT_WITH_LECTERN",
            "INTERACT_WITH_LOOM", "INTERACT_WITH_SMITHING_TABLE",
            "INTERACT_WITH_SMOKER", "INTERACT_WITH_STONECUTTER", "ITEM_ENCHANTED",
            "JUMP", "KILL_ENTITY", "LEAVE_GAME", "MINE_BLOCK", "MINECART_ONE_CM",
            "MOB_KILLS", "NOTEBLOCK_PLAYED", "NOTEBLOCK_TUNED", "OPEN_BARREL",
            "PICKUP", "PIG_ONE_CM", "PLAY_ONE_MINUTE", "PLAYER_KILLS", "RAID_TRIGGER",
            "RAID_WIN", "RECORD_PLAYED", "SHULKER_BOX_OPENED", "SLEEP_IN_BED",
            "SNEAK_TIME", "SPRINT_ONE_CM", "STRIDER_ONE_CM", "SWIM_ONE_CM", "TALKED_TO_VILLAGER", "TARGET_HIT",
            "TIME_SINCE_DEATH", "TIME_SINCE_REST", "TOTAL_WORLD_TIME",
            "TRADED_WITH_VILLAGER", "TRAPPED_CHEST_TRIGGERED", "USE_ITEM",
            "WALK_ON_WATER_ONE_CM", "WALK_ONE_CM", "WALK_UNDER_WATER_ONE_CM",
            "DEATHS");

    @Override
    public List<String> onTabComplete(CommandSender commandSender, Command command, String s, String[] args) {

        List<String> results = new ArrayList<>();

        if (args.length == 1) {
            StringUtil.copyPartialMatches(args[0], statsList, results);
        }



        return results;
    }
}
