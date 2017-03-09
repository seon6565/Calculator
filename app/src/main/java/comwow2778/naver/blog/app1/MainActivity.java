package comwow2778.naver.blog.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b10;
    EditText e1,e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("나이계산기");
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b10 = (Button)findViewById(R.id.b10);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1.setOnClickListener(new View.OnClickListener() {
             @Override
            public void onClick(View v) {
                 String year = e1.getText().toString();
                 int i = Integer.parseInt(year);
                 Toast.makeText(MainActivity.this, "나이는"+ (2017 - i+1), Toast.LENGTH_SHORT).show();

             }
                         }
                     );
        b2.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String age = e2.getText().toString();
                                      int j = Integer.parseInt(age);
                                      Toast.makeText(MainActivity.this, "태어난 해는"+ (2017-j+1), Toast.LENGTH_SHORT).show();

                                  }
                              }
        );

        b10.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                                                      startActivity(intent);
                                  }
                              }
        );

    }
}
