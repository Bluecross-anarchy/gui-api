package com.example.examplemod.utils;


import com.example.examplemod.ExampleMod;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;

public class ChatUtils {
    private static final String prefix = "[UI]   --->   ";
    public static void sendMessage(String msg) {
        Minecraft.getMinecraft().player.sendMessage(new TextComponentString(""+prefix + msg));

    }
}
