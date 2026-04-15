package com.tencent.bugly.beta.upgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.proguard.AbstractC0010m;
import com.tencent.bugly.proguard.B;
import com.tencent.bugly.proguard.M;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class BetaGrayStrategy implements Parcelable, Parcelable.Creator<BetaGrayStrategy> {
    public static final Parcelable.Creator<BetaGrayStrategy> CREATOR = new BetaGrayStrategy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public B f4429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4431c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4432d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4433e;

    public BetaGrayStrategy(Parcel parcel) {
        this.f4430b = 0;
        this.f4431c = -1L;
        this.f4432d = false;
        this.f4433e = -1L;
        this.f4429a = (B) M.a(parcel.createByteArray(), B.class);
        this.f4430b = parcel.readInt();
        this.f4431c = parcel.readLong();
        this.f4432d = 1 == parcel.readByte();
        this.f4433e = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(M.a((AbstractC0010m) this.f4429a));
        parcel.writeInt(this.f4430b);
        parcel.writeLong(this.f4431c);
        parcel.writeByte(this.f4432d ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f4433e);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public BetaGrayStrategy createFromParcel(Parcel parcel) {
        return new BetaGrayStrategy(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public BetaGrayStrategy[] newArray(int i10) {
        return new BetaGrayStrategy[i10];
    }

    public BetaGrayStrategy() {
        this.f4430b = 0;
        this.f4431c = -1L;
        this.f4432d = false;
        this.f4433e = -1L;
    }
}
