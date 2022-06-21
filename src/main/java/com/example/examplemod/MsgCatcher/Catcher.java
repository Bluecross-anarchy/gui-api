package com.example.examplemod.MsgCatcher;

import com.example.examplemod.utils.ChatUtils;
import idk.bluecross.uiapi.modules.UIModule;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class Catcher {

    @SubscribeEvent
    public void ChatEvent(ClientChatEvent e) {
        String msg = e.getMessage( );
        String[] words = msg.split(" ");
        if (msg.startsWith("$")) {
            words[0].replaceFirst("$", "");
            if (words[0].equalsIgnoreCase("clear")) {
                for (UIModule i : UIModule.modules) {
                    i.clear( );
                }
            }
            if (words[0].equalsIgnoreCase("draw")) {
                for (UIModule i : UIModule.modules) {
                    i.draw( );
                }
            }
            if (words[0].equalsIgnoreCase("help")) {
                ChatUtils.sendMessage("help msg");
            }
        } else {
            ////////////////
        }
    }
}


