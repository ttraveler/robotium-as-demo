package demo.test.com.demo1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tv;//声明一个变量 tv
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //实例化tv
        tv = (TextView)findViewById(R.id.tv);

        //给tv设置点击事件
        tv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                //弹出toast显示文本'呵呵'
                Toast.makeText(MainActivity.this,"呵呵",Toast.LENGTH_LONG).show();
            }
        });

    }
}
