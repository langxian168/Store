package guoyuelong.bwie.com.store.base;

import android.support.v4.app.Fragment;
import android.view.View;

/**
 * 作者： 郭跃龙
 * 时间：
 * 作用：
 * 修改时间 ：
 */
public abstract class Base_Fragment extends Fragment implements View.OnClickListener {
    //初始化头部
    public abstract void initHeader();

    //初始化控件
    public abstract void initWidget();

    //设置监听
    public abstract void setWidgetState();

    @Override
    public void onClick(View view) {

    }
}
