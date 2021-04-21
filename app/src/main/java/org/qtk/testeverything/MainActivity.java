package org.qtk.testeverything;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(Constants.TEST_LOG_TAG, this.getClass().getSimpleName() + " onCreate");
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        textView = (TextView) findViewById(R.id.textView);
        editText = (EditText) findViewById(R.id.editText);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(Constants.TEST_LOG_TAG, this.getClass().getSimpleName() + " onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(Constants.TEST_LOG_TAG, this.getClass().getSimpleName() + " onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(Constants.TEST_LOG_TAG, this.getClass().getSimpleName() + " onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(Constants.TEST_LOG_TAG, this.getClass().getSimpleName() + " onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(Constants.TEST_LOG_TAG, this.getClass().getSimpleName() + " onDestroy");
    }


    public void sayHello(View v) {
        textView.setText("Hello, " + editText.getText().toString() + "!");
    }


}
