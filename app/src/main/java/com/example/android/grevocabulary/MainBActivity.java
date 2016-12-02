package com.example.android.grevocabulary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainBActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        try {
            displayText();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayText() throws IOException {
        TextView textView=(TextView) findViewById(R.id.meaning_text_view);
        InputStream is = this.getResources().openRawResource(R.raw.b);
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        String line=null;
        try{
            while((line=br.readLine())!=null){
                textView.append(line);
                textView.append("\n");
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }

}
