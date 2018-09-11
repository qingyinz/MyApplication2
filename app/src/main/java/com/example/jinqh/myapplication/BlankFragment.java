package com.example.jinqh.myapplication;


import android.content.Context;
import android.graphics.drawable.ColorDrawable;

import android.os.Bundle;

import android.support.v4.app.Fragment;

import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

import android.widget.TextView;
import android.widget.Toast;


public class BlankFragment extends Fragment {
    private View view;
    private Button btn_show;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_blank, container, false);
        initview();
        minitView();
        return view;
    }

    private static TextView mTx011;
    private static TextView mTx012;
    private static TextView mTx013;
    private static TextView mTx014;
    private static TextView mTx015;
    private static TextView mTx021;
    private static TextView mTx022;
    private static TextView mTx023;
    private static TextView mTx024;
    private static TextView mTx025;
    private static TextView mTx031;
    private static TextView mTx032;
    private static TextView mTx033;
    private static TextView mTx034;
    private static TextView mTx035;
    private static TextView mTx041;
    private static TextView mTx042;
    private static TextView mTx043;
    private static TextView mTx044;
    private static TextView mTx045;
    private static TextView mTx051;
    private static TextView mTx052;
    private static TextView mTx053;
    private static TextView mTx054;
    private static TextView mTx055;
    private static TextView mTx061;
    private static TextView mTx062;
    private static TextView mTx063;
    private static TextView mTx064;
    private static TextView mTx065;
    private static TextView mTxzhouci;

    private void minitView() {
        mTxzhouci = view.findViewById(R.id.zhouci);
        mTx011 = view.findViewById(R.id.tx011);
        mTx012 = view.findViewById(R.id.tx012);
        mTx013 = view.findViewById(R.id.tx013);
        mTx014 = view.findViewById(R.id.tx014);
        mTx015 = view.findViewById(R.id.tx015);
        mTx021 = view.findViewById(R.id.tx021);
        mTx022 = view.findViewById(R.id.tx022);
        mTx023 = view.findViewById(R.id.tx023);
        mTx024 = view.findViewById(R.id.tx024);
        mTx025 = view.findViewById(R.id.tx025);
        mTx031 = view.findViewById(R.id.tx031);
        mTx032 = view.findViewById(R.id.tx032);
        mTx033 = view.findViewById(R.id.tx033);
        mTx034 = view.findViewById(R.id.tx034);
        mTx035 = view.findViewById(R.id.tx035);
        mTx041 = view.findViewById(R.id.tx041);
        mTx042 = view.findViewById(R.id.tx042);
        mTx043 = view.findViewById(R.id.tx043);
        mTx044 = view.findViewById(R.id.tx044);
        mTx045 = view.findViewById(R.id.tx045);
        mTx051 = view.findViewById(R.id.tx051);
        mTx052 = view.findViewById(R.id.tx052);
        mTx053 = view.findViewById(R.id.tx053);
        mTx054 = view.findViewById(R.id.tx054);
        mTx055 = view.findViewById(R.id.tx055);
        mTx061 = view.findViewById(R.id.tx061);
        mTx062 = view.findViewById(R.id.tx062);
        mTx063 = view.findViewById(R.id.tx063);
        mTx064 = view.findViewById(R.id.tx064);
        mTx065 = view.findViewById(R.id.tx065);
    }

    public static void week_2(Context con) {
        mTxzhouci.setText("周次:二");
        mTx021.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx012.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx022.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));
        mTx023.setText(con.getResources().getString(R.string.zhitu) + con.getResources().getString(R.string.place4));
        mTx033.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));
        mTx014.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));
        mTx035.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
        mTx044.setText(con.getResources().getString(R.string.zhitu) + con.getResources().getString(R.string.place4));
        mTx034.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
        mTx025.setText(con.getResources().getString(R.string.zhitu) + con.getResources().getString(R.string.place4));
        mTx035.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
        mTx045.setText(con.getResources().getString(R.string.qiuzhi) + con.getResources().getString(R.string.place4));
    }

    public static void clear_week(Context con) {
        mTx011.setText("");
        mTx012.setText("");
        mTx013.setText("");
        mTx014.setText("");
        mTx015.setText("");
        mTx021.setText("");
        mTx022.setText("");
        mTx023.setText("");
        mTx024.setText("");
        mTx025.setText("");
        mTx031.setText("");
        mTx032.setText("");
        mTx033.setText("");
        mTx034.setText("");
        mTx035.setText("");
        mTx041.setText("");
        mTx042.setText("");
        mTx043.setText("");
        mTx044.setText("");
        mTx045.setText("");
        mTx051.setText("");
        mTx052.setText("");
        mTx053.setText("");
        mTx054.setText("");
        mTx055.setText("");
        mTx061.setText("");
        mTx062.setText("");
        mTx063.setText("");
        mTx064.setText("");
        mTx065.setText("");
    }

    public static void week_3(Context con) {
        mTxzhouci.setText("周次:三");
        mTx021.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx012.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx022.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));

        mTx023.setText(con.getResources().getString(R.string.zhitu) + con.getResources().getString(R.string.place4));
        mTx033.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));

        mTx034.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
        mTx025.setText(con.getResources().getString(R.string.zhitu) + con.getResources().getString(R.string.place4));
        mTx035.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
        mTx045.setText(con.getResources().getString(R.string.qiuzhi) + con.getResources().getString(R.string.place4));
    }

    public static void week_4(Context con) {
        mTxzhouci.setText("周次:四");
        mTx012.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx013.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx014.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));
        mTx021.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx022.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));
        mTx023.setText(con.getResources().getString(R.string.zhitu) + con.getResources().getString(R.string.place4));
        mTx025.setText(con.getResources().getString(R.string.zhitu) + con.getResources().getString(R.string.place4));
        mTx033.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));
        mTx034.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
        mTx035.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
        mTx044.setText(con.getResources().getString(R.string.zhitu) + con.getResources().getString(R.string.place4));
        mTx045.setText(con.getResources().getString(R.string.qiuzhi) + con.getResources().getString(R.string.place4));

    }

    public static void week_5(Context con) {
        mTxzhouci.setText("周次:五");
        mTx012.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx021.setText(con.getResources().getString(R.string.shebei) + con.getResources().getString(R.string.place8));
        mTx022.setText(con.getResources().getString(R.string.shizhan) + con.getResources().getString(R.string.place5));
        mTx034.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
        mTx035.setText(con.getResources().getString(R.string.jicheng) + con.getResources().getString(R.string.place6));
    }

    public static void week_6(Context con) {
        mTxzhouci.setText("周次:六");

    }

    public static void week_7(Context con) {
        mTxzhouci.setText("周次:七");

    }

    public static void week_8(Context con) {
        mTxzhouci.setText("周次:八");

    }

    public static void week_9(Context con) {
        mTxzhouci.setText("周次:九");

    }

    public static void week_10(Context con) {
        mTxzhouci.setText("周次:十");

    }

    public static void week_11(Context con) {
        mTxzhouci.setText("周次:十一");

    }

    public static void week_12(Context con) {
        mTxzhouci.setText("周次:十二");

    }

    public static void week_13(Context con) {
        mTxzhouci.setText("周次:十三");

    }

    public void initview() {

        btn_show = view.findViewById(R.id.butselect1);
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DiaFragment.newInstance().show(getChildFragmentManager(), "dialog");

            }
        });
    }

    @Override
    public void onStart() {
        super.onStart();

    }


}

