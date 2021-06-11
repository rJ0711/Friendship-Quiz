package com.rocks.enemytest.MCQ;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;
import com.rocks.enemytest.EnemyActivity;
import com.rocks.enemytest.LoadingActivity;
import java.util.Locale;

public class EnemyTestMCQ8
  extends AppCompatActivity
{
  String lan;
  private InterstitialAd mInterstitialAd;
  private TextView question8;
  private TextView quote8;
  
  public void onBackPressed()
  {
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(this);
    localBuilder.setTitle("Want to Go Home!").setMessage("Do you want to stop the analyzation !").setCancelable(true);
    localBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    localBuilder.setPositiveButton("Yes! I wanna", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        Intent localIntent = new Intent(EnemyTestMCQ8.this, EnemyActivity.class);
        localIntent.putExtra("lan", EnemyTestMCQ8.this.lan);
        EnemyTestMCQ8.this.startActivity(localIntent);
        EnemyTestMCQ8.this.finish();
      }
    });
    localBuilder.show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558437);
    InterstitialAd localInterstitialAd = new InterstitialAd(this);
    this.mInterstitialAd = localInterstitialAd;
    localInterstitialAd.setAdUnitId("ca-app-pub-7584931975894597/1119622979");
    this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
    Intent localIntent = getIntent();
    final int i = localIntent.getIntExtra("percentage", 0);
    final String str1 = localIntent.getStringExtra("name");
    final String str2 = localIntent.getStringExtra("enemyName");
    String str3 = localIntent.getStringExtra("lan");
    this.lan = str3;
    if (str3.equals("hin"))
    {
      Locale localLocale = new Locale("hi");
      Locale.setDefault(localLocale);
      Configuration localConfiguration = new Configuration();
      localConfiguration.locale = localLocale;
      getResources().updateConfiguration(localConfiguration, getResources().getDisplayMetrics());
    }
    ((RadioGroup)findViewById(2131361951));
    final RadioButton localRadioButton1 = (RadioButton)findViewById(2131361940);
    final RadioButton localRadioButton2 = (RadioButton)findViewById(2131361941);
    final RadioButton localRadioButton3 = (RadioButton)findViewById(2131361942);
    final RadioButton localRadioButton4 = (RadioButton)findViewById(2131361943);
    this.question8 = ((TextView)findViewById(2131362050));
    this.quote8 = ((TextView)findViewById(2131362058));
    String str4 = getString(2131689474);
    String str5 = getString(2131689592);
    String str6 = getString(2131689570);
    String str7 = getString(2131689571);
    String str8 = getString(2131689572);
    String str9 = getString(2131689573);
    this.question8.setText(str4);
    this.quote8.setText(str5);
    localRadioButton1.setText(str6);
    localRadioButton2.setText(str7);
    localRadioButton3.setText(str8);
    localRadioButton4.setText(str9);
    ((Button)findViewById(2131361866)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(EnemyTestMCQ8.this);
        localBuilder.setTitle("Want to Go Home!").setMessage("Do you want to stop the analyzation !").setCancelable(true);
        localBuilder.setNegativeButton("NO", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            paramAnonymous2DialogInterface.cancel();
          }
        });
        localBuilder.setPositiveButton("Yes! I wanna", new DialogInterface.OnClickListener()
        {
          public void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            Intent localIntent = new Intent(EnemyTestMCQ8.this, EnemyActivity.class);
            localIntent.putExtra("lan", EnemyTestMCQ8.this.lan);
            EnemyTestMCQ8.this.startActivity(localIntent);
            EnemyTestMCQ8.this.finish();
          }
        });
        localBuilder.show();
      }
    });
    Button localButton = (Button)findViewById(2131362022);
    View.OnClickListener local2 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (EnemyTestMCQ8.this.mInterstitialAd.isLoaded())
        {
          EnemyTestMCQ8.this.mInterstitialAd.show();
        }
        else if ((localRadioButton1.isChecked()) || (localRadioButton2.isChecked()) || (localRadioButton3.isChecked()) || (localRadioButton4.isChecked()))
        {
          Intent localIntent = new Intent(EnemyTestMCQ8.this, LoadingActivity.class);
          localIntent.putExtra("percentage", i);
          localIntent.putExtra("name", str1);
          localIntent.putExtra("lan", EnemyTestMCQ8.this.lan);
          localIntent.putExtra("enemyName", str2);
          EnemyTestMCQ8.this.startActivity(localIntent);
          EnemyTestMCQ8.this.finish();
        }
        EnemyTestMCQ8.this.mInterstitialAd.setAdListener(new AdListener()
        {
          public void onAdClicked() {}
          
          public void onAdClosed()
          {
            if ((EnemyTestMCQ8.2.this.val$mcq8_1.isChecked()) || (EnemyTestMCQ8.2.this.val$mcq8_2.isChecked()) || (EnemyTestMCQ8.2.this.val$mcq8_3.isChecked()) || (EnemyTestMCQ8.2.this.val$mcq8_4.isChecked()))
            {
              Intent localIntent = new Intent(EnemyTestMCQ8.this, LoadingActivity.class);
              localIntent.putExtra("percentage", EnemyTestMCQ8.2.this.val$percentage);
              localIntent.putExtra("name", EnemyTestMCQ8.2.this.val$name);
              localIntent.putExtra("enemyName", EnemyTestMCQ8.2.this.val$enemyName);
              localIntent.putExtra("lan", EnemyTestMCQ8.this.lan);
              EnemyTestMCQ8.this.startActivity(localIntent);
              EnemyTestMCQ8.this.finish();
            }
            EnemyTestMCQ8.this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
          }
          
          public void onAdFailedToLoad(int paramAnonymous2Int) {}
          
          public void onAdLeftApplication() {}
          
          public void onAdLoaded() {}
          
          public void onAdOpened() {}
        });
      }
    };
    localButton.setOnClickListener(local2);
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.MCQ.EnemyTestMCQ8
 * JD-Core Version:    0.7.0.1
 */