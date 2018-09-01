package liuleihuatext.myapplication;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import utils.ActivityCollector;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = getIntent();
        String third = intent.getStringExtra("third");
        Button to_second = findViewById(R.id.jumptosecond);
        TextView text = findViewById(R.id.mainText);
        text.setText(third);
        to_second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondActivity.actionStart(MainActivity.this, "从main跳转过来");
                ActivityCollector.finshAll();
            }
        });
    }

    //    跳转到本活动的方法与需要传递的参数
    public static void actionStart(Context context, String date) {
        Intent intent = new Intent(context, MainActivity.class);
        intent.putExtra("main",date);
        context.startActivity(intent);

    }
}
