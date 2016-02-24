package test.rex.com.testapp.pager;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import test.rex.com.testapp.R;

public class PagerFragment extends Fragment {

    private List<Integer> iconRes = new ArrayList<>();
    private List<String> items = new ArrayList<>();
    private ListView listView;
    private View view;

    public static PagerFragment newInstance() {
        PagerFragment pagerFragment = new PagerFragment();
        return pagerFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_pager, container, false);
        listView = (ListView) view.findViewById(R.id.listview);
        PageAdapter adapter = new PageAdapter(getActivity(), iconRes, items);
        listView.setAdapter(adapter);
        listView.setDividerHeight(0);
        return view;
    }

    private void initData() {
        iconRes.add(R.drawable.gift);
        iconRes.add(R.drawable.cake);
        iconRes.add(R.drawable.bear);
        iconRes.add(R.drawable.letter);

        items.add("gift");
        items.add("cake");
        items.add("bear");
        items.add("letter");
    }
}
