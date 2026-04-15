package j2;

import android.graphics.Matrix;
import android.view.View;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f9792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f9793b;

    public d1(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.f9792a = new int[size];
        this.f9793b = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            this.f9792a[i10] = ((Integer) arrayList.get(i10)).intValue();
            this.f9793b[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override // j2.c1
    public void a(View view, float[] fArr) {
        q1.a0.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z10 = parent instanceof View;
        float[] fArr2 = this.f9793b;
        if (z10) {
            b((View) parent, fArr);
            q1.a0.d(fArr2);
            q1.a0.f(fArr2, -view.getScrollX(), -view.getScrollY());
            l0.E(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            q1.a0.d(fArr2);
            q1.a0.f(fArr2, left, top);
            l0.E(fArr, fArr2);
        } else {
            int[] iArr = this.f9792a;
            view.getLocationInWindow(iArr);
            q1.a0.d(fArr2);
            q1.a0.f(fArr2, -view.getScrollX(), -view.getScrollY());
            l0.E(fArr, fArr2);
            float f10 = iArr[0];
            float f11 = iArr[1];
            q1.a0.d(fArr2);
            q1.a0.f(fArr2, f10, f11);
            l0.E(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        q1.h0.v(matrix, fArr2);
        l0.E(fArr, fArr2);
    }

    public d1(int i10, int i11) {
        this.f9792a = new int[]{i10, i11};
        this.f9793b = new float[]{0.0f, 1.0f};
    }

    public d1(int i10, int i11, int i12) {
        this.f9792a = new int[]{i10, i11, i12};
        this.f9793b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public d1(float[] fArr) {
        this.f9793b = fArr;
        this.f9792a = new int[2];
    }
}
