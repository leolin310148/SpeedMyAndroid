package me.leolin.speedmyandroid.speedview.wrapper;

import android.app.Activity;
import android.view.View;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.cache.ViewByIdCache;

/**
 * @author leolin
 */
public class ActivityWrapper extends SpeedView {

    private ViewByIdCache cache;
    private Activity activity;

    public ActivityWrapper(Activity activity) {
        this.activity = activity;
        cache = new ViewByIdCache();
    }

    @Override
    protected View findViewById(int id) {
        View find = cache.find(id);
        if (find == null) {
            find = this.activity.findViewById(id);
            cache.store(find);
        }
        return find;
    }
}
