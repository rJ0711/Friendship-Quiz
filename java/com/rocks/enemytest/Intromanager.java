package com.rocks.enemytest;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

class Intromanager
{
  Context context;
  SharedPreferences.Editor editor;
  SharedPreferences sharedPreferences;
  
  public Intromanager(Context paramContext)
  {
    this.context = paramContext;
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("first", 0);
    this.sharedPreferences = localSharedPreferences;
    this.editor = localSharedPreferences.edit();
  }
  
  public boolean check()
  {
    return this.sharedPreferences.getBoolean("check", true);
  }
  
  public void setFirst(Boolean paramBoolean)
  {
    this.editor.putBoolean("check", paramBoolean.booleanValue());
    this.editor.commit();
  }
}


/* Location:           P:\dex2jar-0.0.9.15\classes_dex2jar.jar
 * Qualified Name:     com.rocks.enemytest.Intromanager
 * JD-Core Version:    0.7.0.1
 */