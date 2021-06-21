package com.charmi.demolibrary.gift.models;

import android.os.Parcel;
import android.os.Parcelable;

public class GIftModel implements Parcelable {

    String giftName;

    protected GIftModel(Parcel in) {
        giftName = in.readString();
    }

    public static final Creator<GIftModel> CREATOR = new Creator<GIftModel>() {
        @Override
        public GIftModel createFromParcel(Parcel in) {
            return new GIftModel(in);
        }

        @Override
        public GIftModel[] newArray(int size) {
            return new GIftModel[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(giftName);
    }
}
