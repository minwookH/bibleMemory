package hmw.navi;

import hmw.navi.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class third_c extends Activity implements OnClickListener {

int a;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_c);
        
        Button BtnA1 = (Button) findViewById(R.id.buttonC1);
        BtnA1.setOnClickListener(this);
        Button BtnA2 = (Button) findViewById(R.id.buttonC2);
        BtnA2.setOnClickListener(this);
        Button BtnA3 = (Button) findViewById(R.id.buttonC3);
        BtnA3.setOnClickListener(this);
        Button BtnA4 = (Button) findViewById(R.id.buttonC4);
        BtnA4.setOnClickListener(this);
        Button BtnA5 = (Button) findViewById(R.id.buttonC5);
        BtnA5.setOnClickListener(this);
        Button BtnA6 = (Button) findViewById(R.id.buttonC6);
        BtnA6.setOnClickListener(this);
        Button BtnA7 = (Button) findViewById(R.id.buttonC7);
        BtnA7.setOnClickListener(this);
        Button BtnA8 = (Button) findViewById(R.id.buttonC8);
        BtnA8.setOnClickListener(this);
        Button BtnA9 = (Button) findViewById(R.id.buttonC9);
        BtnA9.setOnClickListener(this);
        Button BtnA10 = (Button) findViewById(R.id.buttonC10);
        BtnA10.setOnClickListener(this);
        Button BtnA11 = (Button) findViewById(R.id.buttonC11);
        BtnA11.setOnClickListener(this);
        Button BtnA12 = (Button) findViewById(R.id.buttonC12);
        BtnA12.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.buttonC1){
			Intent intent = new Intent(this, sub.class);
			a = 25;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC2){
			Intent intent = new Intent(this, sub.class);
			a = 26;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC3){
			Intent intent = new Intent(this, sub.class);
			a = 27;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC4){
			Intent intent = new Intent(this, sub.class);
			a = 28;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC5){
			Intent intent = new Intent(this, sub.class);
			a = 29;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC6){
			Intent intent = new Intent(this, sub.class);
			a = 30;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC7){
			Intent intent = new Intent(this, sub.class);
			a = 31;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC8){
			Intent intent = new Intent(this, sub.class);
			a = 32;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC9){
			Intent intent = new Intent(this, sub.class);
			a = 33;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC10){
			Intent intent = new Intent(this, sub.class);
			a = 34;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC11){
			Intent intent = new Intent(this, sub.class);
			a = 35;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonC12){
			Intent intent = new Intent(this, sub.class);
			a = 36;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}
		
	}
}