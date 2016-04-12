package kr.hs.emirim.sjung.monchicken;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;

public class SplashActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {//Runnable로 이루어진 객체의 참조값(이름 없는 클래스 :  쓰레드 클래스)-> 객체 생성
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                overridePendingTransition(0,R.anim.zoom_exit);//SplashActivity로 빠져나갈때 zoom_exit실행
                finish();
            }
        }, 3000);
    }
}