package a0;

import b0.c1;
import b0.q0;
import b0.r0;
import b0.s0;
import b0.u0;
import b7.b1;
import c7.e1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.l0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import lf.w0;
import q.t0;
import r.u1;
import r.y1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class v implements s0, t4.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f154c = r.d.a(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f155d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f156e;

    public v(boolean z10, ic.a aVar) {
        this.f152a = z10;
        this.f153b = aVar;
    }

    public static int n(t4.o oVar, int i10) {
        int iHashCode = oVar.f20468b.hashCode() + (oVar.f20467a * 31);
        if (i10 < 2) {
            long jT = t0.t(oVar.f20471e);
            return (iHashCode * 31) + ((int) (jT ^ (jT >>> 32)));
        }
        return oVar.f20471e.hashCode() + (iHashCode * 31);
    }

    public static t4.o p(int i10, DataInputStream dataInputStream) throws IOException {
        t4.s sVarA;
        int i11 = dataInputStream.readInt();
        String utf = dataInputStream.readUTF();
        if (i10 < 2) {
            long j10 = dataInputStream.readLong();
            t4.i iVar = new t4.i();
            iVar.a(Long.valueOf(j10), "exo_len");
            sVarA = t4.s.f20477c.a(iVar);
        } else {
            sVarA = b1.a(dataInputStream);
        }
        return new t4.o(i11, utf, sVarA);
    }

    @Override // t4.q
    public void a(t4.o oVar, boolean z10) {
        this.f152a = true;
    }

    @Override // b0.s0
    public r0 b(int i10, int i11, int i12, long j10) {
        c0.g gVar = (c0.g) this.f153b;
        Object objB = gVar.b(i10);
        Object objI = gVar.f3063b.i(i10);
        List listB = ((q0) this.f154c).b(i10, j10);
        c0.k kVar = (c0.k) this.f156e;
        return new c0.r(i10, objB, listB, kVar.f3085f, kVar.f3091l, i11, i12, kVar.f3089j, kVar.f3090k, objI, kVar.f3080a.f3199t, j10);
    }

    @Override // t4.q
    public void c(HashMap map) throws Throwable {
        DataOutputStream dataOutputStream;
        m0.w wVar = (m0.w) this.f155d;
        DataOutputStream dataOutputStream2 = null;
        try {
            p4.a aVarJ = wVar.J();
            t4.w wVar2 = (t4.w) this.f156e;
            if (wVar2 == null) {
                this.f156e = new t4.w(aVarJ);
            } else {
                wVar2.b(aVarJ);
            }
            dataOutputStream = new DataOutputStream((t4.w) this.f156e);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            dataOutputStream.writeInt(2);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(map.size());
            int iN = 0;
            for (t4.o oVar : map.values()) {
                dataOutputStream.writeInt(oVar.f20467a);
                dataOutputStream.writeUTF(oVar.f20468b);
                b1.b(oVar.f20471e, dataOutputStream);
                iN += n(oVar, 2);
            }
            dataOutputStream.writeInt(iN);
            dataOutputStream.close();
            ((File) wVar.f13783c).delete();
            int i10 = p4.c0.f16548a;
            this.f152a = false;
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream2 = dataOutputStream;
            p4.c0.g(dataOutputStream2);
            throw th;
        }
    }

    @Override // t4.q
    public boolean d() {
        m0.w wVar = (m0.w) this.f155d;
        return ((File) wVar.f13782b).exists() || ((File) wVar.f13783c).exists();
    }

    @Override // t4.q
    public void e(HashMap map) throws Throwable {
        if (this.f152a) {
            c(map);
        }
    }

    @Override // t4.q
    public void g(t4.o oVar) {
        this.f152a = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0096 A[Catch: all -> 0x007e, IOException -> 0x0081, LOOP:0: B:36:0x0094->B:37:0x0096, LOOP_END, TryCatch #4 {IOException -> 0x0081, all -> 0x007e, blocks: (B:13:0x0045, B:18:0x004f, B:24:0x005f, B:25:0x0069, B:26:0x0072, B:33:0x0087, B:34:0x008c, B:35:0x008d, B:37:0x0096, B:38:0x00ac), top: B:62:0x0045 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b8  */
    @Override // t4.q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(java.util.HashMap r13, android.util.SparseArray r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.v.h(java.util.HashMap, android.util.SparseArray):void");
    }

    @Override // t4.q
    public void i() {
        m0.w wVar = (m0.w) this.f155d;
        ((File) wVar.f13782b).delete();
        ((File) wVar.f13783c).delete();
    }

    public void j() {
        synchronized (((ug.f) this.f156e)) {
            if (this.f152a) {
                return;
            }
            this.f152a = true;
            wg.e.b((lh.f0) this.f154c);
            try {
                ((b5.d0) this.f153b).b();
            } catch (IOException unused) {
            }
        }
    }

    public void k(l0 l0Var, float f10, long j10) {
        float fFloatValue = ((Number) ((r.c) this.f154c).e()).floatValue();
        if (fFloatValue > 0.0f) {
            long jB = q1.q.b(fFloatValue, j10);
            if (!this.f152a) {
                t0.j(l0Var, jB, f10, 0L, null, TinkerReport.KEY_APPLIED_INFO_CORRUPTED);
                return;
            }
            float fD = p1.e.d(l0Var.e());
            float fB = p1.e.b(l0Var.e());
            e1 e1Var = l0Var.f8782a.f19346b;
            long jD = e1Var.D();
            e1Var.z().f();
            try {
                ((e1) ((y1) e1Var.f3618b).f18634b).z().o(0.0f, 0.0f, fD, fB, 1);
                t0.j(l0Var, jB, f10, 0L, null, TinkerReport.KEY_APPLIED_INFO_CORRUPTED);
            } finally {
                t0.L(e1Var, jD);
            }
        }
    }

    public c0.r l(int i10, long j10) {
        int i11;
        long jH;
        c0.g gVar = (c0.g) this.f153b;
        Object objB = gVar.b(i10);
        Object objI = gVar.f3063b.i(i10);
        androidx.media3.exoplayer.offline.u uVar = (androidx.media3.exoplayer.offline.u) this.f155d;
        int[] iArr = (int[]) uVar.f969c;
        int length = iArr.length;
        int i12 = (int) (j10 >> 32);
        int i13 = length - 1;
        if (i12 <= i13) {
            i13 = i12;
        }
        int i14 = ((int) (j10 & 4294967295L)) - i12;
        int i15 = length - i13;
        int i16 = i14 > i15 ? i15 : i14;
        if (i16 == 1) {
            i11 = iArr[i13];
        } else {
            int[] iArr2 = (int[]) uVar.f968b;
            int i17 = (i13 + i16) - 1;
            i11 = (iArr2[i17] + iArr[i17]) - iArr2[i13];
        }
        if (this.f152a) {
            if (i11 < 0) {
                f3.i.a("width must be >= 0");
            }
            jH = f3.b.h(i11, i11, 0, Integer.MAX_VALUE);
        } else {
            if (i11 < 0) {
                f3.i.a("height must be >= 0");
            }
            jH = f3.b.h(0, Integer.MAX_VALUE, i11, i11);
        }
        long j11 = jH;
        List listB = ((q0) this.f154c).b(i10, j11);
        c0.k kVar = (c0.k) this.f156e;
        return new c0.r(i10, objB, listB, kVar.f3085f, kVar.f3091l, i13, i16, kVar.f3089j, kVar.f3090k, objI, kVar.f3080a.f3199t, j11);
    }

    public void m(w.j jVar, hf.y yVar) {
        ArrayList arrayList = (ArrayList) this.f155d;
        boolean z10 = jVar instanceof w.h;
        if (z10) {
            arrayList.add(jVar);
        } else if (jVar instanceof w.i) {
            arrayList.remove(((w.i) jVar).f22977a);
        } else if (jVar instanceof w.f) {
            arrayList.add(jVar);
        } else if (jVar instanceof w.g) {
            arrayList.remove(((w.g) jVar).f22976a);
        } else if (jVar instanceof w.b) {
            arrayList.add(jVar);
        } else if (jVar instanceof w.c) {
            arrayList.remove(((w.c) jVar).f22968a);
        } else if (!(jVar instanceof w.a)) {
            return;
        } else {
            arrayList.remove(((w.a) jVar).f22967a);
        }
        w.j jVar2 = (w.j) vb.m.i0(arrayList);
        if (jc.l.a((w.j) this.f156e, jVar2)) {
            return;
        }
        yb.c cVar = null;
        if (jVar2 != null) {
            u0.e eVar = (u0.e) ((ic.a) this.f153b).b();
            float f10 = z10 ? eVar.f21187c : jVar instanceof w.f ? eVar.f21186b : jVar instanceof w.b ? eVar.f21185a : 0.0f;
            u1 u1Var = u0.j.f21202a;
            if (!(jVar2 instanceof w.h) && ((jVar2 instanceof w.f) || (jVar2 instanceof w.b))) {
                u1Var = new u1(45, r.w.f18601d, 2);
            }
            hf.a0.y(yVar, null, null, new f7.x(this, f10, u1Var, (yb.c) null), 3);
        } else {
            w.j jVar3 = (w.j) this.f156e;
            u1 u1Var2 = u0.j.f21202a;
            if (!(jVar3 instanceof w.h) && !(jVar3 instanceof w.f) && (jVar3 instanceof w.b)) {
                u1Var2 = new u1(TinkerReport.KEY_APPLIED_PACKAGE_CHECK_SIGNATURE, r.w.f18601d, 2);
            }
            hf.a0.y(yVar, null, null, new w0(this, u1Var2, cVar, 24), 3);
        }
        this.f156e = jVar2;
    }

    public int o(androidx.media3.exoplayer.offline.u uVar, j2.v vVar, boolean z10) {
        boolean z11;
        int i10;
        int i11;
        c2.d dVar = (c2.d) this.f154c;
        i2.s sVar = (i2.s) this.f156e;
        if (this.f152a) {
            return 0;
        }
        try {
            this.f152a = true;
            b7.n nVarA = ((c1) this.f155d).A(uVar, vVar);
            o.s sVar2 = (o.s) nVarA.f1985c;
            int i12 = sVar2.i();
            for (int i13 = 0; i13 < i12; i13++) {
                c2.t tVar = (c2.t) sVar2.j(i13);
                if (!tVar.f3325d && !tVar.f3329h) {
                }
                z11 = false;
                break;
            }
            z11 = true;
            int i14 = sVar2.i();
            for (int i15 = 0; i15 < i14; i15++) {
                c2.t tVar2 = (c2.t) sVar2.j(i15);
                if (z11 || c2.s.a(tVar2)) {
                    ((i2.j0) this.f153b).A(tVar2.f3324c, (i2.s) this.f156e, tVar2.f3330i, true);
                    if (!sVar.f8845a.g()) {
                        dVar.a(tVar2.f3322a, sVar, c2.s.a(tVar2));
                        sVar.clear();
                    }
                }
            }
            boolean zD = dVar.d(nVarA, z10);
            if (nVarA.f1984b) {
                i10 = 0;
            } else {
                int i16 = sVar2.i();
                for (int i17 = 0; i17 < i16; i17++) {
                    c2.t tVar3 = (c2.t) sVar2.j(i17);
                    if (!p1.b.c(c2.s.f(tVar3, true), 0L) && tVar3.b()) {
                        i10 = 1;
                        break;
                    }
                }
                i10 = 0;
            }
            int i18 = sVar2.i();
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    i11 = 0;
                    break;
                }
                if (((c2.t) sVar2.j(i19)).b()) {
                    i11 = 1;
                    break;
                }
                i19++;
            }
            int i20 = (zD ? 1 : 0) | (i10 << 1) | (i11 << 2);
            this.f152a = false;
            return i20;
        } catch (Throwable th2) {
            this.f152a = false;
            throw th2;
        }
    }

    public void q(int i10, int i11) {
        if (i10 < 0.0f) {
            x.a.a("Index should be non-negative (" + i10 + ')');
        }
        ((x0.b1) this.f153b).f(i10);
        ((u0) this.f156e).a(i10);
        ((x0.b1) this.f154c).f(i11);
    }

    @Override // t4.q
    public void f(long j10) {
    }
}
