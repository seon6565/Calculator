package comwow2778.naver.blog.app1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    Button b1,b10;
    EditText e1,e2,e3;
    CheckBox c1;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        setTitle("레스토랑 메뉴 주문");
        b1 = (Button)findViewById(R.id.b1);
        b10 = (Button)findViewById(R.id.b10);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        c1 = (CheckBox)findViewById(R.id.c1);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);

        b1.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {
                                      String a = e1.getText().toString();
                                      String b = e1.getText().toString();
                                      String c = e1.getText().toString();
                                      int i = Integer.parseInt(a);
                                      int j = Integer.parseInt(b);
                                      int k = Integer.parseInt(c);


                                      int count = i + j + k;
                                      int price = (i * 15000) + (j * 13000) + (k * 9000);
                                      if (c1.isChecked()) {
                                          price = ((i * 15000) + (j * 13000) + (k * 9000)) * 90 / 100;
                                      }
/*스트링으로 변환*/

                                      t1.setText(count+"개");
                                      t2.setText(price+"원");


                                  }
                              }
        );

        b10.setOnClickListener(new View.OnClickListener() {
                                   @Override
                                   public void onClick(View v) {
                                       Intent intent = new Intent(Main3Activity.this,Main4Activity.class);
                                       startActivity(intent);
                                   }
                               }
        );

    }
}
