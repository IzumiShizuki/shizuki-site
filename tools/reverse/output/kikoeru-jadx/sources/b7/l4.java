package b7;

import android.content.ComponentName;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class l4 implements j4 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1937k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1938l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1939m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f1940n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f1941o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f1942p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f1943q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f1944r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f1945s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f1946t;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f1952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ComponentName f1953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IBinder f1954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bundle f1955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MediaSession.Token f1956j;

    static {
        int i10 = p4.c0.f16548a;
        f1937k = Integer.toString(0, 36);
        f1938l = Integer.toString(1, 36);
        f1939m = Integer.toString(2, 36);
        f1940n = Integer.toString(3, 36);
        f1941o = Integer.toString(4, 36);
        f1942p = Integer.toString(5, 36);
        f1943q = Integer.toString(6, 36);
        f1944r = Integer.toString(7, 36);
        f1945s = Integer.toString(8, 36);
        f1946t = Integer.toString(9, 36);
    }

    public l4(int i10, int i11, int i12, int i13, String str, String str2, ComponentName componentName, IBinder iBinder, Bundle bundle, MediaSession.Token token) {
        this.f1947a = i10;
        this.f1948b = i11;
        this.f1949c = i12;
        this.f1950d = i13;
        this.f1951e = str;
        this.f1952f = str2;
        this.f1953g = componentName;
        this.f1954h = iBinder;
        this.f1955i = bundle;
        this.f1956j = token;
    }

    @Override // b7.j4
    public final int a() {
        return this.f1947a;
    }

    @Override // b7.j4
    public final int b() {
        return this.f1948b;
    }

    @Override // b7.j4
    public final String e() {
        return this.f1951e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return this.f1947a == l4Var.f1947a && this.f1948b == l4Var.f1948b && this.f1949c == l4Var.f1949c && this.f1950d == l4Var.f1950d && TextUtils.equals(this.f1951e, l4Var.f1951e) && TextUtils.equals(this.f1952f, l4Var.f1952f) && ud.n.f(this.f1953g, l4Var.f1953g) && ud.n.f(this.f1954h, l4Var.f1954h) && ud.n.f(this.f1956j, l4Var.f1956j);
    }

    @Override // b7.j4
    public final ComponentName f() {
        return this.f1953g;
    }

    @Override // b7.j4
    public final Object g() {
        return this.f1954h;
    }

    @Override // b7.j4
    public final Bundle getExtras() {
        return new Bundle(this.f1955i);
    }

    @Override // b7.j4
    public final String h() {
        return this.f1952f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f1947a), Integer.valueOf(this.f1948b), Integer.valueOf(this.f1949c), Integer.valueOf(this.f1950d), this.f1951e, this.f1952f, this.f1953g, this.f1954h, this.f1956j});
    }

    @Override // b7.j4
    public final boolean i() {
        return false;
    }

    @Override // b7.j4
    public final int j() {
        return this.f1950d;
    }

    @Override // b7.j4
    public final Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putInt(f1937k, this.f1947a);
        bundle.putInt(f1938l, this.f1948b);
        bundle.putInt(f1939m, this.f1949c);
        bundle.putString(f1940n, this.f1951e);
        bundle.putString(f1941o, this.f1952f);
        bundle.putBinder(f1943q, this.f1954h);
        bundle.putParcelable(f1942p, this.f1953g);
        bundle.putBundle(f1944r, this.f1955i);
        bundle.putInt(f1945s, this.f1950d);
        MediaSession.Token token = this.f1956j;
        if (token != null) {
            bundle.putParcelable(f1946t, token);
        }
        return bundle;
    }

    @Override // b7.j4
    public final MediaSession.Token l() {
        return this.f1956j;
    }

    public final String toString() {
        return "SessionToken {pkg=" + this.f1951e + " type=" + this.f1948b + " libraryVersion=" + this.f1949c + " interfaceVersion=" + this.f1950d + " service=" + this.f1952f + " IMediaSession=" + this.f1954h + " extras=" + this.f1955i + "}";
    }
}
