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
	}

	
	public class ImageAdapter extends BaseAdapter {

        Context mContext;        //�����Ķ���
        
        //���췽��
        public ImageAdapter(Context context) {
            this.mContext = context;
        }
        
        //��ȡͼƬ�ĸ���
        public int getCount() {
            return mImageResourceIds.length;
        }

        //��ȡͼƬ�ڿ��е�λ��
        public Object getItem(int position) {
            return mImageResourceIds[position];
        }

        //��ȡͼƬ�ڿ��е�λ��
        public long getItemId(int position) {
            return position;
        }

        //��ȡ��������ָ��λ�õ���ͼ����
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView = new ImageView(mContext);
            imageView.setImageResource(mImageResourceIds[position]);
            imageView.setLayoutParams(new Gallery.LayoutParams(120, 120));
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            return imageView;
        }
        
    }
}
