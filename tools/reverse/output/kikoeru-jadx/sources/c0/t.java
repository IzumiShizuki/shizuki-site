package c0;

import b0.i1;
import b0.l1;
import u.e1;
import x0.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f3163a;

    public t(z zVar) {
        this.f3163a = zVar;
    }

    @Override // b0.i1
    public final int a() {
        z zVar = this.f3163a;
        return (int) (zVar.g().f3133u == e1.f20882a ? zVar.g().f3126n & 4294967295L : zVar.g().f3126n >> 32);
    }

    @Override // b0.i1
    public final float b() {
        z zVar = this.f3163a;
        return (((b1) zVar.f3182c.f3159e).e() * 500) + ((b1) zVar.f3182c.f3160f).e();
    }

    @Override // b0.i1
    public final int c() {
        z zVar = this.f3163a;
        return zVar.g().f3129q + zVar.g().f3130r;
    }

    @Override // b0.i1
    public final float d() {
        z zVar = this.f3163a;
        int iE = ((b1) zVar.f3182c.f3159e).e();
        int iE2 = ((b1) zVar.f3182c.f3160f).e();
        return zVar.d() ? (iE * 500) + iE2 + 100 : (iE * 500) + iE2;
    }

    @Override // b0.i1
    public final q2.b e() {
        return new q2.b(-1, -1);
    }

    @Override // b0.i1
    public final Object f(int i10, l1 l1Var) {
        androidx.media3.exoplayer.offline.u uVar = z.f3179x;
        Object objI = this.f3163a.i(i10, l1Var);
        return objI == zb.a.f26667a ? objI : ub.a0.f21526a;
    }
}
