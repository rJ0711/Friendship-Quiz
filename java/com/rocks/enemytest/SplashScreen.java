package com.rocks.enemytest;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen
  extends AppCompatActivity
{
  ImageView splashImage;
  Animation topAnim;
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    setContentView(2131558441);
    this.topAnim = AnimationUtils.loadAnimation(this, 2130772000);
    ImageView localImageView = (ImageView)findViewById(2131362107);
    this.splashImage = localImageView;
    localImageView.setAnimation(this.topAnim);
    new Handler().postDelayed(new Runnable()
    {
      public void run()
      {
        Intent localIntent = new Intent(SplashScreen.this, LanguageSupport.class);
        SplashScreen.this.startActivity(localIntent);
        SplashScreen.this.finish();
      }
    }, 2000L);
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.SplashScreen
 * JD-Core Version:    0.7.0.1
 */