package cn.edu.gdmec.chaos07150844.toast;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ToastDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toast_demo);
        Button button1 = (Button) findViewById(R.id.button1),
               button2 = (Button) findViewById(R.id.button2),
               button3 = (Button) findViewById(R.id.button3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ToastDemo.this,"直接输出信息",Toast.LENGTH_LONG).show();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View view = li.inflate(R.layout.toastinfo,null);
                Toast toast = new Toast(ToastDemo.this);
                toast.setView(view);
                toast.show();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(ToastDemo.this,"锐萌萌花木兰",Toast.LENGTH_LONG);
                LinearLayout mLayout = new LinearLayout(ToastDemo.this);
                mLayout.setOrientation(LinearLayout.VERTICAL);
                ImageView myImage = new ImageView(ToastDemo.this);
                myImage.setImageResource(R.drawable.mulan);
                View toastView = toast.getView();
                mLayout.addView(myImage);
                mLayout.addView(toastView);
                toast.setView(mLayout);

                toast.show();
            }
        });

    }
}
