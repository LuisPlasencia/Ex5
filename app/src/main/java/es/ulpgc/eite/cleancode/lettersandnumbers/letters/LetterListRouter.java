package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import android.content.Context;
import android.content.Intent;

import es.ulpgc.eite.cleancode.lettersandnumbers.app.AppMediator;
import es.ulpgc.eite.cleancode.lettersandnumbers.app.LettersToNumbersState;
import es.ulpgc.eite.cleancode.lettersandnumbers.app.NumbersToLettersState;

public class LetterListRouter implements LetterListContract.Router {

  public static String TAG = LetterListRouter.class.getSimpleName();

  private AppMediator mediator;

  public LetterListRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void navigateToNextScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, LetterListActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
  }

  @Override
  public void passStateToNextScreen(LettersToNumbersState state) {
    mediator.setNextLetterListScreenState(state);
  }

  /*
  @Override
  public void passStateToPreviousScreen(LetterListState state) {
    mediator.setPreviousLetterListScreenState(state);
  }

  @Override
  public LetterListState getStateFromPreviousScreen() {
    return mediator.getPreviousLetterListScreenState();
  }
  */

  @Override
  public NumbersToLettersState getStateFromNextScreen() {
    return mediator.getNextLetterListScreenState();
  }
}
