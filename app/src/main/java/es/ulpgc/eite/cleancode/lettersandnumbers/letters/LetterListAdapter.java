package es.ulpgc.eite.cleancode.lettersandnumbers.letters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.R;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.LetterData;


public class LetterListAdapter extends ArrayAdapter<LetterData> {

  private final List<LetterData> itemList;
  private final View.OnClickListener clickListener;


  public LetterListAdapter(
      Context ctx, List<LetterData> items, View.OnClickListener listener) {

    super(ctx, 0, items);

    itemList = items;
    clickListener = listener;
  }


  @Override
  public int getCount() {
    return itemList.size();
  }

  @Override
  public LetterData getItem(int position) {
    return itemList.get(position);
  }


  @Override
  public long getItemId(int position) {
    return getItem(position).id;
  }

  @Override
  public View getView(int position, View convertView, ViewGroup parent) {
    View itemView = convertView;

    if (itemView == null) {
      itemView = LayoutInflater
          .from(parent.getContext())
          .inflate(R.layout.cell_list, parent, false);
    }

    itemView.setTag(itemList.get(position));
    itemView.setOnClickListener(clickListener);

    final TextView contentView = itemView.findViewById(R.id.value);
    LetterData data = itemList.get(position);
    contentView.setText(String.valueOf(data));

    return itemView;
  }


}
