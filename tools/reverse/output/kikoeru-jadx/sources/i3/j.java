package i3;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import i2.j0;
import o1.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f8975a = new i();

    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(o1.i iVar, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        v vVarG = o1.f.g(((o1.k) iVar).f16099c);
        p1.c cVarJ = vVarG != null ? o1.f.j(vVarG) : null;
        if (cVarJ == null) {
            return null;
        }
        int i10 = (int) cVarJ.f16483a;
        int i11 = iArr[0];
        int i12 = iArr2[0];
        int i13 = (int) cVarJ.f16484b;
        int i14 = iArr[1];
        int i15 = iArr2[1];
        return new Rect((i10 + i11) - i12, (i13 + i14) - i15, (((int) cVarJ.f16485c) + i11) - i12, (((int) cVarJ.f16486d) + i14) - i15);
    }

    public static final View c(j1.p pVar) {
        q qVar = i2.f.y(pVar.f9690a).f8756o;
        View interopView = qVar != null ? qVar.getInteropView() : null;
        if (interopView != null) {
            return interopView;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void d(q qVar, j0 j0Var) {
        long jH = j0Var.F.f8664c.H(0L);
        int iRound = Math.round(Float.intBitsToFloat((int) (jH >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (jH & 4294967295L)));
        qVar.layout(iRound, iRound2, qVar.getMeasuredWidth() + iRound, qVar.getMeasuredHeight() + iRound2);
    }
}
