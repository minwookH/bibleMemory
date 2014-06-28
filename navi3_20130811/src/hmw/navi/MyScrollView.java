package hmw.navi;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class MyScrollView extends ScrollView {
	
	private float LastX = 0.0f; 

	private Context mContext;

	public MyScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mContext = context;
		// TODO Auto-generated constructor stub
	}
	
	@Override

	public boolean onTouchEvent(MotionEvent event) {
		float x = event.getX();
		if (LastX != 0.0f && (Math.abs(LastX - x) > 15.0f)) {
			LastX = x;
			return ((Activity) mContext).onTouchEvent(event);
		} else {
			LastX = x;
			return super.onTouchEvent(event);
		}
	}

}
