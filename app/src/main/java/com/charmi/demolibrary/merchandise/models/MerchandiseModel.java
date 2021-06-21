package com.charmi.demolibrary.merchandise.models;

import android.os.Parcel;
import android.os.Parcelable;

public class MerchandiseModel implements Parcelable {

    String categoryId;
    String productName;

    protected MerchandiseModel(Parcel in) {
        categoryId = in.readString();
        productName = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(categoryId);
        dest.writeString(productName);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<MerchandiseModel> CREATOR = new Creator<MerchandiseModel>() {
        @Override
        public MerchandiseModel createFromParcel(Parcel in) {
            return new MerchandiseModel(in);
        }

        @Override
        public MerchandiseModel[] newArray(int size) {
            return new MerchandiseModel[size];
        }
    };

    public String getCategoryId() {
        return categoryId;
    }

    public String getProductName() {
        return productName;
    }
}
