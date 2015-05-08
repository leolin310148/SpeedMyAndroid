package me.leolin.speedmyandroid.speedview.chain;

import android.view.View;
import me.leolin.speedmyandroid.speedview.SpeedView;

/**
 * @author leolin
 */
public class ViewChain extends Chain{
    public ViewChain(View view, SpeedView wrapper) {
        super(view, wrapper);
    }
}
