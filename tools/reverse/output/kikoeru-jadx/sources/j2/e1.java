package j2;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Matrix f9796a = new Matrix();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f9797b = new int[2];

    @Override // j2.c1
    public void a(View view, float[] fArr) {
        Matrix matrix = this.f9796a;
        matrix.reset();
        view.transformMatrixToGlobal(matrix);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f9797b;
        view.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix.postTranslate(iArr[0] - i10, iArr[1] - i11);
        q1.h0.v(matrix, fArr);
    }
}
