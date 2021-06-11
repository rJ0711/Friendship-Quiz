package com.rocks.enemytest;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Locale;

public class AboutActivity
  extends AppCompatActivity
{
  String lan;
  
  public void onBackPressed()
  {
    Intent localIntent = new Intent(this, EnemyActivity.class);
    localIntent.putExtra("lan", this.lan);
    startActivity(localIntent);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558428);
    Button localButton = (Button)findViewById(2131361968);
    String str = getIntent().getStringExtra("lan");
    this.lan = str;
    if (str.equals("hin"))
    {
      Locale localLocale = new Locale("hi");
      Locale.setDefault(localLocale);
      Configuration localConfiguration = new Configuration();
      localConfiguration.locale = localLocale;
      getResources().updateConfiguration(localConfiguration, getResources().getDisplayMetrics());
    }
    localButton.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent("android.intent.action.SEND");
        localIntent.putExtra("android.intent.extra.EMAIL", new String[] { "rjrocksapp@gmail.com" });
        localIntent.putExtra("android.intent.extra.SUBJECT", "FEEDBACK");
        localIntent.setType("message/rfc822");
        localIntent.setPackage("com.google.android.gm");
        AboutActivity.this.startActivity(localIntent);
      }
    });
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.AboutActivity
 * JD-Core Version:    0.7.0.1
 */