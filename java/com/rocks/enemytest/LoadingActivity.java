package com.rocks.enemytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class LoadingActivity
  extends AppCompatActivity
{
  private String enemyName;
  private String name;
  private int percentage;
  ProgressBar progressBar;
  TextView progressText;
  
  public void AnimationLoading(String paramString)
  {
    ProgressBarAnimation localProgressBarAnimation = new ProgressBarAnimation(this, this.progressBar, this.progressText, 0.0F, 100.0F, this.percentage, this.name, this.enemyName, paramString);
    localProgressBarAnimation.setDuration(8000L);
    this.progressBar.setAnimation(localProgressBarAnimation);
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558440);
    getWindow().setFlags(1024, 1024);
    Intent localIntent = getIntent();
    this.percentage = localIntent.getIntExtra("percentage", 0);
    this.name = localIntent.getStringExtra("name");
    this.enemyName = localIntent.getStringExtra("enemyName");
    String str = localIntent.getStringExtra("lan");
    this.progressBar = ((ProgressBar)findViewById(2131362000));
    this.progressText = ((TextView)findViewById(2131362042));
    this.progressBar.setMax(100);
    this.progressBar.setScaleY(3.0F);
    AnimationLoading(str);
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.LoadingActivity
 * JD-Core Version:    0.7.0.1
 */