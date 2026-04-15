package k0;

import t2.c0;
import t2.l0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static b f10883h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3.m f10884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f10885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f3.d f10886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x2.d f10887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l0 f10888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f10889f = Float.NaN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f10890g = Float.NaN;

    public b(f3.m mVar, l0 l0Var, f3.d dVar, x2.d dVar2) {
        this.f10884a = mVar;
        this.f10885b = l0Var;
        this.f10886c = dVar;
        this.f10887d = dVar2;
        this.f10888e = c0.h(l0Var, mVar);
    }

    public final long a(int i10, long j10) {
        int i11;
        float f10 = this.f10890g;
        float f11 = this.f10889f;
        if (Float.isNaN(f10) || Float.isNaN(f11)) {
            String str = c.f10891a;
            long jB = f3.b.b(0, 0, 15);
            l0 l0Var = this.f10888e;
            f3.d dVar = this.f10886c;
            float fB = c0.a(str, l0Var, jB, dVar, this.f10887d, 1, 96).b();
            float fB2 = c0.a(c.f10892b, this.f10888e, f3.b.b(0, 0, 15), dVar, this.f10887d, 2, 96).b() - fB;
            this.f10890g = fB;
            this.f10889f = fB2;
            f11 = fB2;
            f10 = fB;
        }
        if (i10 != 1) {
            int iRound = Math.round((f11 * (i10 - 1)) + f10);
            i11 = iRound >= 0 ? iRound : 0;
            int iG = f3.a.g(j10);
            if (i11 > iG) {
                i11 = iG;
            }
        } else {
            i11 = f3.a.i(j10);
        }
        return f3.b.a(f3.a.j(j10), f3.a.h(j10), i11, f3.a.g(j10));
    }
}
