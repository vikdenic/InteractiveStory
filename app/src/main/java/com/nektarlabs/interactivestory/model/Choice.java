package com.nektarlabs.interactivestory.model;

/**
 * Created by viktordenic on 8/30/15.
 */
public class Choice {
    private String mText;
    private int mNextPage;

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public int getNextPage() {
        return mNextPage;
    }

    public void setNextPage(int nextPage) {
        mNextPage = nextPage;
    }
}
