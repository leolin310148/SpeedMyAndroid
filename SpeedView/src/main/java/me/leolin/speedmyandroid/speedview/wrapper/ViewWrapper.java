package me.leolin.speedmyandroid.speedview.wrapper;

import android.view.View;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.cache.ViewByIdCache;

/**
 * @author leolin
 */
public class ViewWrapper extends SpeedView {
    private ViewByIdCache cache;
    private View view;

    public ViewWrapper(View view) {
        this.view = view;
        cache = new ViewByIdCache();
    }


    @Override
    protected View findViewById(int id) {
        View find = cache.find(id);
        if (find == null) {
            find = this.view.findViewById(id);
            cache.store(find);
        }
        return find;
    }
}
