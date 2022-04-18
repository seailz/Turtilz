package com.seailz.turtilz.commands;

import com.seailz.turtilz.Turtilz;
import games.negative.framework.command.Command;
import games.negative.framework.command.annotation.CommandInfo;
import games.negative.framework.message.Message;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.entity.Turtle;

@CommandInfo(name = "turtilz", playerOnly = true)
public class CommandTurtilz extends Command {
    private final Turtilz main;

    public CommandTurtilz(Turtilz main) {
        this.main = main;
    }

    @Override
    public void onCommand(CommandSender sender, String[] args) {
        Player p = (Player) sender;
        p.sendTitle(ChatColor.GREEN + "HI TURTILZ", "EPIC TURTILZ MAN");
        for (int i = 0; i < 700; i++) {
            p.sendMessage("i like turtles");
        }
            Turtle turtle = (Turtle) p.getWorld().spawnEntity(p.getLocation(), EntityType.TURTLE);
            turtle.setCustomName("Turtilz");
             turtle.addPassenger(p);
            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    new Message("&8[Narrator]: &fturtle :)").send(p);
                }
            }, 20);

            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    new Message("&8[Narrator]: &f&lNOW KILL IT.").send(p);
                }
            }, 100);

            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    new Message("&8[Narrator]: &fwhy aren't u killing it...").send(p);
                }
            }, 160);

            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    new Message("&8[Narrator]: &fok fine u won't kill it").send(p);
                }
            }, 200);

            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    new Message("&8[Narrator]: &fdo you want a lot of turtilzss?").send(p);
                }
            }, 260);

            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    new Message("&8[Seailz]: &fI can't be bothered to set up a system to handle your reply, so idk what u answered but i assume it was yes").send(p);
                }
            }, 300);

            Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                public void run() {
                    new Message("&8[Narrator]&f spawning turtilzzs...").send(p);
                }
            }, 360);

           Bukkit.getScheduler().runTaskLater(main, new Runnable() {
                @Override
                  public void run() {
                    for (int i = 0; i < 300; i++) {
                        Turtle turtle = (Turtle) p.getWorld().spawnEntity(p.getLocation(), EntityType.TURTLE);
                        turtle.setCustomName("Turtilz");
                    }
                }
             }, 400);


    }
}
