package com.example.yang.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private String url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainlayout);
        Button button=(Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText=findViewById(R.id.et);
                //intent.setData(Uri.parse("http://www.baidu.com"));
                //intent.setData(Uri.parse(editText.getText().toString()));
                url=editText.getText().toString();
                if (url.isEmpty()) {
                    url = "http://www.baidu.com";
                }
				Intent intent = new Intent("com.ACTION_START_WEBVIEW");
                intent.addCategory("com.START_WEBVIEW_CATEGORY");
                intent.putExtra("url", url);
                startActivity(intent);
            }
        });

    }
}
