package me.leolin.speedmyandroid.speedview.chain;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.action.Action0;

/**
 * @author leolin
 */
public class CheckBoxChain extends Chain<CheckBox, CheckBoxChain> {
    private CompoundButton.OnCheckedChangeListener listener;
    private Action0 onCheckedAction;
    private Action0 onUnCheckedAction;

    public CheckBoxChain(CheckBox view, SpeedView wrapper) {
        super(view, wrapper);
    }

    public CheckBoxChain change(CompoundButton.OnCheckedChangeListener listener) {
        view.setOnCheckedChangeListener(listener);
        return this;
    }

    public CheckBoxChain checkedThen(Action0 action) {
        onCheckedAction = action;
        checkListener();
        return this;
    }

    public CheckBoxChain unCheckedThen(Action0 action) {
        onUnCheckedAction = action;
        checkListener();
        return this;
    }

    private void checkListener() {
        if (listener == null) {
            listener = new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked) {
                        if (onCheckedAction != null) {
                            onCheckedAction.call();
                        }
                    } else {
                        if (onUnCheckedAction != null) {
                            onUnCheckedAction.call();
                        }
                    }
                }
            };
            view.setOnCheckedChangeListener(listener);
        }
    }


}
