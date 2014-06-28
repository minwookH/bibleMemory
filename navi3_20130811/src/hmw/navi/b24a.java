package hmw.navi;

import java.util.ArrayList;

import org.apache.http.util.EncodingUtils;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;

public class b24a extends Activity{
	private BibleDB mDbOpenHelper;
	
	private Bible data;
	private ArrayList<Bible> mInfoArray;
	SQLiteDatabase db = null;
	
	ItemListAdapter notClosedAdapter = null;
	
	private DatabaseHelper mHelper = null;
	private Cursor mCursor = null;
	
	ListView listView1;
	TextView listTitle;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView( R.layout.lllist);

		listView1 = (ListView) findViewById(R.id.listView123);
		listTitle = (TextView)findViewById(R.id.listTitle);
				
		Intent i = getIntent();
	    String category = i.getStringExtra("category");
	    String num1 = i.getStringExtra("num1");
	    String num2 = i.getStringExtra("num2");
	    
	    if(category.equals("60")){
	    	listTitle.setText("60구절");
	    }else if(category.equals("180")){
	    	listTitle.setText("180구절");
	    }else if(category.equals("24a")){
	    	listTitle.setText("아무도 흔들 수 없는 나의 구원");
	    }else if(category.equals("24b")){
	    	listTitle.setText("작은 예수가 되라");
	    }

	    db = openOrCreateDatabase("bibleText.db", MODE_WORLD_READABLE, null);
		Log.d("--openOrCreateDatabase end --", "123");
		
		mHelper = new DatabaseHelper(this);
		//mCursor = db.rawQuery("SELECT * From bibleText where category="+ category, null);
		if(category.equals("60")){
			Log.d("-- 60 --", "60");
			mCursor = db.rawQuery("SELECT * From bible_60_180_48 where category = "+"\"".concat(category).concat("\"")+" AND sub_id >= "+num1+" AND sub_id <="+num2, null);
		}else if(category.equals("180")){
			Log.d("-- 180 --", "180");
			mCursor = db.rawQuery("SELECT * From bible_60_180_48 where category = "+"\"".concat(category).concat("\"")+" AND sub_id >= "+num1+" AND sub_id <="+num2, null);
		}else{
			Log.d("-- 24 --", "24");
			mCursor = db.rawQuery("SELECT * From bible_60_180_48 where category = "+"\"".concat(category).concat("\""), null);
		}
		mInfoArray = new ArrayList<Bible>();
		Log.d("결과 수", Integer.toString(mCursor.getColumnCount()));
		while (mCursor.moveToNext()) {
			
            mInfoArray.add(new Bible(
            		mCursor.getString(mCursor.getColumnIndex("_id")),
                    mCursor.getString(mCursor.getColumnIndex("sub_id")),
                    mCursor.getString(mCursor.getColumnIndex("first_sub")),
                    mCursor.getString(mCursor.getColumnIndex("second_sub")),
                    mCursor.getString(mCursor.getColumnIndex("third_sub")),
                    mCursor.getString(mCursor.getColumnIndex("address")),
                    mCursor.getString(mCursor.getColumnIndex("words")),
                    mCursor.getString(mCursor.getColumnIndex("category"))
            		));
        }
         
		Log.d("--mInfoArray --", mInfoArray.toString());
        mCursor.close();
		
		notClosedAdapter = new ItemListAdapter(this, mInfoArray);
		
		listView1.setAdapter(notClosedAdapter);
		
		listView1.setOnItemClickListener(new AdapterView.OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView av, View v, int position, long id)
			{
				final View view = v;
				new Thread(new Runnable(){
					@Override
					public void run()
					{
						Intent intent = new Intent(b24a.this, sub_180.class);
						Bundle bundle = new Bundle() ;
						Log.d("리스트 아이디 값", view.getTag().toString());
						bundle.putString("_id", view.getTag().toString()) ;
						intent.putExtras(bundle) ;
						startActivity(intent);
						
					}
				}).start();
					
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 1, 0, "setting");
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		if(item.getItemId()==1){
			Intent intent = new Intent(b24a.this, search.class);
			startActivity(intent);
		}
		return false;
	}
	
}
