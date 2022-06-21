package idk.bluecross.uiapi;

import com.example.examplemod.ExampleMod;
import com.example.examplemod.utils.ChatUtils;
import idk.bluecross.uiapi.modules.UIModule;
import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import static idk.bluecross.uiapi.modules.UIModule.getModules;

public class Renderer {



    @SubscribeEvent
    public void onRenderer(RenderGameOverlayEvent.Post event) {
        for (UIModule module : getModules( )) {
            module.draw( );
        }
    }
}
