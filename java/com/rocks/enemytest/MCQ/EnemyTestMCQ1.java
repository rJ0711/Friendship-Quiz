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

public class EnemyTestMCQ1
  extends AppCompatActivity
{
  String lan;
  private AdView mAdView;
  Button next1;
  int percentage;
  private TextView question1;
  private TextView quote1;
  
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
        Intent localIntent = new Intent(EnemyTestMCQ1.this, EnemyActivity.class);
        localIntent.putExtra("lan", EnemyTestMCQ1.this.lan);
        EnemyTestMCQ1.this.startActivity(localIntent);
        EnemyTestMCQ1.this.finish();
      }
    });
    localBuilder.show();
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    setContentView(2131558430);
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
    ((RadioGroup)findViewById(2131361944));
    final RadioButton localRadioButton1 = (RadioButton)findViewById(2131361914);
    final RadioButton localRadioButton2 = (RadioButton)findViewById(2131361915);
    final RadioButton localRadioButton3 = (RadioButton)findViewById(2131361916);
    final RadioButton localRadioButton4 = (RadioButton)findViewById(2131361917);
    this.question1 = ((TextView)findViewById(2131362043));
    this.quote1 = ((TextView)findViewById(2131362051));
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(getString(2131689479));
    localStringBuilder.append(str2);
    localStringBuilder.append(getString(2131689480));
    String str4 = localStringBuilder.toString();
    String str5 = getString(2131689585);
    String str6 = getString(2131689547);
    String str7 = getString(2131689548);
    String str8 = getString(2131689549);
    String str9 = getString(2131689550);
    this.question1.setText(str4);
    this.quote1.setText(str5);
    localRadioButton1.setText(str6);
    localRadioButton2.setText(str7);
    localRadioButton3.setText(str8);
    localRadioButton4.setText(str9);
    this.next1 = ((Button)findViewById(2131362015));
    ((Button)findViewById(2131361859)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        AlertDialog.Builder localBuilder = new AlertDialog.Builder(EnemyTestMCQ1.this);
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
            Intent localIntent = new Intent(EnemyTestMCQ1.this, EnemyActivity.class);
            localIntent.putExtra("lan", EnemyTestMCQ1.this.lan);
            EnemyTestMCQ1.this.startActivity(localIntent);
            EnemyTestMCQ1.this.finish();
          }
        });
        localBuilder.show();
      }
    });
    Button localButton = this.next1;
    View.OnClickListener local3 = new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (localRadioButton1.isChecked())
        {
          EnemyTestMCQ1 localEnemyTestMCQ14 = EnemyTestMCQ1.this;
          localEnemyTestMCQ14.percentage = (7 + localEnemyTestMCQ14.percentage);
        }
        else if (localRadioButton2.isChecked())
        {
          EnemyTestMCQ1 localEnemyTestMCQ13 = EnemyTestMCQ1.this;
          localEnemyTestMCQ13.percentage = (14 + localEnemyTestMCQ13.percentage);
        }
        else if (localRadioButton3.isChecked())
        {
          EnemyTestMCQ1 localEnemyTestMCQ12 = EnemyTestMCQ1.this;
          localEnemyTestMCQ12.percentage = (0 + localEnemyTestMCQ12.percentage);
        }
        else if (localRadioButton4.isChecked())
        {
          EnemyTestMCQ1 localEnemyTestMCQ11 = EnemyTestMCQ1.this;
          localEnemyTestMCQ11.percentage = (4 + localEnemyTestMCQ11.percentage);
        }
        if ((localRadioButton1.isChecked()) || (localRadioButton2.isChecked()) || (localRadioButton3.isChecked()) || (localRadioButton4.isChecked()))
        {
          Intent localIntent = new Intent(EnemyTestMCQ1.this, EnemyTestMCQ2.class);
          localIntent.putExtra("percentage", EnemyTestMCQ1.this.percentage);
          localIntent.putExtra("name", str1);
          localIntent.putExtra("lan", EnemyTestMCQ1.this.lan);
          localIntent.putExtra("enemyName", str2);
          EnemyTestMCQ1.this.startActivity(localIntent);
          EnemyTestMCQ1.this.finish();
        }
      }
    };
    localButton.setOnClickListener(local3);
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.MCQ.EnemyTestMCQ1
 * JD-Core Version:    0.7.0.1
 */