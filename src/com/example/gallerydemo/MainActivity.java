package com.example.gallerydemo;

import java.util.ArrayList;

import com.geminno.view.SlideOnePageGallery;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class MainActivity extends Activity {

	Integer[] mImageResourceIds={R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6};
	SlideOnePageGallery gallery;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		gallery=(SlideOnePageGallery) this.findViewById(R.id.mygallery);
		gallery.setAdapter(new ImageAdapter(this));
		System.out.println("测试内容");
		System.out.println("添加新内容");
		System.out.println("添加新内容B");
		System.out.println("测试内容A");
	}

	
	public class ImageAdapter extends BaseAdapter {

        Context mContext;        //涓婁笅鏂囧璞�
        
        //鏋勯�鏂规硶
        public ImageAdapter(Context context) {
            this.mContext = context;
        }
        
        //鑾峰彇鍥剧墖鐨勪釜鏁�
        public int getCount() {
            return mImageResourceIds.length;
        }

        //鑾峰彇鍥剧墖鍦ㄥ簱涓殑浣嶇疆
        public Object getItem(int position) {
            return mImageResourceIds[position];
        }

        //鑾峰彇鍥剧墖鍦ㄥ簱涓殑浣嶇疆
        public long getItemId(int position) {
            return position;
        }

        //鑾峰彇閫傞厤鍣ㄤ腑鎸囧畾浣嶇疆鐨勮鍥惧璞�
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mImageResourceIds[position]);
            imageView.setLayoutParams(new Gallery.LayoutParams(120, 120));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return imageView;
        }
        
    }
}
