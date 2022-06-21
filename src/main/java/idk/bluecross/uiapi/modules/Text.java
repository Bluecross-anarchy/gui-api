package idk.bluecross.uiapi.modules;

import net.minecraft.client.Minecraft;
import net.minecraftforge.common.MinecraftForge;

public class Text extends UIModule {

    public void setText(String text) {
        this.text = text;
    }

    public Text(){
    }
    public Text(String text) {
    }


    public int getTextWidth() {
        return Minecraft.getMinecraft().fontRenderer.getStringWidth(this.text);
    }

    @Override
    public void draw() {
        Minecraft.getMinecraft().fontRenderer.FONT_HEIGHT = this.height;
        if (this.isInserted){
            Minecraft.getMinecraft( ).fontRenderer.drawString(this.text,
                    this.x + this.whereInserted.x,
                    this.y + this.whereInserted.y,
                    this.color);

        }else {
            Minecraft.getMinecraft( ).fontRenderer.drawString(this.text, this.x, this.y, this.color);
        }
    }

}
