package hmw.navi;

import java.util.ArrayList;

import android.content.Context;
import android.text.Html;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemListAdapter extends BaseAdapter
{
	private Context context;
	private ArrayList<Bible> arrData;
	private LayoutInflater inflater;

	static String fText = null;
	static String mText =null;
	
	public ItemListAdapter(Context c, ArrayList<Bible> arr) {
		this.context = c;
		this.arrData = arr;
		inflater = (LayoutInflater)c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
		
		
	@Override
	public int getCount()
	{
		return arrData.size();
	}

	@Override
	public Object getItem(int position)
	{
		return arrData.get(position).getId();
	}

	@Override
	public long getItemId(int position)
	{
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		if(convertView == null){
			convertView = inflater.inflate(R.layout.bible_list_item, parent, false);
		}
			  
		TextView title = (TextView) convertView.findViewById(R.id.b_title);
		TextView address = (TextView) convertView.findViewById(R.id.b_address);
		TextView contents = (TextView) convertView.findViewById(R.id.b_contents);
		Log.d("----리스트 카테고리----", arrData.get(position).getCategory());
		Log.d("----리스트 position----", Integer.toString(position) );
		if(arrData.get(position).getCategory().equals("180")){
			Log.d("----getSecond_sub----", arrData.get(position).getThird_sub());
			title.setText(arrData.get(position).getThird_sub());
		}else if(arrData.get(position).getCategory().equals("60")
				|| arrData.get(position).getCategory().equals("24a") 
				|| arrData.get(position).getCategory().equals("24b")){
			title.setText(arrData.get(position).getSecond_sub());
		}
		address.setText(arrData.get(position).getAddress());
		contents.setText(Html.fromHtml(arrData.get(position).getWords()));
		convertView.setTag(arrData.get(position).getId());
			  
		return convertView;
	}
	
	public String testColorChange(String search, String text){
		String reText = null;
        
        int a;
        int b;
        a = text.indexOf(search);
        b = search.length();
        reText = text.substring(0, a);
        int c = a + b;
        System.out.println("c : "+c);
        mText = text.substring(c);
        
        Log.d("----search mText----", mText);
        Log.d("----reText ----", reText);
        
        if(fText==null){
            fText = reText+Html.fromHtml("<font color='#22741C'>"+search+"</font>");
        }else{
            fText = fText+reText+Html.fromHtml("<font color='#22741C'>"+search+"</font>");
        }
        
        Log.d("reText ff", fText);
        
        if(mText.indexOf(search)>-1){
        	testColorChange(search, mText);
        }
        return fText+mText;
	}
}
