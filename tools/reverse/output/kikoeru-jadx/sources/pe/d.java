package pe;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.media.MediaDrmException;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.k;
import androidx.lifecycle.p;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.x0;
import b5.g0;
import b5.s;
import b5.t;
import b5.v;
import b5.w;
import b5.x;
import c4.n;
import cb.y;
import e5.r;
import e7.j;
import e7.m;
import e7.u;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import jc.l;
import lh.f;
import m4.i0;
import n5.q;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class d implements a3.d, a8.d, t, x, r, g0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static d f17110b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17111a;

    public /* synthetic */ d(int i10) {
        this.f17111a = i10;
    }

    public static byte[] A(List list) {
        l.e(list, "protocols");
        f fVar = new f();
        for (String str : z(list)) {
            fVar.e0(str.length());
            fVar.k0(str);
        }
        return fVar.u(fVar.f12571b);
    }

    public static v0 B(x0 x0Var, u0 u0Var, int i10) {
        if ((i10 & 2) != 0) {
            u0Var = x0Var instanceof k ? ((k) x0Var).b() : k4.b.f11024a;
        }
        i4.b bVarC = x0Var instanceof k ? ((k) x0Var).c() : i4.a.f9001b;
        l.e(u0Var, "factory");
        l.e(bVarC, "extras");
        return new v0(x0Var.d(), u0Var, bVarC);
    }

    public static j C(n nVar, u uVar, Bundle bundle, p pVar, m mVar) {
        String string = UUID.randomUUID().toString();
        l.d(string, "toString(...)");
        l.e(uVar, "destination");
        l.e(pVar, "hostLifecycleState");
        return new j(nVar, uVar, bundle, pVar, mVar, string, null);
    }

    public static InputStream F(String str) {
        l.e(str, "path");
        ClassLoader classLoader = d.class.getClassLoader();
        if (classLoader == null) {
            return ClassLoader.getSystemResourceAsStream(str);
        }
        URL resource = classLoader.getResource(str);
        if (resource == null) {
            return null;
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        uRLConnectionOpenConnection.setUseCaches(false);
        return uRLConnectionOpenConnection.getInputStream();
    }

    public static y G(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((i0) it.next()).f14286b == null) {
                UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
                cb.u uVar = new cb.u();
                uVar.l(unsupportedOperationException);
                return uVar;
            }
        }
        return g8.a.Q(list);
    }

    public static final float y(float f10, float[] fArr, float[] fArr2) {
        float f11;
        float f12;
        float f13;
        float f14;
        float fAbs = Math.abs(f10);
        float fSignum = Math.signum(f10);
        int iBinarySearch = Arrays.binarySearch(fArr, fAbs);
        if (iBinarySearch >= 0) {
            return fSignum * fArr2[iBinarySearch];
        }
        int i10 = -(iBinarySearch + 1);
        int i11 = i10 - 1;
        if (i11 >= fArr.length - 1) {
            float f15 = fArr[fArr.length - 1];
            float f16 = fArr2[fArr.length - 1];
            if (f15 == 0.0f) {
                return 0.0f;
            }
            return (f16 / f15) * f10;
        }
        if (i11 == -1) {
            float f17 = fArr[0];
            f13 = fArr2[0];
            f14 = f17;
            f12 = 0.0f;
            f11 = 0.0f;
        } else {
            float f18 = fArr[i11];
            float f19 = fArr[i10];
            f11 = fArr2[i11];
            f12 = f18;
            f13 = fArr2[i10];
            f14 = f19;
        }
        return (((f13 - f11) * Math.max(0.0f, Math.min(1.0f, f12 == f14 ? 0.0f : (fAbs - f12) / (f14 - f12)))) + f11) * fSignum;
    }

    public static ArrayList z(List list) {
        l.e(list, "protocols");
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ug.y) obj) != ug.y.f21934c) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ug.y) it.next()).f21942a);
        }
        return arrayList2;
    }

    public Signature[] D(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public boolean E(CharSequence charSequence) {
        return false;
    }

    @Override // e5.r
    public q H0() {
        return new e5.q();
    }

    @Override // e5.r
    public q J(e5.n nVar, e5.k kVar) {
        return new e5.q(nVar, kVar);
    }

    @Override // b5.t
    public void a() {
        int i10 = this.f17111a;
    }

    @Override // g0.a
    public float b(long j10, f3.c cVar) {
        return 0.0f;
    }

    @Override // b5.t
    public /* synthetic */ s e(b5.q qVar, m4.q qVar2) {
        return s.f1596a0;
    }

    @Override // b5.x
    public Map f(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // b5.x
    public w h() {
        throw new IllegalStateException();
    }

    @Override // b5.x
    public u4.a j(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // b5.t
    public int k(m4.q qVar) {
        return qVar.f14548r != null ? 1 : 0;
    }

    @Override // b5.x
    public byte[] m() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // b5.x
    public boolean n(byte[] bArr, String str) {
        throw new IllegalStateException();
    }

    @Override // b5.x
    public void o(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // a8.d
    public String q() {
        return "SELECT seq FROM sqlite_sequence WHERE name='LyricBean'";
    }

    @Override // a3.d
    public a3.c r() {
        return new a3.c(ud.b.w(new a3.b(Locale.getDefault())));
    }

    @Override // b5.x
    public byte[] s(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // b5.x
    public void t(byte[] bArr) {
        throw new IllegalStateException();
    }

    public String toString() {
        switch (this.f17111a) {
            case 28:
                return "ZeroCornerSize";
            default:
                return super.toString();
        }
    }

    @Override // b5.x
    public v u(byte[] bArr, List list, int i10, HashMap map) {
        throw new IllegalStateException();
    }

    @Override // b5.x
    public int v() {
        return 1;
    }

    @Override // b5.t
    public b5.l w(b5.q qVar, m4.q qVar2) {
        if (qVar2.f14548r == null) {
            return null;
        }
        return new b5.u(new b5.k(new g0(), 6001));
    }

    @Override // a3.d
    public Locale x(String str) {
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        if (l.a(localeForLanguageTag.toLanguageTag(), "und")) {
            Log.e("Locale", "The language tag " + str + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtags delimiter and must be replaced with '-'.");
        }
        return localeForLanguageTag;
    }

    private final /* synthetic */ void H() {
    }

    private final void I() {
    }

    @Override // b5.t
    public /* synthetic */ void c() {
    }

    @Override // a8.d
    public void d(a8.c cVar) {
    }

    @Override // b5.x
    public void l(b5.f fVar) {
    }

    @Override // b5.x
    public void p(byte[] bArr) {
    }

    @Override // b5.t
    public void g(Looper looper, w4.k kVar) {
    }

    @Override // b5.x
    public /* synthetic */ void i(byte[] bArr, w4.k kVar) {
    }
}
