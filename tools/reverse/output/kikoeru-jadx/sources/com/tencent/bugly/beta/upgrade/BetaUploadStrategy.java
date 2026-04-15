package com.tencent.bugly.beta.upgrade;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.AbstractC0010m;
import com.tencent.bugly.proguard.M;
import com.tencent.bugly.proguard.sa;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class BetaUploadStrategy implements Parcelable, Parcelable.Creator<BetaUploadStrategy> {
    public static final Parcelable.Creator<BetaUploadStrategy> CREATOR = new BetaUploadStrategy();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public sa f4434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4435b;

    public BetaUploadStrategy() {
        sa saVar = new sa();
        this.f4434a = saVar;
        saVar.f5110e = true;
        saVar.f5111f = true;
        String str = StrategyBean.f4617a;
        saVar.f5112g = str;
        saVar.f5113h = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f4434a.f5116k = jCurrentTimeMillis;
        this.f4435b = jCurrentTimeMillis;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeByteArray(M.a((AbstractC0010m) this.f4434a));
        parcel.writeLong(this.f4435b);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public BetaUploadStrategy createFromParcel(Parcel parcel) {
        return new BetaUploadStrategy(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public BetaUploadStrategy[] newArray(int i10) {
        return new BetaUploadStrategy[i10];
    }

    public BetaUploadStrategy(Parcel parcel) {
        this.f4434a = (sa) M.a(parcel.createByteArray(), sa.class);
        this.f4435b = parcel.readLong();
    }
}
