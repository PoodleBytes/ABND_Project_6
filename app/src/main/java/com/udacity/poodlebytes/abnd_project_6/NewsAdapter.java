package com.udacity.poodlebytes.abnd_project_6;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * {@link NewsAdapter} create a list item layout for each news article
 * in the data source {@link News} objects.
 */
public class NewsAdapter extends ArrayAdapter<News> {
    private static final String TAG = NewsAdapter.class.getSimpleName();

    /**
     * Constructs a new {@link NewsAdapter}.
     *
     * @param context of the app
     * @param news    is the list of news acticles
     */
    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.news_items, parent, false);
        }

        // Start going through the News array
        News currentNews = getItem(position);

        // Find the TextView and bind news fields
        TextView titleView = convertView.findViewById(R.id.tv_title);
        titleView.setText(currentNews.getTitle());

        TextView authorView = convertView.findViewById(R.id.tv_author);
        authorView.setText(currentNews.getAuthor());

        TextView categoryView = convertView.findViewById(R.id.tv_category);
        categoryView.setText(currentNews.getCategory());

        TextView dateView = convertView.findViewById(R.id.tv_date);
        dateView.setText(currentNews.getDate());

        // Return the list item
        return convertView;
    }
}
