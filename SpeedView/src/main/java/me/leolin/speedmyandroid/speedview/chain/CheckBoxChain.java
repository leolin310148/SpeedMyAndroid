package me.leolin.speedmyandroid.speedview.chain;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import me.leolin.speedmyandroid.speedview.SpeedView;

/**
 * @author leolin
 */
public class CheckBoxChain extends Chain<CheckBox, CheckBoxChain> {
    public CheckBoxChain(CheckBox view, SpeedView wrapper) {
        super(view, wrapper);
    }

    public CheckBoxChain change(CompoundButton.OnCheckedChangeListener listener) {
        view.setOnCheckedChangeListener(listener);
        return this;
    }
}
