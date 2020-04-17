package es.ulpgc.eite.cleancode.lettersandnumbers.app;

import android.app.Application;

import es.ulpgc.eite.cleancode.lettersandnumbers.letters.LetterListState;
import es.ulpgc.eite.cleancode.lettersandnumbers.numbers.NumberListState;

public class AppMediator extends Application {

  private LetterListState letterListState;
  private NumberListState numberListState;

  private NumbersToLettersState numbersToLettersState;
  private LettersToNumbersState lettersToNumbersState;

  @Override
  public void onCreate() {
    super.onCreate();

    numberListState = new NumberListState();
    letterListState = new LetterListState();
  }

  public LetterListState getLetterListState() {
    return letterListState;
  }

  public NumberListState getNumberListState() {
    return numberListState;
  }

  public void setPreviousNumberListScreenState(NumbersToLettersState state) {
    numbersToLettersState=state;
  }

  public LettersToNumbersState getPreviousNumberListScreenState() {
    LettersToNumbersState state=lettersToNumbersState;
    lettersToNumbersState=null;
    return state;
  }

  public void setNextLetterListScreenState(LettersToNumbersState state) {
    lettersToNumbersState=state;
  }

  public NumbersToLettersState getNextLetterListScreenState() {
    NumbersToLettersState state=numbersToLettersState;
    numbersToLettersState=null;
    return state;
  }
}
