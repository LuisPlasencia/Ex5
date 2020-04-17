package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.lettersandnumbers.app.LettersToNumbersState;
import es.ulpgc.eite.cleancode.lettersandnumbers.app.NumbersToLettersState;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public interface NumberListContract {

  interface View {
    void injectPresenter(Presenter presenter);

    void onDataUpdated(NumberListViewModel viewModel);
  }

  interface Presenter {
    void injectView(WeakReference<View> view);


    void injectModel(Model model);

    void injectRouter(Router router);

    void onResume();

    void onStart();

    void onRestart();

    void onBackPressed();

    void onPause();

    void onDestroy();

    void onClickNumberListCell(NumberData data);

    void onClickNumberListButton();
  }

  interface Model {
    String getStoredData();

    void onDataFromNextScreen(String data);

    void onRestartScreen(String data);

    void onDataFromPreviousScreen(String data);
  }

  interface Router {
    //void navigateToNextScreen();

    //void passStateToNextScreen(NumberListState state);

    LettersToNumbersState getStateFromPreviousScreen();

    //NumberListState getStateFromNextScreen();

    void passStateToPreviousScreen(NumbersToLettersState state);
  }
}
