package m4;

import android.net.Uri;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f14170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f14171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f14172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f14173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f14174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f14175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f14176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f14177p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f14178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f14179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f14180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f14181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f14182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f14183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ya.i0 f14184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f14185h;

    static {
        int i10 = p4.c0.f16548a;
        f14170i = Integer.toString(0, 36);
        f14171j = Integer.toString(1, 36);
        f14172k = Integer.toString(2, 36);
        f14173l = Integer.toString(3, 36);
        f14174m = Integer.toString(4, 36);
        f14175n = Integer.toString(5, 36);
        f14176o = Integer.toString(6, 36);
        f14177p = Integer.toString(7, 36);
    }

    public d0(Uri uri, String str, a0 a0Var, v vVar, List list, String str2, ya.i0 i0Var, long j10) {
        this.f14178a = uri;
        this.f14179b = o0.p(str);
        this.f14180c = a0Var;
        this.f14181d = vVar;
        this.f14182e = list;
        this.f14183f = str2;
        this.f14184g = i0Var;
        ya.f0 f0VarP = ya.i0.p();
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            h0 h0Var = (h0) i0Var.get(i10);
            g0 g0Var = new g0();
            g0Var.f14213a = h0Var.f14245a;
            g0Var.f14214b = h0Var.f14246b;
            g0Var.f14215c = h0Var.f14247c;
            g0Var.f14216d = h0Var.f14248d;
            g0Var.f14217e = h0Var.f14249e;
            g0Var.f14218f = h0Var.f14250f;
            g0Var.f14219g = h0Var.f14251g;
            f0VarP.a(new f0(g0Var));
        }
        f0VarP.f();
        this.f14185h = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (!this.f14178a.equals(d0Var.f14178a)) {
            return false;
        }
        String str = d0Var.f14179b;
        int i10 = p4.c0.f16548a;
        return Objects.equals(this.f14179b, str) && Objects.equals(this.f14180c, d0Var.f14180c) && Objects.equals(this.f14181d, d0Var.f14181d) && this.f14182e.equals(d0Var.f14182e) && Objects.equals(this.f14183f, d0Var.f14183f) && this.f14184g.equals(d0Var.f14184g) && Long.valueOf(this.f14185h).equals(Long.valueOf(d0Var.f14185h));
    }

    public final int hashCode() {
        int iHashCode = this.f14178a.hashCode() * 31;
        String str = this.f14179b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        a0 a0Var = this.f14180c;
        int iHashCode3 = (iHashCode2 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        v vVar = this.f14181d;
        int iHashCode4 = (this.f14182e.hashCode() + ((iHashCode3 + (vVar == null ? 0 : vVar.hashCode())) * 31)) * 31;
        String str2 = this.f14183f;
        return (int) ((((long) ((this.f14184g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.f14185h);
    }
}
