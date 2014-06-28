package hmw.navi;

import hmw.navi.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class b180_third_e extends Activity implements OnClickListener {

	int a;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("navi180", "b180_third_a - 17");
        setContentView(R.layout.t_180_5);
        Log.i("navi180", "b180_third_a - 19");
        
        Button BtnA1 = (Button) findViewById(R.id.b180_t5_button1);
        BtnA1.setOnClickListener(this);
        Button BtnA2 = (Button) findViewById(R.id.b180_t5_button2);
        BtnA2.setOnClickListener(this);
        Button BtnA3 = (Button) findViewById(R.id.b180_t5_button3);
        BtnA3.setOnClickListener(this);
        
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
        
        BtnA1.setHeight(btnHeight);
        BtnA1.setWidth(btnWidth);
        BtnA1.setTextSize((int)(displayWidth*0.032));
        
        BtnA2.setHeight(btnHeight);
        BtnA2.setWidth(btnWidth);
        BtnA2.setTextSize((int)(displayWidth*0.032));
        
        BtnA3.setHeight(btnHeight);
        BtnA3.setWidth(btnWidth);
        BtnA3.setTextSize((int)(displayWidth*0.032));
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.b180_t5_button1){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "180") ;
			bundle.putString("num1", "145") ;
			bundle.putString("num2", "156") ;
			intent.putExtras(bundle) ;
			startActivity(intent);
		}else if(v.getId() == R.id.b180_t5_button2){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "180") ;
			bundle.putString("num1", "157") ;
			bundle.putString("num2", "168") ;
			intent.putExtras(bundle) ;
			startActivity(intent);
		}else if(v.getId() == R.id.b180_t5_button3){
			Intent intent = new Intent(this, b24a.class);
			Bundle bundle = new Bundle() ;
			bundle.putString("category", "180") ;
			bundle.putString("num1", "169") ;
			bundle.putString("num2", "180") ;
			intent.putExtras(bundle) ;
			startActivity(intent);
		}
		
	}
}