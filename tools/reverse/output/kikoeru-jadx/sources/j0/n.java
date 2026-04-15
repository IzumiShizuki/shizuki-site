package j0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import g2.c0;
import q1.a0;
import q1.h0;
import t2.i0;
import t2.k0;
import y2.y;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f9616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f9617b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9619d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9620e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9621f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9622g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9623h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f9624i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f9625j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0 f9626k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public y2.r f9627l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public p1.c f9628m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p1.c f9629n;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9618c = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f9630o = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final float[] f9631p = a0.a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Matrix f9632q = new Matrix();

    public n(b bVar, l lVar) {
        this.f9616a = bVar;
        this.f9617b = lVar;
    }

    public final void a() {
        float f10;
        float f11;
        int iE;
        int iE2;
        l lVar = this.f9617b;
        InputMethodManager inputMethodManagerA = lVar.a();
        View view = lVar.f9611b;
        if (!inputMethodManagerA.isActive(view) || this.f9625j == null || this.f9627l == null || this.f9626k == null || this.f9628m == null || this.f9629n == null) {
            return;
        }
        float[] fArr = this.f9631p;
        a0.d(fArr);
        c0 c0Var = (c0) this.f9616a.f9585i.f9615r.getValue();
        if (c0Var != null) {
            if (!c0Var.h()) {
                c0Var = null;
            }
            if (c0Var != null) {
                c0Var.j(fArr);
            }
        }
        p1.c cVar = this.f9629n;
        jc.l.b(cVar);
        float f12 = -cVar.f16483a;
        p1.c cVar2 = this.f9629n;
        jc.l.b(cVar2);
        a0.f(fArr, f12, -cVar2.f16484b);
        Matrix matrix = this.f9632q;
        h0.u(matrix, fArr);
        y yVar = this.f9625j;
        jc.l.b(yVar);
        long j10 = yVar.f25435b;
        y2.r rVar = this.f9627l;
        jc.l.b(rVar);
        i0 i0Var = this.f9626k;
        jc.l.b(i0Var);
        t2.n nVar = i0Var.f20345b;
        p1.c cVar3 = this.f9628m;
        jc.l.b(cVar3);
        float f13 = cVar3.f16486d;
        float f14 = cVar3.f16484b;
        p1.c cVar4 = this.f9629n;
        jc.l.b(cVar4);
        boolean z10 = this.f9621f;
        boolean z11 = this.f9622g;
        boolean z12 = this.f9623h;
        boolean z13 = this.f9624i;
        CursorAnchorInfo.Builder builder = this.f9630o;
        builder.reset();
        builder.setMatrix(matrix);
        k0 k0Var = yVar.f25436c;
        int iE3 = k0.e(j10);
        builder.setSelectionRange(iE3, k0.d(j10));
        e3.j jVar = e3.j.f6079b;
        if (!z10 || iE3 < 0) {
            f10 = f13;
            f11 = f14;
        } else {
            int iP = rVar.p(iE3);
            p1.c cVarC = i0Var.c(iP);
            f10 = f13;
            f11 = f14;
            float fJ = nh.b.j(cVarC.f16483a, 0.0f, (int) (i0Var.f20346c >> 32));
            boolean zY = a.a.y(cVar3, fJ, cVarC.f16484b);
            boolean zY2 = a.a.y(cVar3, fJ, cVarC.f16486d);
            boolean z14 = i0Var.a(iP) == jVar;
            int i10 = (zY || zY2) ? 1 : 0;
            if (!zY || !zY2) {
                i10 |= 2;
            }
            if (z14) {
                i10 |= 4;
            }
            float f15 = cVarC.f16484b;
            float f16 = cVarC.f16486d;
            builder.setInsertionMarkerLocation(fJ, f15, f16, f16, i10);
        }
        CursorAnchorInfo.Builder builder2 = builder;
        if (z11) {
            int iE4 = k0Var != null ? k0.e(k0Var.f20358a) : -1;
            int iD = k0Var != null ? k0.d(k0Var.f20358a) : -1;
            if (iE4 >= 0 && iE4 < iD) {
                builder2.setComposingText(iE4, yVar.f25434a.f20320b.subSequence(iE4, iD));
                int iP2 = rVar.p(iE4);
                int iP3 = rVar.p(iD);
                float[] fArr2 = new float[(iP3 - iP2) * 4];
                nVar.a(t2.c0.b(iP2, iP3), fArr2);
                while (iE4 < iD) {
                    int iP4 = rVar.p(iE4);
                    int i11 = (iP4 - iP2) * 4;
                    float f17 = fArr2[i11];
                    CursorAnchorInfo.Builder builder3 = builder2;
                    float f18 = fArr2[i11 + 1];
                    int i12 = iP2;
                    float f19 = fArr2[i11 + 2];
                    float f20 = fArr2[i11 + 3];
                    int i13 = iD;
                    int i14 = (cVar3.f16483a < f19 ? 1 : 0) & (f17 < cVar3.f16485c ? 1 : 0) & (f11 < f20 ? 1 : 0) & (f18 < f10 ? 1 : 0);
                    if (!a.a.y(cVar3, f17, f18) || !a.a.y(cVar3, f19, f20)) {
                        i14 |= 2;
                    }
                    if (i0Var.a(iP4) == jVar) {
                        i14 |= 4;
                    }
                    int i15 = iE4;
                    builder3.addCharacterBounds(i15, f17, f18, f19, f20, i14);
                    builder2 = builder3;
                    iE4 = i15 + 1;
                    iP2 = i12;
                    iD = i13;
                }
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 33 && z12) {
            builder2.setEditorBoundsInfo(d.o.h().setEditorBounds(h0.A(cVar4)).setHandwritingBounds(h0.A(cVar4)).build());
        }
        if (i16 >= 34 && z13 && !cVar3.f() && (iE = nVar.e(f11)) <= (iE2 = nVar.e(f10))) {
            while (true) {
                builder2.addVisibleLineBounds(i0Var.e(iE), nVar.f(iE), i0Var.f(iE), nVar.b(iE));
                if (iE == iE2) {
                    break;
                } else {
                    iE++;
                }
            }
        }
        lVar.a().updateCursorAnchorInfo(view, builder2.build());
        this.f9620e = false;
    }
}
