//로그인 페이지

package com.example.githubui;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;

import androidx.appcompat.app.AppCompatActivity;


public class loginActivity extends AppCompatActivity {
    ScrollView scroll;
    ImageView img;
    BitmapDrawable bitmap;
    //@SuppressLint("SetJavaScriptEnabled")
    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage_main);

        scroll = (ScrollView) findViewById(R.id.ver_scroll);
        img = (ImageView) findViewById(R.id.char_image);
        scroll.setHorizontalScrollBarEnabled(true); //수평 스크롤 바 사용 기능 설정
        scroll.setVerticalScrollBarEnabled(true); //수직 스크롤 바 사용 기능 설정

        //이미지 가져오기
        Resources res = getResources();
        bitmap = (BitmapDrawable) res.getDrawable(R.drawable.char_group);
        int bitmapWidth = bitmap.getIntrinsicWidth();
        int bitmapHeight = bitmap.getIntrinsicHeight();

        //이미지뷰 크기 설정
        img.setImageDrawable(bitmap);
        //이미지 뷰의 크기를 지정하지 않을 경우 자동으로 축소됨.
        img.getLayoutParams().width = bitmapWidth;
        img.getLayoutParams().height = bitmapHeight;

    }



}

