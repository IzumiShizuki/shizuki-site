package com.tencent.bugly.crashreport.common.info;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class PlugInBean implements Parcelable {
    public static final Parcelable.Creator<PlugInBean> CREATOR = new android.support.v4.media.a(25);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4562c;

    public PlugInBean(String str, String str2, String str3) {
        this.f4560a = str;
        this.f4561b = str2;
        this.f4562c = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "plid:" + this.f4560a + " plV:" + this.f4561b + " plUUID:" + this.f4562c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4560a);
        parcel.writeString(this.f4561b);
        parcel.writeString(this.f4562c);
    }

    public PlugInBean(Parcel parcel) {
        this.f4560a = parcel.readString();
        this.f4561b = parcel.readString();
        this.f4562c = parcel.readString();
    }
}
