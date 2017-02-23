package be.formation.gamedbapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

import java.util.Calendar;

import be.formation.gamedbapplication.db.GameDAO;
import be.formation.gamedbapplication.model.Game;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar c = Calendar.getInstance();
        c.set(2004,Calendar.OCTOBER,26);

        Game gl = new Game("Game San andreas",
                "Ca douille",
                "imageUrl",
                "Action",
                "superstar",
                c.getTime(),
                5.0f,
                true);


        GameDAO gameDAO = new GameDAO(this);
        gameDAO.openWritable();
        Long id = gameDAO.insert(gl);


        listView = (ListView) findViewById(R.id.lv_main_list);
        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(
                this,
                android.R.layout.simple_expandable_list_item_2,
                gameDAO.getGamesCursor(),
                new String[]{   GameDAO.COL_TITLE, GameDAO.COL_DESCRIPTION},
                new int[]{android.R.id.text1,android.R.id.text2}
                );

        listView.setAdapter(simpleCursorAdapter);
        for(Game game : gameDAO.getGames())
            Log.i("gta",game.getTitle());

        gameDAO.close();



    }


}
