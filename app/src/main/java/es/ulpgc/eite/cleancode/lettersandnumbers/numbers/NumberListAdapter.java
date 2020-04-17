package es.ulpgc.eite.cleancode.lettersandnumbers.numbers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

import es.ulpgc.eite.cleancode.lettersandnumbers.R;
import es.ulpgc.eite.cleancode.lettersandnumbers.data.NumberData;


public class NumberListAdapter extends ArrayAdapter<NumberData> {

  private final List<NumberData> itemList;
  private final View.OnClickListener clickListener;


  public NumberListAdapter(
      Context ctx, List<NumberData> items, View.OnClickListener listener) {

    super(ctx, 0, items);

    itemList = items;
    clickListener = listener;
  }


  @Override
  public int getCount() {
    return itemList.size();
  }

  @Override
  public NumberData getItem(int position) {
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
    NumberData data = itemList.get(position);
    contentView.setText(String.valueOf(data));

    return itemView;
  }


}
