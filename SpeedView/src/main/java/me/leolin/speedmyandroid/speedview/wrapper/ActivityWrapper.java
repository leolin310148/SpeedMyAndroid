package me.leolin.speedmyandroid.speedview.wrapper;

import android.app.Activity;
import android.view.View;
import me.leolin.speedmyandroid.speedview.SpeedView;

/**
 * @author leolin
 */
public class ActivityWrapper extends SpeedView {

    private Activity activity;

    public ActivityWrapper(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected View findViewById(int id) {
        return activity.findViewById(id);
    }
}
