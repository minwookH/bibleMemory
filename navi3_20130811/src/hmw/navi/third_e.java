package hmw.navi;

import hmw.navi.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class third_e extends Activity implements OnClickListener {

int a;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_e);
        
        Button BtnA1 = (Button) findViewById(R.id.buttonE1);
        BtnA1.setOnClickListener(this);
        Button BtnA2 = (Button) findViewById(R.id.buttonE2);
        BtnA2.setOnClickListener(this);
        Button BtnA3 = (Button) findViewById(R.id.buttonE3);
        BtnA3.setOnClickListener(this);
        Button BtnA4 = (Button) findViewById(R.id.buttonE4);
        BtnA4.setOnClickListener(this);
        Button BtnA5 = (Button) findViewById(R.id.buttonE5);
        BtnA5.setOnClickListener(this);
        Button BtnA6 = (Button) findViewById(R.id.buttonE6);
        BtnA6.setOnClickListener(this);
        Button BtnA7 = (Button) findViewById(R.id.buttonE7);
        BtnA7.setOnClickListener(this);
        Button BtnA8 = (Button) findViewById(R.id.buttonE8);
        BtnA8.setOnClickListener(this);
        Button BtnA9 = (Button) findViewById(R.id.buttonE9);
        BtnA9.setOnClickListener(this);
        Button BtnA10 = (Button) findViewById(R.id.buttonE10);
        BtnA10.setOnClickListener(this);
        Button BtnA11 = (Button) findViewById(R.id.buttonE11);
        BtnA11.setOnClickListener(this);
        Button BtnA12 = (Button) findViewById(R.id.buttonE12);
        BtnA12.setOnClickListener(this);
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if(v.getId() == R.id.buttonE1){
			Intent intent = new Intent(this, sub.class);
			a = 49;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE2){
			Intent intent = new Intent(this, sub.class);
			a = 50;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE3){
			Intent intent = new Intent(this, sub.class);
			a = 51;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE4){
			Intent intent = new Intent(this, sub.class);
			a = 52;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE5){
			Intent intent = new Intent(this, sub.class);
			a = 53;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE6){
			Intent intent = new Intent(this, sub.class);
			a = 54;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE7){
			Intent intent = new Intent(this, sub.class);
			a = 55;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE8){
			Intent intent = new Intent(this, sub.class);
			a = 56;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE9){
			Intent intent = new Intent(this, sub.class);
			a = 57;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE10){
			Intent intent = new Intent(this, sub.class);
			a = 58;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE11){
			Intent intent = new Intent(this, sub.class);
			a = 59;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}else if(v.getId() == R.id.buttonE12){
			Intent intent = new Intent(this, sub.class);
			a = 60;
			intent.putExtra("NumIn", a);
			startActivity(intent);
		}
		
	}
}