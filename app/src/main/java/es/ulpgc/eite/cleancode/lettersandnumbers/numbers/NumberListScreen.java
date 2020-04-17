package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.cleancode.lettersandnumbers.R;
import es.ulpgc.eite.cleancode.lettersandnumbers.app.AppMediator;

public class NumberListScreen {

  public static void configure(NumberListContract.View view) {

    WeakReference<FragmentActivity> context =
        new WeakReference<>((FragmentActivity) view);

    String data = context.get().getString(R.string.app_name);

    AppMediator mediator = (AppMediator) context.get().getApplication();
    NumberListState state = mediator.getNumberListState();

    NumberListContract.Router router = new NumberListRouter(mediator);
    NumberListContract.Presenter presenter = new NumberListPresenter(state);
    NumberListContract.Model model = new NumberListModel(data);
    presenter.injectModel(model);
    presenter.injectRouter(router);
    presenter.injectView(new WeakReference<>(view));

    view.injectPresenter(presenter);

  }
}
