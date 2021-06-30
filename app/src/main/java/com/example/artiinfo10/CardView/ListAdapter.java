package com.example.artiinfo10.CardView;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.artiinfo10.InformacionBasicaSistema;
import com.example.artiinfo10.Municion;
import com.example.artiinfo10.R;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private List<ListElement> mDato;
    private LayoutInflater nInflater;
    private Context context;
    private int c = 0;


    public ListAdapter(List<ListElement> itemList, Context context) {
        this.nInflater = LayoutInflater.from(context);
        this.context = context;
        this.mDato = itemList;

    }

    @Override
    public int getItemCount() {
        return mDato.size();
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = nInflater.inflate(R.layout.list_element, null);
        return new ListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListAdapter.ViewHolder holder, int position) {
        holder.bindData(mDato.get(position));
    }

    public void setItems(List<ListElement> items) {
        mDato = items;
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView iconView;
        CardView cardView;
        TextView tipoDato, dato1, dato2;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            //iconView = itemView.findViewById(R.id.iconView);
            tipoDato = itemView.findViewById(R.id.tipoData);
            cardView = itemView.findViewById(R.id.cvMenu);
            cardView.setId(c++);
            cardView.setOnClickListener(this);
        }

        void bindData(final ListElement item) {
            //  iconView.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            tipoDato.setText(item.tipoDato);

        }

        @Override
        public void onClick(View v) {
            CardView cardView = (CardView) v;
            switch (cardView.getId()) {
                case 0: {
                    Intent intent = new Intent(v.getContext(), InformacionBasicaSistema.class);
                    v.getContext().startActivity(intent);
                }
                break;
                case 2: {
                    Intent intent = new Intent(v.getContext(), Municion.class);
                    v.getContext().startActivity(intent);
                }
                break;
            }


        }
    }
}
