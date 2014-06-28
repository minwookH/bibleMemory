package hmw.navi;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class search extends Activity implements OnClickListener{
	private ArrayList<Bible> mInfoArray;
	SQLiteDatabase db = null;
	
	ItemListAdapter notClosedAdapter = null;
	
	private DatabaseHelper mHelper = null;
	private Cursor mCursor = null;
	
	ListView listView1;
	Button serch_btn;
	EditText serch_edit;
	String serch_text;
	String serch_text_final;
	
	static String fText = null;
	static String mText =null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView( R.layout.search);
		
		listView1 = (ListView) findViewById(R.id.serchlistView);
		serch_btn = (Button)findViewById(R.id.serch_btn);
		serch_edit = (EditText)findViewById(R.id.serch_edit);
		serch_btn.setOnClickListener(this);
		
		db = openOrCreateDatabase("bibleText.db", MODE_WORLD_READABLE, null);
		mHelper = new DatabaseHelper(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		if(v == serch_btn){
			serch_text = serch_edit.getText().toString();
			mCursor = db.rawQuery("SELECT * From bible_60_180_48 where words like '%"+serch_text+"%'", null);
		}
		
		mInfoArray = new ArrayList<Bible>();
		Log.d("결과 수", Integer.toString(mCursor.getColumnCount()));
		while (mCursor.moveToNext()) {
			serch_text_final = testColorChange(serch_text, mCursor.getString(mCursor.getColumnIndex("words")));
			Log.d("-----serch_text_final----", serch_text_final);
			
            mInfoArray.add(new Bible(
            		mCursor.getString(mCursor.getColumnIndex("_id")),
                    mCursor.getString(mCursor.getColumnIndex("sub_id")),
                    mCursor.getString(mCursor.getColumnIndex("first_sub")),
                    mCursor.getString(mCursor.getColumnIndex("second_sub")),
                    mCursor.getString(mCursor.getColumnIndex("third_sub")),
                    mCursor.getString(mCursor.getColumnIndex("address")),
                    serch_text_final,
                    mCursor.getString(mCursor.getColumnIndex("category"))
            		));
            fText = null;
            mText = null;
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
						Intent intent = new Intent(search.this, sub_180.class);
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
			Intent intent = new Intent(search.this, search.class);
			startActivity(intent);
		}
		return false;
	}
	
	public String testColorChange(String search, String text){
		String reText = null;
        
        int a;
        int b;
        a = text.indexOf(search);
        b = search.length();
        reText = text.substring(0, a);
        int c = a + b;
        System.out.println("c : "+c);
        mText = text.substring(c);
        
        Log.d("----search mText----", mText);
        Log.d("----reText ----", reText);
        
        if(fText==null){
        	fText = reText+"<font color='#EDA900'><b>"+search+"</b></font>";
        }else{
        	fText = fText+reText+"<font color='#EDA900'><b>"+search+"</b></font>";
        }
        
        Log.d("reText ff", fText);
        
        if(mText.indexOf(search)>-1){
        	testColorChange(search, mText);
        }
        return fText+mText;
	}
}
