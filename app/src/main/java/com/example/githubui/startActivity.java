//로딜 페이지(첫 시작)

package com.example.githubui;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.os.Handler;
public class startActivity extends AppCompatActivity {

    //private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startpage_main);
        //@Override
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(startActivity.this, loginActivity.class);
                startActivity(intent);
            }
        }, 3000);
    }
}
        /*new Handler().postDelayed(() -> {
            Intent intent = new Intent(startActivity.this, loginActivity.class);
            startActivity(intent);
        }, 3000);*/

/*splash screen 구현
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        try {
            Thread.sleep(4000); //대기 초 설정
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(new Intent(this,loginActivity.class));
        finish();
    }*/
