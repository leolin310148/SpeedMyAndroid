package me.leolin.speedmyandroid.speedview.action;

import android.widget.AdapterView;
import android.widget.ListAdapter;
import me.leolin.speedmyandroid.speedview.chain.Chain;

/**
 * @author leolin
 */
public interface ListViewAction {
    <T extends Chain> T adapter(ListAdapter adapter);

    <T extends Chain> T itemClick(AdapterView.OnItemClickListener onItemClickListener);
}
