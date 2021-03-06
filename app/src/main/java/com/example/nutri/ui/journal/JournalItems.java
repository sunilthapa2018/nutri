package com.example.nutri.ui.journal;

import com.example.nutri.Database.Journal.Journal;

import java.util.ArrayList;

public class JournalItems {
    private ArrayList<Journal> dataList;

    public JournalItems(ArrayList<Journal> dataList) {
        this.dataList = dataList;
    }

    public ArrayList<Journal> getParsedList() {
        return dataList;
    }

    public void setParsedList(ArrayList<Journal> dataList) {
        this.dataList = dataList;
    }

    public int getItemCount() {
        return dataList.size();
    }
}
