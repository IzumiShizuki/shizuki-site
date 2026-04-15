package j5;

import android.content.Context;
import android.net.Uri;
import com.cnl.kikoeru.MainApplication;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class q implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0.y f10385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s4.g f10386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public m3.l f10387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f10388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f10389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f10390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10393i;

    public q(MainApplication mainApplication) {
        this(new m0.w((Context) mainApplication), new r5.l());
    }

    public static c0 e(Class cls, s4.g gVar) {
        try {
            return (c0) cls.getConstructor(s4.g.class).newInstance(gVar);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v21, types: [byte[], java.lang.Cloneable] */
    @Override // j5.c0
    public final a a(m4.i0 i0Var) {
        char c3;
        m4.d0 d0Var;
        long j10;
        Uri uri;
        String str;
        m4.v vVar;
        String str2;
        m4.z zVar;
        m4.i0 i0Var2 = i0Var;
        i0Var2.f14286b.getClass();
        String scheme = i0Var2.f14286b.f14178a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        if (Objects.equals(i0Var2.f14286b.f14179b, "application/x-image-uri")) {
            long j11 = i0Var2.f14286b.f14185h;
            int i10 = p4.c0.f16548a;
            throw null;
        }
        m4.d0 d0Var2 = i0Var2.f14286b;
        int iG = p4.c0.G(d0Var2.f14178a, d0Var2.f14179b);
        if (i0Var2.f14286b.f14185h != -9223372036854775807L) {
            r5.l lVar = (r5.l) this.f10385a.f5431b;
            synchronized (lVar) {
                lVar.f18856d = 1;
            }
        }
        try {
            d0.y yVar = this.f10385a;
            HashMap map = (HashMap) yVar.f5433d;
            c0 c0Var = (c0) map.get(Integer.valueOf(iG));
            if (c0Var == null) {
                c0Var = (c0) yVar.b(iG).get();
                c0Var.b((m3.l) yVar.f5435f);
                c0Var.c(yVar.f5430a);
                c0Var.d();
                map.put(Integer.valueOf(iG), c0Var);
            }
            m4.b0 b0VarA = i0Var2.f14287c.a();
            m4.c0 c0Var2 = i0Var2.f14287c;
            if (c0Var2.f14149a == -9223372036854775807L) {
                b0VarA.f14132a = this.f10388d;
            }
            if (c0Var2.f14152d == -3.4028235E38f) {
                b0VarA.f14135d = this.f10391g;
            }
            if (c0Var2.f14153e == -3.4028235E38f) {
                b0VarA.f14136e = this.f10392h;
            }
            if (c0Var2.f14150b == -9223372036854775807L) {
                b0VarA.f14133b = this.f10389e;
            }
            if (c0Var2.f14151c == -9223372036854775807L) {
                b0VarA.f14134c = this.f10390f;
            }
            m4.c0 c0Var3 = new m4.c0(b0VarA);
            if (c0Var3.equals(i0Var2.f14287c)) {
                c3 = 0;
            } else {
                m4.z zVar2 = new m4.z();
                List list = Collections.EMPTY_LIST;
                ya.i0 i0Var3 = ya.a1.f25946e;
                m4.e0 e0Var = m4.e0.f14187d;
                m4.y yVar2 = i0Var2.f14289e;
                m4.w wVar = new m4.w();
                wVar.f14604a = yVar2.f14618b;
                wVar.f14605b = yVar2.f14620d;
                wVar.f14606c = yVar2.f14621e;
                wVar.f14607d = yVar2.f14622f;
                wVar.f14608e = yVar2.f14623g;
                String str3 = i0Var2.f14285a;
                m4.l0 l0Var = i0Var2.f14288d;
                i0Var2.f14287c.a();
                m4.e0 e0Var2 = i0Var2.f14290f;
                m4.d0 d0Var3 = i0Var2.f14286b;
                if (d0Var3 != null) {
                    String str4 = d0Var3.f14183f;
                    String str5 = d0Var3.f14179b;
                    Uri uri2 = d0Var3.f14178a;
                    list = d0Var3.f14182e;
                    i0Var3 = d0Var3.f14184g;
                    d0Var = null;
                    m4.a0 a0Var = d0Var3.f14180c;
                    if (a0Var != null) {
                        c3 = 0;
                        m4.z zVar3 = new m4.z();
                        zVar3.f14644d = a0Var.f14109a;
                        zVar3.f14645e = a0Var.f14110b;
                        zVar3.f14646f = a0Var.f14111c;
                        zVar3.f14641a = a0Var.f14112d;
                        zVar3.f14642b = a0Var.f14113e;
                        zVar3.f14643c = a0Var.f14114f;
                        zVar3.f14647g = a0Var.f14115g;
                        zVar3.f14648h = a0Var.f14116h;
                        zVar = zVar3;
                    } else {
                        c3 = 0;
                        zVar = new m4.z();
                    }
                    m4.v vVar2 = d0Var3.f14181d;
                    j10 = d0Var3.f14185h;
                    vVar = vVar2;
                    str = str5;
                    uri = uri2;
                    str2 = str4;
                    zVar2 = zVar;
                } else {
                    d0Var = null;
                    c3 = 0;
                    j10 = -9223372036854775807L;
                    uri = null;
                    str = null;
                    vVar = null;
                    str2 = null;
                }
                List list2 = list;
                ya.i0 i0Var4 = i0Var3;
                m4.b0 b0VarA2 = c0Var3.a();
                p4.c.i(((Uri) zVar2.f14645e) == null || ((UUID) zVar2.f14644d) != null);
                m4.d0 d0Var4 = uri != null ? new m4.d0(uri, str, ((UUID) zVar2.f14644d) != null ? new m4.a0(zVar2) : d0Var, vVar, list2, str2, i0Var4, j10) : d0Var;
                if (str3 == null) {
                    str3 = "";
                }
                String str6 = str3;
                m4.y yVar3 = new m4.y(wVar);
                m4.c0 c0Var4 = new m4.c0(b0VarA2);
                if (l0Var == null) {
                    l0Var = m4.l0.K;
                }
                i0Var2 = new m4.i0(str6, yVar3, d0Var4, c0Var4, l0Var, e0Var2);
            }
            a aVarA = c0Var.a(i0Var2);
            ya.i0 i0Var5 = i0Var2.f14286b.f14184g;
            if (!i0Var5.isEmpty()) {
                a[] aVarArr = new a[i0Var5.size() + 1];
                aVarArr[c3] = aVarA;
                for (int i11 = 0; i11 < i0Var5.size(); i11++) {
                    int i12 = 11;
                    if (this.f10393i) {
                        m4.p pVar = new m4.p();
                        pVar.f14488m = m4.o0.p(((m4.h0) i0Var5.get(i11)).f14246b);
                        pVar.f14479d = ((m4.h0) i0Var5.get(i11)).f14247c;
                        pVar.f14480e = ((m4.h0) i0Var5.get(i11)).f14248d;
                        pVar.f14481f = ((m4.h0) i0Var5.get(i11)).f14249e;
                        pVar.f14477b = ((m4.h0) i0Var5.get(i11)).f14250f;
                        pVar.f14476a = ((m4.h0) i0Var5.get(i11)).f14251g;
                        m4.q qVar = new m4.q(pVar);
                        b7.i0 i0Var6 = new b7.i0(13, this, qVar);
                        s4.g gVar = this.f10386b;
                        androidx.media3.exoplayer.offline.g gVar2 = new androidx.media3.exoplayer.offline.g(14, i0Var6);
                        c7.e1 e1Var = new c7.e1(6);
                        m3.l lVar2 = new m3.l(i12);
                        if (this.f10387c.k(qVar)) {
                            m4.p pVarA = qVar.a();
                            pVarA.f14488m = m4.o0.p("application/x-media3-cues");
                            pVarA.f14485j = qVar.f14544n;
                            pVarA.I = this.f10387c.e(qVar);
                            qVar = new m4.q(pVarA);
                        }
                        m4.i0 i0VarB = m4.i0.b(((m4.h0) i0Var5.get(i11)).f14245a.toString());
                        i0VarB.f14286b.getClass();
                        aVarArr[i11 + 1] = new w0(i0VarB, gVar, gVar2, e1Var.v(i0VarB), lVar2, 1048576, qVar);
                    } else {
                        s4.g gVar3 = this.f10386b;
                        gVar3.getClass();
                        aVarArr[i11 + 1] = new k1((m4.h0) i0Var5.get(i11), gVar3, new m3.l(i12));
                    }
                }
                aVarA = new n0(aVarArr);
            }
            a gVar4 = aVarA;
            m4.y yVar4 = i0Var2.f14289e;
            long j12 = yVar4.f14618b;
            if (j12 != 0 || yVar4.f14620d != Long.MIN_VALUE || yVar4.f14622f) {
                gVar4 = new g(gVar4, j12, yVar4.f14620d, !yVar4.f14623g, yVar4.f14621e, yVar4.f14622f);
            }
            i0Var2.f14286b.getClass();
            if (i0Var2.f14286b.f14181d == null) {
                return gVar4;
            }
            p4.c.B("DMediaSourceFactory", "Playing media without ads. Configure ad support by calling setAdsLoaderProvider and setAdViewProvider.");
            return gVar4;
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Override // j5.c0
    public final c0 b(m3.l lVar) {
        this.f10387c = lVar;
        d0.y yVar = this.f10385a;
        yVar.f5435f = lVar;
        r5.l lVar2 = (r5.l) yVar.f5431b;
        synchronized (lVar2) {
            lVar2.f18855c = lVar;
        }
        Iterator it = ((HashMap) yVar.f5433d).values().iterator();
        while (it.hasNext()) {
            ((c0) it.next()).b(lVar);
        }
        return this;
    }

    @Override // j5.c0
    public final c0 c(boolean z10) {
        this.f10393i = z10;
        d0.y yVar = this.f10385a;
        yVar.f5430a = z10;
        r5.l lVar = (r5.l) yVar.f5431b;
        synchronized (lVar) {
            lVar.f18854b = z10;
        }
        Iterator it = ((HashMap) yVar.f5433d).values().iterator();
        while (it.hasNext()) {
            ((c0) it.next()).c(z10);
        }
        return this;
    }

    @Override // j5.c0
    public final c0 d() {
        d0.y yVar = this.f10385a;
        yVar.getClass();
        synchronized (((r5.l) yVar.f5431b)) {
        }
        return this;
    }

    public q(m0.w wVar, r5.l lVar) {
        this.f10386b = wVar;
        m3.l lVar2 = new m3.l(17);
        this.f10387c = lVar2;
        d0.y yVar = new d0.y(lVar, lVar2);
        this.f10385a = yVar;
        if (wVar != ((s4.g) yVar.f5434e)) {
            yVar.f5434e = wVar;
            ((HashMap) yVar.f5432c).clear();
            ((HashMap) yVar.f5433d).clear();
        }
        this.f10388d = -9223372036854775807L;
        this.f10389e = -9223372036854775807L;
        this.f10390f = -9223372036854775807L;
        this.f10391g = -3.4028235E38f;
        this.f10392h = -3.4028235E38f;
        this.f10393i = true;
    }
}
