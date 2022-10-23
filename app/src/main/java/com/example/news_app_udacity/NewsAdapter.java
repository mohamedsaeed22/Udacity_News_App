package com.example.news_app_udacity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_list_item, parent, false);
        }
        News currentNews = getItem(position);
        TextView mSectionNameView =  convertView.findViewById(R.id.section_name);
        mSectionNameView.setText(currentNews.getmSection_Name());
        TextView mTitleView =  convertView.findViewById(R.id.Title);
        mTitleView.setText(currentNews.getmTitle());
        TextView mDateView =  convertView.findViewById(R.id.date_and_time);
        mDateView.setText(currentNews.getmDate());

        TextView mauthorView = convertView.findViewById(R.id.author_name);

        for (int i=0 ;i<currentNews.getMauthor_Name().size() ;i++){

            mauthorView.setText(currentNews.getMauthor_Name().get(i));
        }

        return convertView;
    }
}