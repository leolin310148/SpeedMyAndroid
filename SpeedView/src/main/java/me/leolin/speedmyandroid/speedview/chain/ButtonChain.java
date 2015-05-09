package me.leolin.speedmyandroid.speedview.chain;

import android.widget.Button;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.action.TextAction;

/**
 * @author leolin
 */
public class ButtonChain extends Chain<Button, ButtonChain> implements TextAction {
    public ButtonChain(Button view, SpeedView wrapper) {
        super(view, wrapper);
    }


    @Override
    public ButtonChain text(String text) {
        view.setText(text);
        return this;
    }

    @Override
    public ButtonChain textRes(int resId) {
        view.setText(resId);
        return this;
    }
}
