package com.rocks.enemytest;

import android.content.Context;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ProgressBar;
import android.widget.TextView;

class ProgressBarAnimation
  extends Animation
{
  private Context context;
  String enemyName;
  private float from;
  String lan;
  String name;
  int percentage;
  private ProgressBar progressBar;
  private TextView progressResult;
  private float to;
  
  public ProgressBarAnimation(Context paramContext, ProgressBar paramProgressBar, TextView paramTextView, float paramFloat1, float paramFloat2, int paramInt, String paramString1, String paramString2, String paramString3)
  {
    this.context = paramContext;
    this.progressBar = paramProgressBar;
    this.progressResult = paramTextView;
    this.from = paramFloat1;
    this.to = paramFloat2;
    this.percentage = paramInt;
    this.name = paramString1;
    this.enemyName = paramString2;
    this.lan = paramString3;
  }
  
  protected void applyTransformation(float paramFloat, Transformation paramTransformation)
  {
    super.applyTransformation(paramFloat, paramTransformation);
    float f1 = this.from;
    float f2 = f1 + paramFloat * (this.to - f1);
    ProgressBar localProgressBar = this.progressBar;
    int i = (int)f2;
    localProgressBar.setProgress(i);
    TextView localTextView = this.progressResult;
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(i);
    localStringBuilder.append(" %");
    localTextView.setText(localStringBuilder.toString());
    if (f2 == this.to)
    {
      Intent localIntent = new Intent(this.context, EnemyTestMCQResult.class);
      localIntent.putExtra("percentage", this.percentage);
      localIntent.putExtra("name", this.name);
      localIntent.putExtra("lan", this.lan);
      localIntent.putExtra("enemyName", this.enemyName);
      this.context.startActivity(localIntent);
    }
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.ProgressBarAnimation
 * JD-Core Version:    0.7.0.1
 */