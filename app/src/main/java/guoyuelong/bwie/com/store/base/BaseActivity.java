package guoyuelong.bwie.com.store.base;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import guoyuelong.bwie.com.store.R;

public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {


    //数据解析用的
    public Gson gson = new Gson();
    private ImageView icon;
    private TextView tetle;

    //初始化头部
    public abstract void initHeader();

    //初始化控件
    public abstract void initWidget();

    //设置监听
    public abstract void setWidgetState();

    @Override
    public void onClick(View view) {

    }

    public void getview() {
        icon = (ImageView) findViewById(R.id.main_icon);
        tetle = (TextView) findViewById(R.id.main_tv_tetle);
    }

    public void ShowText(String str) {
        tetle.setText(str);
    }

    public void ShowTextandImage(String str) {
        icon.setVisibility(View.VISIBLE);
        tetle.setText(str);
    }

    public void changetetlestutua(int i, String str) {
        switch (i) {
            case 0:
                ShowText(str);
                break;
            case 1:
                ShowTextandImage(str);
                break;
        }
    }
}
