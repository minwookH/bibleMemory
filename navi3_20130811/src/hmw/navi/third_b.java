package hmw.navi;

import hmw.navi.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class third_b extends Activity implements OnClickListener {

int a;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_b);
        
        Button BtnA1 = (Button) findViewById(R.id.buttonB1);
        BtnA1.setOnClickListener(this);
        Button BtnA2 = (Button) findViewById(R.id.buttonB2);
        BtnA2.setOnClickListener(this);
        Button BtnA3 = (Button) findViewById(R.id.buttonB3);
        BtnA3.setOnClickListener(this);
        Button BtnA4 = (Button) findViewById(R.id.buttonB4);
        BtnA4.setOnClickListener(this);
        Button BtnA5 = (Button) findViewById(R.id.buttonB5);
        BtnA5.setOnClickListener(this);
        Button BtnA6 = (Button) findViewById(R.id.buttonB6);
        BtnA6.setOnClickListener(this);
        Button BtnA7 = (Button) findViewById(R.id.buttonB7);
        BtnA7.setOnClickListener(this);
        Button BtnA8 = (Button) findViewById(R.id.buttonB8);
        BtnA8.setOnClickListener(this);
        Button BtnA9 = (Button) findViewById(R.id.buttonB9);
        BtnA9.setOnClickListener(this);
        Button BtnA10 = (Button) findViewById(R.id.buttonB10);
        BtnA10.setOnClickListener(this);
        Button BtnA11 = (Button) findViewById(R.id.buttonB11);
        BtnA11.setOnClickListener(this);
        Button BtnA12 = (Button) findViewById(R.id.buttonB12);
        BtnA12.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.buttonB1){
			Intent intent = new Intent(this, sub.class);
			a = 13;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB2){
			Intent intent = new Intent(this, sub.class);
			a = 14;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB3){
			Intent intent = new Intent(this, sub.class);
			a = 15;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB4){
			Intent intent = new Intent(this, sub.class);
			a = 16;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB5){
			Intent intent = new Intent(this, sub.class);
			a = 17;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB6){
			Intent intent = new Intent(this, sub.class);
			a = 18;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB7){
			Intent intent = new Intent(this, sub.class);
			a = 19;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB8){
			Intent intent = new Intent(this, sub.class);
			a = 20;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB9){
			Intent intent = new Intent(this, sub.class);
			a = 21;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB10){
			Intent intent = new Intent(this, sub.class);
			a = 22;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB11){
			Intent intent = new Intent(this, sub.class);
			a = 23;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonB12){
			Intent intent = new Intent(this, sub.class);
			a = 24;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}
		
	}
}