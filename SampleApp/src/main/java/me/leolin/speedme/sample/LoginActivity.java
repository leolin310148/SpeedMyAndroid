package me.leolin.speedme.sample;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.*;

/**
 * @author leolin
 */
public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        EditText editTextPassword = (EditText) findViewById(R.id.editTextPassword);
        EditText editTextAccount = (EditText) findViewById(R.id.editTextPassword);

        CheckBox checkBox = (CheckBox) findViewById(R.id.checkBoxShowPassword);
        checkBox.setOnCheckedChangeListener(
                new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {
                            editTextPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                        } else {
                            editTextPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                        }
                    }
                }
        );

        Button buttonLogin = (Button) findViewById(R.id.buttonLogin);
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account = editTextAccount.getText().toString();
                String password = editTextPassword.getText().toString();
                Toast.makeText(LoginActivity.this, "Login with account=" + account + ",password=" + password, Toast.LENGTH_SHORT).show();
            }
        });


    }
}
