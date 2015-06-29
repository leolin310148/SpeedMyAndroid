package me.leolin.speedme.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import me.leolin.speedmyandroid.speedview.SpeedView;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author leolin
 */
public class MenuActivity extends Activity {

    private static final Map<Integer, Class<? extends Activity>> ACTIVITIES = new LinkedHashMap<>();

    static {
        ACTIVITIES.put(0, LoginActivity.class);
        ACTIVITIES.put(1, LoginActivityWithSpeedView.class);
        ACTIVITIES.put(2, MainActivity.class);
        ACTIVITIES.put(3, MainActivity.class);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);



        ArrayAdapter<Object> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ACTIVITIES.values().toArray());
        SpeedView.with(this)
                .list(R.id.listview).adapter(listAdapter)
                .itemClick((parent, view, position, id) -> startActivity(new Intent(this, ACTIVITIES.get(position))));

    }
}
