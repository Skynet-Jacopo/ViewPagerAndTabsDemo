package com.example.liuqun.viewpagerandtabsdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by 90516 on 5/29/2016.
 */
public class PageFragment extends Fragment {

    public static final String ARGS_PAGE_NUM = "pageNumber";
    private int pageNumber;

    public static PageFragment newInstance(int pageNumber) {
        PageFragment fragment = new PageFragment();

        Bundle args = new Bundle();
        args.putInt(ARGS_PAGE_NUM, pageNumber);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        pageNumber = getArguments().getInt(ARGS_PAGE_NUM);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_page, container, false);

        TextView tvCaption = (TextView) view.findViewById(R.id.tvCaption);
        tvCaption.setText("你好!我是雷神" + pageNumber + "号");
        return view;
    }
}
