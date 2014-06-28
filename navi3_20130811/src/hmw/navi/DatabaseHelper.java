package hmw.navi;

import java.util.Calendar;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

public class DatabaseHelper extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "bible_text.db";
	static final String NAME = "name";
	static final String DATE = "date";
	
	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {

	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}
}

class Date {
	static Calendar mCalendar;
	static int curYear, curMonth, curDay, curHour, curMinute, curNoon, curSecond;
	
	static public String getDateNow() {
		mCalendar = Calendar.getInstance();
		curYear = mCalendar.get(Calendar.YEAR);  
		curMonth = mCalendar.get(Calendar.MONTH)+1;  
		curDay = mCalendar.get(Calendar.DAY_OF_MONTH);    
		curHour = mCalendar.get(Calendar.HOUR_OF_DAY);  
		curMinute = mCalendar.get(Calendar.MINUTE);  
		curSecond = mCalendar.get(Calendar.SECOND);  

		String s_date = curYear + "-" + 
						curMonth + "-" + 
						curDay + " " + 
						curHour + ":" + 
						curMinute + ":" + 
						curSecond;
		
		return s_date;
	}
}