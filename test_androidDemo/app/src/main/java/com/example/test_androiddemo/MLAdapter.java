package com.example.test_androiddemo;

import android.content.Context;
import android.renderscript.Sampler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MLAdapter extends BaseAdapter {
    private List<HashMap<String, Object>> dataSource;
    private Context mlContext;
//    转换器将XML文件装换成对象
    private LayoutInflater mlInflater;
//    创建构造器
    public  MLAdapter(Context c){
         mlContext = c;
         dataSource = new ArrayList<HashMap<String, Object>>();
         HashMap<String,Object> map;
         for (int i = 0;i < 30;i++){

             map = new HashMap<String, Object>();
             map.put("image",R.drawable.pic);
             map.put("time","2019-5.20");
             map.put("text","你好啊！傻屌");
             dataSource.add(map);
         }

        mlInflater = (LayoutInflater)mlContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }
    @Override
    public int getCount() {
        return dataSource.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if (view == null){
            view = (View) mlInflater.inflate(R.layout.list_item_layout,null);
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView timeView = view.findViewById(R.id.timeLabel);
            TextView label = view.findViewById(R.id.textView5);
            view.setTag(new  Holder(imageView,timeView,label));

        }

        Holder h = (Holder) view.getTag();
        h.imageView.setImageResource((int)dataSource.get(i).get("image"));
        h.TimeLabel.setText((String)dataSource.get(i).get("time"));
        h.messageLabel.setText((String)dataSource.get(i).get("text"));
        return view;
    }

    private  class Holder{
       ImageView imageView;
       TextView TimeLabel;
       TextView messageLabel;

       public  Holder(ImageView image,TextView time,TextView message){
           imageView = image;
           TimeLabel = time;
           messageLabel = message;
       }

    }

}


