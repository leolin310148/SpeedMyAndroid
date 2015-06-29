package me.leolin.speedme.sample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import me.leolin.speedmyandroid.speedview.SpeedView;

/**
 * @author leolin
 */
public class LoginActivityWithSpeedView extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SpeedView speedView = SpeedView.with(this);
        speedView
                .chkbox(R.id.checkBoxShowPassword)
                .checkedThen(speedView.et(R.id.editTextPassword)::showAsText)
                .unCheckedThen(speedView.et(R.id.editTextPassword)::showAsPassword)
                .btn(R.id.buttonLogin)
                .click(() -> {
                    speedView.etValues(R.id.editTextUserName, R.id.editTextPassword).then((account, password) -> Toast.makeText(LoginActivityWithSpeedView.this, "Login with account=" + account + ",password=" + password, Toast.LENGTH_SHORT).show());
                });
    }
}
