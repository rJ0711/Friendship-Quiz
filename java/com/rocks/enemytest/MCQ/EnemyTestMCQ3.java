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
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.rocks.enemytest.EnemyActivity;
import java.util.Locale;

public class EnemyTestMCQ3
  extends AppCompatActivity
{
  String lan;
  private AdView mAdView;
  int percentage;
  private TextView question3;
  private TextView quote3;
  
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
        Intent localIntent = new Intent(EnemyTestMCQ3.this, EnemyActivity.class);
        localIntent.putExtra("lan", EnemyTestMCQ3.this.lan);
        EnemyTestMCQ3.this.startActivity(localIntent);
        EnemyTestMCQ3.this.finish();
      }
    });
    localBuilder.show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558432);
    AdView localAdView = new AdView(this);
    localAdView.setAdSize(AdSize.BANNER);
    localAdView.setAdUnitId("ca-app-pub-7584931975894597/3993198323");
    MobileAds.initialize(this, new OnInitializationCompleteListener()
    {
      public void onInitializationComplete(InitializationStatus paramAnonymousInitializationStatus) {}
    });
    this.mAdView = ((AdView)findViewById(2131361851));
    AdRequest localAdRequest = new AdRequest.Builder().build();
    this.mAdView.loadAd(localAdRequest);
    Intent localIntent = getIntent();
    this.percentage = localIntent.getIntExtra("percentage", 0);
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
    ((RadioGroup)findViewById(2131361946));
    final RadioButton localRadioButton1 = (RadioButton)findViewById(2131361922);
    final RadioButton localRadioButton2 = (RadioButton)findViewById(2131361923);
    final RadioButton localRadioButton3 = (RadioButton)findViewById(2131361924);
    final RadioButton localRadioButton4 = (RadioButton)findViewById(2131361925);
    ((RadioButton)findViewById(2131361921));
    this.question3 = ((TextView)findViewById(2131362045));
    this.quote3 = ((TextView)findViewById(2131362053));
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(getString(2131689485));
    localStringBuilder1.append(str2);
    localStringBuilder1.append(getString(2131689486));
    String str4 = localStringBuilder1.toString();
    String str5 = getString(2131689587);
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(getString(2131689555));
    localStringBuilder2.append(str2);
    localStringBuilder2.append(getString(2131689556));
    String str6 = localStringBuilder2.toString();
    StringBuilder localStringBuilder3 = new StringBuilder();
    localStringBuilder3.append(str2);
    localStringBuilder3.append(getString(2131689557));
    String str7 = localStringBuilder3.toString();
    StringBuilder localStringBuilder4 = new StringBuilder();
    localStringBuilder4.append(str2);
    localStringBuilder4.append(getString(2131689558));
    String str8 = localStringBuilder4.toString();
    StringBuilder localStringBuilder5 = new StringBuilder();
    localStringBuilder5.append(str2);
    localStringBuilder5.append(getString(2131689559));
    String str9 = localStringBuilder5.toString();
    this.question3.setText(str4);
    this.quote3.setText(str5);
    localRadioButton1.setText(str6);
    localRadioButton2.setText(str7);
    localRadioButton3.setText(str8);
    localRadioButton4.setText(str9);
    Button localButton = (Button)findViewById(2131362017);
    ((Button)findViewById(2131361861)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(EnemyTestMCQ3.this);
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
            Intent localIntent = new Intent(EnemyTestMCQ3.this, EnemyActivity.class);
            localIntent.putExtra("lan", EnemyTestMCQ3.this.lan);
            EnemyTestMCQ3.this.startActivity(localIntent);
            EnemyTestMCQ3.this.finish();
          }
        });
        localBuilder.show();
      }
    });
    View.OnClickListener local3 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (localRadioButton1.isChecked())
        {
          EnemyTestMCQ3 localEnemyTestMCQ34 = EnemyTestMCQ3.this;
          localEnemyTestMCQ34.percentage = (14 + localEnemyTestMCQ34.percentage);
        }
        else if (localRadioButton2.isChecked())
        {
          EnemyTestMCQ3 localEnemyTestMCQ33 = EnemyTestMCQ3.this;
          localEnemyTestMCQ33.percentage = (7 + localEnemyTestMCQ33.percentage);
        }
        else if (localRadioButton3.isChecked())
        {
          EnemyTestMCQ3 localEnemyTestMCQ32 = EnemyTestMCQ3.this;
          localEnemyTestMCQ32.percentage = (2 + localEnemyTestMCQ32.percentage);
        }
        else if (localRadioButton4.isChecked())
        {
          EnemyTestMCQ3 localEnemyTestMCQ31 = EnemyTestMCQ3.this;
          localEnemyTestMCQ31.percentage = (4 + localEnemyTestMCQ31.percentage);
        }
        if ((localRadioButton1.isChecked()) || (localRadioButton2.isChecked()) || (localRadioButton3.isChecked()) || (localRadioButton4.isChecked()))
        {
          Intent localIntent = new Intent(EnemyTestMCQ3.this, EnemyTestMCQ4.class);
          localIntent.putExtra("percentage", EnemyTestMCQ3.this.percentage);
          localIntent.putExtra("name", str1);
          localIntent.putExtra("lan", EnemyTestMCQ3.this.lan);
          localIntent.putExtra("enemyName", str2);
          EnemyTestMCQ3.this.startActivity(localIntent);
          EnemyTestMCQ3.this.finish();
        }
      }
    };
    localButton.setOnClickListener(local3);
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.MCQ.EnemyTestMCQ3
 * JD-Core Version:    0.7.0.1
 */