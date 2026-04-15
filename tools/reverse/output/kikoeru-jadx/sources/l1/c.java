package l1;

import a9.m;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.f;
import androidx.lifecycle.x;
import ce.j0;
import d.i0;
import j0.l;
import j2.h0;
import j2.l2;
import j2.t2;
import j2.v;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import k1.g;
import o.n;
import o.y;
import q2.o;
import q2.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements f, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f11675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i0 f11676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f11677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f11678d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f11679e = 100;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f11680f = a.f11668a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11681g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kf.f f11682h = g8.a.c(1, 6, null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Handler f11683i = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f11684j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11685k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y f11686l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public t2 f11687m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f11688n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final m f11689o;

    public c(v vVar, i0 i0Var) {
        this.f11675a = vVar;
        this.f11676b = i0Var;
        y yVar = n.f16024a;
        jc.l.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f11684j = yVar;
        this.f11686l = new y();
        o oVarA = vVar.getSemanticsOwner().a();
        jc.l.c(yVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f11687m = new t2(oVarA, yVar);
        this.f11689o = new m(18, this);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x007d -> B:17:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(ac.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof l1.b
            if (r0 == 0) goto L13
            r0 = r8
            l1.b r0 = (l1.b) r0
            int r1 = r0.f11674g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f11674g = r1
            goto L18
        L13:
            l1.b r0 = new l1.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.f11672e
            int r1 = r0.f11674g
            r2 = 2
            r3 = 1
            zb.a r4 = zb.a.f26667a
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            kf.c r1 = r0.f11671d
            ub.a.f(r8)
            goto L47
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L34:
            kf.c r1 = r0.f11671d
            ub.a.f(r8)
            goto L52
        L3a:
            ub.a.f(r8)
            kf.f r8 = r7.f11682h
            r8.getClass()
            kf.c r1 = new kf.c
            r1.<init>(r8)
        L47:
            r0.f11671d = r1
            r0.f11674g = r3
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r4) goto L52
            goto L7f
        L52:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L80
            r1.c()
            boolean r8 = r7.e()
            if (r8 == 0) goto L66
            r7.f()
        L66:
            boolean r8 = r7.f11688n
            if (r8 != 0) goto L73
            r7.f11688n = r3
            android.os.Handler r8 = r7.f11683i
            a9.m r5 = r7.f11689o
            r8.post(r5)
        L73:
            r0.f11671d = r1
            r0.f11674g = r2
            long r5 = r7.f11679e
            java.lang.Object r8 = hf.a0.l(r5, r0)
            if (r8 != r4) goto L47
        L7f:
            return r4
        L80:
            ub.a0 r8 = ub.a0.f21526a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c.a(ac.c):java.lang.Object");
    }

    @Override // androidx.lifecycle.f
    public final void b(x xVar) {
        jc.l.e(xVar, "owner");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(o.m r35) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c.c(o.m):void");
    }

    public final o.m d() {
        if (this.f11681g) {
            this.f11681g = false;
            this.f11684j = r.b(this.f11675a.getSemanticsOwner());
            this.f11685k = System.currentTimeMillis();
        }
        return this.f11684j;
    }

    public final boolean e() {
        return this.f11677c != null;
    }

    public final void f() {
        l lVar = this.f11677c;
        if (lVar == null) {
            return;
        }
        Object obj = lVar.f9610a;
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        ArrayList arrayList = this.f11678d;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) arrayList.get(i10);
            int iOrdinal = dVar.f11692c.ordinal();
            if (iOrdinal == 0) {
                b1.e eVar = dVar.f11693d;
                if (eVar != null) {
                    ViewStructure viewStructureH = android.support.v4.media.c.h(eVar.f1425a);
                    if (Build.VERSION.SDK_INT >= 29) {
                        m2.a.d(l2.g(obj), viewStructureH);
                    }
                }
            } else {
                if (iOrdinal != 1) {
                    throw new j0();
                }
                AutofillId autofillIdB = lVar.b(dVar.f11690a);
                if (autofillIdB != null && Build.VERSION.SDK_INT >= 29) {
                    m2.a.e(l2.g(obj), autofillIdB);
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionG = l2.g(obj);
            b1.e eVarK = a2.c.K(lVar.f9611b);
            Objects.requireNonNull(eVarK);
            m2.a.g(contentCaptureSessionG, g.k(eVarK.f1425a), new long[]{Long.MIN_VALUE});
        }
        arrayList.clear();
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void g(x xVar) {
        a0.c.o(xVar);
    }

    public final void h(o oVar, t2 t2Var) {
        b0.i0 i0Var = new b0.i0(13, t2Var, this);
        oVar.getClass();
        List listJ = o.j(4, oVar);
        int size = listJ.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = listJ.get(i11);
            if (d().a(((o) obj).f17642g)) {
                i0Var.q(Integer.valueOf(i10), obj);
                i10++;
            }
        }
        List listJ2 = o.j(4, oVar);
        int size2 = listJ2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            o oVar2 = (o) listJ2.get(i12);
            o.m mVarD = d();
            int i13 = oVar2.f17642g;
            if (mVarD.a(i13)) {
                y yVar = this.f11686l;
                if (yVar.a(i13)) {
                    Object objB = yVar.b(i13);
                    if (objB == null) {
                        throw h0.g("node not present in pruned tree before this change");
                    }
                    h(oVar2, (t2) objB);
                } else {
                    continue;
                }
            }
        }
    }

    public final void j(int i10, String str) {
        l lVar;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 29 && (lVar = this.f11677c) != null) {
            AutofillId autofillIdB = lVar.b(i10);
            if (autofillIdB == null) {
                throw h0.g("Invalid content capture ID");
            }
            if (i11 >= 29) {
                m2.a.f(l2.g(lVar.f9610a), autofillIdB, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(int r14, q2.o r15) {
        /*
            Method dump skipped, instruction units count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c.l(int, q2.o):void");
    }

    public final void m(o oVar) {
        if (e()) {
            this.f11678d.add(new d(oVar.f17642g, this.f11685k, e.f11695b, null));
            List listJ = o.j(4, oVar);
            int size = listJ.size();
            for (int i10 = 0; i10 < size; i10++) {
                m((o) listJ.get(i10));
            }
        }
    }

    @Override // androidx.lifecycle.f
    public final void n(x xVar) {
        m(this.f11675a.getSemanticsOwner().a());
        f();
        this.f11677c = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f11683i.removeCallbacks(this.f11689o);
        this.f11677c = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r18 = this;
            r0 = r18
            o.y r1 = r0.f11686l
            r1.c()
            o.m r2 = r0.d()
            int[] r3 = r2.f16008b
            java.lang.Object[] r4 = r2.f16009c
            long[] r2 = r2.f16007a
            int r5 = r2.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L5e
            r7 = 0
        L17:
            r8 = r2[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 == 0) goto L59
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = 0
        L31:
            if (r12 >= r10) goto L57
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r17 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r17 >= 0) goto L53
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r3[r13]
            r13 = r4[r13]
            q2.p r13 = (q2.p) r13
            j2.t2 r15 = new j2.t2
            q2.o r13 = r13.f17643a
            o.m r6 = r0.d()
            r15.<init>(r13, r6)
            r1.h(r14, r15)
        L53:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L31
        L57:
            if (r10 != r11) goto L5e
        L59:
            if (r7 == r5) goto L5e
            int r7 = r7 + 1
            goto L17
        L5e:
            j2.t2 r1 = new j2.t2
            j2.v r2 = r0.f11675a
            q2.q r2 = r2.getSemanticsOwner()
            q2.o r2 = r2.a()
            o.m r3 = r0.d()
            r1.<init>(r2, r3)
            r0.f11687m = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.c.p():void");
    }

    @Override // androidx.lifecycle.f
    public final void q(x xVar) {
        this.f11677c = (l) this.f11676b.b();
        l(-1, this.f11675a.getSemanticsOwner().a());
        f();
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void k(x xVar) {
    }

    @Override // androidx.lifecycle.f
    public final /* synthetic */ void o(x xVar) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
