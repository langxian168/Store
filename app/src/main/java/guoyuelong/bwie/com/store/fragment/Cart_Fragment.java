package guoyuelong.bwie.com.store.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import guoyuelong.bwie.com.store.R;
import guoyuelong.bwie.com.store.base.Base_Fragment;

/**
 * 作者： 郭跃龙
 * 时间：
 * 作用：
 * 修改时间 ：
 */
public class Cart_Fragment extends Base_Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.cart_fragment_layout, null);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void initHeader() {

    }

    @Override
    public void initWidget() {

    }

    @Override
    public void setWidgetState() {

    }
}
