package hmw.navi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import hmw.navi.R;
import hmw.navi.subSource;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class sub_180 extends Activity implements OnClickListener , OnGestureListener {

	String id;
	int a;
	
	private static final int SWIPE_MIN_DISTANCE = 120; 
    private static final int SWIPE_MAX_OFF_PATH = 250; 
    private static final int SWIPE_THRESHOLD_VELOCITY = 200; 

    private GestureDetector gestureScanner;
    
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
	
	subSource su = new subSource();
	
	String[] selDB = new String[4];
	
    public void onCreate(Bundle savedInstanceState) {
    	Log.i("navi180", "sub180 - 45");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub180);
        gestureScanner = new GestureDetector(this); 
        
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        
        Intent intent = getIntent();
        Log.i("navi180", "sub180 - 53");
        // a = getIntent().getIntExtra("NumIn", defaultValue);
        id = intent.getStringExtra("_id");
        a = Integer.parseInt(id);
        Log.i("navi180", "sub180 - 56 a= "+a);
        
        text1 = (TextView)findViewById(R.id.b180_textView1);
        text2 = (TextView)findViewById(R.id.b180_textView2);
        text3 = (TextView)findViewById(R.id.b180_textView3);
        text4 = (TextView)findViewById(R.id.b180_textView4);
        
        selDB = searchDB(a);
		
        	// ������ ���
        	//TextView tv = (TextView)findViewById(R.id.textView);
        	//tv.setText(cur.getString(0));
        
        /*
        final TextView text1 = (TextView)findViewById(R.id.textView1);
        final TextView text2 = (TextView)findViewById(R.id.textView2);
        final TextView text3 = (TextView)findViewById(R.id.textView3);
        final TextView text4 = (TextView)findViewById(R.id.textView4);
        final TextView text5 = (TextView)findViewById(R.id.textView5);
        */
        Log.i("navi180", "sub180 - selDB[0]= "+selDB[0]);
        Log.i("navi180", "sub180 - selDB[1]= "+selDB[1]);
        Log.i("navi180", "sub180 - selDB[2]= "+selDB[2]);
        Log.i("navi180", "sub180 - selDB[3]= "+selDB[3]);
        Log.i("navi180", "sub180 - selDB[4]= "+selDB[4]);

        text1.setText(selDB[0]);
        text2.setText(selDB[1]);
        if(a>=2001 && a<=2180){
        	text3.setText(selDB[2].concat(" (").concat(selDB[3]).concat(")"));
        }else{
        	text3.setText(selDB[3]);
        }
        text4.setText(selDB[4]);
        //text1.setText(cur.getString(1));
        //text2.setText(cur.getString(2));
        //text3.setText(cur.getString(3));
        //text4.setText(cur.getString(4));
        
        //Button BtnPOST = (Button) findViewById(R.id.buttonPOST);
        //BtnPOST.setOnClickListener(this);
       // Button BtnNEXT = (Button) findViewById(R.id.buttonNEXT);
      //  BtnNEXT.setOnClickListener(this);
        
        
        Button BtnPOST = (Button)findViewById(R.id.b180_buttonPOST);
        BtnPOST.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View v) {
        	   Log.i("navi180", "sub_postButton before a = " + a);
        	   if(a==1001){
        		   Toast.makeText(sub_180.this, "ù��° �ϼ۱����Դϴ�!!", Toast.LENGTH_SHORT).show();
        	   }else{
        		   if(a==2001){
        			   a = 1060;
        		   }else if(a==3001){
        			   a = 2180;
        		   }else{
        			   a--;
        		   }
        		   
        		   selDB = searchDB(a);
        		   
        		   text1.setText(selDB[0]);
        	       text2.setText(selDB[1]);
        	       if(a>=2001 && a<=2180){
        	    	   text3.setText(selDB[2].concat(" (").concat(selDB[3]).concat(")"));
        	       }else{
        	    	   text3.setText(selDB[3]);
        	       }
        	       text4.setText(selDB[4]);
        		   Log.i("navi180", "sub_postButton after a = " + a);
        	   }
           }
        });
        
        Button BtnNEXT = (Button)findViewById(R.id.b180_buttonNEXT);
        BtnNEXT.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View v) {
        	   Log.i("navi180", "sub_nextButton after a = " + a);
        	   if(a==3048){
        		   Toast.makeText(sub_180.this, "������ �ϼ۱����Դϴ�!!", Toast.LENGTH_SHORT).show();
        	   }else{
        		   if(a==1060){
        			   a = 2001;
        		   }else if(a==2180){
        			   a = 3001;
        		   }else{
        			   a++;
        		   }
        		   selDB = searchDB(a);
        		   
        		   text1.setText(selDB[0]);
        	       text2.setText(selDB[1]);
        	       if(a>=2001 && a<=2180){
        	    	   text3.setText(selDB[2].concat(" (").concat(selDB[3]).concat(")"));
        	       }else{
        	    	   text3.setText(selDB[3]);
        	       }
        	       text4.setText(selDB[4]);
        		   Log.i("navi180", "sub_nextButton after a = " + a);
        	   }
           }
        });

        
    }
    
    
    private float LastY = 0.0f;
    public boolean onTouchEvent(MotionEvent me) { 
        //return gestureScanner.onTouchEvent(me);
    	Log.i("navi180", "onTouchEvent1");
        float y = me.getY();
        Log.i("navi180", "onTouchEvent y = " + y);
        if (LastY != 0.0f && (Math.abs(LastY - y) > 15.0f)) {
        	Log.i("navi180", "onTouchEvent2");
         LastY = y;
         return onTouchEvent(me);
        } else {
        	Log.i("navi180", "onTouchEvent3");
         LastY =y;
         return gestureScanner.onTouchEvent(me);
        }
        
    } 


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		/*
		if(v.getId() == R.id.buttonPOST){
			if(a==1){
				Toast.makeText(sub.this, "ù��° �ϼ۱����Դϴ�!!", Toast.LENGTH_SHORT);
			}else{
				a--;
				text1.setText(su.Source1(a));
				text2.setText(su.Source2(a));
				text3.setText(su.Source3(a));
				text4.setText(su.Source4(a));
			}
		}else if(v.getId() == R.id.buttonNEXT){
			if(a==60){
				Toast.makeText(sub.this, "������ �ϼ۱����Դϴ�!!", Toast.LENGTH_SHORT);
			}else{
				a++;
				text1.setText(su.Source1(a));
				text2.setText(su.Source2(a));
				text3.setText(su.Source3(a));
				text4.setText(su.Source4(a));
			}
		}
		*/
		
	}

	@Override
	public boolean onDown(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
		// TODO Auto-generated method stub
		try { 
			Log.i("navi180", "touch1");
            if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH)
                return false; 
          
            // right to left swipe 
            Log.i("navi180", "touch2");
            if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE 
                    && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) { 
            	if(a==3048){
            		Log.i("navi180", "touch3");
          		   Toast.makeText(sub_180.this, "������ �ϼ۱����Դϴ�!!", Toast.LENGTH_SHORT).show();
          	   }else{
          		 Log.i("navi180", "touch4");
	          		 if(a==1060){
		      			   a = 2001;
		      		   }else if(a==2180){
		      			   a = 3001;
		      		   }else{
		      			   a++;
		      		   }
          		   selDB = searchDB(a);
      		   
          		   text1.setText(selDB[0]);
	      	       text2.setText(selDB[1]);
	      	       if(a>=2001 && a<=2180){
	      	    	   text3.setText(selDB[2].concat(" (").concat(selDB[3]).concat(")"));
	      	       }else{
	      	    	   text3.setText(selDB[3]);
	      	       }
	      	       text4.setText(selDB[4]);
          		   Log.i("navi180", "sub_nextButton after a = " + a);
          	   }
            } 

            // left to right swipe 
            else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE 
                    && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) { 
            	if(a==1001){
            		Log.i("navi180", "touch5");
         		   Toast.makeText(sub_180.this, "ù��° �ϼ۱����Դϴ�!!", Toast.LENGTH_SHORT).show();
         	   }else{
         		  Log.i("navi180", "touch6");
	         		 if(a==2001){
		      			   a = 1060;
		      		   }else if(a==3001){
		      			   a = 2180;
		      		   }else{
		      			   a--;
		      		   }
	         		 
         		   selDB = searchDB(a);
       		   
         		   text1.setText(selDB[0]);
	       	       text2.setText(selDB[1]);
	       	       if(a>=2001 && a<=2180){
	       	    	   text3.setText(selDB[2].concat(" (").concat(selDB[3]).concat(")"));
	       	       }else{
	       	    	   text3.setText(selDB[3]);
	       	       }
	       	       text4.setText(selDB[4]);
         		   Log.i("navi180", "sub_postButton after a = " + a);
         	   }
            } 
            
        } catch (Exception e) { 
        } 
        return true; 
	}

	@Override
	public void onLongPress(MotionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onScroll(MotionEvent arg0, MotionEvent arg1, float arg2,
			float arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void onShowPress(MotionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onSingleTapUp(MotionEvent arg0) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String[] searchDB(int num){
    	SQLiteDatabase db = openOrCreateDatabase("bibleText.db", MODE_WORLD_READABLE, null);
    	Log.i("navi180", "sub180 - 66");
	
    	// ������ db�� Ŀ�� ȹ��
    	Cursor cur = db.rawQuery("SELECT * From bible_60_180_48 where _id="+num, null);
    	Log.i("navi180", "sub180 - 70");
	
    	// ó�� ���ڵ�� �̵�
    	cur.moveToFirst();
    	
    	String[] sel = new String[5];
    	
    	sel[0] = cur.getString(2);
    	sel[1] = cur.getString(3);
    	sel[2] = cur.getString(4);
    	sel[3] = cur.getString(5);
    	sel[4] = cur.getString(6);
    	
		return sel;

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
			Intent intent = new Intent(sub_180.this, search.class);
			startActivity(intent);
		}
		return false;
	}
}
