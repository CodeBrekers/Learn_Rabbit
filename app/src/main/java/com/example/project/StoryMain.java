package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class StoryMain extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.story_main);

        listView= (ListView) findViewById(R.id.listview);

        ArrayList<String> arrayList=new ArrayList<>();

        arrayList.add("The Thirsty Crow - Picture");
        arrayList.add("The Crocodile And The Monkey - Picture");
        arrayList.add("The Rabbit And The Tortoise - Picture");
        arrayList.add("The Wolf And The Lamb - Read");
        arrayList.add("The Cows And The Lions - Read");
        arrayList.add("The Fox And The Crow - Read");
        arrayList.add("The Fox And The Grapes - Read");
        arrayList.add("A Lion And A Mouse -Read");
        arrayList.add("The Ant And The Grasshopper - Read");
        arrayList.add("The Lion And The Rabbit - Read");
        arrayList.add("The Hunter And Pigeons - Read");
        arrayList.add("Two Friends And The Bear - Read");



        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myintent = new Intent(view.getContext(),StoryOne.class);
                    startActivityForResult(myintent,0);
                }
                if(position==1){
                    Intent myintent = new Intent(view.getContext(), com.example.project.StoryTwo.class);
                    startActivityForResult(myintent,1);
                }
                if(position==2){
                    Intent myintent = new Intent(view.getContext(), com.example.project.StoryThree.class);
                    startActivityForResult(myintent,2);
                }
                if(position==3){
                    Intent myintent = new Intent(view.getContext(), com.example.project.StoryFour.class);
                    startActivityForResult(myintent,3);
                }
                if(position==4){
                    Intent myintent = new Intent(view.getContext(), com.example.project.StoryFive.class);
                    startActivityForResult(myintent,4);
                }
                if(position==5){
                    Intent myintent = new Intent(view.getContext(), com.example.project.StorySix.class);
                    startActivityForResult(myintent,5);
                }
                if(position==6){
                    Intent myintent = new Intent(view.getContext(), com.example.project.StorySeven.class);
                    startActivityForResult(myintent,6);
                }
                if(position==7){
                    Intent myintent = new Intent(view.getContext(),StoryEight.class);
                    startActivityForResult(myintent,7);
                }
                if(position==8){
                    Intent myintent = new Intent(view.getContext(),StoryNine.class);
                    startActivityForResult(myintent,8);
                }
                if(position==9){
                    Intent myintent = new Intent(view.getContext(),StoryTen.class);
                    startActivityForResult(myintent,9);
                }
                if(position==10){
                    Intent myintent = new Intent(view.getContext(), com.example.project.StoryEleven.class);
                    startActivityForResult(myintent,10);
                }
                if(position==11){
                    Intent myintent = new Intent(view.getContext(),StoryTwelve.class);
                    startActivityForResult(myintent,11);
                }
};});}}