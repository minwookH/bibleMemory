package hmw.navi;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class BibleDB {
 
    private static final String DATABASE_NAME = "bibleText.db";
    private static final int DATABASE_VERSION = 1;
    public static SQLiteDatabase mDB;
    private DatabaseHelper mDBHelper;
    private Context mCtx;
 
    private class DatabaseHelper extends SQLiteOpenHelper{
 
        // 생성자
        public DatabaseHelper(Context context, String name,
                CursorFactory factory, int version) {
            super(context, name, factory, version);
        }
 
        // 버전이 업데이트 되었을 경우 DB를 다시 만들어 준다.
        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        }

		@Override
		public void onCreate(SQLiteDatabase arg0) {
			// TODO Auto-generated method stub
		}
    }
 
    public BibleDB(Context context){
        this.mCtx = context;
    }
 
    public BibleDB open() throws SQLException{
        mDBHelper = new DatabaseHelper(mCtx, DATABASE_NAME, null, DATABASE_VERSION);
        mDB = mDBHelper.getWritableDatabase();
        return this;
    }
 
    public void close(){
        mDB.close();
    }

}
