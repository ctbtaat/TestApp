package test.rex.com.testapp.pager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import test.rex.com.testapp.R;

public class PageAdapter extends BaseAdapter {

    private List<Integer> iconRes;
    private List<String> items;
    private Context context;
    LayoutInflater inflater;

    public PageAdapter(Context context, List<Integer> iconRes, List<String> items) {
        this.iconRes = iconRes;
        this.items = items;
        this.context = context;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return iconRes.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.item, null, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        buildView(position, viewHolder);
        return convertView;
    }

    private void buildView(int position, ViewHolder viewHolder) {
        viewHolder.itemImg.setImageResource(iconRes.get(position));
        viewHolder.title.setText(items.get(position));
    }

    class ViewHolder {
        ImageView itemImg;
        TextView title;
        TextView times;

        ViewHolder(View convertView) {
            itemImg = (ImageView) convertView.findViewById(R.id.item_img);
            title = (TextView) convertView.findViewById(R.id.title);
            times = (TextView) convertView.findViewById(R.id.times);
        }

    }
}
