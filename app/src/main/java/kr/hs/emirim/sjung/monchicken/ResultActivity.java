package kr.hs.emirim.sjung.monchicken;

//import android.app.Notification;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.*;
/**
 * Created by appcreator14 on 2016. 3. 28..
 */
public class ResultActivity extends AppCompatActivity {

    TextView mResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        mResult = (TextView) findViewById(R.id.result);


        Intent intent = getIntent();//기존의 것을 가져온다
        String name = intent.getStringExtra("name");
        int age = intent.getIntExtra("age",-1);
        mResult.setText(name+"님, 안녕하세요!");
    }
}