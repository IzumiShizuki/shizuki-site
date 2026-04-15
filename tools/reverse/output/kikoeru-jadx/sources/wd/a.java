package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ce.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23515a;

    public /* synthetic */ a(int i10) {
        this.f23515a = i10;
    }

    @Override // ce.y
    public final Object a(ce.f fVar, ce.i iVar) {
        switch (this.f23515a) {
            case 0:
                return new h(fVar, iVar);
            case 1:
                return new f(fVar, iVar);
            case 2:
                return new e(fVar, iVar);
            case 3:
                return new k(fVar, iVar);
            case 4:
                return new l(fVar);
            case 5:
                return new n(fVar, iVar);
            case 6:
                return new p(fVar, iVar);
            case 7:
                return new u(fVar, iVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return new w(fVar, iVar);
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return new z(fVar, iVar);
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return new b0(fVar, iVar);
            case 11:
                return new f0(fVar, iVar);
            case 12:
                return new h0(fVar, iVar);
            case 13:
                return new j0(fVar, iVar);
            case 14:
                return new n0(fVar, iVar);
            case 15:
                return new m0(fVar);
            case 16:
                return new o0(fVar);
            case 17:
                return new t0(fVar, iVar);
            case 18:
                return new r0(fVar, iVar);
            case 19:
                return new v0(fVar, iVar);
            case 20:
                return new y0(fVar, iVar);
            case 21:
                return new z0(fVar, iVar);
            case 22:
                return new b1(fVar, iVar);
            case 23:
                return new f1(fVar);
            case 24:
                return new g1(fVar, iVar);
            case 25:
                return new zd.b(fVar);
            case 26:
                return new zd.c(fVar);
            case 27:
                return new zd.d(fVar, iVar);
            case 28:
                return new zd.i(fVar, iVar);
            default:
                return new zd.h(fVar);
        }
    }
}
