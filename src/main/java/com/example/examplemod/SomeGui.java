package com.example.examplemod;


import idk.bluecross.uiapi.modules.Box;
import idk.bluecross.uiapi.modules.Button;
import idk.bluecross.uiapi.modules.Text;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.awt.*;

public class SomeGui {



    SomeGui() {
        Box box1 = new Box( );
        box1.setBG(218, 173, 14, 150);
        box1.setPos(17, 17);
        box1.setSize(150, 150);
        Box box2 = new Box( );
        box2.insertIn(box1);
        box2.setBG(Color.red);
        box2.setPos(5, 5);
        box2.setSize(10, 10);
        Text text1 = new Text("Some text: wlknskjfgnkjdfbg");
        text1.setColor(Color.green);
        text1.setPos(20, 5);
        Text text2 = new Text( );
        text2.setText("123123");
        text2.setColor(250, 10, 10);
        text2.insertIn(box1);
        text2.setPos(20, 50);
        Button button1 = new Button("Button1");
        button1.setPos(200, 200);
        button1.setBG(Color.black);
        button1.setColor(Color.white);
        button1.setSize(100,30);
        button1.setMargins(15,5);

    }



}
