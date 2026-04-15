package m6;

import java.util.List;
import m4.p0;
import p4.c0;
import p4.s;
import r5.n;
import r5.o;
import r5.q;
import ya.a1;
import ya.g0;
import ya.i0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class d implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public q f14781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f14782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14783c;

    public final boolean b(o oVar) {
        boolean zW;
        f fVar = new f();
        if (fVar.a(oVar, true) && (fVar.f14789a & 2) == 2) {
            int iMin = Math.min(fVar.f14793e, 8);
            s sVar = new s(iMin);
            oVar.z(sVar.f16611a, 0, iMin);
            sVar.G(0);
            if (sVar.a() >= 5 && sVar.u() == 127 && sVar.w() == 1179402563) {
                this.f14782b = new c();
                return true;
            }
            sVar.G(0);
            try {
                zW = r5.b.w(1, sVar, true);
            } catch (p0 unused) {
                zW = false;
            }
            if (zW) {
                this.f14782b = new j();
            } else {
                sVar.G(0);
                if (h.e(sVar, h.f14796o)) {
                    this.f14782b = new h();
                }
            }
            return true;
        }
        return false;
    }

    @Override // r5.n
    public final boolean f(o oVar) {
        try {
            return b(oVar);
        } catch (p0 unused) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0173  */
    @Override // r5.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int g(r5.o r21, b0.a r22) throws m4.p0 {
        /*
            Method dump skipped, instruction units count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m6.d.g(r5.o, b0.a):int");
    }

    @Override // r5.n
    public final void h(q qVar) {
        this.f14781a = qVar;
    }

    @Override // r5.n
    public final void i(long j10, long j11) {
        i iVar = this.f14782b;
        if (iVar != null) {
            e eVar = iVar.f14799a;
            f fVar = eVar.f14784a;
            fVar.f14789a = 0;
            fVar.f14790b = 0L;
            fVar.f14791c = 0;
            fVar.f14792d = 0;
            fVar.f14793e = 0;
            eVar.f14785b.D(0);
            eVar.f14786c = -1;
            eVar.f14788e = false;
            if (j10 == 0) {
                iVar.d(!iVar.f14810l);
                return;
            }
            if (iVar.f14806h != 0) {
                long j12 = (((long) iVar.f14807i) * j11) / 1000000;
                iVar.f14803e = j12;
                g gVar = iVar.f14802d;
                int i10 = c0.f16548a;
                gVar.m(j12);
                iVar.f14806h = 2;
            }
        }
    }

    @Override // r5.n
    public final List j() {
        g0 g0Var = i0.f25998b;
        return a1.f25946e;
    }

    @Override // r5.n
    public final void a() {
    }

    @Override // r5.n
    public final n c() {
        return this;
    }
}
