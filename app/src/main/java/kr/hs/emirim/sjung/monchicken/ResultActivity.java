package kr.hs.emirim.sjung.monchicken;

//import android.app.Notification;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.*;

import java.util.Random;

/**
 * Created by appcreator14 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {

    static String TAG="먼치킨:ResultActivity";
    TextView mResult;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Log.d(TAG, "결과 액티비티 시작!");

        mResult = (TextView) findViewById(R.id.result);
        mImageView = (ImageView) findViewById(R.id.imageView);
        Log.d(TAG,"텍스트뷰 연결 성공!");

        Random r = new Random();
        int result=r.nextInt(12);
        Log.d(TAG,"랜덤값 생성! : "+result);
        //if
        /*if(result==0){
            mImageView.setImageResource(R.drawable.ch1);//내부적 int값
        }else if(result==1){
            mImageView.setImageResource(R.drawable.ch2);
        }else if(result==2){
            mImageView.setImageResource(R.drawable.ch3);
        }else if(result==3){
            mImageView.setImageResource(R.drawable.ch4);
        }else if(result==4){
            mImageView.setImageResource(R.drawable.ch5);
        }else if(result==5){
            mImageView.setImageResource(R.drawable.ch6);
        }else if(result==6){
            mImageView.setImageResource(R.drawable.ch7);
        }else if(result==7){
            mImageView.setImageResource(R.drawable.ch8);
        }else if(result==8){
            mImageView.setImageResource(R.drawable.ch9);
        }else if(result==9){
            mImageView.setImageResource(R.drawable.ch10);
        }else if(result==10){
            mImageView.setImageResource(R.drawable.fchicken);
        }else if(result==11){
            mImageView.setImageResource(R.drawable.ychicken);
        }*/

        mImageView.setImageResource(R.drawable.ch1+result);//안드로이드 내부적 구조 이용 트릭(result값이 더해져 다음 숫자로)


        Intent intent = getIntent();//기존의 것을 가져온다
        String name = intent.getStringExtra("name");
        Log.d(TAG,"인텐트값 읽기<name> : " + name);

        int age = intent.getIntExtra("age",-1);
        Log.d(TAG,"인텐트값 읽기<age> : "+age);

        mResult.setText(name+"님, 안녕하세요!");
    }
}