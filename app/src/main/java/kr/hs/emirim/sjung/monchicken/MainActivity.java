package kr.hs.emirim.sjung.monchicken;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;
import android.content.Intent;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mName;
    Button mButton;
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mName = (EditText) findViewById(R.id.name);
        mButton = (Button) findViewById(R.id.btn_show_me_the_chicken);
        mButton.setOnClickListener(this);//버튼 클
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mName.setText(null);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */

    @Override//어노테이션?
    public void onClick(View v) {


        String name = mName.getText().toString();//EditText에서 입력받은 값을 toString으로 저장한다

        /*if(name==null)
        {
            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();//현재액티비티로넘어감(duration:기간-띄워주는....상수형으로적는다(대문자))
            //name에 입력을 안하면 null이 리턴되서 null point exception 발생
        }
        else {
            Toast.makeText(this, "룰루랄라" + name + "의 안드로이드!", Toast.LENGTH_LONG).show();//현재액티비티로넘어감(duration:기간-띄워주는....상수형으로적는다(대문자))
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
        }*/
        try{
            Toast.makeText(this, "룰루랄라" + name + "의 안드로이드!", Toast.LENGTH_LONG).show();//현재액티비티로넘어감(duration:기간-띄워주는....상수형으로적는다(대문자))
            Intent intent = new Intent(this, ResultActivity.class);
            startActivity(intent);
        }catch(NullPointerException e){
            Toast.makeText(this, "이름을 입력해 주세요!", Toast.LENGTH_LONG).show();//현재액티비티로넘어감(duration:기간-띄워주는....상수형으로적는다(대문자))
        }catch(Exception e){
            Toast.makeText(this, "예외 상황이 발생했습니다!", Toast.LENGTH_LONG).show();//현재액티비티로넘어감(duration:기간-띄워주는....상수형으로적는다(대문자))

        }
    }
}
