package liuleihuatext.myapplication;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import utils.ActivityCollector;

/**
 * Created by liujie on 2018/8/4.
 */

public class SecondActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String main = intent.getStringExtra("main");
        Button to_third = findViewById(R.id.jumptothird);
        TextView second = findViewById(R.id.secondText);
        second.setText(main);
        to_third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdActivity.actionStart(SecondActivity.this, "从第二个活动跳转过来的！");
                ActivityCollector.finshAll();
            }
        });
    }

    //    跳转到本活动的方法与需要传递的参数
    public static void actionStart(Context context, String date) {
        Intent intent = new Intent(context, SecondActivity.class);
        intent.putExtra("second",date);
        context.startActivity(intent);
    }
}
