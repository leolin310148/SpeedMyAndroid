package me.leolin.speedmyandroid.speedview.wrapper;

import android.view.View;
import me.leolin.speedmyandroid.speedview.SpeedView;

/**
 * @author leolin
 */
public class ViewWrapper extends SpeedView {
    private View view;

    public ViewWrapper(View view) {
        this.view = view;
    }


    @Override
    protected View findViewById(int id) {
        return view.findViewById(id);
    }
}
