package me.leolin.speedmyandroid.speedview.chain;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.EditText;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.action.Action1;
import me.leolin.speedmyandroid.speedview.action.EditTextAction;
import me.leolin.speedmyandroid.speedview.action.TextAction;

/**
 * @author leolin
 */
public class EditTextChain extends Chain<EditText, EditTextChain> implements EditTextAction, TextAction {
    public EditTextChain(EditText view, SpeedView wrapper) {
        super(view, wrapper);
    }


    @Override
    public EditTextChain showAsText() {
        view.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        return this;
    }

    @Override
    public EditTextChain showAsPassword() {
        view.setTransformationMethod(PasswordTransformationMethod.getInstance());
        return this;
    }

    public EditTextChain getStringThen(Action1<String> then) {
        then.call(view.getText().toString());
        return this;
    }

    public EditTextChain getIntegerThen(Action1<Integer> then) {
        then.call(Integer.parseInt(view.getText().toString()));
        return this;
    }

    @Override
    public EditTextChain text(String text) {
        view.setText(text);
        return this;
    }

    @Override
    public EditTextChain textRes(int resId) {
        view.setText(resId);
        return this;
    }


}
