package comwow2778.naver.blog.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {
    Button b1,b2,b3,b4;
    EditText e1,e2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        setTitle("계산기");
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);

        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String a = e1.getText().toString();
                                      String b = e2.getText().toString();
                                          if(a.isEmpty()) {
                                              e1.requestFocus();
                                              Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                          }
                                          else if (b.isEmpty()) {
                                                  e2.requestFocus();
                                                  Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                          }
                                          else {
                                                  int i = Integer.parseInt(a);
                                                  int j = Integer.parseInt(b);
                                                  Toast.makeText(Main4Activity.this, "더하기 계산결과는" + (i + j), Toast.LENGTH_SHORT).show();
                                          }


                                  }
                              }
        );

        b2.setOnClickListener(new View.OnClickListener() {

                                  @Override
                                  public void onClick(View v) {
                                      String a = e1.getText().toString();
                                      String b = e2.getText().toString();
                                      if(a.isEmpty()) {
                                          e1.requestFocus();
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                      }
                                      else if (b.isEmpty()) {
                                          e2.requestFocus();
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                      }
                                      else {
                                          int i = Integer.parseInt(a);
                                          int j = Integer.parseInt(b);
                                          Toast.makeText(Main4Activity.this, "더하기 계산결과는" + (i + j), Toast.LENGTH_SHORT).show();
                                      }
                                  }
                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String a = e1.getText().toString();
                                      String b = e2.getText().toString();
                                      if(a.isEmpty()) {
                                          e1.requestFocus();
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                      }
                                      else if (b.isEmpty()) {
                                          e2.requestFocus();
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                      }
                                      else {
                                          int i = Integer.parseInt(a);
                                          int j = Integer.parseInt(b);
                                          Toast.makeText(Main4Activity.this, "더하기 계산결과는" + (i + j), Toast.LENGTH_SHORT).show();
                                      }
                                  }
                              }
        );
        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String a = e1.getText().toString();
                                      String b = e2.getText().toString();
                                      if(a.isEmpty()) {
                                          e1.requestFocus();
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                      }
                                      else if (b.isEmpty()) {
                                          e2.requestFocus();
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                      }
                                      else {
                                          int i = Integer.parseInt(a);
                                          int j = Integer.parseInt(b);
                                          Toast.makeText(Main4Activity.this, "더하기 계산결과는" + (i + j), Toast.LENGTH_SHORT).show();
                                      }
                                  }
                              }
        );

    }
}
