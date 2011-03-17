package com.androidodc;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WelcomeActivity extends Activity {

    private TextView welcomeView = null;
    private Button enterButton = null;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        welcomeView = (TextView) findViewById(R.id.welcome);

        String welcome = getResources().getString(R.string.welcome,
                getHotelName());
        welcomeView.setText(welcome);

        enterButton = (Button) findViewById(R.id.enter);
        enterButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                /*
                 * The following code will be used, when TableAcitivity is
                 * created.
                 *
                 * startActivity(new Intent(WelcomeActivity.this,
                 * TablesActivity.class));
                 */
                finish();
            }
        });
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
            return false;
        }
        return true;
    }

    private String getHotelName() {
        // FIXME: need merge
        return "our Restaurant";
    }

}
