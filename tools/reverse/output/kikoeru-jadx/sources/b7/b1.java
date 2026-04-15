package b7;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.StatFs;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.Surface;
import b7.b1;
import g5.w;
import hf.l0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import lh.l;
import lh.u;
import lh.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b1 implements oe.a, oe.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f1652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f1653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f1654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f1655g;

    public b1(bd.h0 h0Var, b0.w1 w1Var, re.l lVar, dd.b bVar) {
        this.f1649a = 5;
        this.f1649a = 5;
        this.f1650b = bVar;
        this.f1651c = lVar.b(new bd.a(28, this));
        this.f1652d = h0Var;
        this.f1653e = w1Var;
        this.f1654f = new m0.w(h0Var, w1Var);
        this.f1655g = yd.e.f26197g;
    }

    public static boolean A(j5.d0 d0Var, Object obj, boolean z10, int i10, int i11, int i12) {
        Object obj2 = d0Var.f10245a;
        int i13 = d0Var.f10246b;
        if (!obj2.equals(obj)) {
            return false;
        }
        if (z10 && i13 == i10 && d0Var.f10247c == i11) {
            return true;
        }
        return !z10 && i13 == -1 && d0Var.f10249e == i12;
    }

    public static t4.s a(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                throw new IOException(q.t0.B(i12, "Invalid value size: "));
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = p4.c0.f16553f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new t4.s(map);
    }

    public static void b(t4.s sVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry> setEntrySet = sVar.f20479b.entrySet();
        dataOutputStream.writeInt(setEntrySet.size());
        for (Map.Entry entry : setEntrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public static final ge.g d(b1 b1Var, be.e eVar, Object obj) {
        ge.g gVarB = ge.h.b((bd.h0) b1Var.f1652d, obj);
        if (gVarB != null) {
            return gVarB;
        }
        String str = "Unsupported annotation argument: " + eVar;
        jc.l.e(str, "message");
        return new ge.j(str);
    }

    public static /* synthetic */ List t(b1 b1Var, oe.w wVar, ud.t tVar, Boolean bool, boolean z10, int i10) {
        boolean z11 = (i10 & 4) == 0;
        if ((i10 & 16) != 0) {
            bool = null;
        }
        return b1Var.q(wVar, tVar, z11, false, bool, (i10 & 32) != 0 ? false : z10);
    }

    public static j5.d0 u(m4.y0 y0Var, ya.i0 i0Var, j5.d0 d0Var, m4.f1 f1Var) {
        m4.i1 i1VarJ = y0Var.J();
        int iU = y0Var.u();
        Object objL = i1VarJ.p() ? null : i1VarJ.l(iU);
        int iB = (y0Var.o() || i1VarJ.p()) ? -1 : i1VarJ.f(iU, f1Var, false).b(p4.c0.N(y0Var.M()) - f1Var.f14205e);
        for (int i10 = 0; i10 < i0Var.size(); i10++) {
            j5.d0 d0Var2 = (j5.d0) i0Var.get(i10);
            if (A(d0Var2, objL, y0Var.o(), y0Var.F(), y0Var.x(), iB)) {
                return d0Var2;
            }
        }
        if (i0Var.isEmpty() && d0Var != null && A(d0Var, objL, y0Var.o(), y0Var.F(), y0Var.x(), iB)) {
            return d0Var;
        }
        return null;
    }

    public static ud.t w(ce.b bVar, yd.f fVar, bd.f0 f0Var, int i10, boolean z10) {
        jc.l.e(bVar, "proto");
        jc.l.e(fVar, "nameResolver");
        j2.h0.q(i10, "kind");
        if (bVar instanceof wd.n) {
            ce.i iVar = ae.g.f324a;
            ae.e eVarA = ae.g.a((wd.n) bVar, fVar, f0Var);
            if (eVarA != null) {
                return ud.s.n(eVarA);
            }
        } else if (bVar instanceof wd.b0) {
            ce.i iVar2 = ae.g.f324a;
            ae.e eVarC = ae.g.c((wd.b0) bVar, fVar, f0Var);
            if (eVarC != null) {
                return ud.s.n(eVarC);
            }
        } else if (bVar instanceof wd.j0) {
            ce.o oVar = zd.j.f26806d;
            jc.l.d(oVar, "propertySignature");
            zd.d dVar = (zd.d) vb.w.m((ce.m) bVar, oVar);
            if (dVar != null) {
                int iB = w0.c.b(i10);
                if (iB == 1) {
                    return vb.w.p((wd.j0) bVar, fVar, f0Var, true, true, z10);
                }
                if (iB != 2) {
                    if (iB != 3 || (dVar.f26758b & 8) != 8) {
                        return null;
                    }
                    zd.c cVar = dVar.f26762f;
                    jc.l.d(cVar, "getSetter(...)");
                    return new ud.t(fVar.getString(cVar.f26751c).concat(fVar.getString(cVar.f26752d)));
                }
                if (dVar.i()) {
                    zd.c cVar2 = dVar.f26761e;
                    jc.l.d(cVar2, "getGetter(...)");
                    return new ud.t(fVar.getString(cVar2.f26751c).concat(fVar.getString(cVar2.f26752d)));
                }
            }
        }
        return null;
    }

    public lh.s B() throws IOException {
        fh.e eVar = fh.e.f7102a;
        Object obj = fh.e.f7102a;
        fh.d dVar = obj != null ? (fh.d) obj : null;
        Context contextB = dVar != null ? dVar.b() : null;
        AssetManager assets = contextB != null ? contextB.getAssets() : null;
        if (assets == null) {
            if (Build.FINGERPRINT == null) {
                throw new IOException("Platform applicationContext not initialized. Possibly running Android unit test without Robolectric. Android tests should run with Robolectric and call OkHttp.initialize before test");
            }
            throw new IOException("Platform applicationContext not initialized. Startup Initializer possibly disabled, call OkHttp.initialize before test.");
        }
        InputStream inputStreamOpen = assets.open((String) this.f1655g);
        jc.l.d(inputStreamOpen, "open(...)");
        return g8.a.Z(inputStreamOpen);
    }

    public id.h C(be.b bVar, yc.m0 m0Var, List list) {
        jc.l.e(list, "result");
        return new id.h(this, yc.v.f((bd.h0) this.f1652d, bVar, (b0.w1) this.f1653e), bVar, list, m0Var);
    }

    public id.h D(be.b bVar, dd.a aVar, List list) {
        jc.l.e(list, "result");
        if (uc.a.f21565a.contains(bVar)) {
            return null;
        }
        return C(bVar, aVar, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(oe.w r10, wd.j0 r11, int r12, se.w r13, ic.n r14) {
        /*
            r9 = this;
            yd.b r0 = yd.d.B
            int r1 = r11.f23779d
            java.lang.Boolean r5 = r0.d(r1)
            boolean r6 = ae.g.d(r11)
            java.lang.Object r0 = r9.f1650b
            r7 = r0
            dd.b r7 = (dd.b) r7
            java.lang.Object r0 = r9.f1655g
            r8 = r0
            yd.e r8 = (yd.e) r8
            r3 = 1
            r4 = 1
            r2 = r10
            dd.c r10 = ud.b.s(r2, r3, r4, r5, r6, r7, r8)
            r0 = 0
            if (r10 != 0) goto L37
            boolean r10 = r2 instanceof oe.u
            if (r10 == 0) goto L36
            r10 = r2
            oe.u r10 = (oe.u) r10
            yc.m0 r10 = r10.f16433c
            boolean r1 = r10 instanceof ud.r
            if (r1 == 0) goto L30
            ud.r r10 = (ud.r) r10
            goto L31
        L30:
            r10 = r0
        L31:
            if (r10 == 0) goto L36
            dd.c r10 = r10.f21601a
            goto L37
        L36:
            r10 = r0
        L37:
            if (r10 != 0) goto L3a
            goto L6a
        L3a:
            i5.f r1 = r10.f5867b
            java.lang.Object r1 = r1.f9020d
            yd.e r1 = (yd.e) r1
            yd.e r3 = ud.g.f21581e
            java.lang.String r4 = "version"
            jc.l.e(r3, r4)
            int r4 = r3.f26166b
            int r5 = r3.f26167c
            int r3 = r3.f26168d
            boolean r1 = r1.a(r4, r5, r3)
            yd.f r3 = r2.f16431a
            bd.f0 r2 = r2.f16432b
            ud.t r11 = w(r11, r3, r2, r12, r1)
            if (r11 != 0) goto L5c
            goto L6a
        L5c:
            java.lang.Object r12 = r9.f1651c
            re.e r12 = (re.e) r12
            java.lang.Object r10 = r12.a(r10)
            java.lang.Object r10 = r14.q(r10, r11)
            if (r10 != 0) goto L6b
        L6a:
            return r0
        L6b:
            boolean r11 = vc.s.a(r13)
            if (r11 == 0) goto Lc3
            ge.g r10 = (ge.g) r10
            boolean r11 = r10 instanceof ge.d
            if (r11 == 0) goto L87
            ge.y r11 = new ge.y
            ge.d r10 = (ge.d) r10
            java.lang.Object r10 = r10.f7527a
            java.lang.Number r10 = (java.lang.Number) r10
            byte r10 = r10.byteValue()
            r11.<init>(r10)
            return r11
        L87:
            boolean r11 = r10 instanceof ge.v
            if (r11 == 0) goto L9b
            ge.y r11 = new ge.y
            ge.v r10 = (ge.v) r10
            java.lang.Object r10 = r10.f7527a
            java.lang.Number r10 = (java.lang.Number) r10
            short r10 = r10.shortValue()
            r11.<init>(r10)
            return r11
        L9b:
            boolean r11 = r10 instanceof ge.k
            if (r11 == 0) goto Laf
            ge.y r11 = new ge.y
            ge.k r10 = (ge.k) r10
            java.lang.Object r10 = r10.f7527a
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            r11.<init>(r10)
            return r11
        Laf:
            boolean r11 = r10 instanceof ge.t
            if (r11 == 0) goto Lc3
            ge.y r11 = new ge.y
            ge.t r10 = (ge.t) r10
            java.lang.Object r10 = r10.f7527a
            java.lang.Number r10 = (java.lang.Number) r10
            long r12 = r10.longValue()
            r11.<init>(r12)
            return r11
        Lc3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.b1.E(oe.w, wd.j0, int, se.w, ic.n):java.lang.Object");
    }

    public List F(oe.w wVar, ce.b bVar, int i10, int i11) {
        ud.t tVarW = w(bVar, wVar.f16431a, wVar.f16432b, i10, false);
        if (tVarW == null) {
            return vb.r.f22819a;
        }
        return t(this, wVar, new ud.t(tVarW.f21602a + '@' + i11), null, false, 60);
    }

    public List G(oe.w wVar, wd.j0 j0Var, ud.c cVar) {
        bd.f0 f0Var = wVar.f16432b;
        yd.f fVar = wVar.f16431a;
        Boolean boolD = yd.d.B.d(j0Var.f23779d);
        boolean zD = ae.g.d(j0Var);
        if (cVar == ud.c.f21570a) {
            ud.t tVarP = vb.w.p(j0Var, fVar, f0Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (tVarP != null) {
                return t(this, wVar, tVarP, boolD, zD, 8);
            }
        } else {
            ud.t tVarP2 = vb.w.p(j0Var, fVar, f0Var, (40 & 8) == 0, (40 & 16) == 0, true);
            if (tVarP2 != null) {
                if (ef.n.n0(tVarP2.f21602a, "$delegate", false) == (cVar == ud.c.f21572c)) {
                    return q(wVar, tVarP2, true, true, boolD, zD);
                }
            }
        }
        return vb.r.f22819a;
    }

    public void H(String str) {
        SparseArray sparseArray = (SparseArray) this.f1651c;
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f1653e;
        HashMap map = (HashMap) this.f1650b;
        t4.o oVar = (t4.o) map.get(str);
        if (oVar != null && oVar.f20469c.isEmpty() && oVar.f20470d.isEmpty()) {
            map.remove(str);
            int i10 = oVar.f20467a;
            boolean z10 = sparseBooleanArray.get(i10);
            ((t4.q) this.f1654f).a(oVar, z10);
            if (z10) {
                sparseArray.remove(i10);
                sparseBooleanArray.delete(i10);
            } else {
                sparseArray.put(i10, null);
                ((SparseBooleanArray) this.f1652d).put(i10, true);
            }
        }
    }

    public ch.l I() {
        ch.l lVar = new ch.l(false);
        lVar.f4201b = (ug.t) this.f1650b;
        lVar.f4203d = (String) this.f1651c;
        lVar.f4204e = (ug.b0) this.f1653e;
        lVar.f4205f = (ud.n) this.f1654f;
        lVar.f4202c = ((ug.r) this.f1652d).j();
        return lVar;
    }

    public void J() {
        try {
            lh.b0 b0VarL = g8.a.l(B());
            try {
                lh.i iVarJ = b0VarL.j(b0VarL.readInt());
                lh.i iVarJ2 = b0VarL.j(b0VarL.readInt());
                b0VarL.close();
                synchronized (this) {
                    jc.l.b(iVarJ);
                    this.f1652d = iVarJ;
                    jc.l.b(iVarJ2);
                    this.f1653e = iVarJ2;
                }
            } finally {
            }
        } finally {
            ((CountDownLatch) this.f1651c).countDown();
        }
    }

    public void K() {
        ((t4.q) this.f1654f).e((HashMap) this.f1650b);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.f1652d;
        int size = sparseBooleanArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((SparseArray) this.f1651c).remove(sparseBooleanArray.keyAt(i10));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.f1653e).clear();
    }

    public void L(m4.i1 i1Var) {
        ah.j jVar = new ah.j(4);
        if (((ya.i0) this.f1653e).isEmpty()) {
            l(jVar, (j5.d0) this.f1654f, i1Var);
            if (!ud.n.f((j5.d0) this.f1655g, (j5.d0) this.f1654f)) {
                l(jVar, (j5.d0) this.f1655g, i1Var);
            }
            if (!ud.n.f((j5.d0) this.f1652d, (j5.d0) this.f1654f) && !ud.n.f((j5.d0) this.f1652d, (j5.d0) this.f1655g)) {
                l(jVar, (j5.d0) this.f1652d, i1Var);
            }
        } else {
            for (int i10 = 0; i10 < ((ya.i0) this.f1653e).size(); i10++) {
                l(jVar, (j5.d0) ((ya.i0) this.f1653e).get(i10), i1Var);
            }
            if (!((ya.i0) this.f1653e).contains((j5.d0) this.f1652d)) {
                l(jVar, (j5.d0) this.f1652d, i1Var);
            }
        }
        this.f1651c = jVar.c();
    }

    @Override // oe.c
    public ArrayList c(wd.y0 y0Var, yd.f fVar) {
        jc.l.e(y0Var, "proto");
        jc.l.e(fVar, "nameResolver");
        Object objK = y0Var.k(zd.j.f26810h);
        jc.l.d(objK, "getExtension(...)");
        Iterable<wd.h> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(vb.n.K(iterable, 10));
        for (wd.h hVar : iterable) {
            jc.l.b(hVar);
            arrayList.add(((m0.w) this.f1654f).v(hVar, fVar));
        }
        return arrayList;
    }

    @Override // oe.c
    public List e(oe.w wVar, wd.w wVar2) {
        jc.l.e(wVar, "container");
        String string = wVar.f16431a.getString(wVar2.f24012d);
        String strB = ae.b.b(((oe.u) wVar).f16427f.b());
        jc.l.e(strB, "desc");
        return t(this, wVar, new ud.t(string + '#' + strB), null, false, 60);
    }

    @Override // oe.a
    public Object f(oe.w wVar, wd.j0 j0Var, se.w wVar2) {
        jc.l.e(j0Var, "proto");
        return E(wVar, j0Var, 3, wVar2, ud.a.f21567b);
    }

    @Override // oe.c
    public List g(oe.w wVar, ce.b bVar, int i10, int i11, wd.b1 b1Var) {
        jc.l.e(bVar, "callableProto");
        j2.h0.q(i10, "kind");
        return F(wVar, bVar, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // oe.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List h(oe.w r7, ce.b r8, int r9, int r10, wd.b1 r11) {
        /*
            r6 = this;
            java.lang.String r11 = "callableProto"
            jc.l.e(r8, r11)
            java.lang.String r11 = "kind"
            j2.h0.q(r9, r11)
            boolean r11 = r8 instanceof wd.b0
            r0 = 0
            if (r11 == 0) goto L19
            r1 = r8
            wd.b0 r1 = (wd.b0) r1
            java.util.List r1 = r1.f23563o
            int r1 = r1.size()
            goto L28
        L19:
            boolean r1 = r8 instanceof wd.j0
            if (r1 == 0) goto L27
            r1 = r8
            wd.j0 r1 = (wd.j0) r1
            java.util.List r1 = r1.f23790o
            int r1 = r1.size()
            goto L28
        L27:
            r1 = 0
        L28:
            r2 = 64
            r3 = 32
            r4 = 1
            if (r11 == 0) goto L3e
            r11 = r8
            wd.b0 r11 = (wd.b0) r11
            int r11 = r11.f23551c
            r5 = r11 & 32
            if (r5 != r3) goto L39
            goto L3c
        L39:
            r11 = r11 & r2
            if (r11 != r2) goto L64
        L3c:
            r0 = 1
            goto L64
        L3e:
            boolean r11 = r8 instanceof wd.j0
            if (r11 == 0) goto L50
            r11 = r8
            wd.j0 r11 = (wd.j0) r11
            int r11 = r11.f23778c
            r5 = r11 & 32
            if (r5 != r3) goto L4c
            goto L4f
        L4c:
            r11 = r11 & r2
            if (r11 != r2) goto L64
        L4f:
            goto L3c
        L50:
            boolean r11 = r8 instanceof wd.n
            if (r11 == 0) goto L6b
            r11 = r7
            oe.u r11 = (oe.u) r11
            wd.j r2 = r11.f16428g
            wd.j r3 = wd.j.f23772d
            if (r2 != r3) goto L5f
            r0 = 2
            goto L64
        L5f:
            boolean r11 = r11.f16429h
            if (r11 == 0) goto L64
            goto L3c
        L64:
            int r1 = r1 + r0
            int r1 = r1 + r10
            java.util.List r7 = r6.F(r7, r8, r9, r1)
            return r7
        L6b:
            java.lang.UnsupportedOperationException r7 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Unsupported message: "
            r9.<init>(r10)
            java.lang.Class r8 = r8.getClass()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.b1.h(oe.w, ce.b, int, int, wd.b1):java.util.List");
    }

    @Override // oe.a
    public Object i(oe.w wVar, wd.j0 j0Var, se.w wVar2) {
        jc.l.e(j0Var, "proto");
        return E(wVar, j0Var, 2, wVar2, ud.a.f21568c);
    }

    @Override // oe.c
    public List j(oe.w wVar, wd.j0 j0Var) {
        jc.l.e(j0Var, "proto");
        return G(wVar, j0Var, ud.c.f21572c);
    }

    @Override // oe.c
    public ArrayList k(oe.u uVar) throws InvocationTargetException {
        jc.l.e(uVar, "container");
        yc.m0 m0Var = uVar.f16433c;
        ud.r rVar = m0Var instanceof ud.r ? (ud.r) m0Var : null;
        dd.c cVar = rVar != null ? rVar.f21601a : null;
        if (cVar == null) {
            throw new IllegalStateException(("Class for loading annotations is not found: " + uVar.f16427f.a()).toString());
        }
        ArrayList arrayList = new ArrayList(1);
        Class cls = cVar.f5866a;
        jc.l.e(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        jc.l.d(declaredAnnotations, "getDeclaredAnnotations(...)");
        for (Annotation annotation : declaredAnnotations) {
            jc.l.b(annotation);
            Class clsD = g8.a.D(g8.a.y(annotation));
            id.h hVarD = D(ed.d.a(clsD), new dd.a(annotation), arrayList);
            if (hVarD != null) {
                a2.c.V(hVarD, annotation, clsD);
            }
        }
        return arrayList;
    }

    public void l(ah.j jVar, j5.d0 d0Var, m4.i1 i1Var) {
        if (d0Var == null) {
            return;
        }
        if (i1Var.b(d0Var.f10245a) != -1) {
            jVar.G(d0Var, i1Var);
            return;
        }
        m4.i1 i1Var2 = (m4.i1) ((ya.k0) this.f1651c).get(d0Var);
        if (i1Var2 != null) {
            jVar.G(d0Var, i1Var2);
        }
    }

    @Override // oe.c
    public List m(oe.w wVar, wd.j0 j0Var) {
        jc.l.e(j0Var, "proto");
        return G(wVar, j0Var, ud.c.f21571b);
    }

    public h8.h n() {
        Context context = (Context) this.f1650b;
        s8.c cVar = (s8.c) this.f1651c;
        ub.p pVarD = (ub.p) this.f1652d;
        if (pVarD == null) {
            final int i10 = 0;
            pVarD = ub.a.d(new ic.a(this) { // from class: h8.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b1 f8211b;

                {
                    this.f8211b = this;
                }

                @Override // ic.a
                public final Object b() {
                    k8.f fVar;
                    long jL;
                    switch (i10) {
                        case 0:
                            return new q8.a((Context) this.f8211b.f1650b).a();
                        default:
                            b1 b1Var = this.f8211b;
                            x8.h hVar = x8.h.f24851a;
                            Context context2 = (Context) b1Var.f1650b;
                            synchronized (hVar) {
                                try {
                                    fVar = x8.h.f24852b;
                                    if (fVar == null) {
                                        u uVar = l.f12595a;
                                        pf.e eVar = l0.f8566a;
                                        pf.d dVar = pf.d.f17138c;
                                        Bitmap.Config[] configArr = x8.d.f24838a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir == null) {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                        cacheDir.mkdirs();
                                        File fileI0 = fc.b.i0(cacheDir, "image_cache");
                                        String str = y.f12619b;
                                        y yVarW = w.w(fileI0);
                                        if (0.02d > 0.0d) {
                                            jL = 10485760;
                                            try {
                                                File file = yVarW.toFile();
                                                file.mkdir();
                                                StatFs statFs = new StatFs(file.getAbsolutePath());
                                                jL = nh.b.l((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                                break;
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            jL = 0;
                                        }
                                        k8.f fVar2 = new k8.f(jL, dVar, uVar, yVarW);
                                        x8.h.f24852b = fVar2;
                                        fVar = fVar2;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return fVar;
                    }
                }
            });
        }
        ub.p pVarD2 = (ub.p) this.f1653e;
        if (pVarD2 == null) {
            final int i11 = 1;
            pVarD2 = ub.a.d(new ic.a(this) { // from class: h8.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b1 f8211b;

                {
                    this.f8211b = this;
                }

                @Override // ic.a
                public final Object b() {
                    k8.f fVar;
                    long jL;
                    switch (i11) {
                        case 0:
                            return new q8.a((Context) this.f8211b.f1650b).a();
                        default:
                            b1 b1Var = this.f8211b;
                            x8.h hVar = x8.h.f24851a;
                            Context context2 = (Context) b1Var.f1650b;
                            synchronized (hVar) {
                                try {
                                    fVar = x8.h.f24852b;
                                    if (fVar == null) {
                                        u uVar = l.f12595a;
                                        pf.e eVar = l0.f8566a;
                                        pf.d dVar = pf.d.f17138c;
                                        Bitmap.Config[] configArr = x8.d.f24838a;
                                        File cacheDir = context2.getCacheDir();
                                        if (cacheDir == null) {
                                            throw new IllegalStateException("cacheDir == null");
                                        }
                                        cacheDir.mkdirs();
                                        File fileI0 = fc.b.i0(cacheDir, "image_cache");
                                        String str = y.f12619b;
                                        y yVarW = w.w(fileI0);
                                        if (0.02d > 0.0d) {
                                            jL = 10485760;
                                            try {
                                                File file = yVarW.toFile();
                                                file.mkdir();
                                                StatFs statFs = new StatFs(file.getAbsolutePath());
                                                jL = nh.b.l((long) (0.02d * statFs.getBlockCountLong() * statFs.getBlockSizeLong()), 10485760L, 262144000L);
                                                break;
                                            } catch (Exception unused) {
                                            }
                                        } else {
                                            jL = 0;
                                        }
                                        k8.f fVar2 = new k8.f(jL, dVar, uVar, yVarW);
                                        x8.h.f24852b = fVar2;
                                        fVar = fVar2;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            return fVar;
                    }
                }
            });
        }
        ub.p pVarD3 = (ub.p) this.f1654f;
        if (pVarD3 == null) {
            pVarD3 = ub.a.d(new e.e(21));
        }
        vb.r rVar = vb.r.f22819a;
        return new h8.h(context, cVar, pVarD, pVarD2, pVarD3, new h8.b(rVar, rVar, rVar, rVar, rVar), (x8.g) this.f1655g);
    }

    @Override // oe.c
    public List o(oe.w wVar, ce.b bVar, int i10) {
        jc.l.e(bVar, "proto");
        j2.h0.q(i10, "kind");
        if (i10 == 2) {
            return G(wVar, (wd.j0) bVar, ud.c.f21570a);
        }
        ud.t tVarW = w(bVar, wVar.f16431a, wVar.f16432b, i10, false);
        return tVarW == null ? vb.r.f22819a : t(this, wVar, tVarW, null, false, 60);
    }

    public ug.g p() {
        ug.g gVar = (ug.g) this.f1655g;
        if (gVar != null) {
            return gVar;
        }
        ug.g gVar2 = ug.g.f21779n;
        ug.g gVarR = ua.j.r((ug.r) this.f1652d);
        this.f1655g = gVarR;
        return gVarR;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List q(oe.w r9, ud.t r10, boolean r11, boolean r12, java.lang.Boolean r13, boolean r14) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f1650b
            r6 = r0
            dd.b r6 = (dd.b) r6
            java.lang.Object r0 = r8.f1655g
            r7 = r0
            yd.e r7 = (yd.e) r7
            r1 = r9
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            dd.c r9 = ud.b.s(r1, r2, r3, r4, r5, r6, r7)
            if (r9 != 0) goto L2d
            boolean r9 = r1 instanceof oe.u
            r11 = 0
            if (r9 == 0) goto L2c
            r9 = r1
            oe.u r9 = (oe.u) r9
            yc.m0 r9 = r9.f16433c
            boolean r12 = r9 instanceof ud.r
            if (r12 == 0) goto L26
            ud.r r9 = (ud.r) r9
            goto L27
        L26:
            r9 = r11
        L27:
            if (r9 == 0) goto L2c
            dd.c r9 = r9.f21601a
            goto L2d
        L2c:
            r9 = r11
        L2d:
            if (r9 != 0) goto L30
            goto L44
        L30:
            java.lang.Object r11 = r8.f1651c
            re.e r11 = (re.e) r11
            java.lang.Object r9 = r11.a(r9)
            ud.d r9 = (ud.d) r9
            java.util.HashMap r9 = r9.f21574a
            java.lang.Object r9 = r9.get(r10)
            java.util.List r9 = (java.util.List) r9
            if (r9 != 0) goto L46
        L44:
            vb.r r9 = vb.r.f22819a
        L46:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b7.b1.q(oe.w, ud.t, boolean, boolean, java.lang.Boolean, boolean):java.util.List");
    }

    @Override // oe.c
    public ArrayList r(wd.t0 t0Var, yd.f fVar) {
        jc.l.e(t0Var, "proto");
        jc.l.e(fVar, "nameResolver");
        Object objK = t0Var.k(zd.j.f26808f);
        jc.l.d(objK, "getExtension(...)");
        Iterable<wd.h> iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(vb.n.K(iterable, 10));
        for (wd.h hVar : iterable) {
            jc.l.b(hVar);
            arrayList.add(((m0.w) this.f1654f).v(hVar, fVar));
        }
        return arrayList;
    }

    @Override // oe.c
    public List s(oe.w wVar, ce.b bVar, int i10) {
        jc.l.e(bVar, "proto");
        j2.h0.q(i10, "kind");
        return F(wVar, bVar, i10, bVar instanceof wd.b0 ? ((wd.b0) bVar).f23563o.size() : bVar instanceof wd.j0 ? ((wd.j0) bVar).f23790o.size() : 0);
    }

    public String toString() {
        switch (this.f1649a) {
            case 6:
                ud.n nVar = (ud.n) this.f1654f;
                StringBuilder sb = new StringBuilder(32);
                sb.append("Request{method=");
                sb.append((String) this.f1651c);
                sb.append(", url=");
                sb.append((ug.t) this.f1650b);
                ug.r rVar = (ug.r) this.f1652d;
                if (rVar.size() != 0) {
                    sb.append(", headers=[");
                    int i10 = 0;
                    for (Object obj : rVar) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            ud.b.H();
                            throw null;
                        }
                        ub.k kVar = (ub.k) obj;
                        String str = (String) kVar.f21543a;
                        String str2 = (String) kVar.f21544b;
                        if (i10 > 0) {
                            sb.append(", ");
                        }
                        sb.append(str);
                        sb.append(':');
                        if (wg.e.l(str)) {
                            str2 = "██";
                        }
                        sb.append(str2);
                        i10 = i11;
                    }
                    sb.append(']');
                }
                if (!jc.l.a(nVar, wg.a.f24220b)) {
                    sb.append(", tags=");
                    sb.append(nVar);
                }
                sb.append('}');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public t4.o v(String str) {
        return (t4.o) ((HashMap) this.f1650b).get(str);
    }

    public t4.o x(String str) {
        HashMap map = (HashMap) this.f1650b;
        t4.o oVar = (t4.o) map.get(str);
        if (oVar != null) {
            return oVar;
        }
        SparseArray sparseArray = (SparseArray) this.f1651c;
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt < 0) {
            while (i10 < size && i10 == sparseArray.keyAt(i10)) {
                i10++;
            }
            iKeyAt = i10;
        }
        t4.o oVar2 = new t4.o(iKeyAt, str, t4.s.f20477c);
        map.put(str, oVar2);
        sparseArray.put(iKeyAt, str);
        ((SparseBooleanArray) this.f1653e).put(iKeyAt, true);
        ((t4.q) this.f1654f).g(oVar2);
        return oVar2;
    }

    public void y(long j10) {
        t4.q qVar;
        SparseArray sparseArray = (SparseArray) this.f1651c;
        HashMap map = (HashMap) this.f1650b;
        t4.q qVar2 = (t4.q) this.f1654f;
        qVar2.f(j10);
        t4.q qVar3 = (t4.q) this.f1655g;
        if (qVar3 != null) {
            qVar3.f(j10);
        }
        if (qVar2.d() || (qVar = (t4.q) this.f1655g) == null || !qVar.d()) {
            qVar2.h(map, sparseArray);
        } else {
            ((t4.q) this.f1655g).h(map, sparseArray);
            qVar2.c(map);
        }
        t4.q qVar4 = (t4.q) this.f1655g;
        if (qVar4 != null) {
            qVar4.i();
            this.f1655g = null;
        }
    }

    public boolean z(be.b bVar) {
        dd.c cVarI;
        if (bVar.e() != null && jc.l.a(bVar.f().b(), "Container") && (cVarI = ud.n.i((dd.b) this.f1650b, bVar, (yd.e) this.f1655g)) != null) {
            LinkedHashSet linkedHashSet = uc.a.f21565a;
            Class cls = cVarI.f5866a;
            jc.l.e(cls, "klass");
            Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
            jc.l.d(declaredAnnotations, "getDeclaredAnnotations(...)");
            boolean z10 = false;
            for (Annotation annotation : declaredAnnotations) {
                jc.l.b(annotation);
                if (ed.d.a(g8.a.D(g8.a.y(annotation))).equals(ld.v.f12256b)) {
                    z10 = true;
                }
            }
            if (z10) {
                return true;
            }
        }
        return false;
    }

    public b1(ch.l lVar) {
        this.f1649a = 6;
        jc.l.e(lVar, "builder");
        ug.t tVar = (ug.t) lVar.f4201b;
        if (tVar != null) {
            this.f1650b = tVar;
            this.f1651c = (String) lVar.f4203d;
            this.f1652d = ((hd.q0) lVar.f4202c).k();
            this.f1653e = (ug.b0) lVar.f4204e;
            this.f1654f = (ud.n) lVar.f4205f;
            return;
        }
        throw new IllegalStateException("url == null");
    }

    public b1(g5.n nVar, MediaFormat mediaFormat, m4.q qVar, Surface surface, MediaCrypto mediaCrypto, c7.e1 e1Var) {
        this.f1649a = 1;
        this.f1650b = nVar;
        this.f1651c = mediaFormat;
        this.f1652d = qVar;
        this.f1653e = surface;
        this.f1654f = mediaCrypto;
        this.f1655g = e1Var;
    }

    public b1(Context context) {
        this.f1649a = 2;
        this.f1650b = context.getApplicationContext();
        this.f1651c = x8.c.f24837a;
        this.f1652d = null;
        this.f1653e = null;
        this.f1654f = null;
        this.f1655g = new x8.g();
    }

    public b1(r4.a aVar, File file) {
        this.f1649a = 4;
        this.f1650b = new HashMap();
        this.f1651c = new SparseArray();
        this.f1652d = new SparseBooleanArray();
        this.f1653e = new SparseBooleanArray();
        t4.p pVar = aVar != null ? new t4.p(aVar) : null;
        File file2 = new File(file, "cached_content_index.exi");
        a0.v vVar = new a0.v();
        vVar.f153b = null;
        vVar.f154c = null;
        vVar.f155d = new m0.w(file2);
        if (pVar != null) {
            this.f1654f = pVar;
            this.f1655g = vVar;
        } else {
            int i10 = p4.c0.f16548a;
            this.f1654f = vVar;
            this.f1655g = pVar;
        }
    }

    public b1(m4.f1 f1Var) {
        this.f1649a = 7;
        this.f1650b = f1Var;
        ya.g0 g0Var = ya.i0.f25998b;
        this.f1653e = ya.a1.f25946e;
        this.f1651c = ya.f1.f25977g;
    }

    public b1(int i10) {
        this.f1649a = i10;
        switch (i10) {
            case 3:
                this.f1649a = 3;
                this.f1650b = new AtomicBoolean(false);
                this.f1651c = new CountDownLatch(1);
                this.f1655g = "PublicSuffixDatabase.list";
                break;
            default:
                this.f1650b = v3.F.f(b4.f1659g);
                this.f1651c = f4.f1776b;
                this.f1652d = m4.u0.f14591b;
                this.f1653e = ya.a1.f25946e;
                this.f1654f = Bundle.EMPTY;
                this.f1655g = null;
                break;
        }
    }

    public b1(v3 v3Var, f4 f4Var, m4.u0 u0Var, ya.i0 i0Var, Bundle bundle, g4 g4Var) {
        this.f1649a = 0;
        this.f1650b = v3Var;
        this.f1651c = f4Var;
        this.f1652d = u0Var;
        this.f1653e = i0Var;
        this.f1654f = bundle == null ? Bundle.EMPTY : bundle;
        this.f1655g = g4Var;
    }
}
