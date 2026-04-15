package m5;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import b5.d0;
import j5.o1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.RandomAccess;
import m4.j1;
import m4.k1;
import m4.m1;
import p4.c0;
import ya.a1;
import ya.i0;
import ya.v;
import ya.y0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class p extends j2.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final y0 f14745j = new v(new androidx.media3.exoplayer.offline.i(8));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14746c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f14747d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m3.l f14748e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f14749f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j f14750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f14751h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m4.d f14752i;

    public p(Context context) {
        m3.l lVar = new m3.l(1);
        String str = j.f14702t0;
        j jVar = new j(new i(context));
        this.f14746c = new Object();
        this.f14747d = context.getApplicationContext();
        this.f14748e = lVar;
        this.f14750g = jVar;
        this.f14752i = m4.d.f14158g;
        boolean zL = c0.L(context);
        this.f14749f = zL;
        if (!zL && c0.f16548a >= 32) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f14751h = audioManager == null ? null : new d0(audioManager.getSpatializer());
        }
        boolean z10 = this.f14750g.o0;
    }

    public static void f(o1 o1Var, j jVar, HashMap map) {
        for (int i10 = 0; i10 < o1Var.f10379a; i10++) {
            k1 k1Var = (k1) jVar.B.get(o1Var.a(i10));
            if (k1Var != null) {
                j1 j1Var = k1Var.f14346a;
                k1 k1Var2 = (k1) map.get(Integer.valueOf(j1Var.f14306c));
                if (k1Var2 == null || (k1Var2.f14347b.isEmpty() && !k1Var.f14347b.isEmpty())) {
                    map.put(Integer.valueOf(j1Var.f14306c), k1Var);
                }
            }
        }
    }

    public static int g(m4.q qVar, String str, boolean z10) {
        if (!TextUtils.isEmpty(str) && str.equals(qVar.f14534d)) {
            return 4;
        }
        String strJ = j(str);
        String strJ2 = j(qVar.f14534d);
        if (strJ2 == null || strJ == null) {
            return (z10 && strJ2 == null) ? 1 : 0;
        }
        if (strJ2.startsWith(strJ) || strJ.startsWith(strJ2)) {
            return 3;
        }
        int i10 = c0.f16548a;
        return strJ2.split("-", 2)[0].equals(strJ.split("-", 2)[0]) ? 2 : 0;
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean l(j jVar, int i10, m4.q qVar) {
        if ((i10 & 3584) == 0) {
            return false;
        }
        m1 m1Var = jVar.f14469t;
        if (m1Var.f14404c && (i10 & 2048) == 0) {
            return false;
        }
        if (m1Var.f14403b) {
            boolean z10 = (qVar.G == 0 && qVar.H == 0) ? false : true;
            boolean z11 = (i10 & 1024) != 0;
            if (z10 && !z11) {
                return false;
            }
        }
        return true;
    }

    public static Pair m(int i10, t tVar, int[][][] iArr, m mVar, Comparator comparator) {
        int i11;
        RandomAccess randomAccessU;
        t tVar2 = tVar;
        ArrayList arrayList = new ArrayList();
        int i12 = tVar2.f14755a;
        int i13 = 0;
        while (i13 < i12) {
            if (i10 == tVar2.f14756b[i13]) {
                o1 o1Var = tVar2.f14757c[i13];
                for (int i14 = 0; i14 < o1Var.f10379a; i14++) {
                    j1 j1VarA = o1Var.a(i14);
                    a1 a1VarE = mVar.e(i13, j1VarA, iArr[i13][i14]);
                    int i15 = j1VarA.f14304a;
                    boolean[] zArr = new boolean[i15];
                    int i16 = 0;
                    while (i16 < i15) {
                        n nVar = (n) a1VarE.get(i16);
                        int iA = nVar.a();
                        if (zArr[i16] || iA == 0) {
                            i11 = i12;
                        } else {
                            if (iA == 1) {
                                randomAccessU = i0.u(nVar);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(nVar);
                                int i17 = i16 + 1;
                                while (i17 < i15) {
                                    n nVar2 = (n) a1VarE.get(i17);
                                    int i18 = i12;
                                    if (nVar2.a() == 2 && nVar.b(nVar2)) {
                                        arrayList2.add(nVar2);
                                        zArr[i17] = true;
                                    }
                                    i17++;
                                    i12 = i18;
                                }
                                randomAccessU = arrayList2;
                            }
                            i11 = i12;
                            arrayList.add(randomAccessU);
                        }
                        i16++;
                        i12 = i11;
                    }
                }
            }
            i13++;
            tVar2 = tVar;
            i12 = i12;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i19 = 0; i19 < list.size(); i19++) {
            iArr2[i19] = ((n) list.get(i19)).f14725c;
        }
        n nVar3 = (n) list.get(0);
        return Pair.create(new q(0, nVar3.f14724b, iArr2), Integer.valueOf(nVar3.f14723a));
    }

    @Override // j2.b
    public final void e(m4.d dVar) {
        boolean zEquals;
        synchronized (this.f14746c) {
            zEquals = this.f14752i.equals(dVar);
            this.f14752i = dVar;
        }
        if (zEquals) {
            return;
        }
        i();
    }

    public final j h() {
        j jVar;
        synchronized (this.f14746c) {
            jVar = this.f14750g;
        }
        return jVar;
    }

    public final void i() {
        boolean z10;
        v4.c0 c0Var;
        d0 d0Var;
        synchronized (this.f14746c) {
            try {
                z10 = this.f14750g.o0 && !this.f14749f && c0.f16548a >= 32 && (d0Var = this.f14751h) != null && d0Var.f1520a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (!z10 || (c0Var = (v4.c0) this.f9723a) == null) {
            return;
        }
        c0Var.f22415h.e(10);
    }

    public final void k() {
        synchronized (this.f14746c) {
            this.f14750g.getClass();
        }
    }

    public final void n(j jVar) {
        boolean zEquals;
        jVar.getClass();
        synchronized (this.f14746c) {
            zEquals = this.f14750g.equals(jVar);
            this.f14750g = jVar;
        }
        if (zEquals) {
            return;
        }
        if (jVar.o0 && this.f14747d == null) {
            p4.c.B("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        v4.c0 c0Var = (v4.c0) this.f9723a;
        if (c0Var != null) {
            c0Var.f22415h.e(10);
        }
    }
}
