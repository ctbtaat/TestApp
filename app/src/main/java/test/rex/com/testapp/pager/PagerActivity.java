package test.rex.com.testapp.pager;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

import com.baobombpager_master.PagerFragmentHolder;

import test.rex.com.testapp.R;

public class PagerActivity extends FragmentActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_pager);

        PagerFragmentHolder pagerFragmentHolder = new PagerFragmentHolder(this,
                R.id.fragment_container, PagerFragment.newInstance(), PagerFragment.newInstance(),
                PagerFragment.newInstance(), PagerFragment.newInstance());
        int[] iconRes = new int[4];
        iconRes[0] = R.drawable.gift;
        iconRes[1] = R.drawable.cake;
        iconRes[2] = R.drawable.bear;
        iconRes[3] = R.drawable.letter;
        String[] iconTextRes = new String[4];
        iconTextRes[0] = "gift";
        iconTextRes[1] = "cake";
        iconTextRes[2] = "bear";
        iconTextRes[3] = "letter";

        pagerFragmentHolder.setIconRes(iconRes); //tab Icon res
        pagerFragmentHolder.setTextRes(iconTextRes, 12, Color.BLACK, Color.WHITE); // tab text res
        pagerFragmentHolder.setPagerTab(pagerFragmentHolder.averageByWindowWidth(),
                10, Color.WHITE, Color.BLUE, Color.BLACK); // init your tab widget.
        pagerFragmentHolder.initPager(); // call this when you initialized your tab and pager
    }
}
