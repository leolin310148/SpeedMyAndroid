package me.leolin.speedmyandroid.speedview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import me.leolin.speedmyandroid.speedview.SpeedView;

import java.util.List;

/**
 * @author Leolin
 */
public class SpeedListAdapter<T> extends BaseAdapter {

    private List<T> list;
    private int layoutResId;
    private LayoutInflater inflater;
    private DataBinder<T> dataBinder;

    public SpeedListAdapter(List<T> list, int layoutResId, LayoutInflater inflater, DataBinder<T> dataBinder) {
        this.list = list;
        this.layoutResId = layoutResId;
        this.inflater = inflater;
        this.dataBinder = dataBinder;
    }

    public void setDataAndRefresh(List<T> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = inflater.inflate(layoutResId, null);
            convertView.setTag(SpeedView.with(convertView));
        }
        if (dataBinder != null) {
            dataBinder.setData((SpeedView) convertView.getTag(), (T) getItem(position));
        }

        return convertView;
    }

    public interface DataBinder<T> {
        void setData(SpeedView speedView, T t);
    }
}
