package com.rocks.enemytest;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;

public class EnemyTestMCQResult
  extends AppCompatActivity
{
  String lan;
  private InterstitialAd mInterstitialAd;
  RelativeLayout relativeLayout;
  TextView resultEnemy;
  TextView resultName;
  TextView setPercentage;
  Button share;
  int var;
  
  private void Screenshot()
  {
    Bitmap localBitmap = bitmapSS(this.relativeLayout);
    try
    {
      File localFile = new File(getExternalCacheDir(), "akeresult.jpg");
      FileOutputStream localFileOutputStream = new FileOutputStream(localFile);
      localBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localFileOutputStream);
      localFileOutputStream.flush();
      localFileOutputStream.close();
      localFile.setReadable(true, false);
      Uri localUri = Uri.fromFile(localFile);
      if (Build.VERSION.SDK_INT >= 24) {
        localUri = FileProvider.getUriForFile(this, "com.rocks.enemytest.provider", localFile);
      }
      intentShare(localUri);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException.printStackTrace();
      return;
    }
    catch (FileNotFoundException localFileNotFoundException)
    {
      localFileNotFoundException.printStackTrace();
    }
  }
  
  private Bitmap bitmapSS(View paramView)
  {
    Bitmap localBitmap = Bitmap.createBitmap(paramView.getWidth(), paramView.getHeight(), Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Drawable localDrawable = paramView.getBackground();
    if (localDrawable != null) {
      localDrawable.draw(localCanvas);
    } else {
      localCanvas.drawColor(17170443);
    }
    paramView.draw(localCanvas);
    return localBitmap;
  }
  
  private void intentShare(Uri paramUri)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setFlags(268435456);
    localIntent.putExtra("android.intent.extra.STREAM", paramUri);
    localIntent.setType("image/png");
    startActivity(Intent.createChooser(localIntent, "share by"));
  }
  
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
    setContentView(2131558438);
    InterstitialAd localInterstitialAd = new InterstitialAd(this);
    this.mInterstitialAd = localInterstitialAd;
    localInterstitialAd.setAdUnitId("ca-app-pub-7584931975894597/1119622979");
    this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
    Intent localIntent = getIntent();
    int i = localIntent.getIntExtra("percentage", 0);
    String str1 = localIntent.getStringExtra("name");
    String str2 = localIntent.getStringExtra("enemyName");
    String str3 = localIntent.getStringExtra("lan");
    this.lan = str3;
    if (str3 == "hin") {
      this.var = 1;
    }
    if (this.var == 1)
    {
      Locale localLocale = new Locale("hi");
      Locale.setDefault(localLocale);
      Configuration localConfiguration = new Configuration();
      localConfiguration.locale = localLocale;
      getResources().updateConfiguration(localConfiguration, getResources().getDisplayMetrics());
    }
    this.relativeLayout = ((RelativeLayout)findViewById(2131362074));
    String str4 = String.valueOf(i);
    this.resultEnemy = ((TextView)findViewById(2131362063));
    this.resultName = ((TextView)findViewById(2131362064));
    this.setPercentage = ((TextView)findViewById(2131361953));
    TextView localTextView = (TextView)findViewById(2131362065);
    this.resultEnemy.setText(str2);
    this.resultName.setText(str1);
    this.setPercentage.setText(str4);
    Button localButton1 = (Button)findViewById(2131362062);
    Button localButton2 = (Button)findViewById(2131361857);
    Button localButton3 = (Button)findViewById(2131362092);
    StringBuilder localStringBuilder1 = new StringBuilder();
    localStringBuilder1.append(str2);
    localStringBuilder1.append(getString(2131689490));
    String str5 = localStringBuilder1.toString();
    StringBuilder localStringBuilder2 = new StringBuilder();
    localStringBuilder2.append(str2);
    localStringBuilder2.append(getString(2131689491));
    String str6 = localStringBuilder2.toString();
    StringBuilder localStringBuilder3 = new StringBuilder();
    localStringBuilder3.append(str2);
    localStringBuilder3.append(getString(2131689492));
    String str7 = localStringBuilder3.toString();
    StringBuilder localStringBuilder4 = new StringBuilder();
    localStringBuilder4.append(str2);
    localStringBuilder4.append(getString(2131689493));
    String str8 = localStringBuilder4.toString();
    if ((i >= 14) && (i <= 28)) {
      localTextView.setText(str5);
    } else if ((i >= 28) && (i <= 49)) {
      localTextView.setText(str6);
    } else if ((i >= 49) && (i <= 98)) {
      localTextView.setText(str7);
    } else if (i <= 14) {
      localTextView.setText(str8);
    }
    localButton2.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(EnemyTestMCQResult.this, EnemyActivity.class);
        localIntent.putExtra("lan", EnemyTestMCQResult.this.lan);
        EnemyTestMCQResult.this.startActivity(localIntent);
        EnemyTestMCQResult.this.finish();
      }
    });
    localButton1.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(EnemyTestMCQResult.this, EnemyActivity.class);
        localIntent.putExtra("lan", EnemyTestMCQResult.this.lan);
        EnemyTestMCQResult.this.startActivity(localIntent);
        EnemyTestMCQResult.this.finish();
      }
    });
    localButton3.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (EnemyTestMCQResult.this.mInterstitialAd.isLoaded()) {
          EnemyTestMCQResult.this.mInterstitialAd.show();
        } else {
          EnemyTestMCQResult.this.Screenshot();
        }
        EnemyTestMCQResult.this.mInterstitialAd.setAdListener(new AdListener()
        {
          public void onAdClicked() {}
          
          public void onAdClosed()
          {
            EnemyTestMCQResult.this.Screenshot();
            EnemyTestMCQResult.this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
          }
          
          public void onAdFailedToLoad(int paramAnonymous2Int) {}
          
          public void onAdLeftApplication() {}
          
          public void onAdLoaded() {}
          
          public void onAdOpened() {}
        });
      }
    });
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.EnemyTestMCQResult
 * JD-Core Version:    0.7.0.1
 */