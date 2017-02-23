package be.formation.gamedbapplication.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Student on 23-02-17.
 */

public class DbHelper extends SQLiteOpenHelper {

    public static final String DB_NAME = "game.db";
    public static final int DB_VERSION = 3;
    public DbHelper(Context context) {
        super(context, DB_NAME, null,DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL(GameDAO.CREATE_REQUEST);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(GameDAO.UPGRADE_REQUEST);
        onCreate(db);
    }
}
