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

public class ThirdActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Intent intent = getIntent();
        String second = intent.getStringExtra("third");
        TextView third = findViewById(R.id.thirdText);
        third.setText(second);
        Button to_main = findViewById(R.id.jumptofirst);
        to_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.actionStart(ThirdActivity.this,"从第三个活动跳转过来的");
                ActivityCollector.finshAll();
            }
        });
    }

    //    跳转到本活动的方法与需要传递的参数
    public static void actionStart(Context context, String date) {
        Intent intent = new Intent(context, ThirdActivity.class);
        intent.putExtra("third",date);
        context.startActivity(intent);
    }
}
