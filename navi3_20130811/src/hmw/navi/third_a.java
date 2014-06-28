package hmw.navi;

import hmw.navi.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class third_a extends Activity implements OnClickListener {

	int a;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_a);
        
        Button BtnA1 = (Button) findViewById(R.id.buttonA1);
        BtnA1.setOnClickListener(this);
        Button BtnA2 = (Button) findViewById(R.id.buttonA2);
        BtnA2.setOnClickListener(this);
        Button BtnA3 = (Button) findViewById(R.id.buttonA3);
        BtnA3.setOnClickListener(this);
        Button BtnA4 = (Button) findViewById(R.id.buttonA4);
        BtnA4.setOnClickListener(this);
        Button BtnA5 = (Button) findViewById(R.id.buttonA5);
        BtnA5.setOnClickListener(this);
        Button BtnA6 = (Button) findViewById(R.id.buttonA6);
        BtnA6.setOnClickListener(this);
        Button BtnA7 = (Button) findViewById(R.id.buttonA7);
        BtnA7.setOnClickListener(this);
        Button BtnA8 = (Button) findViewById(R.id.buttonA8);
        BtnA8.setOnClickListener(this);
        Button BtnA9 = (Button) findViewById(R.id.buttonA9);
        BtnA9.setOnClickListener(this);
        Button BtnA10 = (Button) findViewById(R.id.buttonA10);
        BtnA10.setOnClickListener(this);
        Button BtnA11 = (Button) findViewById(R.id.buttonA11);
        BtnA11.setOnClickListener(this);
        Button BtnA12 = (Button) findViewById(R.id.buttonA12);
        BtnA12.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.buttonA1){
			Intent intent = new Intent(this, sub.class);
			a = 1;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA2){
			Intent intent = new Intent(this, sub.class);
			a = 2;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA3){
			Intent intent = new Intent(this, sub.class);
			a = 3;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA4){
			Intent intent = new Intent(this, sub.class);
			a = 4;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA5){
			Intent intent = new Intent(this, sub.class);
			a = 5;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA6){
			Intent intent = new Intent(this, sub.class);
			a = 6;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA7){
			Intent intent = new Intent(this, sub.class);
			a = 7;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA8){
			Intent intent = new Intent(this, sub.class);
			a = 8;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA9){
			Intent intent = new Intent(this, sub.class);
			a = 9;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA10){
			Intent intent = new Intent(this, sub.class);
			a = 10;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA11){
			Intent intent = new Intent(this, sub.class);
			a = 11;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonA12){
			Intent intent = new Intent(this, sub.class);
			a = 12;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}
		
	}
}