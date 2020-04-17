package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import android.util.Log;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

import es.ulpgc.eite.cleancode.lettersandnumbers.app.LettersToNumbersState;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public class NumberListPresenter implements NumberListContract.Presenter {

  public static String TAG = NumberListPresenter.class.getSimpleName();

  private WeakReference<NumberListContract.View> view;
  private NumberListState state;
  private NumberListContract.Model model;
  private NumberListContract.Router router;

  public NumberListPresenter(NumberListState state) {
    this.state = state;
  }

  @Override
  public void onStart() {
    // Log.e(TAG, "onStart()");

    // initialize the state if is necessary
    if (state == null) {
      state = new NumberListState();
    }

    // use passed state if is necessary
    LettersToNumbersState savedState = router.getStateFromPreviousScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.onDataFromPreviousScreen(savedState.data);
    }

  }

  @Override
  public void onRestart() {
    // Log.e(TAG, "onRestart()");

    // update the model if is necessary
    model.onRestartScreen(state.data);
  }

  @Override
  public void onResume() {
    // Log.e(TAG, "onResume()");

    /*
    // use passed state if is necessary
    NumberListState savedState = router.getStateFromNextScreen();
    if (savedState != null) {

      // update the model if is necessary
      model.onDataFromNextScreen(savedState.data);
    }
    */

    // call the model and update the state
    state.data = model.getStoredData();
    state.datasource = new ArrayList<>();

    // update the view
    view.get().onDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    // Log.e(TAG, "onBackPressed()");
  }

  @Override
  public void onPause() {
    model.onDataFromNextScreen(state.data);
    // Log.e(TAG, "onPause()");
  }

  @Override
  public void onDestroy() {
    // Log.e(TAG, "onDestroy()");
  }

  @Override
  public void onClickNumberListCell(NumberData data) {
     Log.e(TAG, "onClickNumberListCell()");
  }

  @Override
  public void onClickNumberListButton() {
     Log.e(TAG, "onClickNumberListButton()");
     NumberData numero = new NumberData();
     numero.number = state.number;
     numero.id = state.id;
     state.id ++;
     state.number++;

     state.datasource.add(numero);
     view.get().onDataUpdated(state);
  }

  @Override
  public void injectView(WeakReference<NumberListContract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(NumberListContract.Model model) {
    this.model = model;
  }

  @Override
  public void injectRouter(NumberListContract.Router router) {
    this.router = router;
  }
}
