package com.tencent.bugly.crashreport.crash;

import android.os.Parcel;
import android.os.Parcelable;
import com.tencent.bugly.crashreport.common.info.PlugInBean;
import com.tencent.bugly.proguard.ca;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class CrashDetailBean implements Parcelable, Comparable<CrashDetailBean> {
    public static final Parcelable.Creator<CrashDetailBean> CREATOR = new android.support.v4.media.a(16);
    public String A;
    public String B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public long N;
    public boolean O;
    public Map<String, String> P;
    public Map<String, String> Q;
    public int R;
    public int S;
    public Map<String, String> T;
    public Map<String, String> U;
    public byte[] V;
    public String W;
    public String X;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f4655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f4656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f4657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f4658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map<String, PlugInBean> f4660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Map<String, PlugInBean> f4661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f4662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f4663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f4664l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f4665m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f4666n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f4667o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f4668p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f4669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f4670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f4671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4672t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f4673u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f4674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f4675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f4676x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte[] f4677y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Map<String, String> f4678z;

    public CrashDetailBean() {
        this.f4653a = -1L;
        this.f4654b = 0;
        this.f4655c = UUID.randomUUID().toString();
        this.f4656d = false;
        this.f4657e = "";
        this.f4658f = "";
        this.f4659g = "";
        this.f4660h = null;
        this.f4661i = null;
        this.f4662j = false;
        this.f4663k = false;
        this.f4664l = 0;
        this.f4665m = "";
        this.f4666n = "";
        this.f4667o = "";
        this.f4668p = "";
        this.f4669q = "";
        this.f4670r = -1L;
        this.f4671s = null;
        this.f4672t = 0;
        this.f4673u = "";
        this.f4674v = "";
        this.f4675w = null;
        this.f4676x = null;
        this.f4677y = null;
        this.f4678z = null;
        this.A = "";
        this.B = "";
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = "";
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = -1L;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = -1;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(CrashDetailBean crashDetailBean) {
        if (crashDetailBean == null) {
            return 1;
        }
        long j10 = this.f4670r - crashDetailBean.f4670r;
        if (j10 > 0) {
            return 1;
        }
        return j10 < 0 ? -1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f4654b);
        parcel.writeString(this.f4655c);
        parcel.writeByte(this.f4656d ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f4657e);
        parcel.writeString(this.f4658f);
        parcel.writeString(this.f4659g);
        parcel.writeByte(this.f4662j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f4663k ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f4664l);
        parcel.writeString(this.f4665m);
        parcel.writeString(this.f4666n);
        parcel.writeString(this.f4667o);
        parcel.writeString(this.f4668p);
        parcel.writeString(this.f4669q);
        parcel.writeLong(this.f4670r);
        parcel.writeString(this.f4671s);
        parcel.writeInt(this.f4672t);
        parcel.writeString(this.f4673u);
        parcel.writeString(this.f4674v);
        parcel.writeString(this.f4675w);
        ca.b(parcel, this.f4678z);
        parcel.writeString(this.A);
        parcel.writeString(this.B);
        parcel.writeLong(this.C);
        parcel.writeLong(this.D);
        parcel.writeLong(this.E);
        parcel.writeLong(this.F);
        parcel.writeLong(this.G);
        parcel.writeLong(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeLong(this.N);
        parcel.writeByte(this.O ? (byte) 1 : (byte) 0);
        ca.b(parcel, this.P);
        ca.a(parcel, this.f4660h);
        ca.a(parcel, this.f4661i);
        parcel.writeInt(this.R);
        parcel.writeInt(this.S);
        ca.b(parcel, this.T);
        ca.b(parcel, this.U);
        parcel.writeByteArray(this.V);
        parcel.writeByteArray(this.f4677y);
        parcel.writeString(this.W);
        parcel.writeString(this.X);
        parcel.writeString(this.f4676x);
    }

    public CrashDetailBean(Parcel parcel) {
        this.f4653a = -1L;
        this.f4654b = 0;
        this.f4655c = UUID.randomUUID().toString();
        this.f4656d = false;
        this.f4657e = "";
        this.f4658f = "";
        this.f4659g = "";
        this.f4660h = null;
        this.f4661i = null;
        this.f4662j = false;
        this.f4663k = false;
        this.f4664l = 0;
        this.f4665m = "";
        this.f4666n = "";
        this.f4667o = "";
        this.f4668p = "";
        this.f4669q = "";
        this.f4670r = -1L;
        this.f4671s = null;
        this.f4672t = 0;
        this.f4673u = "";
        this.f4674v = "";
        this.f4675w = null;
        this.f4676x = null;
        this.f4677y = null;
        this.f4678z = null;
        this.A = "";
        this.B = "";
        this.C = -1L;
        this.D = -1L;
        this.E = -1L;
        this.F = -1L;
        this.G = -1L;
        this.H = -1L;
        this.I = "";
        this.J = "";
        this.K = "";
        this.L = "";
        this.M = "";
        this.N = -1L;
        this.O = false;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = -1;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = null;
        this.X = null;
        this.f4654b = parcel.readInt();
        this.f4655c = parcel.readString();
        this.f4656d = parcel.readByte() == 1;
        this.f4657e = parcel.readString();
        this.f4658f = parcel.readString();
        this.f4659g = parcel.readString();
        this.f4662j = parcel.readByte() == 1;
        this.f4663k = parcel.readByte() == 1;
        this.f4664l = parcel.readInt();
        this.f4665m = parcel.readString();
        this.f4666n = parcel.readString();
        this.f4667o = parcel.readString();
        this.f4668p = parcel.readString();
        this.f4669q = parcel.readString();
        this.f4670r = parcel.readLong();
        this.f4671s = parcel.readString();
        this.f4672t = parcel.readInt();
        this.f4673u = parcel.readString();
        this.f4674v = parcel.readString();
        this.f4675w = parcel.readString();
        this.f4678z = ca.b(parcel);
        this.A = parcel.readString();
        this.B = parcel.readString();
        this.C = parcel.readLong();
        this.D = parcel.readLong();
        this.E = parcel.readLong();
        this.F = parcel.readLong();
        this.G = parcel.readLong();
        this.H = parcel.readLong();
        this.I = parcel.readString();
        this.J = parcel.readString();
        this.K = parcel.readString();
        this.L = parcel.readString();
        this.M = parcel.readString();
        this.N = parcel.readLong();
        this.O = parcel.readByte() == 1;
        this.P = ca.b(parcel);
        this.f4660h = ca.a(parcel);
        this.f4661i = ca.a(parcel);
        this.R = parcel.readInt();
        this.S = parcel.readInt();
        this.T = ca.b(parcel);
        this.U = ca.b(parcel);
        this.V = parcel.createByteArray();
        this.f4677y = parcel.createByteArray();
        this.W = parcel.readString();
        this.X = parcel.readString();
        this.f4676x = parcel.readString();
    }
}
