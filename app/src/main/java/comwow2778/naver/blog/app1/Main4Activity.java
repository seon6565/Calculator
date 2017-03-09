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
                                      int i = Integer.parseInt(a);
                                      int j = Integer.parseInt(b);
                                      if(a.isEmpty() && b.isEmpty()){
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                          if(a.isEmpty()){
                                              e1.requestFocus();/*포커스찾기*/
                                          }
                                          else if(b.isEmpty()){
                                              e2.requestFocus();
                                          }
                                      }
                                      else {
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
                                      int i = Integer.parseInt(a);
                                      int j = Integer.parseInt(b);
                                      if(a.isEmpty() && b.isEmpty()){
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                          if(a.isEmpty()){
                                              e1.requestFocus();
                                          }
                                          else if(b.isEmpty()){
                                              e2.requestFocus();
                                          }
                                      }
                                      else {
                                          Toast.makeText(Main4Activity.this, "빼기 계산결과는" + (i - j), Toast.LENGTH_SHORT).show();
                                      }
                                  }
                              }
        );
        b3.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String a = e1.getText().toString();
                                      String b = e2.getText().toString();
                                      int i = Integer.parseInt(a);
                                      int j = Integer.parseInt(b);
                                      if(a == null && b == null){
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                          if(a.isEmpty()){
                                              e1.requestFocus();
                                          }
                                          else if(b.isEmpty()){
                                              e2.requestFocus();
                                          }
                                      }
                                      else {

                                          Toast.makeText(Main4Activity.this, "곱하기 계산결과는"+ (i*j), Toast.LENGTH_SHORT).show();
                                      }
                                  }
                              }
        );
        b4.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String a = e1.getText().toString();
                                      String b = e2.getText().toString();
                                      int i = Integer.parseInt(a);
                                      int j = Integer.parseInt(b);
                                      if(a.isEmpty() && b.isEmpty()){
                                          Toast.makeText(Main4Activity.this, "값을 입력하세요", Toast.LENGTH_SHORT).show();
                                          if(a.isEmpty()){
                                              e1.requestFocus();
                                          }
                                          else if(b.isEmpty()){
                                              e2.requestFocus();
                                          }
                                      }
                                      else {
                                          Toast.makeText(Main4Activity.this, "나누기 계산결과는" + (i / j), Toast.LENGTH_SHORT).show();
                                      }
                                  }
                              }
        );

    }
}
