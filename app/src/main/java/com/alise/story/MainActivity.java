package com.alise.story;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private void onClick() {
        EditText nameInput, likeInput, dislikeInput;

        nameInput = (EditText) findViewById(R.id.nameInput);
        likeInput = (EditText) findViewById(R.id.likeInput);
        dislikeInput = (EditText) findViewById(R.id.dislikeInput);

        String nameText, nameLike, nameDislike, story;

        nameText = nameInput.getText().toString();
        nameLike = likeInput.getText().toString();
        nameDislike = dislikeInput.getText().toString();

        story = "Yo"+ nameText + "!" + "I like" + nameLike + "too. " + "But what is wrong with " + nameDislike + "? Lol!" ;



    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
