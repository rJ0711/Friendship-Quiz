package com.rocks.enemytest;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest.Builder;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.rocks.enemytest.MCQ.EnemyTestMCQ1;
import hotchemi.android.rate.AppRate;
import java.util.Locale;

public class EnemyActivity
  extends AppCompatActivity
{
  Button calculate;
  TextInputEditText enemyEdit;
  TextInputLayout enemyNameText;
  Animation fabClose;
  Animation fabForward;
  RadioButton female1;
  RadioButton female2;
  FloatingActionButton infoBtn;
  boolean isopen = false;
  String lan;
  private InterstitialAd mInterstitialAd;
  RadioButton male1;
  RadioButton male2;
  FloatingActionButton menuBtn;
  TextInputEditText nameEdit;
  TextInputLayout nameText;
  RadioGroup radioGroup1;
  RadioGroup radioGroup2;
  Animation rotatingBackground;
  Animation rotatingForward;
  FloatingActionButton shareBtn;
  int var;
  
  private void closeKeyboard()
  {
    View localView = getCurrentFocus();
    if (localView != null) {
      ((InputMethodManager)getSystemService("input_method")).hideSoftInputFromWindow(localView.getWindowToken(), 0);
    }
  }
  
  public void Animatemenu()
  {
    if (this.isopen)
    {
      this.menuBtn.startAnimation(this.rotatingBackground);
      this.infoBtn.startAnimation(this.fabClose);
      this.shareBtn.startAnimation(this.fabClose);
      this.infoBtn.setClickable(false);
      this.shareBtn.setClickable(false);
      this.isopen = false;
      return;
    }
    this.menuBtn.startAnimation(this.rotatingForward);
    this.infoBtn.startAnimation(this.fabForward);
    this.shareBtn.startAnimation(this.fabForward);
    this.infoBtn.setClickable(true);
    this.shareBtn.setClickable(true);
    this.isopen = true;
  }
  
  public void menuClick(View paramView)
  {
    Animatemenu();
  }
  
  public void onBackPressed()
  {
    finish();
    finishAffinity();
    startActivity(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME").setFlags(268435456));
  }
  
  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    final Intent localIntent = getIntent();
    String str = localIntent.getStringExtra("lan");
    this.lan = str;
    if (str.equals("eng"))
    {
      this.var = 1;
      Locale localLocale2 = new Locale("en-rIN");
      Locale.setDefault(localLocale2);
      Configuration localConfiguration2 = new Configuration();
      localConfiguration2.locale = localLocale2;
      getResources().updateConfiguration(localConfiguration2, getResources().getDisplayMetrics());
    }
    else
    {
      this.var = 2;
      Locale localLocale1 = new Locale("hi");
      Locale.setDefault(localLocale1);
      Configuration localConfiguration1 = new Configuration();
      localConfiguration1.locale = localLocale1;
      getResources().updateConfiguration(localConfiguration1, getResources().getDisplayMetrics());
    }
    setContentView(2131558429);
    InterstitialAd localInterstitialAd = new InterstitialAd(this);
    this.mInterstitialAd = localInterstitialAd;
    localInterstitialAd.setAdUnitId("ca-app-pub-7584931975894597/1119622979");
    this.mInterstitialAd.loadAd(new AdRequest.Builder().build());
    AppRate.with(this).setInstallDays(0).setLaunchTimes(2).setRemindInterval(1).monitor();
    AppRate.showRateDialogIfMeetsConditions(this);
    this.calculate = ((Button)findViewById(2131361877));
    this.nameText = ((TextInputLayout)findViewById(2131362012));
    this.enemyNameText = ((TextInputLayout)findViewById(2131361952));
    this.nameEdit = ((TextInputEditText)findViewById(2131361911));
    this.enemyEdit = ((TextInputEditText)findViewById(2131361910));
    this.male1 = ((RadioButton)findViewById(2131362002));
    this.female1 = ((RadioButton)findViewById(2131361959));
    this.male2 = ((RadioButton)findViewById(2131362003));
    this.female2 = ((RadioButton)findViewById(2131361960));
    this.menuBtn = ((FloatingActionButton)findViewById(2131362005));
    this.shareBtn = ((FloatingActionButton)findViewById(2131362093));
    this.infoBtn = ((FloatingActionButton)findViewById(2131361981));
    ((Button)findViewById(2131361883)).setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        if (EnemyActivity.this.var == 1)
        {
          new Intent(EnemyActivity.this, EnemyActivity.class);
          localIntent.putExtra("lan", "hin");
          EnemyActivity.this.startActivity(localIntent);
          EnemyActivity.this.finish();
          return;
        }
        new Intent(EnemyActivity.this, EnemyActivity.class);
        localIntent.putExtra("lan", "eng");
        EnemyActivity.this.startActivity(localIntent);
        EnemyActivity.this.finish();
      }
    });
    this.fabForward = AnimationUtils.loadAnimation(this, 2130771996);
    this.fabClose = AnimationUtils.loadAnimation(this, 2130771997);
    this.rotatingForward = AnimationUtils.loadAnimation(this, 2130771999);
    this.rotatingBackground = AnimationUtils.loadAnimation(this, 2130771998);
    this.nameEdit.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {
          EnemyActivity.this.nameEdit.setError("Name required");
        }
      }
    });
    this.enemyEdit.setOnFocusChangeListener(new View.OnFocusChangeListener()
    {
      public void onFocusChange(View paramAnonymousView, boolean paramAnonymousBoolean)
      {
        if (paramAnonymousBoolean) {
          EnemyActivity.this.enemyEdit.setError("Friend's name required");
        }
      }
    });
    this.nameEdit.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        EnemyActivity.this.nameText.setErrorEnabled(false);
      }
    });
    this.enemyEdit.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        EnemyActivity.this.enemyNameText.setErrorEnabled(false);
      }
    });
    this.radioGroup1 = ((RadioGroup)findViewById(2131362060));
    this.radioGroup2 = ((RadioGroup)findViewById(2131362061));
    this.radioGroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
      public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
      {
        EnemyActivity.this.male1.setError(null);
        EnemyActivity.this.female1.setError(null);
      }
    });
    this.radioGroup2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
    {
      public void onCheckedChanged(RadioGroup paramAnonymousRadioGroup, int paramAnonymousInt)
      {
        EnemyActivity.this.male2.setError(null);
        EnemyActivity.this.female2.setError(null);
      }
    });
    this.infoBtn.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        Intent localIntent = new Intent(EnemyActivity.this, AboutActivity.class);
        localIntent.putExtra("lan", EnemyActivity.this.lan);
        EnemyActivity.this.startActivity(localIntent);
        EnemyActivity.this.finish();
      }
    });
    this.shareBtn.setOnClickListener(new View.OnClickListener()
    {
      /* Error */
      public void onClick(View paramAnonymousView)
      {
        // Byte code:
        //   0: new 26	android/content/Intent
        //   3: dup
        //   4: ldc 28
        //   6: invokespecial 31	android/content/Intent:<init>	(Ljava/lang/String;)V
        //   9: astore_2
        //   10: aload_0
        //   11: getfield 17	com/rocks/enemytest/EnemyActivity$9:this$0	Lcom/rocks/enemytest/EnemyActivity;
        //   14: invokevirtual 35	com/rocks/enemytest/EnemyActivity:getApplicationContext	()Landroid/content/Context;
        //   17: invokevirtual 41	android/content/Context:getPackageName	()Ljava/lang/String;
        //   20: astore_3
        //   21: new 43	java/lang/StringBuilder
        //   24: dup
        //   25: invokespecial 44	java/lang/StringBuilder:<init>	()V
        //   28: astore 4
        //   30: aload 4
        //   32: ldc 46
        //   34: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   37: pop
        //   38: aload 4
        //   40: aload_3
        //   41: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   44: pop
        //   45: aload 4
        //   47: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   50: astore 8
        //   52: goto +34 -> 86
        //   55: new 43	java/lang/StringBuilder
        //   58: dup
        //   59: invokespecial 44	java/lang/StringBuilder:<init>	()V
        //   62: astore 5
        //   64: aload 5
        //   66: ldc 46
        //   68: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   71: pop
        //   72: aload 5
        //   74: aload_3
        //   75: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   78: pop
        //   79: aload 5
        //   81: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   84: astore 8
        //   86: aload_2
        //   87: ldc 55
        //   89: invokevirtual 59	android/content/Intent:setType	(Ljava/lang/String;)Landroid/content/Intent;
        //   92: pop
        //   93: new 43	java/lang/StringBuilder
        //   96: dup
        //   97: invokespecial 44	java/lang/StringBuilder:<init>	()V
        //   100: astore 10
        //   102: aload 10
        //   104: ldc 61
        //   106: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   109: pop
        //   110: aload 10
        //   112: aload 8
        //   114: invokevirtual 50	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   117: pop
        //   118: aload 10
        //   120: invokevirtual 53	java/lang/StringBuilder:toString	()Ljava/lang/String;
        //   123: astore 13
        //   125: aload_2
        //   126: ldc 63
        //   128: ldc 65
        //   130: invokevirtual 69	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   133: pop
        //   134: aload_2
        //   135: ldc 71
        //   137: aload 13
        //   139: invokevirtual 69	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
        //   142: pop
        //   143: aload_0
        //   144: getfield 17	com/rocks/enemytest/EnemyActivity$9:this$0	Lcom/rocks/enemytest/EnemyActivity;
        //   147: aload_2
        //   148: ldc 73
        //   150: invokestatic 77	android/content/Intent:createChooser	(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;
        //   153: invokevirtual 81	com/rocks/enemytest/EnemyActivity:startActivity	(Landroid/content/Intent;)V
        //   156: return
        // Local variable table:
        //   start	length	slot	name	signature
        //   0	157	0	this	9
        //   0	157	1	paramAnonymousView	View
        //   9	139	2	localIntent	Intent
        //   20	55	3	str1	String
        //   28	18	4	localStringBuilder1	java.lang.StringBuilder
        //   62	18	5	localStringBuilder2	java.lang.StringBuilder
        //   50	63	8	str2	String
        //   55	1	9	localActivityNotFoundException	android.content.ActivityNotFoundException
        //   100	19	10	localStringBuilder3	java.lang.StringBuilder
        //   123	15	13	str3	String
        // Exception table:
        //   from	to	target	type
        //   21	52	55	android/content/ActivityNotFoundException
      }
    });
    this.calculate.setOnClickListener(new View.OnClickListener()
    {
      public void onClick(View paramAnonymousView)
      {
        EnemyActivity.this.closeKeyboard();
        String str1 = EnemyActivity.this.nameText.getEditText().getText().toString().trim();
        String str2 = EnemyActivity.this.enemyNameText.getEditText().getText().toString().trim();
        if (TextUtils.isEmpty(str1))
        {
          EnemyActivity.this.nameText.requestFocus();
          EnemyActivity.this.nameText.setErrorEnabled(true);
        }
        else
        {
          EnemyActivity.this.nameText.setError(null);
          EnemyActivity.this.nameText.setErrorEnabled(false);
        }
        if (TextUtils.isEmpty(str2))
        {
          EnemyActivity.this.enemyNameText.requestFocus();
          EnemyActivity.this.enemyNameText.setErrorEnabled(true);
        }
        else
        {
          EnemyActivity.this.enemyNameText.setError(null);
          EnemyActivity.this.enemyNameText.setErrorEnabled(false);
        }
        if (EnemyActivity.this.radioGroup1.getCheckedRadioButtonId() <= 0)
        {
          EnemyActivity.this.radioGroup1.requestFocus();
          EnemyActivity.this.male1.setError("Select gender");
          EnemyActivity.this.female1.setError("Select gender");
        }
        if (EnemyActivity.this.radioGroup2.getCheckedRadioButtonId() <= 0)
        {
          EnemyActivity.this.radioGroup2.requestFocus();
          EnemyActivity.this.male2.setError("Select gender");
          EnemyActivity.this.female2.setError("Select gender");
        }
        if ((EnemyActivity.this.radioGroup1.getCheckedRadioButtonId() > 0) && (EnemyActivity.this.radioGroup2.getCheckedRadioButtonId() > 0) && (!str1.isEmpty()) && (!str2.isEmpty()))
        {
          if (EnemyActivity.this.mInterstitialAd.isLoaded())
          {
            EnemyActivity.this.mInterstitialAd.show();
          }
          else
          {
            Intent localIntent = new Intent(EnemyActivity.this, EnemyTestMCQ1.class);
            localIntent.putExtra("name", str1);
            localIntent.putExtra("lan", EnemyActivity.this.lan);
            localIntent.putExtra("enemyName", str2);
            EnemyActivity.this.startActivity(localIntent);
          }
          EnemyActivity.this.mInterstitialAd.setAdListener(new AdListener()
          {
            public void onAdClicked() {}
            
            public void onAdClosed()
            {
              String str1 = EnemyActivity.this.nameText.getEditText().getText().toString().trim();
              String str2 = EnemyActivity.this.enemyNameText.getEditText().getText().toString().trim();
              Intent localIntent = new Intent(EnemyActivity.this, EnemyTestMCQ1.class);
              localIntent.putExtra("name", str1);
              localIntent.putExtra("lan", EnemyActivity.this.lan);
              localIntent.putExtra("enemyName", str2);
              EnemyActivity.this.startActivity(localIntent);
            }
            
            public void onAdFailedToLoad(int paramAnonymous2Int) {}
            
            public void onAdLeftApplication() {}
            
            public void onAdLoaded() {}
            
            public void onAdOpened() {}
          });
        }
      }
    });
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.EnemyActivity
 * JD-Core Version:    0.7.0.1
 */