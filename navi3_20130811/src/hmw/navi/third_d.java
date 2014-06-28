package hmw.navi;

import hmw.navi.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class third_d extends Activity implements OnClickListener {

int a;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_d);
        
        Button BtnA1 = (Button) findViewById(R.id.buttonD1);
        BtnA1.setOnClickListener(this);
        Button BtnA2 = (Button) findViewById(R.id.buttonD2);
        BtnA2.setOnClickListener(this);
        Button BtnA3 = (Button) findViewById(R.id.buttonD3);
        BtnA3.setOnClickListener(this);
        Button BtnA4 = (Button) findViewById(R.id.buttonD4);
        BtnA4.setOnClickListener(this);
        Button BtnA5 = (Button) findViewById(R.id.buttonD5);
        BtnA5.setOnClickListener(this);
        Button BtnA6 = (Button) findViewById(R.id.buttonD6);
        BtnA6.setOnClickListener(this);
        Button BtnA7 = (Button) findViewById(R.id.buttonD7);
        BtnA7.setOnClickListener(this);
        Button BtnA8 = (Button) findViewById(R.id.buttonD8);
        BtnA8.setOnClickListener(this);
        Button BtnA9 = (Button) findViewById(R.id.buttonD9);
        BtnA9.setOnClickListener(this);
        Button BtnA10 = (Button) findViewById(R.id.buttonD10);
        BtnA10.setOnClickListener(this);
        Button BtnA11 = (Button) findViewById(R.id.buttonD11);
        BtnA11.setOnClickListener(this);
        Button BtnA12 = (Button) findViewById(R.id.buttonD12);
        BtnA12.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.buttonD1){
			Intent intent = new Intent(this, sub.class);
			a = 37;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD2){
			Intent intent = new Intent(this, sub.class);
			a = 38;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD3){
			Intent intent = new Intent(this, sub.class);
			a = 39;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD4){
			Intent intent = new Intent(this, sub.class);
			a = 40;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD5){
			Intent intent = new Intent(this, sub.class);
			a = 41;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD6){
			Intent intent = new Intent(this, sub.class);
			a = 42;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD7){
			Intent intent = new Intent(this, sub.class);
			a = 43;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD8){
			Intent intent = new Intent(this, sub.class);
			a = 44;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD9){
			Intent intent = new Intent(this, sub.class);
			a = 45;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD10){
			Intent intent = new Intent(this, sub.class);
			a = 46;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD11){
			Intent intent = new Intent(this, sub.class);
			a = 47;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonD12){
			Intent intent = new Intent(this, sub.class);
			a = 48;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}
		
	}
}