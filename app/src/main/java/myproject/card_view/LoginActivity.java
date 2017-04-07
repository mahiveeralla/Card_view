package myproject.card_view;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by vengal45 on 2/28/2017.
 */

public class LoginActivity extends Activity {

    private Button login;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginactivity);

        login=(Button)findViewById(R.id.login);
        textView=(TextView)findViewById(R.id.textView);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"successfully login",Toast.LENGTH_LONG).show();
            }
        });
    }
}
