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

public class EnemyTestMCQ7
  extends AppCompatActivity
{
  String lan;
  private AdView mAdView;
  int percentage;
  private TextView question7;
  private TextView quote7;
  
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
        Intent localIntent = new Intent(EnemyTestMCQ7.this, EnemyActivity.class);
        localIntent.putExtra("lan", EnemyTestMCQ7.this.lan);
        EnemyTestMCQ7.this.startActivity(localIntent);
        EnemyTestMCQ7.this.finish();
      }
    });
    localBuilder.show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558436);
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
    final String str1 = localIntent.getStringExtra("name");
    this.percentage = localIntent.getIntExtra("percentage", 0);
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
    ((RadioGroup)findViewById(2131361950));
    final RadioButton localRadioButton1 = (RadioButton)findViewById(2131361937);
    final RadioButton localRadioButton2 = (RadioButton)findViewById(2131361938);
    final RadioButton localRadioButton3 = (RadioButton)findViewById(2131361939);
    this.question7 = ((TextView)findViewById(2131362049));
    this.quote7 = ((TextView)findViewById(2131362057));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getString(2131689481));
    localStringBuilder.append(str2);
    localStringBuilder.append(" lost your trust?(or ");
    localStringBuilder.append(str2);
    localStringBuilder.append(getString(2131689482));
    String str4 = localStringBuilder.toString();
    String str5 = getString(2131689591);
    String str6 = getString(2131689567);
    String str7 = getString(2131689568);
    String str8 = getString(2131689569);
    this.question7.setText(str4);
    this.quote7.setText(str5);
    localRadioButton1.setText(str6);
    localRadioButton2.setText(str7);
    localRadioButton3.setText(str8);
    ((Button)findViewById(2131361865)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(EnemyTestMCQ7.this);
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
            Intent localIntent = new Intent(EnemyTestMCQ7.this, EnemyActivity.class);
            localIntent.putExtra("lan", EnemyTestMCQ7.this.lan);
            EnemyTestMCQ7.this.startActivity(localIntent);
            EnemyTestMCQ7.this.finish();
          }
        });
        localBuilder.show();
      }
    });
    Button localButton = (Button)findViewById(2131362021);
    View.OnClickListener local3 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (localRadioButton1.isChecked())
        {
          EnemyTestMCQ7 localEnemyTestMCQ73 = EnemyTestMCQ7.this;
          localEnemyTestMCQ73.percentage = (2 + localEnemyTestMCQ73.percentage);
        }
        else if (localRadioButton2.isChecked())
        {
          EnemyTestMCQ7 localEnemyTestMCQ72 = EnemyTestMCQ7.this;
          localEnemyTestMCQ72.percentage = (7 + localEnemyTestMCQ72.percentage);
        }
        else if (localRadioButton3.isChecked())
        {
          EnemyTestMCQ7 localEnemyTestMCQ71 = EnemyTestMCQ7.this;
          localEnemyTestMCQ71.percentage = (14 + localEnemyTestMCQ71.percentage);
        }
        if ((localRadioButton1.isChecked()) || (localRadioButton2.isChecked()) || (localRadioButton3.isChecked()))
        {
          Intent localIntent = new Intent(EnemyTestMCQ7.this, EnemyTestMCQ8.class);
          localIntent.putExtra("percentage", EnemyTestMCQ7.this.percentage);
          localIntent.putExtra("name", str1);
          localIntent.putExtra("enemyName", str2);
          localIntent.putExtra("lan", EnemyTestMCQ7.this.lan);
          EnemyTestMCQ7.this.startActivity(localIntent);
          EnemyTestMCQ7.this.finish();
        }
      }
    };
    localButton.setOnClickListener(local3);
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.MCQ.EnemyTestMCQ7
 * JD-Core Version:    0.7.0.1
 */