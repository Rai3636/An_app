package com.example.inputlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class WordAdapter extends RecyclerView.Adapter<WordAdapter.WordViewHolder> {

    private List<String> words;

    public WordAdapter(List<String> words) {
        this.words = words;
    }

    static class WordViewHolder extends RecyclerView.ViewHolder {
        TextView wordTextView;

        WordViewHolder(View itemView) {
            super(itemView);
            wordTextView = itemView.findViewById(R.id.wordTextView);
        }
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_word, parent, false);
        return new WordViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String currentWord = words.get(position);
        String word = currentWord.trim().substring(0, 1).toUpperCase() + currentWord.trim().substring(1).toLowerCase();
        holder.wordTextView.setText(word);
    }

    @Override
    public int getItemCount() {
        return words.size();
    }
}
