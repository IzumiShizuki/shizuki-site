package com.tencent.bugly.crashreport.common.strategy;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.tencent.bugly.proguard.ca;
import j2.h0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class StrategyBean implements Parcelable {
    public static final Parcelable.Creator<StrategyBean> CREATOR = new a(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f4617a = "https://android.bugly.qq.com/rqd/async";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f4618b = "https://android.bugly.qq.com/rqd/async";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f4619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f4620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f4622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f4623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f4624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f4625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4630n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4631o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f4632p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f4633q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f4634r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f4635s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Map<String, String> f4636t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4637u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f4638v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f4639w;

    public StrategyBean() {
        this.f4620d = -1L;
        this.f4621e = -1L;
        this.f4622f = true;
        this.f4623g = true;
        this.f4624h = true;
        this.f4625i = true;
        this.f4626j = false;
        this.f4627k = true;
        this.f4628l = true;
        this.f4629m = true;
        this.f4630n = true;
        this.f4632p = 30000L;
        this.f4633q = f4617a;
        this.f4634r = f4618b;
        this.f4637u = 10;
        this.f4638v = 300000L;
        this.f4639w = -1L;
        this.f4621e = System.currentTimeMillis();
        StringBuilder sbP = h0.p("S(@L@L@)");
        f4619c = sbP.toString();
        sbP.setLength(0);
        sbP.append("*^");
        sbP.append("@K#K");
        sbP.append("@!");
        this.f4635s = sbP.toString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f4621e);
        parcel.writeByte(this.f4622f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4623g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4624h ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f4633q);
        parcel.writeString(this.f4634r);
        parcel.writeString(this.f4635s);
        ca.b(parcel, this.f4636t);
        parcel.writeByte(this.f4625i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4626j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4629m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4630n ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f4632p);
        parcel.writeByte(this.f4627k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4628l ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f4631o);
        parcel.writeInt(this.f4637u);
        parcel.writeLong(this.f4638v);
        parcel.writeLong(this.f4639w);
    }

    public StrategyBean(Parcel parcel) {
        this.f4620d = -1L;
        this.f4621e = -1L;
        boolean z10 = true;
        this.f4622f = true;
        this.f4623g = true;
        this.f4624h = true;
        this.f4625i = true;
        this.f4626j = false;
        this.f4627k = true;
        this.f4628l = true;
        this.f4629m = true;
        this.f4630n = true;
        this.f4632p = 30000L;
        this.f4633q = f4617a;
        this.f4634r = f4618b;
        this.f4637u = 10;
        this.f4638v = 300000L;
        this.f4639w = -1L;
        try {
            f4619c = "S(@L@L@)";
            this.f4621e = parcel.readLong();
            this.f4622f = parcel.readByte() == 1;
            this.f4623g = parcel.readByte() == 1;
            this.f4624h = parcel.readByte() == 1;
            this.f4633q = parcel.readString();
            this.f4634r = parcel.readString();
            this.f4635s = parcel.readString();
            this.f4636t = ca.b(parcel);
            this.f4625i = parcel.readByte() == 1;
            this.f4626j = parcel.readByte() == 1;
            this.f4629m = parcel.readByte() == 1;
            this.f4630n = parcel.readByte() == 1;
            this.f4632p = parcel.readLong();
            this.f4627k = parcel.readByte() == 1;
            if (parcel.readByte() != 1) {
                z10 = false;
            }
            this.f4628l = z10;
            this.f4631o = parcel.readLong();
            this.f4637u = parcel.readInt();
            this.f4638v = parcel.readLong();
            this.f4639w = parcel.readLong();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
