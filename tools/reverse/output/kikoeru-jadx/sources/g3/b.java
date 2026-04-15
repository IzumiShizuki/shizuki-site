package g3;

import f3.i;
import o.t;
import o.v0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f7340a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile v0 f7341b = new v0(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object[] f7342c;

    static {
        Object[] objArr = new Object[0];
        f7342c = objArr;
        synchronized (objArr) {
            f7341b.f((int) 115.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f7341b.f((int) 130.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f7341b.f((int) 150.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f7341b.f((int) 180.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f7341b.f((int) 200.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f7341b.e(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        i.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static a a(float f10) {
        float fE;
        a cVar;
        float[] fArr = f7340a;
        if (f10 < 1.03f) {
            return null;
        }
        int i10 = (int) (f10 * 100.0f);
        a aVar = (a) f7341b.d(i10);
        if (aVar != null) {
            return aVar;
        }
        v0 v0Var = f7341b;
        if (v0Var.f16058a) {
            t.a(v0Var);
        }
        int iA = p.a.a(v0Var.f16059b, v0Var.f16061d, i10);
        if (iA >= 0) {
            return (a) f7341b.h(iA);
        }
        int i11 = -(iA + 1);
        int i12 = i11 - 1;
        if (i11 >= f7341b.g()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f10});
            b(f10, cVar2);
            return cVar2;
        }
        if (i12 < 0) {
            cVar = new c(fArr, fArr);
            fE = 1.0f;
        } else {
            fE = f7341b.e(i12) / 100.0f;
            cVar = (a) f7341b.h(i12);
        }
        float fE2 = f7341b.e(i11) / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, fE == fE2 ? 0.0f : (f10 - fE) / (fE2 - fE))) * 1.0f) + 0.0f;
        a aVar2 = (a) f7341b.h(i11);
        float[] fArr2 = new float[9];
        for (int i13 = 0; i13 < 9; i13++) {
            float f11 = fArr[i13];
            float fB = cVar.b(f11);
            fArr2[i13] = ((aVar2.b(f11) - fB) * fMax) + fB;
        }
        c cVar3 = new c(fArr, fArr2);
        b(f10, cVar3);
        return cVar3;
    }

    public static void b(float f10, c cVar) {
        synchronized (f7342c) {
            v0 v0VarClone = f7341b.clone();
            v0VarClone.f((int) (f10 * 100.0f), cVar);
            f7341b = v0VarClone;
        }
    }
}
