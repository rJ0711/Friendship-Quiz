package com.rocks.enemytest;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import java.util.Locale;

public class IntroSlider
  extends AppCompatActivity
{
  ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener()
  {
    public void onPageScrollStateChanged(int paramAnonymousInt) {}
    
    public void onPageScrolled(int paramAnonymousInt1, float paramAnonymousFloat, int paramAnonymousInt2) {}
    
    public void onPageSelected(int paramAnonymousInt)
    {
      IntroSlider.this.addDotIndicator(paramAnonymousInt);
      IntroSlider.this.mCurrentpage = paramAnonymousInt;
      if (IntroSlider.this.mCurrentpage == 0)
      {
        IntroSlider.this.nextBtn.setEnabled(true);
        IntroSlider.this.previousBtn.setEnabled(false);
        IntroSlider.this.previousBtn.setVisibility(4);
        IntroSlider.this.nextBtn.setText("Next");
        IntroSlider.this.previousBtn.setText("");
        return;
      }
      if (paramAnonymousInt == IntroSlider.this.dots.length - 1)
      {
        IntroSlider.this.nextBtn.setEnabled(true);
        IntroSlider.this.previousBtn.setEnabled(true);
        IntroSlider.this.previousBtn.setVisibility(0);
        IntroSlider.this.nextBtn.setText("Let's go!");
        IntroSlider.this.previousBtn.setText("back");
      }
    }
  };
  LinearLayout dotLayout;
  TextView[] dots;
  Intromanager intromanager;
  int mCurrentpage;
  Button nextBtn;
  Button previousBtn;
  SlideAdaptor slideAdaptor;
  ViewPager viewPager;
  
  public void addDotIndicator(int paramInt)
  {
    this.dots = new TextView[2];
    this.dotLayout.removeAllViews();
    TextView[] arrayOfTextView;
    for (int i = 0;; i++)
    {
      arrayOfTextView = this.dots;
      if (i >= arrayOfTextView.length) {
        break;
      }
      arrayOfTextView[i] = new TextView(this);
      this.dots[i].setText(Html.fromHtml("&#8226;"));
      this.dots[i].setTextSize(35.0F);
      this.dots[i].setTextColor(getResources().getColor(2131099698));
      this.dotLayout.addView(this.dots[i]);
    }
    if (arrayOfTextView.length > 0) {
      arrayOfTextView[paramInt].setTextColor(getResources().getColor(2131099718));
    }
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Boolean localBoolean = Boolean.valueOf(getSharedPreferences("PREFERENCE", 0).getBoolean("isFirstRun", false));
    final String str = getIntent().getStringExtra("lan");
    if (str.equals("hin"))
    {
      Locale localLocale = new Locale("hi");
      Locale.setDefault(localLocale);
      Configuration localConfiguration = new Configuration();
      localConfiguration.locale = localLocale;
      getResources().updateConfiguration(localConfiguration, getResources().getDisplayMetrics());
    }
    if (localBoolean.booleanValue())
    {
      Intent localIntent = new Intent(this, EnemyActivity.class);
      localIntent.putExtra("lan", str);
      startActivity(localIntent);
      finish();
    }
    getSharedPreferences("PREFERENCE", 0).edit().putBoolean("isFirstRun", true).commit();
    getWindow().setFlags(1024, 1024);
    setContentView(2131558439);
    this.viewPager = ((ViewPager)findViewById(2131362156));
    this.dotLayout = ((LinearLayout)findViewById(2131361909));
    this.previousBtn = ((Button)findViewById(2131362039));
    this.nextBtn = ((Button)findViewById(2131362023));
    SlideAdaptor localSlideAdaptor = new SlideAdaptor(this);
    this.slideAdaptor = localSlideAdaptor;
    this.viewPager.setAdapter(localSlideAdaptor);
    addDotIndicator(0);
    this.viewPager.addOnPageChangeListener(this.changeListener);
    this.nextBtn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (IntroSlider.this.mCurrentpage == -1 + IntroSlider.this.dots.length)
        {
          Intent localIntent = new Intent(IntroSlider.this, EnemyActivity.class);
          localIntent.putExtra("lan", str);
          IntroSlider.this.startActivity(localIntent);
          IntroSlider.this.finish();
        }
        IntroSlider.this.viewPager.setCurrentItem(1 + IntroSlider.this.mCurrentpage);
      }
    });
    this.previousBtn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        IntroSlider.this.viewPager.setCurrentItem(-1 + IntroSlider.this.mCurrentpage);
      }
    });
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.IntroSlider
 * JD-Core Version:    0.7.0.1
 */