package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.data.LetterData;

public class LetterListViewModel {

  // put the view state here
  public String data;
  public List<LetterData> datasource;

  public LetterListViewModel() {
    datasource = new ArrayList<>();
  }
}
