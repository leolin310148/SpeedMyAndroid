package me.leolin.speedmyandroid.speedview.chain;

import android.widget.TextView;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.action.TextAction;

/**
 * @author leolin
 */
public class TextViewChain extends Chain<TextView, TextViewChain> implements TextAction {
    public TextViewChain(TextView view, SpeedView wrapper) {
        super(view, wrapper);
    }

    @Override
    public TextViewChain text(String text) {
        view.setText(text);
        return this;
    }

    @Override
    public TextViewChain textRes(int resId) {
        view.setText(resId);
        return this;
    }
}
