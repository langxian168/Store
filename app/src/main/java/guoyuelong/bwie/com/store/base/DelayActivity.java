package guoyuelong.bwie.com.store.base;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import guoyuelong.bwie.com.store.R;

public class DelayActivity extends AppCompatActivity {

    private ImageView image;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            int i = (int) msg.obj;
            if (i > 0) {

            } else  {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        }
    };
    private Timer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delay);
        image = (ImageView) findViewById(R.id.icon_guide);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            int i = 3;
            @Override
            public void run() {
                Message obtain = Message.obtain();
                obtain.obj = i;
                i--;
                handler.sendMessage(obtain);
            }
        }, 1000, 1000);
    }

    @Override
    protected void onPause() {
        super.onPause();
        timer.cancel();
    }
}
