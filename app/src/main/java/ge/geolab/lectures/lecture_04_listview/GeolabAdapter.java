package ge.geolab.lectures.lecture_04_listview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by GeoLab on 10/26/15.
 */
public class GeolabAdapter extends BaseAdapter {
    private ArrayList<GeoLabStudent> students;
    private Context context;

    public GeolabAdapter(Context context, ArrayList<GeoLabStudent> students) {
        this.context = context;
        this.students = students;
    }

    @Override
    public int getCount() {
        return students.size();
    }

    @Override
    public Object getItem(int position) {
        return students.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView;
        ViewHolder holder = null;
        if(convertView == null){
            itemView = View.inflate(context, R.layout.list_item_layout, null);
            ImageView profileImageView = (ImageView) itemView.findViewById(R.id.profileImage);
            TextView nameView = (TextView) itemView.findViewById(R.id.name);
            TextView surNameView = (TextView) itemView.findViewById(R.id.surName);

            holder = new ViewHolder();
            holder.profileImageView = profileImageView;
            holder.nameView = nameView;
            holder.surNameView = surNameView;

            itemView.setTag(holder);
        }else{
            itemView = convertView;
            holder = (ViewHolder) itemView.getTag();
        }


        GeoLabStudent student = (GeoLabStudent) getItem(position);


        holder.profileImageView.setImageResource(student.getImage());
        holder.nameView.setText(student.getName());
        holder.surNameView.setText(student.getSurName());


        return itemView;
    }

    private class ViewHolder {
        ImageView profileImageView;
        TextView nameView, surNameView;
    }

}
