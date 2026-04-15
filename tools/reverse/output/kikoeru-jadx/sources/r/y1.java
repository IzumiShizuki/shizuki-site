package r;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class y1 implements b2, re.n, sa.k, yc.m, yc.m0, yc.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f18634b;

    public /* synthetic */ y1(int i10, Object obj) {
        this.f18633a = i10;
        this.f18634b = obj;
    }

    public static int c0(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        return i10 | (i11 << 4) | (((i13 << 4) | i12) << 8) | (((((i17 << 4) | i16) << 8) | ((i15 << 4) | i14)) << 16);
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x040f A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList d0(r.y1 r38, java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 1742
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r.y1.d0(r.y1, java.lang.String):java.util.ArrayList");
    }

    @Override // yc.m
    public Object B(bd.h hVar, Object obj) {
        return null;
    }

    @Override // yc.s
    public yc.s E(ld.o oVar) {
        jc.l.e(oVar, "visibility");
        return this;
    }

    @Override // sa.k
    public sa.j G() {
        ((sa.o) this.f18634b).getClass();
        return sa.o.f19728c;
    }

    @Override // r.x1
    public p H(long j10, p pVar, p pVar2, p pVar3) {
        return ((b0.w1) this.f18634b).H(j10, pVar, pVar2, pVar3);
    }

    @Override // yc.m
    public Object J(bd.l lVar, Object obj) {
        return m(lVar, obj);
    }

    @Override // yc.m
    public Object K(bd.e0 e0Var, Object obj) {
        return null;
    }

    @Override // yc.m
    public Object L(bd.k kVar, Object obj) {
        return null;
    }

    @Override // yc.m
    public Object M(bd.j0 j0Var, Object obj) {
        return null;
    }

    public v3.d P(int i10) {
        return null;
    }

    public void Q() {
        ((x0.r) this.f18634b).getClass();
    }

    public void R(byte b10) {
        ((Parcel) this.f18634b).writeByte(b10);
    }

    public void S(float f10) {
        ((Parcel) this.f18634b).writeFloat(f10);
    }

    public void T(long j10) {
        long jB = f3.o.b(j10);
        byte b10 = 0;
        if (!f3.p.a(jB, 0L)) {
            if (f3.p.a(jB, 4294967296L)) {
                b10 = 1;
            } else if (f3.p.a(jB, 8589934592L)) {
                b10 = 2;
            }
        }
        R(b10);
        if (f3.p.a(f3.o.b(j10), 0L)) {
            return;
        }
        S(f3.o.c(j10));
    }

    public v3.d U(int i10) {
        return null;
    }

    public y V(int i10) {
        switch (this.f18633a) {
            case 0:
                return ((z[]) this.f18634b)[i10];
            case 1:
                return (z) this.f18634b;
            default:
                return (y) this.f18634b;
        }
    }

    public u.e1 W() {
        return ((a0.t) this.f18634b).f128o;
    }

    public uh.z X(uh.b bVar) {
        long jC;
        a0.t tVar = (a0.t) this.f18634b;
        jc.l.e(bVar, "padding");
        float f10 = bVar.f21951a;
        float f11 = bVar.f21952b;
        int iOrdinal = W().ordinal();
        if (iOrdinal == 0) {
            jC = tVar.c() & 4294967295L;
        } else {
            if (iOrdinal != 1) {
                throw new ce.j0();
            }
            jC = tVar.c() >> 32;
        }
        return new uh.z(f10, ((int) jC) - f11);
    }

    public ArrayList Y() {
        Iterable iterable = (Iterable) ((a0.t) this.f18634b).f124k;
        ArrayList arrayList = new ArrayList(vb.n.K(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new uh.x((a0.u) it.next(), W()));
        }
        return arrayList;
    }

    public void Z() {
        View view = (View) this.f18634b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override // r.x1
    public boolean a() {
        ((b0.w1) this.f18634b).getClass();
        return false;
    }

    public void a0(float f10, float f11, float f12, float f13) {
        c7.e1 e1Var = (c7.e1) this.f18634b;
        q1.o oVarZ = e1Var.z();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (e1Var.D() >> 32)) - (f12 + f10);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (e1Var.D() & 4294967295L)) - (f13 + f11))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        if (!(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) >= 0.0f)) {
            q1.y.a("Width and height must be greater than or equal to zero");
        }
        e1Var.e0(jFloatToRawIntBits);
        oVarZ.p(f10, f11);
    }

    @Override // yc.m
    public Object b(bd.h0 h0Var, Object obj) {
        return null;
    }

    public void b0(Exception exc) {
        p4.c.o("MediaCodecAudioRenderer", "Audio sink error", exc);
        p5.y yVar = ((x4.x) this.f18634b).T0;
        Handler handler = yVar.f16767b;
        if (handler != null) {
            handler.post(new x4.g(yVar, exc, 5));
        }
    }

    @Override // yc.s
    public yc.t build() {
        return (ue.c) this.f18634b;
    }

    @Override // yc.s
    public yc.s e(be.e eVar) {
        jc.l.e(eVar, "name");
        return this;
    }

    public boolean e0(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // sa.k
    public float[] f() {
        ((sa.o) this.f18634b).getClass();
        return sa.o.f19729d;
    }

    public void f0(float f10, long j10) {
        q1.o oVarZ = ((c7.e1) this.f18634b).z();
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        oVarZ.p(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        oVarZ.c(f10);
        oVarZ.p(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    @Override // r.x1
    public p g(long j10, p pVar, p pVar2, p pVar3) {
        return ((b0.w1) this.f18634b).g(j10, pVar, pVar2, pVar3);
    }

    public void g0(float f10, float f11, long j10) {
        q1.o oVarZ = ((c7.e1) this.f18634b).z();
        int i10 = (int) (j10 >> 32);
        int i11 = (int) (j10 & 4294967295L);
        oVarZ.p(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
        oVarZ.b(f10, f11);
        oVarZ.p(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
    }

    @Override // yc.s
    public yc.s h(int i10) {
        j2.h0.q(i10, "kind");
        return this;
    }

    public void h0() {
        View viewFindViewById;
        View view = (View) this.f18634b;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
            viewFindViewById = view;
        } else {
            viewFindViewById = view.getRootView().findFocus();
        }
        if (viewFindViewById == null) {
            viewFindViewById = view.getRootView().findViewById(R.id.content);
        }
        if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
            return;
        }
        viewFindViewById.post(new a9.m(21, viewFindViewById));
    }

    @Override // yc.m
    public Object i(bd.q0 q0Var, Object obj) {
        return m(q0Var, obj);
    }

    public void i0(float f10, float f11) {
        ((c7.e1) this.f18634b).z().p(f10, f11);
    }

    @Override // yc.m
    public Object j(bd.c0 c0Var, Object obj) {
        return null;
    }

    @Override // re.n
    public void lock() {
        ((ReentrantLock) this.f18634b).lock();
    }

    @Override // yc.m
    public Object m(yc.t tVar, Object obj) {
        return new sc.k0((sc.i0) this.f18634b, tVar);
    }

    @Override // r.x1
    public long n(p pVar, p pVar2, p pVar3) {
        return ((b0.w1) this.f18634b).n(pVar, pVar2, pVar3);
    }

    @Override // yc.m
    public Object o(bd.a0 a0Var, Object obj) {
        return null;
    }

    @Override // yc.s
    public yc.s p(se.w wVar) {
        jc.l.e(wVar, "type");
        return this;
    }

    @Override // yc.s
    public yc.s q(zc.h hVar) {
        jc.l.e(hVar, "additionalAnnotations");
        return this;
    }

    @Override // r.x1
    public p t(p pVar, p pVar2, p pVar3) {
        return ((b0.w1) this.f18634b).t(pVar, pVar2, pVar3);
    }

    public String toString() {
        switch (this.f18633a) {
            case 15:
                StringBuilder sb = new StringBuilder();
                pd.p pVar = (pd.p) this.f18634b;
                sb.append(pVar);
                sb.append(": ");
                sb.append(((Map) n7.b0.r(pVar.f17067i, pd.p.f17064m[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    @Override // yc.s
    public yc.s u(yc.k kVar) {
        jc.l.e(kVar, "owner");
        return this;
    }

    @Override // re.n
    public void unlock() {
        ((ReentrantLock) this.f18634b).unlock();
    }

    @Override // yc.m
    public Object v(bd.p0 p0Var, Object obj) {
        int i10;
        sc.i0 i0Var = (sc.i0) this.f18634b;
        jc.l.e(p0Var, "descriptor");
        List listZ0 = p0Var.z0();
        jc.l.d(listZ0, "getContextReceiverParameters(...)");
        if (listZ0.isEmpty()) {
            i10 = (p0Var.f2652t != null ? 1 : 0) + (p0Var.f2653u != null ? 1 : 0);
        } else {
            i10 = -1;
        }
        if (p0Var.f2638f) {
            if (i10 == -1) {
                return new sc.s0(i0Var, p0Var);
            }
            if (i10 == 0) {
                return new sc.m0(i0Var, p0Var);
            }
            if (i10 == 1) {
                return new sc.o0(i0Var, p0Var);
            }
            if (i10 == 2) {
                return new sc.q0(i0Var, p0Var);
            }
        } else {
            if (i10 == -1) {
                return new sc.s1(i0Var, p0Var);
            }
            if (i10 == 0) {
                return new sc.d1(i0Var, p0Var);
            }
            if (i10 == 1) {
                return new sc.g1(i0Var, p0Var);
            }
            if (i10 == 2) {
                return new sc.j1(i0Var, p0Var);
            }
        }
        throw new hc.a("Unsupported property: " + p0Var);
    }

    @Override // yc.m
    public Object w(bd.r0 r0Var, Object obj) {
        return m(r0Var, obj);
    }

    @Override // yc.m
    public Object y(bd.y0 y0Var, Object obj) {
        return null;
    }

    @Override // qa.c
    public qa.b z() {
        ((sa.o) this.f18634b).getClass();
        return sa.o.f19727b;
    }

    public /* synthetic */ y1(int i10, boolean z10) {
        this.f18633a = i10;
    }

    public y1(View view) {
        this.f18633a = 12;
        if (Build.VERSION.SDK_INT >= 30) {
            u3.i iVar = new u3.i(11, view);
            iVar.f21302c = view;
            this.f18634b = iVar;
            return;
        }
        this.f18634b = new y1(11, view);
    }

    public y1(int[] iArr) {
        this.f18633a = 9;
        this.f18634b = (int[]) iArr.clone();
    }

    public y1(View view, Window window) {
        this.f18633a = 13;
        y1 y1Var = new y1(view);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            this.f18634b = new u3.a1(window, y1Var, 1);
            return;
        }
        if (i10 >= 30) {
            this.f18634b = new u3.x0(window, y1Var, 1);
            return;
        }
        if (i10 >= 26) {
            this.f18634b = new u3.z0(window, y1Var, 0);
        } else if (i10 >= 23) {
            this.f18634b = new u3.y0(window, y1Var, 0);
        } else {
            this.f18634b = new u3.x0(window, y1Var, 0);
        }
    }

    public y1(int i10) {
        r5.p pVar;
        this.f18633a = i10;
        switch (i10) {
            case 17:
                jc.l.e(TimeUnit.MINUTES, "timeUnit");
                yg.c cVar = yg.c.f26354l;
                jc.l.e(cVar, "taskRunner");
                this.f18634b = new h9.b(cVar);
                break;
            case 21:
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f18634b = new v3.f(this);
                } else {
                    this.f18634b = new v3.e(this);
                }
                break;
            case 26:
                if (Build.VERSION.SDK_INT >= 28) {
                    pVar = new r5.p(14);
                } else {
                    pVar = new r5.p(15);
                }
                this.f18634b = pVar;
                break;
            default:
                this.f18634b = sa.m.f19714a;
                break;
        }
    }

    @Override // yc.s
    public yc.s A() {
        return this;
    }

    @Override // yc.s
    public yc.s F() {
        return this;
    }

    @Override // yc.s
    public yc.s N() {
        return this;
    }

    @Override // yc.s
    public yc.s k() {
        return this;
    }

    @Override // yc.s
    public yc.s r() {
        return this;
    }

    @Override // yc.s
    public yc.s s() {
        return this;
    }

    @Override // yc.s
    public yc.s x() {
        return this;
    }

    @Override // yc.s
    public yc.s c(bd.a0 a0Var) {
        return this;
    }

    @Override // yc.s
    public yc.s d(List list) {
        return this;
    }

    @Override // yc.s
    public yc.s l(yc.x xVar) {
        return this;
    }

    public y1(float f10, float f11, p pVar) {
        y1 y1Var;
        this.f18633a = 3;
        int[] iArr = z1.f18640a;
        if (pVar != null) {
            y1Var = new y1(pVar, f10, f11);
        } else {
            y1Var = new y1(f10, f11);
        }
        this.f18634b = new b0.w1(15, y1Var);
    }

    public y1(p pVar, float f10, float f11) {
        this.f18633a = 0;
        int iB = pVar.b();
        z[] zVarArr = new z[iB];
        for (int i10 = 0; i10 < iB; i10++) {
            zVarArr[i10] = new z(f10, f11, pVar.a(i10));
        }
        this.f18634b = zVarArr;
    }

    public y1(float f10, float f11) {
        this.f18633a = 1;
        this.f18634b = new z(f10, f11, 0.01f);
    }

    public void O(int i10, v3.d dVar, String str, Bundle bundle) {
    }
}
