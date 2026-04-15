package y2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import q1.h0;
import t2.i0;
import t2.k0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j2.v f25381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tc.b0 f25382b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25384d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f25385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f25386f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f25387g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25388h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f25389i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public y f25390j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i0 f25391k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r f25392l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p1.c f25394n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p1.c f25395o;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f25383c = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public jc.m f25393m = b.f25361d;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CursorAnchorInfo.Builder f25396p = new CursorAnchorInfo.Builder();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final float[] f25397q = q1.a0.a();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Matrix f25398r = new Matrix();

    public c(j2.v vVar, tc.b0 b0Var) {
        this.f25381a = vVar;
        this.f25382b = b0Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, ub.h] */
    /* JADX WARN: Type inference failed for: r3v3, types: [ic.k, jc.m] */
    public final void a() {
        View view;
        int iE;
        int iE2;
        tc.b0 b0Var = this.f25382b;
        ?? r22 = b0Var.f20619c;
        InputMethodManager inputMethodManager = (InputMethodManager) r22.getValue();
        View view2 = (View) b0Var.f20618b;
        if (inputMethodManager.isActive(view2)) {
            ?? r32 = this.f25393m;
            float[] fArr = this.f25397q;
            r32.a(new q1.a0(fArr));
            this.f25381a.w(fArr);
            Matrix matrix = this.f25398r;
            h0.u(matrix, fArr);
            y yVar = this.f25390j;
            jc.l.b(yVar);
            long j10 = yVar.f25435b;
            r rVar = this.f25392l;
            jc.l.b(rVar);
            i0 i0Var = this.f25391k;
            jc.l.b(i0Var);
            t2.n nVar = i0Var.f20345b;
            p1.c cVar = this.f25394n;
            jc.l.b(cVar);
            float f10 = cVar.f16486d;
            float f11 = cVar.f16484b;
            p1.c cVar2 = this.f25395o;
            jc.l.b(cVar2);
            boolean z10 = this.f25386f;
            boolean z11 = this.f25387g;
            boolean z12 = this.f25388h;
            boolean z13 = this.f25389i;
            CursorAnchorInfo.Builder builder = this.f25396p;
            builder.reset();
            builder.setMatrix(matrix);
            k0 k0Var = yVar.f25436c;
            int iE3 = k0.e(j10);
            builder.setSelectionRange(iE3, k0.d(j10));
            e3.j jVar = e3.j.f6079b;
            if (!z10 || iE3 < 0) {
                view = view2;
            } else {
                int iP = rVar.p(iE3);
                p1.c cVarC = i0Var.c(iP);
                view = view2;
                float fJ = nh.b.j(cVarC.f16483a, 0.0f, (int) (i0Var.f20346c >> 32));
                boolean zI = ua.j.i(cVar, fJ, cVarC.f16484b);
                boolean zI2 = ua.j.i(cVar, fJ, cVarC.f16486d);
                boolean z14 = i0Var.a(iP) == jVar;
                int i10 = (zI || zI2) ? 1 : 0;
                if (!zI || !zI2) {
                    i10 |= 2;
                }
                if (z14) {
                    i10 |= 4;
                }
                float f12 = cVarC.f16484b;
                float f13 = cVarC.f16486d;
                builder.setInsertionMarkerLocation(fJ, f12, f13, f13, i10);
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
                        float f14 = fArr2[i11];
                        CursorAnchorInfo.Builder builder3 = builder2;
                        float f15 = fArr2[i11 + 1];
                        int i12 = iD;
                        float f16 = fArr2[i11 + 2];
                        float f17 = fArr2[i11 + 3];
                        int i13 = iE4;
                        int i14 = (cVar.f16483a < f16 ? 1 : 0) & (f14 < cVar.f16485c ? 1 : 0) & (f11 < f17 ? 1 : 0) & (f15 < f10 ? 1 : 0);
                        if (!ua.j.i(cVar, f14, f15) || !ua.j.i(cVar, f16, f17)) {
                            i14 |= 2;
                        }
                        if (i0Var.a(iP4) == jVar) {
                            i14 |= 4;
                        }
                        builder3.addCharacterBounds(i13, f14, f15, f16, f17, i14);
                        builder2 = builder3;
                        iE4 = i13 + 1;
                        iD = i12;
                    }
                }
            }
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 33 && z12) {
                builder2.setEditorBoundsInfo(d.o.h().setEditorBounds(h0.A(cVar2)).setHandwritingBounds(h0.A(cVar2)).build());
            }
            if (i15 >= 34 && z13 && !cVar.f() && (iE = nVar.e(f11)) <= (iE2 = nVar.e(f10))) {
                while (true) {
                    builder2.addVisibleLineBounds(i0Var.e(iE), nVar.f(iE), i0Var.f(iE), nVar.b(iE));
                    if (iE == iE2) {
                        break;
                    } else {
                        iE++;
                    }
                }
            }
            ((InputMethodManager) r22.getValue()).updateCursorAnchorInfo(view, builder2.build());
            this.f25385e = false;
        }
    }
}
