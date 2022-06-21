package idk.bluecross.uiapi.modules;


import net.minecraft.client.gui.Gui;
import net.minecraftforge.common.MinecraftForge;

import java.awt.*;
import java.util.ArrayList;


public class Box extends UIModule {

    protected boolean isDrawBorder;

    protected ArrayList<UIModule> inserted = new ArrayList<>( );

    public ArrayList<UIModule> getInserted() {
        return this.inserted;
    }

    public void drawBorder(boolean draw) {
        this.isDrawBorder = draw;
    }

    public void draw() {
        if (isInserted) {
            Gui.drawRect(this.x + this.whereInserted.getPos( )[0],
                    this.y + this.whereInserted.getPos( )[1],
                    this.x + this.width + this.whereInserted.getPos( )[0],
                    this.y + this.height + this.whereInserted.getPos( )[1],
                    this.BG);
        } else {
            Gui.drawRect(this.x, this.y, this.x + this.width, this.y + this.height, this.BG);
        }
        if (this.isDrawBorder) {
            Gui.drawRect(this.x, this.y + 1, this.x + this.width, this.y, Color.darkGray.hashCode( )); // top border
            Gui.drawRect(this.x, this.y + this.height, this.x + this.width, this.y + this.height + 1, Color.darkGray.hashCode( )); // bottom border
            Gui.drawRect(this.x - 1, this.y, this.x, this.x + this.height, Color.darkGray.hashCode( )); // left border
            Gui.drawRect(this.x + this.width, this.y, this.x + width + 1, this.x + this.height, Color.darkGray.hashCode( )); // right border
        }
    }


}
