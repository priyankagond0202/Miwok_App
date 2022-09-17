package com.mainactivity2.mypractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father","apa"));
        words.add(new Word("mother","ata"));
        words.add(new Word("son","angsi"));
        words.add(new Word("daughter","tune"));
        words.add(new Word("older brother","taachi"));
        words.add(new Word("younger brother","chalitti"));
        words.add(new Word("older sister","tete"));
        words.add(new Word("younger sister","kollete"));

        WordAdapter Adapter = new WordAdapter(this, words,R.color.category_family_members);

        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(Adapter);


    }
}