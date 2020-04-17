package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import es.ulpgc.eite.cleancode.lettersandnumbers.app.AppMediator;
import es.ulpgc.eite.cleancode.lettersandnumbers.app.LettersToNumbersState;
import es.ulpgc.eite.cleancode.lettersandnumbers.app.NumbersToLettersState;

public class NumberListRouter implements NumberListContract.Router {

  public static String TAG = NumberListRouter.class.getSimpleName();

  private AppMediator mediator;

  public NumberListRouter(AppMediator mediator) {
    this.mediator = mediator;
  }

  /*
  @Override
  public void navigateToNextScreen() {
    Context context = mediator.getApplicationContext();
    Intent intent = new Intent(context, NumberListActivity.class);
    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    context.startActivity(intent);
  }

  @Override
  public void passStateToNextScreen(NumberListState state) {
    mediator.setNextNumberListScreenState(state);
  }


  @Override
  public NumberListState getStateFromNextScreen() {
    return mediator.getNextNumberListScreenState();
  }
  */

  @Override
  public void passStateToPreviousScreen(NumbersToLettersState state) {
    mediator.setPreviousNumberListScreenState(state);
  }

  @Override
  public LettersToNumbersState getStateFromPreviousScreen() {
    return mediator.getPreviousNumberListScreenState();
  }

}
