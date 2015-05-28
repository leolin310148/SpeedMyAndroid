package me.leolin.speedme.sample;

import android.app.Activity;
import android.os.Bundle;
import me.leolin.speedmyandroid.speedview.SpeedView;
import me.leolin.speedmyandroid.speedview.chain.EditTextChain;

/**
 * @author leolin
 */
public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        SpeedView speedView = SpeedView.with(this);
        //@formatter:off
        speedView
                .chkbox(R.id.checkBoxShowPassword)
                .change((buttonView, isChecked) -> {
                    EditTextChain passwordEtChain = speedView.et(R.id.editTextPassword);
                    if (isChecked) {
                        passwordEtChain.showAsText();
                    } else {
                        passwordEtChain.showAsPassword();
                    }
                })
                .btn(R.id.buttonLogin)    ;
        //@formatter:on
    }
}
