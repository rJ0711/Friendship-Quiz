package com.rocks.enemytest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;

class SlideAdaptor
  extends PagerAdapter
{
  Context context;
  LayoutInflater layoutInflater;
  public String[] slide_decription = { "Better to understand better to believe !\n The easiest way to realise the difference between enemies and friends.", "Simply think hard and suspect it. \n You will definitely know who are they." };
  public String[] slide_headline = { "Enemies in Friend", "Ready for Analysis" };
  public int[] slide_images = { 2131230833, 2131230874 };
  
  public SlideAdaptor(Context paramContext)
  {
    this.context = paramContext;
  }
  
  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup.removeView((RelativeLayout)paramObject);
  }
  
  public int getCount()
  {
    return this.slide_headline.length;
  }
  
  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    LayoutInflater localLayoutInflater = (LayoutInflater)this.context.getSystemService("layout_inflater");
    this.layoutInflater = localLayoutInflater;
    View localView = localLayoutInflater.inflate(2131558471, paramViewGroup, false);
    ImageView localImageView = (ImageView)localView.findViewById(2131362100);
    TextView localTextView1 = (TextView)localView.findViewById(2131362099);
    TextView localTextView2 = (TextView)localView.findViewById(2131362098);
    localImageView.setImageResource(this.slide_images[paramInt]);
    localTextView1.setText(this.slide_headline[paramInt]);
    localTextView2.setText(this.slide_decription[paramInt]);
    paramViewGroup.addView(localView);
    return localView;
  }
  
  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    return paramView == (RelativeLayout)paramObject;
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.SlideAdaptor
 * JD-Core Version:    0.7.0.1
 */