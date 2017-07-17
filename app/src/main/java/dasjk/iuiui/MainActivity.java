package dasjk.iuiui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.rong.imkit.RongIM;
import io.rong.imlib.RongIMClient;

public class MainActivity extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("SDDDDDDD");
        btn= (Button) findViewById(R.id.aaaa);
       String  token ="MfrglHjfrLMc2cSrK2lructqkWrbWMAVxIoXN7kfdGIty66KekCmGKZl0K/4aoryGpiQdneWmgV30zPMyQmwdA==";
        RongIM.connect(token, new RongIMClient.ConnectCallback() {
            @Override
            public void onTokenIncorrect() {
                Toast.makeText(MainActivity.this,"tokenCUOWU",Toast.LENGTH_LONG).show();

            }

            @Override
            public void onSuccess(String s) {
                Toast.makeText(MainActivity.this,"tokenCUOWU"+s,Toast.LENGTH_LONG).show();

            }

            @Override
            public void onError(RongIMClient.ErrorCode errorCode) {
                Toast.makeText(MainActivity.this,"tdddddddddddddddddd",Toast.LENGTH_LONG).show();

            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (RongIM.getInstance()!=null){
                    RongIM.getInstance().startPrivateChat(MainActivity.this,"luoxue","dsssss");

                }
            }
        });
    }
}
