package me.leolin.speedmyandroid.speedview;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import me.leolin.speedmyandroid.speedview.chain.*;
import me.leolin.speedmyandroid.speedview.value.ValueProvider;
import me.leolin.speedmyandroid.speedview.wrapper.ActivityWrapper;
import me.leolin.speedmyandroid.speedview.wrapper.ViewWrapper;

/**
 * @author leolin
 */
public abstract class SpeedView {

    public static SpeedView with(View view) {
        return new ViewWrapper(view);
    }

    public static SpeedView with(Activity activity) {
        return new ActivityWrapper(activity);
    }

    protected abstract View findViewById(int id);

    public <T extends View> T just(int id) {
        return (T) findViewById(id);
    }

    public ViewChain view(int id) {
        return new ViewChain(findViewById(id), this);
    }

    public ButtonChain btn(int id) {
        return new ButtonChain((Button) findViewById(id), this);
    }

    public TextViewChain tv(int id) {
        return new TextViewChain((TextView) findViewById(id), this);
    }

    public ViewGroupChain container(int id) {
        return new ViewGroupChain((ViewGroup) findViewById(id), this);
    }

    public ListViewChain list(int id) {
        return new ListViewChain((ListView) findViewById(id), this);
    }

    public EditTextChain et(int id) {
        return new EditTextChain((EditText) findViewById(id), this);
    }

    public CheckBoxChain chkbox(int id) {
        return new CheckBoxChain((CheckBox) findViewById(id), this);
    }


    public static ValueProvider Value() {
        return new ValueProvider();
    }
}
