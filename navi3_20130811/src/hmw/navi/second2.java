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

public class second2 extends Activity implements OnClickListener {

public void onCreate(Bundle savedInstanceState) {
		
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second2);
        
        Button BtnA = (Button) findViewById(R.id.b180_button1);
        BtnA.setOnClickListener(this);
        Button BtnB = (Button) findViewById(R.id.b180_button2);
        BtnB.setOnClickListener(this);
        Button BtnC = (Button) findViewById(R.id.b180_button3);
        BtnC.setOnClickListener(this);
        Button BtnD = (Button) findViewById(R.id.b180_button4);
        BtnD.setOnClickListener(this);
        Button BtnE = (Button) findViewById(R.id.b180_button5);
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
		if(v.getId() == R.id.b180_button1){
			Log.i("navi180", "second2 - 36");
			startActivity(new Intent(this, b180_third_a.class));
			Log.i("navi180", "second2 - 38");

		}else if(v.getId() == R.id.b180_button2){
			startActivity(new Intent(this, b180_third_b.class));

		}else if(v.getId() == R.id.b180_button3){
			startActivity(new Intent(this, b180_third_c.class));

		}else if(v.getId() == R.id.b180_button4){
			startActivity(new Intent(this, b180_third_d.class));

		}else if(v.getId() == R.id.b180_button5){
			startActivity(new Intent(this, b180_third_e.class));

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
			Intent intent = new Intent(second2.this, search.class);
			startActivity(intent);
		}
		return false;
	}
}