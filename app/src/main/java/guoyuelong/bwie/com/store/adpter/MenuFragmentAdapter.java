package guoyuelong.bwie.com.store.adpter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * 作者： 郭跃龙
 * 时间：
 * 作用：
 * 修改时间 ：
 */
public class MenuFragmentAdapter extends FragmentPagerAdapter {
    private Context context;
    private List<Fragment> list;

    public MenuFragmentAdapter(FragmentManager fm, Context context, List<Fragment> list) {
        super(fm);
        this.context = context;
        this.list = list;
    }

    @Override
    public Fragment getItem(int position) {
        return list.get(position);
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
