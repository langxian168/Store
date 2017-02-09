package guoyuelong.bwie.com.store.base;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import guoyuelong.bwie.com.store.R;
import guoyuelong.bwie.com.store.adpter.MenuFragmentAdapter;
import guoyuelong.bwie.com.store.fragment.Cart_Fragment;
import guoyuelong.bwie.com.store.fragment.Favorable_Fragment;
import guoyuelong.bwie.com.store.fragment.Home_Fragment;
import guoyuelong.bwie.com.store.fragment.My_Fragment;

public class MainActivity extends BaseActivity {

    private Button main_bt_home;
    private Button main_bt_favorable;
    private Button main_bt_cart;
    private Button main_bt_my;
    private List<Button> btList;
    private ViewPager main_viewpager;
    private List<Drawable> list;
    private List<Drawable> list1;
    private List<Fragment> flist;
    private List<String> tetlelist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initHeader();
        initWidget();
        setWidgetState();
        setResurce();
    }

    private void setResurce() {

        flist = new ArrayList<>();
        flist.add(new Home_Fragment());
        flist.add(new Favorable_Fragment());
        flist.add(new Cart_Fragment());
        flist.add(new My_Fragment());
        main_viewpager.setAdapter(new MenuFragmentAdapter(getSupportFragmentManager(), getApplication(), flist));

        btList.add(main_bt_home);
        btList.add(main_bt_favorable);
        btList.add(main_bt_cart);
        btList.add(main_bt_my);
        main_bt_home.setOnClickListener(this);
        main_bt_favorable.setOnClickListener(this);
        main_bt_cart.setOnClickListener(this);
        main_bt_my.setOnClickListener(this);
        list = new ArrayList<>();
        list1 = new ArrayList<>();
        Drawable drawable = getResources().getDrawable(R.mipmap.tab_home);
        Drawable drawable1 = getResources().getDrawable(R.mipmap.tab_home_s);
        list.add(drawable);
        list1.add(drawable1);
        Drawable drawable2 = getResources().getDrawable(R.mipmap.tab_topic);
        Drawable drawable3 = getResources().getDrawable(R.mipmap.tab_topic_s);
        list.add(drawable2);
        list1.add(drawable3);
        Drawable drawable4 = getResources().getDrawable(R.mipmap.main_index_cart_normal);
        Drawable drawable5 = getResources().getDrawable(R.mipmap.main_index_cart_pressed);
        list.add(drawable4);
        list1.add(drawable5);
        Drawable drawable6 = getResources().getDrawable(R.mipmap.main_index_my_normal);
        Drawable drawable7 = getResources().getDrawable(R.mipmap.main_index_my_pressed);
        list.add(drawable6);
        list1.add(drawable7);
//        头部文字
        tetlelist = new ArrayList<>();
        tetlelist.add("月光茶人");
        tetlelist.add("优惠");
        tetlelist.add("购物车");
        tetlelist.add("我的");
    }

    @Override
    public void initHeader() {

    }

    @Override
    public void initWidget() {

        btList = new ArrayList<>();
        main_viewpager = (ViewPager) findViewById(R.id.main_viewpager);
        main_bt_home = (Button) findViewById(R.id.main_bt_home);
        main_bt_favorable = (Button) findViewById(R.id.main_bt_favorable);
        main_bt_cart = (Button) findViewById(R.id.main_bt_cart);
        main_bt_my = (Button) findViewById(R.id.main_bt_my);

    }

    @Override
    public void setWidgetState() {
        main_viewpager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i < list.size(); i++) {
                    if (i == position) {
                        btList.get(i).setCompoundDrawablesWithIntrinsicBounds(null, list1.get(i), null, null);
                      //  changetetlestutua(i,tetlelist.get(i));
                    } else {
                        btList.get(i).setCompoundDrawablesWithIntrinsicBounds(null, list.get(i), null, null);
                    }
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        super.onClick(view);
//        动态设置改变按钮背景
        for (int i = 0; i < btList.size(); i++) {
            Button button = btList.get(i);
            if (view == button) {
                //改变图标
                btList.get(i).setCompoundDrawablesWithIntrinsicBounds(null, list1.get(i), null, null);
            //    changetetlestutua(i,tetlelist.get(i));
                //改变页面
                main_viewpager.setCurrentItem(i);

            } else {
                btList.get(i).setCompoundDrawablesWithIntrinsicBounds(null, list.get(i), null, null);
            }
        }
    }
}
