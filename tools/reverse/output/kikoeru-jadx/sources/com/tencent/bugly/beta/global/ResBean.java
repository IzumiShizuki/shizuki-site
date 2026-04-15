package com.tencent.bugly.beta.global;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class ResBean implements Parcelable, Parcelable.Creator<ResBean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static ResBean f4369a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, String> f4371c = new ConcurrentHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4372d = "#273238";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4373e = "#757575";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f4370b = {"IMG_title", "VAL_style", "tacticsSource", "h5"};
    public static final Parcelable.Creator<ResBean> CREATOR = new ResBean();

    public ResBean() {
    }

    public String a(String str) {
        return this.f4371c.get(str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        for (String str : f4370b) {
            parcel.writeString(this.f4371c.get(str));
        }
    }

    public void a(String str, Object obj) {
        if (obj instanceof String) {
            this.f4371c.put(str, (String) obj);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ResBean createFromParcel(Parcel parcel) {
        return new ResBean(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ResBean[] newArray(int i10) {
        return new ResBean[0];
    }

    public ResBean(Parcel parcel) {
        try {
            for (String str : f4370b) {
                this.f4371c.put(str, parcel.readString());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
