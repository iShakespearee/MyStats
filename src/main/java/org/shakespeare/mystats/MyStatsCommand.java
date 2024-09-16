package org.shakespeare.mystats;

import org.bukkit.Statistic;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MyStatsCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] args) {
        if (commandSender instanceof Player) {
            Player player = (Player) commandSender;

            if (args.length == 0) {
                player.sendMessage("§c§lINVALID USAGE §c/mystats <statistic>");
                return true;
            }
            String statisticType = args[0].toUpperCase();
            switch (statisticType.toUpperCase()) {
                case "ANIMALS_BRED":
                    player.getStatistic(Statistic.ANIMALS_BRED);
                    player.sendMessage("§e§lYOU HAVE BRED ANIMALS §e" + player.getStatistic(Statistic.ANIMALS_BRED) + " §e§lTIMES!");
                    break;

                case "ARMOR_CLEANED":
                    player.getStatistic(Statistic.ARMOR_CLEANED);
                    player.sendMessage("§e§lYOU HAVE CLEANED ARMOR PIECES §e" + player.getStatistic(Statistic.ARMOR_CLEANED) + " §e§lTIMES!");
                    break;

                case "AVIATE_ONE_CM":
                    player.getStatistic(Statistic.AVIATE_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE AVIATED §e" + player.getStatistic(Statistic.AVIATE_ONE_CM) + " §e§lCM!");
                    break;

                case "BANNER_CLEANED":
                    player.getStatistic(Statistic.BANNER_CLEANED);
                    player.sendMessage("§e§lYOU HAVE CLEANED BANNERS §e" + player.getStatistic(Statistic.BANNER_CLEANED) + " §e§lTIMES!");
                    break;

                case "BEACON_INTERACTION":
                    player.getStatistic(Statistic.BEACON_INTERACTION);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH BEACONS §e" + player.getStatistic(Statistic.BEACON_INTERACTION) + " §e§lTIMES!");
                    break;

                case "BELL_RING":
                    player.getStatistic(Statistic.BELL_RING);
                    player.sendMessage("§e§lYOU HAVE RUNG BELLS §e" + player.getStatistic(Statistic.BELL_RING) + " §e§lTIMES!");
                    break;

                case "BOAT_ONE_CM":
                    player.getStatistic(Statistic.BOAT_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE TRAVELED IN A BOAT §e" + player.getStatistic(Statistic.BOAT_ONE_CM) + " §e§lCM!");
                    break;

                case "BREAK_ITEM":
                    player.getStatistic(Statistic.BREAK_ITEM);
                    player.sendMessage("§e§lYOU HAVE BROKEN ITEMS §e" + player.getStatistic(Statistic.BREAK_ITEM) + " §e§lTIMES!");
                    break;

                case "BREWINGSTAND_INTERACTION":
                    player.getStatistic(Statistic.BREWINGSTAND_INTERACTION);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH BREWING STANDS §e" + player.getStatistic(Statistic.BREWINGSTAND_INTERACTION) + " §e§lTIMES!");
                    break;

                case "CAKE_SLICES_EATEN":
                    player.getStatistic(Statistic.CAKE_SLICES_EATEN);
                    player.sendMessage("§e§lYOU HAVE EATEN CAKE SLICES §e" + player.getStatistic(Statistic.CAKE_SLICES_EATEN) + " §e§lTIMES!");
                    break;

                case "CAULDRON_FILLED":
                    player.getStatistic(Statistic.CAULDRON_FILLED);
                    player.sendMessage("§e§lYOU HAVE FILLED CAULDRONS §e" + player.getStatistic(Statistic.CAULDRON_FILLED) + " §e§lTIMES!");
                    break;

                case "CAULDRON_USED":
                    player.getStatistic(Statistic.CAULDRON_USED);
                    player.sendMessage("§e§lYOU HAVE USED CAULDRONS §e" + player.getStatistic(Statistic.CAULDRON_USED) + " §e§lTIMES!");
                    break;

                case "CHEST_OPENED":
                    player.getStatistic(Statistic.CHEST_OPENED);
                    player.sendMessage("§e§lYOU HAVE OPENED CHESTS §e" + player.getStatistic(Statistic.CHEST_OPENED) + " §e§lTIMES!");
                    break;

                case "CLEAN_SHULKER_BOX":
                    player.getStatistic(Statistic.CLEAN_SHULKER_BOX);
                    player.sendMessage("§e§lYOU HAVE CLEANED SHULKER BOXES §e" + player.getStatistic(Statistic.CLEAN_SHULKER_BOX) + " §e§lTIMES!");
                    break;

                case "CLIMB_ONE_CM":
                    player.getStatistic(Statistic.CLIMB_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE CLIMBED §e" + player.getStatistic(Statistic.CLIMB_ONE_CM) + " §e§lCM!");
                    break;

                case "CRAFT_ITEM":
                    player.getStatistic(Statistic.CRAFT_ITEM);
                    player.sendMessage("§e§lYOU HAVE CRAFTED ITEMS §e" + player.getStatistic(Statistic.CRAFT_ITEM) + " §e§lTIMES!");
                    break;

                case "CRAFTING_TABLE_INTERACTION":
                    player.getStatistic(Statistic.CRAFTING_TABLE_INTERACTION);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH CRAFTING TABLES §e" + player.getStatistic(Statistic.CRAFTING_TABLE_INTERACTION) + " §e§lTIMES!");
                    break;

                case "CROUCH_ONE_CM":
                    player.getStatistic(Statistic.CROUCH_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE CROUCHED §e" + player.getStatistic(Statistic.CROUCH_ONE_CM) + " §e§lCM!");
                    break;

                case "DAMAGE_ABSORBED":
                    player.getStatistic(Statistic.DAMAGE_ABSORBED);
                    player.sendMessage("§e§lYOU HAVE ABSORBED DAMAGE §e" + player.getStatistic(Statistic.DAMAGE_ABSORBED) + " §e§lIN TENTHS!");
                    break;

                case "DAMAGE_BLOCKED_BY_SHIELD":
                    player.getStatistic(Statistic.DAMAGE_BLOCKED_BY_SHIELD);
                    player.sendMessage("§e§lYOU HAVE BLOCKED DAMAGE WITH SHIELD §e" + player.getStatistic(Statistic.DAMAGE_BLOCKED_BY_SHIELD) + " §e§lIN TENTHS!");
                    break;

                case "DAMAGE_DEALT":
                    player.getStatistic(Statistic.DAMAGE_DEALT);
                    player.sendMessage("§e§lYOU HAVE DEALT DAMAGE §e" + player.getStatistic(Statistic.DAMAGE_DEALT) + " §e§lIN TENTHS!");
                    break;

                case "DAMAGE_DEALT_ABSORBED":
                    player.getStatistic(Statistic.DAMAGE_DEALT_ABSORBED);
                    player.sendMessage("§e§lYOU HAVE DEALT DAMAGE THAT WAS ABSORBED §e" + player.getStatistic(Statistic.DAMAGE_DEALT_ABSORBED) + " §e§lIN TENTHS!");
                    break;

                case "DAMAGE_DEALT_RESISTED":
                    player.getStatistic(Statistic.DAMAGE_DEALT_RESISTED);
                    player.sendMessage("§e§lYOU HAVE DEALT DAMAGE THAT WAS RESISTED §e" + player.getStatistic(Statistic.DAMAGE_DEALT_RESISTED) + " §e§lIN TENTHS!");
                    break;

                case "DAMAGE_RESISTED":
                    player.getStatistic(Statistic.DAMAGE_RESISTED);
                    player.sendMessage("§e§lYOU HAVE RESISTED DAMAGE §e" + player.getStatistic(Statistic.DAMAGE_RESISTED) + " §e§lIN TENTHS!");
                    break;

                case "DAMAGE_TAKEN":
                    player.getStatistic(Statistic.DAMAGE_TAKEN);
                    player.sendMessage("§e§lYOU HAVE TAKEN DAMAGE §e" + player.getStatistic(Statistic.DAMAGE_TAKEN) + " §e§lIN TENTHS!");
                    break;

                case "DISPENSER_INSPECTED":
                    player.getStatistic(Statistic.DISPENSER_INSPECTED);
                    player.sendMessage("§e§lYOU HAVE INSPECTED DISPENSERS §e" + player.getStatistic(Statistic.DISPENSER_INSPECTED) + " §e§lTIMES!");
                    break;

                case "DROP":
                    player.getStatistic(Statistic.DROP);
                    player.sendMessage("§e§lYOU HAVE DROPPED ITEMS §e" + player.getStatistic(Statistic.DROP) + " §e§lTIMES!");
                    break;

                case "DROP_COUNT":
                    player.getStatistic(Statistic.DROP_COUNT);
                    player.sendMessage("§e§lYOU HAVE DROPPED ITEMS COUNT §e" + player.getStatistic(Statistic.DROP_COUNT) + " §e§lTIMES!");
                    break;

                case "DROPPER_INSPECTED":
                    player.getStatistic(Statistic.DROPPER_INSPECTED);
                    player.sendMessage("§e§lYOU HAVE INSPECTED DROPPERS §e" + player.getStatistic(Statistic.DROPPER_INSPECTED) + " §e§lTIMES!");
                    break;

                case "ENDERCHEST_OPENED":
                    player.getStatistic(Statistic.ENDERCHEST_OPENED);
                    player.sendMessage("§e§lYOU HAVE OPENED ENDER CHESTS §e" + player.getStatistic(Statistic.ENDERCHEST_OPENED) + " §e§lTIMES!");
                    break;

                case "ENTITY_KILLED_BY":
                    player.getStatistic(Statistic.ENTITY_KILLED_BY);
                    player.sendMessage("§e§lYOU HAVE BEEN KILLED BY ENTITIES §e" + player.getStatistic(Statistic.ENTITY_KILLED_BY) + " §e§lTIMES");
                    break;

                case "FALL_ONE_CM":
                    player.getStatistic(Statistic.FALL_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE FALLEN §e" + player.getStatistic(Statistic.FALL_ONE_CM) + " §e§lCM!");
                    break;

                case "FISH_CAUGHT":
                    player.getStatistic(Statistic.FISH_CAUGHT);
                    player.sendMessage("§e§lYOU HAVE CAUGHT FISH §e" + player.getStatistic(Statistic.FISH_CAUGHT) + " §e§lTIMES!");
                    break;

                case "FLOWER_POTTED":
                    player.getStatistic(Statistic.FLOWER_POTTED);
                    player.sendMessage("§e§lYOU HAVE POTTED FLOWERS §e" + player.getStatistic(Statistic.FLOWER_POTTED) + " §e§lTIMES!");
                    break;

                case "FLY_ONE_CM":
                    player.getStatistic(Statistic.FLY_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE FLOWN §e" + player.getStatistic(Statistic.FLY_ONE_CM) + " §e§lCM!");
                    break;

                case "FURNACE_INTERACTION":
                    player.getStatistic(Statistic.FURNACE_INTERACTION);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH FURNACES §e" + player.getStatistic(Statistic.FURNACE_INTERACTION) + " §e§lTIMES!");
                    break;

                case "HOPPER_INSPECTED":
                    player.getStatistic(Statistic.HOPPER_INSPECTED);
                    player.sendMessage("§e§lYOU HAVE INSPECTED HOPPERS §e" + player.getStatistic(Statistic.HOPPER_INSPECTED) + " §e§lTIMES!");
                    break;

                case "HORSE_ONE_CM":
                    player.getStatistic(Statistic.HORSE_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE RIDDEN HORSES §e" + player.getStatistic(Statistic.HORSE_ONE_CM) + " §e§lCM!");
                    break;

                case "INTERACT_WITH_ANVIL":
                    player.getStatistic(Statistic.INTERACT_WITH_ANVIL);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH ANVILS §e" + player.getStatistic(Statistic.INTERACT_WITH_ANVIL) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_BLAST_FURNACE":
                    player.getStatistic(Statistic.INTERACT_WITH_BLAST_FURNACE);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH BLAST FURNACES §e" + player.getStatistic(Statistic.INTERACT_WITH_BLAST_FURNACE) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_CAMPFIRE":
                    player.getStatistic(Statistic.INTERACT_WITH_CAMPFIRE);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH CAMPFIRES §e" + player.getStatistic(Statistic.INTERACT_WITH_CAMPFIRE) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_CARTOGRAPHY_TABLE":
                    player.getStatistic(Statistic.INTERACT_WITH_CARTOGRAPHY_TABLE);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH CARTOGRAPHY TABLES §e" + player.getStatistic(Statistic.INTERACT_WITH_CARTOGRAPHY_TABLE) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_GRINDSTONE":
                    player.getStatistic(Statistic.INTERACT_WITH_GRINDSTONE);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH GRINDSTONES §e" + player.getStatistic(Statistic.INTERACT_WITH_GRINDSTONE) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_LECTERN":
                    player.getStatistic(Statistic.INTERACT_WITH_LECTERN);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH LECTERNS §e" + player.getStatistic(Statistic.INTERACT_WITH_LECTERN) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_LOOM":
                    player.getStatistic(Statistic.INTERACT_WITH_LOOM);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH LOOMS §e" + player.getStatistic(Statistic.INTERACT_WITH_LOOM) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_SMITHING_TABLE":
                    player.getStatistic(Statistic.INTERACT_WITH_SMITHING_TABLE);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH SMITHING TABLES §e" + player.getStatistic(Statistic.INTERACT_WITH_SMITHING_TABLE) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_SMOKER":
                    player.getStatistic(Statistic.INTERACT_WITH_SMOKER);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH SMOKERS §e" + player.getStatistic(Statistic.INTERACT_WITH_SMOKER) + " §e§lTIMES!");
                    break;

                case "INTERACT_WITH_STONECUTTER":
                    player.getStatistic(Statistic.INTERACT_WITH_STONECUTTER);
                    player.sendMessage("§e§lYOU HAVE INTERACTED WITH STONECUTTERS §e" + player.getStatistic(Statistic.INTERACT_WITH_STONECUTTER) + " §e§lTIMES!");
                    break;

                case "ITEM_ENCHANTED":
                    player.getStatistic(Statistic.ITEM_ENCHANTED);
                    player.sendMessage("§e§lYOU HAVE ENCHANTED ITEMS §e" + player.getStatistic(Statistic.ITEM_ENCHANTED) + " §e§lTIMES!");
                    break;

                case "JUMP":
                    player.getStatistic(Statistic.JUMP);
                    player.sendMessage("§e§lYOU HAVE JUMPED §e" + player.getStatistic(Statistic.JUMP) + " §e§lTIMES!");
                    break;

                case "KILL_ENTITY":
                    player.getStatistic(Statistic.KILL_ENTITY);
                    player.sendMessage("§e§lYOU HAVE KILLED ENTITIES §e" + player.getStatistic(Statistic.KILL_ENTITY) + " §e§lTIMES!");
                    break;

                case "LEAVE_GAME":
                    player.getStatistic(Statistic.LEAVE_GAME);
                    player.sendMessage("§e§lYOU HAVE LEFT THE GAME §e" + player.getStatistic(Statistic.LEAVE_GAME) + " §e§lTIMES!");
                    break;

                case "MINE_BLOCK":
                    player.getStatistic(Statistic.MINE_BLOCK);
                    player.sendMessage("§e§lYOU HAVE MINED BLOCKS §e" + player.getStatistic(Statistic.MINE_BLOCK) + " §e§lTIMES!");
                    break;

                case "MINECART_ONE_CM":
                    player.getStatistic(Statistic.MINECART_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE TRAVELED IN MINECARTS §e" + player.getStatistic(Statistic.MINECART_ONE_CM) + " §e§lCM!");
                    break;

                case "MOB_KILLS":
                    player.getStatistic(Statistic.MOB_KILLS);
                    player.sendMessage("§e§lYOU HAVE KILLED MOBS §e" + player.getStatistic(Statistic.MOB_KILLS) + " §e§lTIMES!");
                    break;

                case "NOTEBLOCK_PLAYED":
                    player.getStatistic(Statistic.NOTEBLOCK_PLAYED);
                    player.sendMessage("§e§lYOU HAVE PLAYED NOTEBLOCKS §e" + player.getStatistic(Statistic.NOTEBLOCK_PLAYED) + " §e§lTIMES!");
                    break;

                case "NOTEBLOCK_TUNED":
                    player.getStatistic(Statistic.NOTEBLOCK_TUNED);
                    player.sendMessage("§e§lYOU HAVE TUNED NOTEBLOCKS §e" + player.getStatistic(Statistic.NOTEBLOCK_TUNED) + " §e§lTIMES!");
                    break;

                case "OPEN_BARREL":
                    player.getStatistic(Statistic.OPEN_BARREL);
                    player.sendMessage("§e§lYOU HAVE OPENED BARRELS §e" + player.getStatistic(Statistic.OPEN_BARREL) + " §e§lTIMES!");
                    break;

                case "PICKUP":
                    player.getStatistic(Statistic.PICKUP);
                    player.sendMessage("§e§lYOU HAVE PICKED UP ITEMS §e" + player.getStatistic(Statistic.PICKUP) + " §e§lTIMES!");
                    break;

                case "PIG_ONE_CM":
                    player.getStatistic(Statistic.PIG_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE RIDDEN PIGS §e" + player.getStatistic(Statistic.PIG_ONE_CM) + " §e§lCM!");
                    break;

                case "PLAY_ONE_MINUTE":
                    player.getStatistic(Statistic.PLAY_ONE_MINUTE);
                    player.sendMessage("§e§lYOU HAVE PLAYED §e" + player.getStatistic(Statistic.PLAY_ONE_MINUTE) + " §e§lMINUTES!");
                    break;

                case "PLAYER_KILLS":
                    player.getStatistic(Statistic.PLAYER_KILLS);
                    player.sendMessage("§e§lYOU HAVE KILLED PLAYERS §e" + player.getStatistic(Statistic.PLAYER_KILLS) + " §e§lTIMES!");
                    break;

                case "RAID_TRIGGER":
                    player.getStatistic(Statistic.RAID_TRIGGER);
                    player.sendMessage("§e§lYOU HAVE TRIGGERED RAIDS §e" + player.getStatistic(Statistic.RAID_TRIGGER) + " §e§lTIMES!");
                    break;

                case "RAID_WIN":
                    player.getStatistic(Statistic.RAID_WIN);
                    player.sendMessage("§e§lYOU HAVE WON RAIDS §e" + player.getStatistic(Statistic.RAID_WIN) + " §e§lTIMES!");
                    break;

                case "RECORD_PLAYED":
                    player.getStatistic(Statistic.RECORD_PLAYED);
                    player.sendMessage("§e§lYOU HAVE PLAYED RECORDS §e" + player.getStatistic(Statistic.RECORD_PLAYED) + " §e§lTIMES!");
                    break;

                case "SHULKER_BOX_OPENED":
                    player.getStatistic(Statistic.SHULKER_BOX_OPENED);
                    player.sendMessage("§e§lYOU HAVE OPENED SHULKER BOXES §e" + player.getStatistic(Statistic.SHULKER_BOX_OPENED) + " §e§lTIMES!");
                    break;

                case "SLEEP_IN_BED":
                    player.getStatistic(Statistic.SLEEP_IN_BED);
                    player.sendMessage("§e§lYOU HAVE SLEPT IN BEDS §e" + player.getStatistic(Statistic.SLEEP_IN_BED) + " §e§lTIMES!");
                    break;

                case "SNEAK_TIME":
                    player.getStatistic(Statistic.SNEAK_TIME);
                    player.sendMessage("§e§lYOU HAVE SNEAKED FOR §e" + player.getStatistic(Statistic.SNEAK_TIME) + " §e§lTICKS!");
                    break;

                case "SPRINT_ONE_CM":
                    player.getStatistic(Statistic.SPRINT_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE SPRINTED §e" + player.getStatistic(Statistic.SPRINT_ONE_CM) + " §e§lCM!");
                    break;

                case "STRIDER_ONE_CM":
                    player.getStatistic(Statistic.STRIDER_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE MOVED WITH STRIDER FOR §e" + player.getStatistic(Statistic.STRIDER_ONE_CM) + " §e§lCM!");
                    break;

                case "SWIM_ONE_CM":
                    player.getStatistic(Statistic.SWIM_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE SWAM §e" + player.getStatistic(Statistic.SWIM_ONE_CM) + " §e§lCM!");
                    break;

                case "TALKED_TO_VILLAGER":
                    player.getStatistic(Statistic.TALKED_TO_VILLAGER);
                    player.sendMessage("§e§lYOU HAVE TALKED TO VILLAGERS §e" + player.getStatistic(Statistic.TALKED_TO_VILLAGER) + " §e§lTIMES!");
                    break;

                case "TARGET_HIT":
                    player.getStatistic(Statistic.TARGET_HIT);
                    player.sendMessage("§e§lYOU HAVE HIT TARGETS §e" + player.getStatistic(Statistic.TARGET_HIT) + " §e§lTIMES!");
                    break;

                case "TIME_SINCE_DEATH":
                    player.getStatistic(Statistic.TIME_SINCE_DEATH);
                    player.sendMessage("§e§lTIME SINCE LAST DEATH: §e" + player.getStatistic(Statistic.TIME_SINCE_DEATH) + " §e§lSECONDS!");
                    break;

                case "TIME_SINCE_REST":
                    player.getStatistic(Statistic.TIME_SINCE_REST);
                    player.sendMessage("§e§lTIME SINCE LAST REST: §e" + player.getStatistic(Statistic.TIME_SINCE_REST) + " §e§lSECONDS!");
                    break;

                case "TOTAL_WORLD_TIME":
                    player.getStatistic(Statistic.TOTAL_WORLD_TIME);
                    player.sendMessage("§e§lTOTAL WORLD TIME PLAYED: §e" + player.getStatistic(Statistic.TOTAL_WORLD_TIME) + " §e§lSECONDS!");
                    break;

                case "TRADED_WITH_VILLAGER":
                    player.getStatistic(Statistic.TRADED_WITH_VILLAGER);
                    player.sendMessage("§e§lYOU HAVE TRADED WITH VILLAGERS §e" + player.getStatistic(Statistic.TRADED_WITH_VILLAGER) + " §e§lTIMES!");
                    break;

                case "TRAPPED_CHEST_TRIGGERED":
                    player.getStatistic(Statistic.TRAPPED_CHEST_TRIGGERED);
                    player.sendMessage("§e§lYOU HAVE TRIGGERED TRAPPED CHESTS §e" + player.getStatistic(Statistic.TRAPPED_CHEST_TRIGGERED) + " §e§lTIMES!");
                    break;

                case "USE_ITEM":
                    player.getStatistic(Statistic.USE_ITEM);
                    player.sendMessage("§e§lYOU HAVE USED ITEMS §e" + player.getStatistic(Statistic.USE_ITEM) + " §e§lTIMES!");
                    break;

                case "WALK_ON_WATER_ONE_CM":
                    player.getStatistic(Statistic.WALK_ON_WATER_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE WALKED ON WATER FOR §e" + player.getStatistic(Statistic.WALK_ON_WATER_ONE_CM) + " §e§lCM!");
                    break;

                case "WALK_ONE_CM":
                    player.getStatistic(Statistic.WALK_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE WALKED §e" + player.getStatistic(Statistic.WALK_ONE_CM) + " §e§lCM!");
                    break;

                case "WALK_UNDER_WATER_ONE_CM":
                    player.getStatistic(Statistic.WALK_UNDER_WATER_ONE_CM);
                    player.sendMessage("§e§lYOU HAVE WALKED UNDER WATER FOR §e" + player.getStatistic(Statistic.WALK_UNDER_WATER_ONE_CM) + " §e§lCM!");
                    break;

                case "DEATHS":
                    player.getStatistic(Statistic.DEATHS);
                    player.sendMessage("§e§lYOU HAVE DIED §e" + player.getStatistic(Statistic.DEATHS) + " §e§lTIMES");
                    break;

                case "info":
                    player.sendMessage("§b§lMYSTATS - MADE BY §bShakespeare\n§bMy stats is an easy and fun plugin\n§bTo view all your stats!\n§3github.com/ishakespearee/mystats\n§b§lV-1.6");

                default:
                    player.sendMessage("§c§lSTATISTIC DOES NOT EXIST");
                    break;

            }

        }
        return false;

    }
}
