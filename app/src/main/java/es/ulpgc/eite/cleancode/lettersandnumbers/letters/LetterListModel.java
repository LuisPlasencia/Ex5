package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

public class LetterListModel implements LetterListContract.Model {

  public static String TAG = LetterListModel.class.getSimpleName();

  private String data;

  public LetterListModel(String data) {
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
    // Log.e(TAG, "onDataFromPreviousScreen()");
    this.data = data;
  }
}
