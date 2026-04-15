package p5;

import m4.d1;
import p4.c0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y f16763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16765c;

    public /* synthetic */ x(y yVar, Object obj, long j10) {
        this.f16763a = yVar;
        this.f16764b = obj;
        this.f16765c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        v4.s sVar = this.f16763a.f16768c;
        int i10 = c0.f16548a;
        v4.v vVar = sVar.f22626a;
        w4.d dVar = vVar.f22689s;
        w4.a aVarZ = dVar.Z();
        Object obj = this.f16764b;
        dVar.a0(aVarZ, 26, new androidx.media3.exoplayer.offline.g(aVarZ, obj, this.f16765c));
        if (vVar.M == obj) {
            vVar.f22683m.e(26, new d1(21));
        }
    }
}
