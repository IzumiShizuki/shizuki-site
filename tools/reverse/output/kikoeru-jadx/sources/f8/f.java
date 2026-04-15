package f8;

import android.animation.TypeEvaluator;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p3.d[] f6860a;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        p3.d[] dVarArr = (p3.d[]) obj;
        p3.d[] dVarArr2 = (p3.d[]) obj2;
        if (!n7.d.d(dVarArr, dVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!n7.d.d(this.f6860a, dVarArr)) {
            this.f6860a = n7.d.m(dVarArr);
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            p3.d dVar = this.f6860a[i10];
            p3.d dVar2 = dVarArr[i10];
            p3.d dVar3 = dVarArr2[i10];
            dVar.getClass();
            dVar.f16530a = dVar2.f16530a;
            int i11 = 0;
            while (true) {
                float[] fArr = dVar2.f16531b;
                if (i11 < fArr.length) {
                    dVar.f16531b[i11] = (dVar3.f16531b[i11] * f10) + ((1.0f - f10) * fArr[i11]);
                    i11++;
                }
            }
        }
        return this.f6860a;
    }
}
