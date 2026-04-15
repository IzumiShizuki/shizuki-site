package da;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import bg.a2;
import com.cnl.kikoeru.MainApplication;
import com.cnl.kikoeru.R;
import java.io.UnsupportedEncodingException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import x0.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends androidx.lifecycle.s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f5739b = x0.v.v(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f5740c = x0.v.v(new b(null, 63));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e1 f5741d = x0.v.v(ka.q.f11304b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final e1 f5742e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f5743f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f5744g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e1 f5745h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ub.p f5746i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f5747j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f5748k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e1 f5749l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h1.v f5750m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e1 f5751n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f5752o;

    public m0() {
        Boolean bool = Boolean.FALSE;
        this.f5742e = x0.v.v(bool);
        this.f5743f = x0.v.v(bool);
        this.f5744g = x0.v.v(bool);
        this.f5745h = x0.v.v(bool);
        this.f5746i = ub.a.d(new p(this, 10));
        this.f5748k = ud.b.x("mp4", "avi", "webm", "mkv", "flv", "wmv", "mov", "mpg");
        this.f5749l = x0.v.v(null);
        this.f5750m = new h1.v();
        this.f5751n = x0.v.v(bool);
    }

    public static void T(b bVar, int i10, s2.a aVar) {
        boolean z10;
        jc.l.e(bVar, "pNode");
        List list = bVar.f5636a;
        if (list.get(i10) == aVar) {
            return;
        }
        s2.a aVar2 = s2.a.f19357b;
        s2.a aVar3 = s2.a.f19356a;
        if (aVar == null) {
            int iOrdinal = ((s2.a) list.get(i10)).ordinal();
            if (iOrdinal == 0) {
                aVar = aVar2;
            } else {
                if (iOrdinal != 1 && iOrdinal != 2) {
                    throw new ce.j0();
                }
                aVar = aVar3;
            }
        }
        list.set(i10, aVar);
        b bVar2 = bVar;
        while (bVar2 != null) {
            b bVar3 = bVar2.f5641f;
            List list2 = bVar2.f5636a;
            boolean z11 = list2 instanceof Collection;
            boolean z12 = false;
            if (z11 && list2.isEmpty()) {
                z10 = true;
            } else {
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (((s2.a) it.next()) != aVar3) {
                        z10 = false;
                        break;
                    }
                }
                z10 = true;
            }
            if (z11 && list2.isEmpty()) {
                z12 = true;
            } else {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((s2.a) it2.next()) != aVar2) {
                        break;
                    }
                }
                z12 = true;
            }
            if (bVar3 != null) {
                bVar3.f5636a.set(bVar3.f5640e.indexOf(bVar2), z10 ? aVar3 : z12 ? aVar2 : s2.a.f19358c);
            }
            bVar2 = bVar3;
        }
        V((s2.a) list.get(i10), (b) bVar.f5640e.get(i10));
    }

    public static final void V(s2.a aVar, b bVar) {
        if (bVar != null) {
            Collections.fill(bVar.f5636a, aVar);
            Iterator it = bVar.f5640e.iterator();
            while (it.hasNext()) {
                V(aVar, (b) it.next());
            }
        }
    }

    public static final void Y(ArrayList arrayList, b bVar) {
        oc.c it = ud.b.q(bVar.f5640e).iterator();
        while (it.f16312c) {
            int iNextInt = it.nextInt();
            b bVar2 = (b) bVar.f5640e.get(iNextInt);
            arrayList.add(((bg.o0) bVar.f5639d.get(iNextInt)).a());
            if (bVar2 != null) {
                Y(arrayList, bVar2);
            }
        }
    }

    public static final boolean Z(b bVar, boolean z10) {
        Object next;
        Iterator it = bVar.f5639d.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            bg.o0 o0Var = (bg.o0) next;
            if ((o0Var instanceof bg.z) && (!z10 || ef.u.c0(((bg.z) o0Var).f2996d, ".mp3", true))) {
                break;
            }
        }
        if (next != null) {
            return true;
        }
        for (b bVar2 : bVar.f5640e) {
            if (bVar2 != null && Z(bVar2, z10)) {
                bVar2.f5638c.setValue(Boolean.TRUE);
                return true;
            }
        }
        return false;
    }

    public static final void a0(ArrayList arrayList, b bVar) {
        Iterator it = bVar.f5636a.iterator();
        int i10 = 0;
        while (true) {
            boolean zHasNext = it.hasNext();
            s2.a aVar = s2.a.f19357b;
            if (!zHasNext) {
                Collections.fill(bVar.f5636a, aVar);
                return;
            }
            Object next = it.next();
            int i11 = i10 + 1;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            if (((s2.a) next) != aVar) {
                bg.o0 o0Var = (bg.o0) bVar.f5639d.get(i10);
                if (o0Var instanceof bg.n0) {
                    Object obj = bVar.f5640e.get(i10);
                    jc.l.b(obj);
                    a0(arrayList, (b) obj);
                } else if (o0Var instanceof bg.z) {
                    arrayList.add(o0Var);
                }
            }
            i10 = i11;
        }
    }

    public static void d0(Throwable th2) {
        if ((th2 instanceof SocketException) || (th2 instanceof SocketTimeoutException)) {
            ka.n.c(th2, 0L, null, null, 511);
            ka.n.c(na.q.g(R.string.may_need_proxy), 0L, null, null, 511);
        } else {
            if (na.q.k(th2)) {
                return;
            }
            ka.n.c(th2, 0L, null, null, 511);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cd -> B:35:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f0(da.b r12, java.lang.String r13, ac.c r14) {
        /*
            Method dump skipped, instruction units count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da.m0.f0(da.b, java.lang.String, ac.c):java.lang.Object");
    }

    public static final void w(boolean z10, List list, b bVar) {
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                bg.o0 o0Var = (bg.o0) obj;
                if (o0Var instanceof bg.j0) {
                    ArrayList arrayList2 = j9.v.f10760a;
                    String lowerCase = na.w.h(((bg.j0) o0Var).f2909d).toLowerCase(Locale.ROOT);
                    jc.l.d(lowerCase, "toLowerCase(...)");
                    if (arrayList2.contains(lowerCase)) {
                    }
                }
                arrayList.add(obj);
            }
            list = arrayList;
        }
        List list2 = bVar.f5639d;
        List list3 = bVar.f5640e;
        List<bg.o0> list4 = list;
        vb.m.P(list2, list4);
        for (bg.o0 o0Var2 : list4) {
            bVar.f5636a.add(s2.a.f19357b);
            bVar.f5637b.add(null);
            if (o0Var2 instanceof bg.n0) {
                b bVar2 = new b(bVar, 31);
                list3.add(bVar2);
                w(z10, ((bg.n0) o0Var2).f2932c, bVar2);
            } else {
                list3.add(null);
            }
        }
    }

    public final a2 A() {
        return (a2) this.f5739b.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(long r12, ac.c r14, boolean r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof da.f0
            if (r0 == 0) goto L13
            r0 = r14
            da.f0 r0 = (da.f0) r0
            int r1 = r0.f5683i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5683i = r1
            goto L18
        L13:
            da.f0 r0 = new da.f0
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.f5681g
            int r1 = r0.f5683i
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            da.m0 r12 = r0.f5680f
            ub.a.f(r14)
            r6 = r11
            goto L84
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            boolean r15 = r0.f5679e
            long r12 = r0.f5678d
            ub.a.f(r14)
            r8 = r12
            goto L5e
        L3e:
            ub.a.f(r14)
            pf.e r14 = hf.l0.f8566a
            pf.d r14 = pf.d.f17138c
            da.g0 r5 = new da.g0
            r10 = 0
            r9 = 0
            r6 = r12
            r8 = r15
            r5.<init>(r6, r8, r9, r10)
            r0.f5678d = r6
            r0.f5679e = r8
            r0.f5683i = r3
            java.lang.Object r14 = hf.a0.H(r14, r5, r0)
            if (r14 != r4) goto L5c
            r6 = r11
            goto L82
        L5c:
            r15 = r8
            r8 = r6
        L5e:
            ub.n r14 = (ub.n) r14
            java.lang.Object r12 = r14.f21546a
            boolean r13 = r12 instanceof ub.m
            if (r13 != 0) goto L96
            r7 = r12
            java.util.List r7 = (java.util.List) r7
            pf.e r12 = hf.l0.f8566a
            jf.d r12 = nf.n.f15850a
            b0.z r5 = new b0.z
            r10 = 0
            r6 = r11
            r5.<init>(r6, r7, r8, r10)
            r0.f5680f = r6
            r0.f5678d = r8
            r0.f5679e = r15
            r0.f5683i = r2
            java.lang.Object r14 = hf.a0.H(r12, r5, r0)
            if (r14 != r4) goto L83
        L82:
            return r4
        L83:
            r12 = r6
        L84:
            da.b r14 = (da.b) r14
            r12.getClass()
            java.lang.String r13 = "<set-?>"
            jc.l.e(r14, r13)
            x0.e1 r12 = r12.f5740c
            r12.setValue(r14)
            java.lang.Boolean r12 = java.lang.Boolean.TRUE
            return r12
        L96:
            r6 = r11
            java.lang.Throwable r12 = ub.n.a(r12)
            if (r12 == 0) goto La5
            ka.q r13 = ka.q.f11305c
            r11.b0(r13)
            d0(r12)
        La5:
            java.lang.Boolean r12 = java.lang.Boolean.FALSE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: da.m0.G(long, ac.c, boolean):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        if (hf.a0.H(r2, r3, r1) == r12) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(long r14, ac.c r16, boolean r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da.m0.H(long, ac.c, boolean):java.lang.Object");
    }

    public final void W(bg.o0 o0Var, b bVar, b bVar2, e7.a0 a0Var) throws UnsupportedEncodingException {
        jc.l.e(o0Var, "item");
        jc.l.e(bVar2, "pNode");
        jc.l.e(a0Var, "nav");
        Class cls = Boolean.TYPE;
        if (bVar != null) {
            x0.w0 w0Var = bVar.f5638c;
            w0Var.setValue(Boolean.valueOf(!((Boolean) w0Var.getValue()).booleanValue()));
            if (((Boolean) w0Var.getValue()).booleanValue()) {
                if (((Boolean) a0.c.F(cls, gg.c.a(), "autoOpenSingleChildDir", Boolean.TRUE)).booleanValue()) {
                    for (b bVar3 = (b) vb.m.z0(bVar.f5640e); bVar3 != null; bVar3 = (b) vb.m.z0(bVar3.f5640e)) {
                        x0.w0 w0Var2 = bVar3.f5638c;
                        if (!((Boolean) w0Var2.getValue()).booleanValue()) {
                            w0Var2.setValue(Boolean.TRUE);
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
        bg.k0 k0Var = (bg.k0) o0Var;
        String strD = k0Var.d();
        String strM = na.w.m(k0Var.a());
        if (!(k0Var instanceof bg.z)) {
            if (k0Var instanceof bg.j0) {
                e7.a0.b(a0Var, "TextScreen/".concat(na.w.g(strD)));
                return;
            }
            if (k0Var instanceof bg.d0) {
                e7.a0.b(a0Var, "PictureScreen/" + na.w.g(strD) + "/" + strM);
                return;
            }
            if (!(k0Var instanceof bg.g0)) {
                throw new ce.j0();
            }
            na.c.i(Uri.parse(strD));
            return;
        }
        List<bg.o0> list = bVar2.f5639d;
        ArrayList arrayList = new ArrayList();
        for (bg.o0 o0Var2 : list) {
            bg.z zVar = o0Var2 instanceof bg.z ? (bg.z) o0Var2 : null;
            if (zVar != null) {
                arrayList.add(zVar);
            }
        }
        List list2 = this.f5748k;
        boolean z10 = list2 instanceof Collection;
        Object objB = ub.a0.f21526a;
        if (!z10 || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (ef.u.c0(k0Var.a(), (String) it.next(), true)) {
                    if (!((Boolean) a0.c.F(cls, gg.c.a(), "useExternalVideoPlayer", Boolean.FALSE)).booleanValue()) {
                        e7.a0.b(a0Var, "VideoScreen/" + na.w.k(k0Var.d()));
                        return;
                    }
                    try {
                        MainApplication mainApplicationA = a9.i.a();
                        Intent intent = new Intent();
                        intent.setDataAndType(Uri.parse(k0Var.d()), "video/*");
                        intent.addFlags(268435456);
                        ArrayList arrayList2 = new ArrayList(vb.n.K(arrayList, 10));
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            arrayList2.add(Uri.parse(((bg.z) it2.next()).d()));
                        }
                        intent.putExtra("video_list", (Parcelable[]) arrayList2.toArray(new Uri[0]));
                        intent.putExtra("headers", new String[]{"authorization", "Bearer " + a9.i.f()});
                        mainApplicationA.startActivity(intent);
                    } catch (Throwable th2) {
                        objB = ub.a.b(th2);
                    }
                    if (ub.n.a(objB) != null) {
                        ka.n.c(na.q.g(R.string.load_failed), 0L, null, null, 511);
                        return;
                    }
                    return;
                }
            }
        }
        try {
            h1.s sVar = h9.d.f8243c;
            jc.l.e(sVar, "<this>");
            int iIndexOf = sVar.indexOf(k0Var);
            if (iIndexOf != -1) {
                e1 e1Var = h9.d.f8242b;
                Integer num = (Integer) e1Var.getValue();
                if (num != null && num.intValue() == iIndexOf) {
                    e7.a0.b(a0Var, "PlayingScreen");
                } else {
                    e1Var.setValue(Integer.valueOf(iIndexOf));
                    ((androidx.lifecycle.q) h9.d.c()).r1(iIndexOf, false, 0L);
                }
                h9.d.f(true);
            } else {
                h9.d.f8241a.setValue(A());
                sVar.clear();
                vb.m.P(sVar, arrayList);
                h9.d.e(sVar.indexOf(k0Var));
            }
        } catch (Throwable th3) {
            objB = ub.a.b(th3);
        }
        if (ub.n.a(objB) != null) {
            ka.n.c(na.q.g(R.string.load_failed), 0L, null, null, 511);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x017e A[PHI: r3
      0x017e: PHI (r3v7 java.lang.Object) = (r3v6 java.lang.Object), (r3v6 java.lang.Object), (r3v9 java.lang.Object) binds: [B:40:0x0124, B:50:0x017b, B:18:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object X(ac.c r24) {
        /*
            Method dump skipped, instruction units count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: da.m0.X(ac.c):java.lang.Object");
    }

    public final void b0(ka.q qVar) {
        jc.l.e(qVar, "<set-?>");
        this.f5741d.setValue(qVar);
    }

    public final void c0(boolean z10) {
        this.f5742e.setValue(Boolean.valueOf(z10));
    }

    public final void e0() {
        b bVarZ = z();
        int i10 = 0;
        for (Object obj : bVarZ.f5639d) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ud.b.H();
                throw null;
            }
            T(bVarZ, i10, s2.a.f19357b);
            i10 = i11;
        }
    }

    public final Object x(long j10, ac.c cVar, boolean z10) throws Throwable {
        pf.e eVar = hf.l0.f8566a;
        Object objH = hf.a0.H(nf.n.f15850a, new d0(z10, this, j10, null), cVar);
        return objH == zb.a.f26667a ? objH : ub.a0.f21526a;
    }

    public final b z() {
        return (b) this.f5740c.getValue();
    }
}
