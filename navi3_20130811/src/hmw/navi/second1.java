package hmw.navi;

import hmw.navi.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class second1 extends Activity implements OnClickListener {
	public void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second1);
        
        Button BtnA = (Button) findViewById(R.id.button1);
        BtnA.setOnClickListener(this);
        Button BtnB = (Button) findViewById(R.id.button2);
        BtnB.setOnClickListener(this);
        Button BtnC = (Button) findViewById(R.id.button3);
        BtnC.setOnClickListener(this);
        Button BtnD = (Button) findViewById(R.id.button4);
        BtnD.setOnClickListener(this);
        Button BtnE = (Button) findViewById(R.id.button5);
        BtnE.setOnClickListener(this);
        
        //화면사이즈
        DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);

        // 가로
        int displayWidth = metrics.widthPixels;
        // 세로
        int displayHeight = metrics.heightPixels;
        Log.d("second1 displayWidth", Integer.toString(displayWidth));
        int btnWidth = (int)(displayWidth*0.68);
        int btnHeight = (int)(displayWidth*0.2);
        
        BtnA.setHeight(btnHeight);
        BtnA.setWidth(btnWidth);
        BtnA.setTextSize((int)(displayWidth*0.032));
        
        BtnB.setHeight(btnHeight);
        BtnB.setWidth(btnWidth);
        BtnB.setTextSize((int)(displayWidth*0.032));
        
        BtnC.setHeight(btnHeight);
        BtnC.setWidth(btnWidth);
        BtnC.setTextSize((int)(displayWidth*0.032));
        
        BtnD.setHeight(btnHeight);
        BtnD.setWidth(btnWidth);
        BtnD.setTextSize((int)(displayWidth*0.032));
        
        BtnE.setHeight(btnHeight);
        BtnE.setWidth(btnWidth);
        BtnE.setTextSize((int)(displayWidth*0.032));
        
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.button1){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "60") ;
			bundle.putString("num1", "1") ;
			bundle.putString("num2", "12") ;
			intent.putExtras(bundle) ;
			startActivity(intent);
		}else if(v.getId() == R.id.button2){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "60") ;
			bundle.putString("num1", "13") ;
			bundle.putString("num2", "24") ;
			intent.putExtras(bundle) ;
			startActivity(intent);

		}else if(v.getId() == R.id.button3){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "60") ;
			bundle.putString("num1", "25") ;
			bundle.putString("num2", "36") ;
			intent.putExtras(bundle) ;
			startActivity(intent);

		}else if(v.getId() == R.id.button4){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "60") ;
			bundle.putString("num1", "37") ;
			bundle.putString("num2", "48") ;
			intent.putExtras(bundle) ;
			startActivity(intent);
		}else if(v.getId() == R.id.button5){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "60") ;
			bundle.putString("num1", "49") ;
			bundle.putString("num2", "60") ;
			intent.putExtras(bundle) ;
			startActivity(intent);
		}
		
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
			Intent intent = new Intent(second1.this, search.class);
			startActivity(intent);
		}
		return false;
	}

}
