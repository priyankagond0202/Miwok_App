package com.mainactivity2.mypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("red","wetetti"));
        words.add(new Word("mustard yellow","chiwiite"));
        words.add(new Word("dusty yellow","topiise"));
        words.add(new Word("green","chokokki"));
        words.add(new Word("brown","takaakki"));
        words.add(new Word("gray","topoppi"));
        words.add(new Word("black","kululli"));
        words.add(new Word("white","kelilli"));

        WordAdapter Adapter = new WordAdapter(this, words,R.color.category_colors);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(Adapter);


    }
}