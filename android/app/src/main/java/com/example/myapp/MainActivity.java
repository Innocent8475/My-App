package com.example.myapp;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.graphics.Color;

import com.getcapacitor.BridgeActivity;

public class MainActivity extends BridgeActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
      Window window = getWindow();
      window.setNavigationBarColor(Color.parseColor("#ffffff")); // white nav bar
      window.setStatusBarColor(Color.parseColor("#ffffff"));     // white status bar
    }

    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
      // Force dark icons on status bar
      Window window = getWindow();
      View decor = window.getDecorView();
      decor.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
    }
  }
}
