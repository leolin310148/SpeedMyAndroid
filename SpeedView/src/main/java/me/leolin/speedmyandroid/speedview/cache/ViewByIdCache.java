package me.leolin.speedmyandroid.speedview.cache;

import android.view.View;

import java.util.HashMap;
import java.util.Map;

/**
 * @author leolin
 */
public class ViewByIdCache {
    private Map<Integer, View> cacheMap = new HashMap<Integer, View>();

    public View find(int id) {
        return cacheMap.get(id);
    }

    public void store(View view) {
        cacheMap.put(view.getId(), view);
    }
}
