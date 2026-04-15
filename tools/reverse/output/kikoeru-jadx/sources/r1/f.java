package r1;

import q1.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f18678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q f18679f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f18680g;

    public f(q qVar, q qVar2) {
        float[] fArrG;
        super(qVar2, qVar, qVar2, null);
        this.f18678e = qVar;
        this.f18679f = qVar2;
        float[] fArr = a.f18643b.f18644a;
        s sVar = qVar.f18705d;
        float[] fArr2 = qVar.f18710i;
        s sVar2 = qVar2.f18705d;
        float[] fArr3 = qVar2.f18711j;
        if (j.d(sVar, sVar2)) {
            fArrG = j.g(fArr3, fArr2);
        } else {
            float[] fArrA = sVar.a();
            float[] fArrA2 = sVar2.a();
            s sVar3 = j.f18687b;
            fArrG = j.g(j.d(sVar2, sVar3) ? fArr3 : j.f(j.g(j.c(fArr, fArrA2, new float[]{0.964212f, 1.0f, 0.825188f}), qVar2.f18710i)), j.d(sVar, sVar3) ? fArr2 : j.g(j.c(fArr, fArrA, new float[]{0.964212f, 1.0f, 0.825188f}), fArr2));
        }
        this.f18680g = fArrG;
    }

    @Override // r1.g
    public final long a(long j10) {
        float fH = q1.q.h(j10);
        float fG = q1.q.g(j10);
        float fE = q1.q.e(j10);
        float fD = q1.q.d(j10);
        m mVar = this.f18678e.f18717p;
        float fC = (float) mVar.c(fH);
        float fC2 = (float) mVar.c(fG);
        float fC3 = (float) mVar.c(fE);
        float[] fArr = this.f18680g;
        float f10 = (fArr[6] * fC3) + (fArr[3] * fC2) + (fArr[0] * fC);
        float f11 = (fArr[7] * fC3) + (fArr[4] * fC2) + (fArr[1] * fC);
        float f12 = (fArr[8] * fC3) + (fArr[5] * fC2) + (fArr[2] * fC);
        q qVar = this.f18679f;
        float fC4 = (float) qVar.f18714m.c(f10);
        m mVar2 = qVar.f18714m;
        return h0.b(fC4, (float) mVar2.c(f11), (float) mVar2.c(f12), fD, qVar);
    }
}
