package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import android.util.Log;

public class NumberListModel implements NumberListContract.Model {

  public static String TAG = NumberListModel.class.getSimpleName();

  private String data;

  public NumberListModel(String data) {
    this.data = data;
  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");
    this.data = data;
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
    this.data = data;
  }

  @Override
  public void onDataFromPreviousScreen(String data) {
     Log.e(TAG, "onDataFromPreviousScreen()");
     this.data = data;
  }
}
