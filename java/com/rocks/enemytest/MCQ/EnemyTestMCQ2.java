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

public class EnemyTestMCQ2
  extends AppCompatActivity
{
  String lan;
  private AdView mAdView;
  int percentage;
  private TextView question2;
  private TextView quote2;
  
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
        Intent localIntent = new Intent(EnemyTestMCQ2.this, EnemyActivity.class);
        localIntent.putExtra("lan", EnemyTestMCQ2.this.lan);
        EnemyTestMCQ2.this.startActivity(localIntent);
        EnemyTestMCQ2.this.finish();
      }
    });
    localBuilder.show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558431);
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
    ((RadioGroup)findViewById(2131361945));
    final RadioButton localRadioButton1 = (RadioButton)findViewById(2131361918);
    final RadioButton localRadioButton2 = (RadioButton)findViewById(2131361919);
    final RadioButton localRadioButton3 = (RadioButton)findViewById(2131361920);
    final RadioButton localRadioButton4 = (RadioButton)findViewById(2131361921);
    this.question2 = ((TextView)findViewById(2131362044));
    this.quote2 = ((TextView)findViewById(2131362052));
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(getString(2131689487));
    localStringBuilder1.append(str2);
    localStringBuilder1.append(getString(2131689488));
    String str4 = localStringBuilder1.toString();
    String str5 = getString(2131689586);
    String str6 = getString(2131689551);
    String str7 = getString(2131689552);
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(str2);
    localStringBuilder2.append(getString(2131689553));
    String str8 = localStringBuilder2.toString();
    String str9 = getString(2131689554);
    this.question2.setText(str4);
    this.quote2.setText(str5);
    localRadioButton1.setText(str6);
    localRadioButton2.setText(str7);
    localRadioButton3.setText(str8);
    localRadioButton4.setText(str9);
    ((Button)findViewById(2131361860)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(EnemyTestMCQ2.this);
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
            Intent localIntent = new Intent(EnemyTestMCQ2.this, EnemyActivity.class);
            localIntent.putExtra("lan", EnemyTestMCQ2.this.lan);
            EnemyTestMCQ2.this.startActivity(localIntent);
            EnemyTestMCQ2.this.finish();
          }
        });
        localBuilder.show();
      }
    });
    Button localButton = (Button)findViewById(2131362016);
    View.OnClickListener local3 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (localRadioButton1.isChecked())
        {
          EnemyTestMCQ2 localEnemyTestMCQ24 = EnemyTestMCQ2.this;
          localEnemyTestMCQ24.percentage = (14 + localEnemyTestMCQ24.percentage);
        }
        else if (localRadioButton2.isChecked())
        {
          EnemyTestMCQ2 localEnemyTestMCQ23 = EnemyTestMCQ2.this;
          localEnemyTestMCQ23.percentage = (2 + localEnemyTestMCQ23.percentage);
        }
        else if (localRadioButton3.isChecked())
        {
          EnemyTestMCQ2 localEnemyTestMCQ22 = EnemyTestMCQ2.this;
          localEnemyTestMCQ22.percentage = (7 + localEnemyTestMCQ22.percentage);
        }
        else if (localRadioButton4.isChecked())
        {
          EnemyTestMCQ2 localEnemyTestMCQ21 = EnemyTestMCQ2.this;
          localEnemyTestMCQ21.percentage = (4 + localEnemyTestMCQ21.percentage);
        }
        if ((localRadioButton1.isChecked()) || (localRadioButton2.isChecked()) || (localRadioButton3.isChecked()) || (localRadioButton4.isChecked()))
        {
          Intent localIntent = new Intent(EnemyTestMCQ2.this, EnemyTestMCQ3.class);
          localIntent.putExtra("percentage", EnemyTestMCQ2.this.percentage);
          localIntent.putExtra("name", str1);
          localIntent.putExtra("lan", EnemyTestMCQ2.this.lan);
          localIntent.putExtra("enemyName", str2);
          EnemyTestMCQ2.this.startActivity(localIntent);
          EnemyTestMCQ2.this.finish();
        }
      }
    };
    localButton.setOnClickListener(local3);
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.MCQ.EnemyTestMCQ2
 * JD-Core Version:    0.7.0.1
 */