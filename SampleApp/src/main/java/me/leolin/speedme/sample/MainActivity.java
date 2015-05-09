package me.leolin.speedme.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;
import me.leolin.speedmyandroid.speedview.SpeedView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = new TextView(this);
        textView.setText("Programmatically created");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, new String[]{"A", "B", "C"});

        // @formatter:off
        SpeedView.with(this)
                .tv(R.id.textView1).text("Hello SpeedView")
                .tv(R.id.textView2).text(":)").show().text("Amazing!")
                .btn(R.id.button).text("Click me!")
                    .click(v -> Toast.makeText(this, "Button clicked", Toast.LENGTH_SHORT).show())
                .container(R.id.container).addView(textView)
                .list(R.id.listview).adapter(arrayAdapter)
                    .itemClick((parent, view, position, id) -> Toast.makeText(this, "click position:" + position, Toast.LENGTH_SHORT).show())
                .view(R.id.textViewWillBeDisappear).hide();

    }

}
