package com.charmi.demolibrary.recharge.models;

import android.os.Parcel;
import android.os.Parcelable;

public class RechargeModel implements Parcelable {

    String operatorName;
    String MobileNumber;

    protected RechargeModel(Parcel in) {
        operatorName = in.readString();
        MobileNumber = in.readString();
    }

    public static final Creator<RechargeModel> CREATOR = new Creator<RechargeModel>() {
        @Override
        public RechargeModel createFromParcel(Parcel in) {
            return new RechargeModel(in);
        }

        @Override
        public RechargeModel[] newArray(int size) {
            return new RechargeModel[size];
        }
    };

    public String getOperatorName() {
        return operatorName;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(operatorName);
        dest.writeString(MobileNumber);
    }
}
