package me.leolin.speedmyandroid.speedview.chain;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.action.Action1;
import me.leolin.speedmyandroid.speedview.action.ListViewAction;

/**
 * @author leolin
 */
public class ListViewChain extends Chain<ListView, ListViewChain> implements ListViewAction {
    public ListViewChain(ListView view, SpeedView wrapper) {
        super(view, wrapper);
    }

    @Override
    public ListViewChain adapter(ListAdapter adapter) {
        view.setAdapter(adapter);
        return this;
    }

    @Override
    public ListViewChain itemClick(AdapterView.OnItemClickListener onItemClickListener) {
        view.setOnItemClickListener(onItemClickListener);
        return this;
    }

    public ListViewChain itemClick(final Action1<Integer> action) {
        view.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                action.call(position);
            }
        });
        return this;
    }


    public ListViewChain emptyView(int emptyViewId) {
        view.setEmptyView(just(emptyViewId));
        return this;
    }


}
