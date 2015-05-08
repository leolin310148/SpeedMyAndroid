package me.leolin.speedmyandroid.speedview.chain;

import android.view.View;
import android.view.ViewGroup;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.action.ContainerViewAction;

/**
 * @author leolin
 */
public class ViewGroupChain extends Chain<ViewGroup, ListViewChain> implements ContainerViewAction {
    public ViewGroupChain(ViewGroup view, SpeedView wrapper) {
        super(view, wrapper);
    }

    @Override
    public ViewGroupChain addView(View child) {
        view.addView(child);
        return this;
    }
}
