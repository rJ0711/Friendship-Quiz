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

public class EnemyTestMCQ5
  extends AppCompatActivity
{
  String lan;
  private AdView mAdView;
  int percentage;
  private TextView question5;
  private TextView quote5;
  
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
        Intent localIntent = new Intent(EnemyTestMCQ5.this, EnemyActivity.class);
        localIntent.putExtra("lan", EnemyTestMCQ5.this.lan);
        EnemyTestMCQ5.this.startActivity(localIntent);
        EnemyTestMCQ5.this.finish();
      }
    });
    localBuilder.show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558434);
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
    ((RadioGroup)findViewById(2131361948));
    final RadioButton localRadioButton1 = (RadioButton)findViewById(2131361930);
    final RadioButton localRadioButton2 = (RadioButton)findViewById(2131361931);
    final RadioButton localRadioButton3 = (RadioButton)findViewById(2131361932);
    final RadioButton localRadioButton4 = (RadioButton)findViewById(2131361933);
    ((Button)findViewById(2131361863)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(EnemyTestMCQ5.this);
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
            Intent localIntent = new Intent(EnemyTestMCQ5.this, EnemyActivity.class);
            localIntent.putExtra("lan", EnemyTestMCQ5.this.lan);
            EnemyTestMCQ5.this.startActivity(localIntent);
            EnemyTestMCQ5.this.finish();
          }
        });
        localBuilder.show();
      }
    });
    this.question5 = ((TextView)findViewById(2131362047));
    this.quote5 = ((TextView)findViewById(2131362055));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getString(2131689475));
    localStringBuilder.append(str2);
    localStringBuilder.append(getString(2131689476));
    String str4 = localStringBuilder.toString();
    String str5 = getString(2131689589);
    this.question5.setText(str4);
    this.quote5.setText(str5);
    localRadioButton1.setText("5-6");
    localRadioButton2.setText(" 9-10");
    localRadioButton3.setText("1-2");
    localRadioButton4.setText("3-4");
    Button localButton = (Button)findViewById(2131362019);
    View.OnClickListener local3 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (localRadioButton1.isChecked())
        {
          EnemyTestMCQ5 localEnemyTestMCQ54 = EnemyTestMCQ5.this;
          localEnemyTestMCQ54.percentage = (2 + localEnemyTestMCQ54.percentage);
        }
        else if (localRadioButton2.isChecked())
        {
          EnemyTestMCQ5 localEnemyTestMCQ53 = EnemyTestMCQ5.this;
          localEnemyTestMCQ53.percentage = (0 + localEnemyTestMCQ53.percentage);
        }
        else if (localRadioButton3.isChecked())
        {
          EnemyTestMCQ5 localEnemyTestMCQ52 = EnemyTestMCQ5.this;
          localEnemyTestMCQ52.percentage = (14 + localEnemyTestMCQ52.percentage);
        }
        else if (localRadioButton4.isChecked())
        {
          EnemyTestMCQ5 localEnemyTestMCQ51 = EnemyTestMCQ5.this;
          localEnemyTestMCQ51.percentage = (7 + localEnemyTestMCQ51.percentage);
        }
        if ((localRadioButton1.isChecked()) || (localRadioButton2.isChecked()) || (localRadioButton3.isChecked()) || (localRadioButton4.isChecked()))
        {
          Intent localIntent = new Intent(EnemyTestMCQ5.this, EnemyTestMCQ6.class);
          localIntent.putExtra("percentage", EnemyTestMCQ5.this.percentage);
          localIntent.putExtra("name", str1);
          localIntent.putExtra("enemyName", str2);
          localIntent.putExtra("lan", EnemyTestMCQ5.this.lan);
          EnemyTestMCQ5.this.startActivity(localIntent);
          EnemyTestMCQ5.this.finish();
        }
      }
    };
    localButton.setOnClickListener(local3);
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.MCQ.EnemyTestMCQ5
 * JD-Core Version:    0.7.0.1
 */