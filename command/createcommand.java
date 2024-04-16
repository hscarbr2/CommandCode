package hayden.me.mccommand.command;
import com.google.gson.JsonArray;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.LiteralMessage;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.minecraft.server.PlayerManager;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.server.command.TimeCommand;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.PlainTextContent;
import net.minecraft.text.Text;
import net.minecraft.util.math.BlockPos;
import net.minecraft.text.Text;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.function.Supplier;

import static java.lang.Math.random;

public class createcommand {

    public static void register(CommandDispatcher<ServerCommandSource> dispatcher, boolean dedicated) {
        dispatcher.register(CommandManager.literal("modrequest").then(CommandManager.literal("create").executes(createcommand::createticket).then(CommandManager.literal("claim").executes(createcommand::claimticket)).then(CommandManager.literal("close").executes(createcommand::closeticket))));
    }

    private static int createticket(CommandContext<ServerCommandSource> context) throws CommandSyntaxException {
        //Information gathered when User calls the create subcommand
        ServerPlayerEntity player = context.getSource().getPlayer();
        int playerposX = Objects.requireNonNull(context.getSource().getPlayer()).getBlockPos().getX();
        int playerposY = Objects.requireNonNull(context.getSource().getPlayer()).getBlockPos().getY();
        int playerposZ = Objects.requireNonNull(context.getSource().getPlayer()).getBlockPos().getZ();
        ServerPlayerEntity playerID = (ServerPlayerEntity) context.getSource().getPlayerNames();
        long time = context.getSource().getPlayer().getLastActionTime();
        Text user_name = context.getSource().getPlayer().getDisplayName();
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return 1;
    }
    private static boolean ticketClaimed = false;
    private static int claimticket(CommandContext<ServerCommandSource> context){
        //admins to claim ticket to look into the issue further
        //We need a way to claim the ticket to either Kylie or Derek
        //String adminName = context.getSource().getPlayer().getName().getString();
       // if(ticketClaimed) {
       // } else if (admins.contains(adminName)) {
       //     claimedBy = adminName;
        //    ticketClaimed = true;
       // }


       return 1;
    }
    private static int closeticket(CommandContext<ServerCommandSource> context){
      // if(!ticketClaimed){
        //   context.getSource().sendFeedback(new LiteralText("No ticket has been claimed"));
      // } else if (admins.contains(adminName) && adminName.equals(claimedBy)) {
         //  context.getSource().sendFeedback(new LiteralText("Ticket closed by: " + adminName), false);
          // ticketClaimed = false;
          // claimedBy = "";
      // } else {
         //  context.getSource().sendFeedback(new LiteralText("Not Authorized"));
       //}
        return 1;
    }

}

