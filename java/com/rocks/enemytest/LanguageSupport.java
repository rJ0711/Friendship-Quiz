package com.rocks.enemytest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class LanguageSupport
  extends AppCompatActivity
{
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558459);
    Button localButton1 = (Button)findViewById(2131361973);
    Button localButton2 = (Button)findViewById(2131361898);
    localButton1.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(LanguageSupport.this, IntroSlider.class);
        localIntent.putExtra("lan", "hin");
        LanguageSupport.this.startActivity(localIntent);
        LanguageSupport.this.finish();
      }
    });
    localButton2.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(LanguageSupport.this, IntroSlider.class);
        localIntent.putExtra("lan", "eng");
        LanguageSupport.this.startActivity(localIntent);
        LanguageSupport.this.finish();
      }
    });
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.LanguageSupport
 * JD-Core Version:    0.7.0.1
 */