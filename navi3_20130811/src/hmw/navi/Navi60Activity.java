package hmw.navi;

import hmw.navi.R;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Navi60Activity extends Activity implements OnClickListener {

	Button Btn60;
	Button Btn180;
	Button Btn24a;
	Button Btn24b;
	
	TextView mainText1;
	TextView mainText2;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        Btn60 = (Button) findViewById(R.id.button60);
        Btn180 = (Button) findViewById(R.id.button180);
        Btn24a = (Button) findViewById(R.id.button24a);
        Btn24b = (Button) findViewById(R.id.button24b);
        mainText1= (TextView) findViewById(R.id.mainText);
        mainText2= (TextView) findViewById(R.id.mainText2);
        
        Btn60.setOnClickListener(this);
        Btn180.setOnClickListener(this);
        Btn24a.setOnClickListener(this);
        Btn24b.setOnClickListener(this);
        /*
        Button BtnA = (Button) findViewById(R.id.MainButton1);
        BtnA.setOnClickListener(this);
        Button BtnB = (Button) findViewById(R.id.MainButton2);
        BtnB.setOnClickListener(this);
        */
        
      //화면사이즈
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        // 가로
        int displayWidth = metrics.widthPixels;
        // 세로
        int displayHeight = metrics.heightPixels;
        
        int btnWidth = (int)(displayWidth*0.4);
		Log.d("---displayWidth---", Integer.toString(displayWidth));
        Btn60.setHeight(btnWidth);
        Btn60.setWidth(btnWidth);
        Btn60.setTextSize((int)(displayWidth*0.038));
        
        Btn180.setHeight(btnWidth);
        Btn180.setWidth(btnWidth);
        Btn180.setTextSize((int)(displayWidth*0.038));
        
        Btn24a.setHeight(btnWidth);
        Btn24a.setWidth(btnWidth);
        Btn24a.setTextSize((int)(displayWidth*0.028));
        
        Btn24b.setHeight(btnWidth);
        Btn24b.setWidth(btnWidth);
        Btn24b.setTextSize((int)(displayWidth*0.032));
        
        mainText1.setText("성경 암송");
        mainText1.setTextSize((int)(displayWidth*0.05));
        
        mainText2.setTextSize((int)(displayWidth*0.05));
        
        boolean a = checkDB(getApplicationContext());
        
        if(!a){
        	Log.d("--checkDB 판별 --", "false");
        	dumpDB(getApplicationContext());
        }
        
        //initialize(getApplicationContext());
        /*
        //��ü��ġ�� ȭ�� �ѱ��


        LinearLayout selection = (LinearLayout)findViewById(R.id.linear);  //��ġ�̺�Ʈ�� ���� �ؽ�Ʈ��� �̰��� �ؽ�Ʈ ������ �ٲ۴�.
        selection.setOnTouchListener(new OnTouchListener(){   //��ġ �̺�Ʈ ������ ���(�������� �������� ����)    
        	public boolean onTouch(View v, MotionEvent event) {
        		if(event.getAction()==MotionEvent.ACTION_DOWN){ 

        			Intent intent = new Intent(Navi60Activity.this, second.class);
        			startActivity(intent);
        			finish();
        			
        			//TextView text = (TextView)findViewById(R.id.st);
        			//text.setText("123456");
        			return true;
        		}             
        		return false;
        	}
        });
        
        */
    }
    
    
    
    public static final String PACKAGE_DIR = "/data/data/hmw.navi/";
	public static final String DATABASE_NAME = "bible_60_180_48.db";
	public static final String COPY2DATABASE_NAME = "bibleText.db";
	public static final String PACKAGE_NAME = "hmw.navi";
    ////
    
    public boolean checkDB(Context mContext){
    	Log.d("--checkDB 시작 --", "123");
        String filePath = "/data/data/" + PACKAGE_NAME + "/databases/bibleText.db";
        File file = new File(filePath);
        return file.exists();
    }

	 // Dump DB
	 public void dumpDB(Context mContext){
		 Log.d("--dumpDB 시작 --", "123");
	        AssetManager manager = mContext.getAssets();
	        String folderPath = "/data/data/" + PACKAGE_NAME + "/databases";
	        String filePath = "/data/data/" + PACKAGE_NAME + "/databases/bibleText.db";
	
	        File folder = new File(folderPath);
	        File file = new File(filePath);
	
	        FileOutputStream fos = null;
	        BufferedOutputStream bos = null;
	
	        try {
	                InputStream is = manager.open("bible_60_180_48.db");
	                BufferedInputStream bis = new BufferedInputStream(is);
	
	                if (folder.exists()) {
	                }else{
	                        folder.mkdirs();
	                }
	
	                if (file.exists()) {
	                        file.delete();
	                        file.createNewFile();
	                }
	
	                fos = new FileOutputStream(file);
	                bos = new BufferedOutputStream(fos);
	                int read = -1;
	                byte[] buffer = new byte[1024];
	                while ((read = bis.read(buffer, 0, 1024)) != -1) {
	                        bos.write(buffer, 0, read);
	                }
	
	                bos.flush();
	                bos.close();
	                fos.close();
	                bis.close();
	                is.close();
	                Log.d("--dumpDB 끝 --", "123");
	        } catch (IOException e) {
	                Log.e("ErrorMessage : ", e.getMessage());
	        }
	 }
    
    
    //DB���� ����
    
    
	public static void initialize(Context ctx) {
		Log.d("--db 생성 시작 --", "123");
		// check 		
		File folder = new File(PACKAGE_DIR + "databases");
		folder.mkdirs();
		File outfile = new File(PACKAGE_DIR + "databases/" + COPY2DATABASE_NAME);
		Log.d("--db 생성 시작 outfile.length()--", Long.toString(outfile.length()));
		if (outfile.length() <= 0) {
			AssetManager assetManager = ctx.getResources().getAssets();
			try {	
				InputStream is = assetManager.open(DATABASE_NAME, AssetManager.ACCESS_BUFFER);
				long filesize = is.available();
				Log.d("--db 생성 시작 filesize --", Long.toString(filesize));
				byte [] tempdata = new byte[(int)filesize];
				is.read(tempdata); 		
				is.close();				
				outfile.createNewFile();	
				FileOutputStream fo = new FileOutputStream(outfile);
				fo.write(tempdata);		
				fo.close();	
				Log.d("--db 생성끝 --", "123");
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}		
	}
    

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v == Btn60){
			Intent intent = new Intent(this, second1.class);
			startActivity(intent);
		}else if(v == Btn180){
			Intent intent = new Intent(this, second2.class);
			startActivity(intent);
		}else if(v == Btn24b){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "24b") ;
			intent.putExtras(bundle) ;
			startActivity(intent);
		}else if(v == Btn24a){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "24a") ;
			intent.putExtras(bundle) ;
			startActivity(intent);
			/*Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "24a") ;
			intent.putExtras(bundle) ;
			startActivity(intent);*/
		}
		/*
		if(v.getId() == R.id.MainButton1){
			startActivity(new Intent(this, second1.class));

		}else if(v.getId() == R.id.MainButton2){
			startActivity(new Intent(this, second2.class));

		}
		*/
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
			Intent intent = new Intent(Navi60Activity.this, search.class);
			startActivity(intent);
		}
		return false;
	}
}