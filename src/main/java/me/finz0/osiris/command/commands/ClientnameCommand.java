package me.finz0.osiris.command.commands;

import me.finz0.osiris.OsirisMod;
import me.finz0.osiris.command.Command;

public class ClientnameCommand extends Command {
    @Override
    public String[] getAlias() {
        return new String[]{
                "name", "modname", "clientname", "suffix", "watermark"
        };
    }

    @Override
    public String getSyntax() {
        return "name <new name>";
    }

    @Override
    public void onCommand(String command, String[] args) throws Exception {
        if(!args[0].replace("__", "").equalsIgnoreCase("")) {
            OsirisMod.MODNAME = args[0].replace("__", "");
            sendClientMessage("set client name to " + args[0].replace("__", ""));
        }else
            sendClientMessage(getSyntax());
    }
}
