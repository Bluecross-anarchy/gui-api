package idk.bluecross.uiapi.modules;


import net.minecraft.client.gui.Gui;
import net.minecraftforge.common.MinecraftForge;

import java.awt.*;
import java.lang.reflect.Method;
import java.util.ArrayList;

public abstract class UIModule {

    public static ArrayList<UIModule> modules = new ArrayList<>( );
    protected int color, width, height, BG, marginX, marginY;
    protected Box whereInserted;
    protected boolean isInserted, draggable;
    protected String name;
    protected int x = 0;
    protected int y = 0;
    protected String text;


    /////////////////////
    public String getName() {
        return this.name;
    }

    protected void makePrivate() {
        modules.remove(this);
    }

    protected UIModule() {
        modules.add(this);
        if (this instanceof Box) this.name = "Box";
        else if (this instanceof Text) this.name = "Text";
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static ArrayList<UIModule> getModules() {
        return UIModule.modules;
    }

    public void setPos(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int[] getPos() {
        return new int[]{x, y};
    }

    public void setColor(int red, int green, int blue) {
        this.color = new Color(red, green, blue).hashCode( );
    }

    public void setColor(int red, int green, int blue, int alpha) {
        this.color = new Color(red, green, blue, alpha).hashCode( );
    }

    public void setColor(Color color) {
        int idk = color.hashCode( );
        this.color = idk;
    }

    public void setBG(int red, int green, int blue) {
        this.BG = new Color(red, green, blue).hashCode( );
        updateVariables( );
    }

    public void setBG(int red, int green, int blue, int alpha) {
        this.BG = new Color(red, green, blue, alpha).hashCode( );
        updateVariables( );
    }

    public void setBG(Color color) {
        int idk = color.hashCode( );
        this.BG = idk;
        updateVariables( );

    }

    public void clear() {
        MinecraftForge.EVENT_BUS.unregister(this);
    }

    public void setSize(int width, int height) {
        this.width = width;
        this.height = height;
        updateVariables( );
    }

    public void insertIn(Box m) {
        m.inserted.add(this);
        this.whereInserted = m;
        this.isInserted = true;
        updateVariables( );
    }

    public void setText(String text) {
        this.text = text;
        updateVariables( );
    }

    public void setMargins(int width, int height) {
        this.marginX = width;
        this.marginY = height;
    }

    protected void updateVariables() {
        if (this.BG != 0 && this.width != 0 && this.height != 0) {
                this.upd( );
        }
    }

    protected void upd() {

    }


    ////////////////////////////////////////////////////////////////////////

    public abstract void draw();


}
