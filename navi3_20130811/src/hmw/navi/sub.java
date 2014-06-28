package hmw.navi;

import hmw.navi.R;
import hmw.navi.subSource;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class sub extends Activity implements OnClickListener , OnGestureListener {

	int a;
	
	private static final int SWIPE_MIN_DISTANCE = 120; 
    private static final int SWIPE_MAX_OFF_PATH = 250; 
    private static final int SWIPE_THRESHOLD_VELOCITY = 200; 

    private GestureDetector gestureScanner;
    
    private TextView text1;
    private TextView text2;
    private TextView text3;
    private TextView text4;
    private TextView text5;
	
	subSource su = new subSource();
	
    public void onCreate(Bundle savedInstanceState) {
    	Log.i("navi", "sub-16");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub);
        gestureScanner = new GestureDetector(this); 
        
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        
        Intent intent = getIntent();
        // a = getIntent().getIntExtra("NumIn", defaultValue);
        a = intent.getExtras().getInt("NumIn");
        
        
        /*
        final TextView text1 = (TextView)findViewById(R.id.textView1);
        final TextView text2 = (TextView)findViewById(R.id.textView2);
        final TextView text3 = (TextView)findViewById(R.id.textView3);
        final TextView text4 = (TextView)findViewById(R.id.textView4);
        final TextView text5 = (TextView)findViewById(R.id.textView5);
        */
        
        text1 = (TextView)findViewById(R.id.textView1);
        text2 = (TextView)findViewById(R.id.textView2);
        text3 = (TextView)findViewById(R.id.textView3);
        text4 = (TextView)findViewById(R.id.textView4);
        text5 = (TextView)findViewById(R.id.textView5);
        
        text1.setText(su.Source1(a));
        text2.setText(su.Source2(a));
        text3.setText(su.Source3(a));
        text4.setText(su.Source4(a));
        text5.setText(su.Source2(a));
        
        //Button BtnPOST = (Button) findViewById(R.id.buttonPOST);
        //BtnPOST.setOnClickListener(this);
       // Button BtnNEXT = (Button) findViewById(R.id.buttonNEXT);
      //  BtnNEXT.setOnClickListener(this);
        
        Button BtnPOST = (Button)findViewById(R.id.buttonPOST);
        BtnPOST.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View v) {
        	   Log.i("navi", "sub_postButton before a = " + a);
        	   if(a<=1){
        		   Toast.makeText(sub.this, "첫번째 암송구절입니다!!", Toast.LENGTH_SHORT).show();
        	   }else{
        		   a--;
        		   text1.setText(su.Source1(a));
        		   text2.setText(su.Source2(a));
        		   text3.setText(su.Source3(a));
        		   text4.setText(su.Source4(a));
        		   text5.setText(su.Source2(a));
        		   Log.i("navi", "sub_postButton after a = " + a);
        	   }
           }
        });
        
        Button BtnNEXT = (Button)findViewById(R.id.buttonNEXT);
        BtnNEXT.setOnClickListener(new Button.OnClickListener(){
           public void onClick(View v) {
        	   Log.i("navi", "sub_nextButton after a = " + a);
        	   if(a>=60){
        		   Toast.makeText(sub.this, "마지막 암송구절입니다!!", Toast.LENGTH_SHORT).show();
        	   }else{
        		   a++;
        		   text1.setText(su.Source1(a));
        		   text2.setText(su.Source2(a));
        		   text3.setText(su.Source3(a));
        		   text4.setText(su.Source4(a));
        		   text5.setText(su.Source2(a));
        		   Log.i("navi", "sub_nextButton after a = " + a);
        	   }
           }
        });

        
    }
    
    public boolean onTouchEvent(MotionEvent me) { 
        return gestureScanner.onTouchEvent(me); 
    } 


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		/*
		if(v.getId() == R.id.buttonPOST){
			if(a==1){
				Toast.makeText(sub.this, "첫번째 암송구절입니다!!", Toast.LENGTH_SHORT);
			}else{
				a--;
				text1.setText(su.Source1(a));
				text2.setText(su.Source2(a));
				text3.setText(su.Source3(a));
				text4.setText(su.Source4(a));
			}
		}else if(v.getId() == R.id.buttonNEXT){
			if(a==60){
				Toast.makeText(sub.this, "마지막 암송구절입니다!!", Toast.LENGTH_SHORT);
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
            if (Math.abs(e1.getY() - e2.getY()) > SWIPE_MAX_OFF_PATH) 
                return false; 
          
            // right to left swipe 
            if (e1.getX() - e2.getX() > SWIPE_MIN_DISTANCE 
                    && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) { 
            	if(a>=60){
          		   Toast.makeText(sub.this, "마지막 암송구절입니다!!", Toast.LENGTH_SHORT).show();
          	   }else{
          		   a++;
          		   text1.setText(su.Source1(a));
          		   text2.setText(su.Source2(a));
          		   text3.setText(su.Source3(a));
          		   text4.setText(su.Source4(a));
          		   text5.setText(su.Source2(a));
          		   Log.i("navi", "sub_nextButton after a = " + a);
          	   }
            } 

            // left to right swipe 
            else if (e2.getX() - e1.getX() > SWIPE_MIN_DISTANCE 
                    && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) { 
            	if(a<=1){
         		   Toast.makeText(sub.this, "첫번째 암송구절입니다!!", Toast.LENGTH_SHORT).show();
         	   }else{
         		   a--;
         		   text1.setText(su.Source1(a));
         		   text2.setText(su.Source2(a));
         		   text3.setText(su.Source3(a));
         		   text4.setText(su.Source4(a));
         		   text5.setText(su.Source2(a));
         		   Log.i("navi", "sub_postButton after a = " + a);
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

}
