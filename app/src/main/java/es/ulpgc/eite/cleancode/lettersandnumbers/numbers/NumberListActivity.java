package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import es.ulpgc.eite.cleancode.lettersandnumbers.R;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;

public class NumberListActivity
    extends AppCompatActivity implements NumberListContract.View {

  public static String TAG = NumberListActivity.class.getSimpleName();

  private NumberListContract.Presenter presenter;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_number_list);
    getSupportActionBar().setTitle(R.string.numbers_title);

    // do the setup
    NumberListScreen.configure(this);

    if (savedInstanceState == null) {
      presenter.onStart();

    } else {
      presenter.onRestart();
    }
  }

  @Override
  protected void onResume() {
    super.onResume();

    // load the data
    presenter.onResume();
  }

  @Override
  public void onBackPressed() {
    super.onBackPressed();

    presenter.onBackPressed();
  }

  @Override
  protected void onPause() {
    super.onPause();

    presenter.onPause();
  }

  @Override
  protected void onDestroy() {
    super.onDestroy();

    presenter.onDestroy();
  }


  public void onClickNumberListButton(View view) {
    presenter.onClickNumberListButton();
  }

  @Override
  public void onDataUpdated(NumberListViewModel vm) {
    //Log.e(TAG, "onDataUpdated()");


    // deal with the datasource
    ((ListView) findViewById(R.id.numberList)).setAdapter(
        new NumberListAdapter(this,vm.datasource,new View.OnClickListener() {

          @Override
          public void onClick(View view) {
            NumberData data = (NumberData) view.getTag();
            presenter.onClickNumberListCell(data);
          }
        })
    );
  }

  @Override
  public void injectPresenter(NumberListContract.Presenter presenter) {
    this.presenter = presenter;
  }

}
