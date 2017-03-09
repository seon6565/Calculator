package comwow2778.naver.blog.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    Button b1,b2;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("온도변환기");
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String year = e1.getText().toString();
                                      int i = Integer.parseInt(year);
                                      Toast.makeText(Main2Activity.this, "화씨는"+ (i*1.8+32), Toast.LENGTH_SHORT).show();

                                  }
                              }
        );
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String age = e2.getText().toString();
                                      int j = Integer.parseInt(age);
                                      Toast.makeText(Main2Activity.this, "섭씨는"+ ((j-32)/1.8), Toast.LENGTH_SHORT).show();

                                  }
                              }
        );

    }
}