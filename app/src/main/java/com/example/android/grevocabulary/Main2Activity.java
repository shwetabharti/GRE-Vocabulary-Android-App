package com.example.android.grevocabulary;

import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        try {
            displayText();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void displayText() throws IOException {
        TextView textView=(TextView) findViewById(R.id.meaning_text_view);
        InputStream is = this.getResources().openRawResource(R.raw.a);
        //File file = new File("/Users/yadav/Desktop/GRE_Vocabulary/A.txt");
            //FileReader fr=new FileReader(file);
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            String line=null;
            try{
                while((line=br.readLine())!=null){
                    //textView.setText("Puff");
                    textView.append(line);
                    textView.append("\n");
                }
            }
            catch(IOException e) {
                e.printStackTrace();
            }
    }
}
