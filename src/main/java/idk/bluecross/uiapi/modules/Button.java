package idk.bluecross.uiapi.modules;

import java.awt.*;

import com.example.examplemod.ExampleMod;
import net.minecraft.client.Minecraft;

public class Button extends UIModule {

    Text label = new Text( );
    Box box = new Box( );
    String labelText;

    public Button(String text) {
        text = this.labelText;
    }

    @Override
    protected void upd() {
        label.setText(labelText);
        box.setSize(this.width, this.height);
        box.BG = this.BG;
        box.setPos(this.x, this.y);
        ////////
        label.color = this.color;
        label.setPos(
                (box.width - label.getTextWidth( )) / 2,
                box.height / 2 - 3
        );
        label.insertIn(box);
    }

    int textWidth = label.getTextWidth( );

    @Override
    public void draw() {


//        ExampleMod.logger.debug("----->"+ box.y + " " + label.height / 2);

        box.draw( );
        label.draw( );
//        ExampleMod.logger.info("Button is here!" +
//                String.format("Color: %s BG is : %s Pos is %s and %s", label.color, box.BG, this.getPos( )[0], this.getPos( )[1])
//        );
    }
}
