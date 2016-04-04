package kr.hs.emirim.sjung.monchicken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText mName;
    Button mButton;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);//버튼 클릭
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText("");
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override//어노테이션?
    public void onClick(View v) {
        Toast.makeText(this,"집에가고싶다!",Toast.LENGTH_LONG).show();//현재액티비티로넘어감(duration:기간-띄워주는....상수형으로적는다(대문자))

    }
}
