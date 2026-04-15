package com.tencent.bugly.crashreport.biz;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import com.tencent.bugly.proguard.ca;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class UserInfoBean implements Parcelable {
    public static final Parcelable.Creator<UserInfoBean> CREATOR = new a(24);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4522b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4523c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f4524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f4525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f4526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f4527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f4528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f4529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f4530j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f4531k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4532l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4533m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f4534n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4535o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4536p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f4537q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Map<String, String> f4538r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Map<String, String> f4539s;

    public UserInfoBean() {
        this.f4531k = 0L;
        this.f4532l = false;
        this.f4533m = "unknown";
        this.f4536p = -1;
        this.f4537q = -1;
        this.f4538r = null;
        this.f4539s = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4522b);
        parcel.writeString(this.f4523c);
        parcel.writeString(this.f4524d);
        parcel.writeLong(this.f4525e);
        parcel.writeLong(this.f4526f);
        parcel.writeLong(this.f4527g);
        parcel.writeLong(this.f4528h);
        parcel.writeLong(this.f4529i);
        parcel.writeString(this.f4530j);
        parcel.writeLong(this.f4531k);
        parcel.writeByte(this.f4532l ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f4533m);
        parcel.writeInt(this.f4536p);
        parcel.writeInt(this.f4537q);
        ca.b(parcel, this.f4538r);
        ca.b(parcel, this.f4539s);
        parcel.writeString(this.f4534n);
        parcel.writeInt(this.f4535o);
    }

    public UserInfoBean(Parcel parcel) {
        this.f4531k = 0L;
        this.f4532l = false;
        this.f4533m = "unknown";
        this.f4536p = -1;
        this.f4537q = -1;
        this.f4538r = null;
        this.f4539s = null;
        this.f4522b = parcel.readInt();
        this.f4523c = parcel.readString();
        this.f4524d = parcel.readString();
        this.f4525e = parcel.readLong();
        this.f4526f = parcel.readLong();
        this.f4527g = parcel.readLong();
        this.f4528h = parcel.readLong();
        this.f4529i = parcel.readLong();
        this.f4530j = parcel.readString();
        this.f4531k = parcel.readLong();
        this.f4532l = parcel.readByte() == 1;
        this.f4533m = parcel.readString();
        this.f4536p = parcel.readInt();
        this.f4537q = parcel.readInt();
        this.f4538r = ca.b(parcel);
        this.f4539s = ca.b(parcel);
        this.f4534n = parcel.readString();
        this.f4535o = parcel.readInt();
    }
}
