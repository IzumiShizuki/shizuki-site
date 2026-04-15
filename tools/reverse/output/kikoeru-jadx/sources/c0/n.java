package c0;

import b0.g0;
import b0.q0;
import b0.u0;
import g2.r1;
import java.util.List;
import x0.b1;
import y.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends jc.m implements ic.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f3106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f3107c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ic.a f3108d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1 f3109e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f3110f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hf.y f3111g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ q1.v f3112h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(z zVar, u uVar, pc.r rVar, e1 e1Var, float f10, hf.y yVar, q1.v vVar) {
        super(2);
        this.f3106b = zVar;
        this.f3107c = uVar;
        this.f3108d = rVar;
        this.f3109e = e1Var;
        this.f3110f = f10;
        this.f3111g = yVar;
        this.f3112h = vVar;
    }

    @Override // ic.n
    public final Object q(Object obj, Object obj2) {
        androidx.media3.exoplayer.offline.u uVar;
        int iF;
        q0 q0Var = (q0) obj;
        long j10 = ((f3.a) obj2).f6651a;
        e1 e1Var = this.f3109e;
        float f10 = e1Var.f25123d;
        float f11 = e1Var.f25121b;
        z zVar = this.f3106b;
        zVar.f3201v.getValue();
        boolean z10 = zVar.f3180a || q0Var.f1337b.O();
        n7.d.e(j10, u.e1.f20882a);
        u uVar2 = this.f3107c;
        if (uVar2.f3167d != null && f3.a.b(uVar2.f3165b, j10) && uVar2.f3166c == q0Var.f1337b.a()) {
            androidx.media3.exoplayer.offline.u uVar3 = uVar2.f3167d;
            jc.l.b(uVar3);
            uVar = uVar3;
        } else {
            uVar2.f3165b = j10;
            uVar2.f3166c = q0Var.f1337b.a();
            androidx.media3.exoplayer.offline.u uVar4 = (androidx.media3.exoplayer.offline.u) uVar2.f3164a.q(q0Var, new f3.a(j10));
            uVar2.f3167d = uVar4;
            uVar = uVar4;
        }
        g gVar = (g) this.f3108d.b();
        q0Var.f1337b.getLayoutDirection();
        r1 r1Var = q0Var.f1337b;
        int iA0 = r1Var.a0(f11);
        r1Var.getLayoutDirection();
        int iA02 = r1Var.a0(f10);
        int iA03 = r1Var.a0(androidx.compose.foundation.layout.a.e(e1Var, r1Var.getLayoutDirection()));
        int iG = (f3.a.g(j10) - iA0) - iA02;
        long j11 = (((long) iA0) & 4294967295L) | (((long) iA03) << 32);
        int iA04 = r1Var.a0(androidx.compose.foundation.layout.a.d(e1Var, r1Var.getLayoutDirection()) + androidx.compose.foundation.layout.a.e(e1Var, r1Var.getLayoutDirection()));
        int iA05 = r1Var.a0(f10 + f11);
        List listF = g0.f(gVar, zVar.f3198s, zVar.f3190k);
        long jA = f3.a.a(j10, f3.b.g(iA04, j10), 0, f3.b.f(iA05, j10), 0, 10);
        int iA06 = r1Var.a0(this.f3110f);
        boolean zO = r1Var.O();
        k kVar = new k(zVar, listF, gVar, uVar, jA, true, q0Var, iG, j11, iA0, iA02, iA06, this.f3111g, z10, zVar.f3181b, this.f3112h);
        s sVar = zVar.f3182c;
        int[] iArr = (int[]) sVar.f3157c;
        Object obj3 = sVar.f3161g;
        Integer numY0 = vb.l.y0(iArr, 0);
        int iH = g0.h(numY0 != null ? numY0.intValue() : 0, gVar, obj3);
        if (!vb.l.f0(iArr, iH)) {
            ((u0) sVar.f3162h).a(iH);
            h1.g gVarD = h1.t.d();
            ic.k kVarE = gVarD != null ? gVarD.e() : null;
            h1.g gVarG = h1.t.g(gVarD);
            try {
                iArr = (int[]) ((x) sVar.f3156b).q(Integer.valueOf(iH), Integer.valueOf(iArr.length));
                h1.t.k(gVarD, gVarG, kVarE);
                sVar.f3157c = iArr;
                ((b1) sVar.f3159e).f(s.d(iArr));
            } catch (Throwable th2) {
                h1.t.k(gVarD, gVarG, kVarE);
                throw th2;
            }
        }
        int[] iArr2 = (int[]) sVar.f3158d;
        int length = iArr.length;
        int i10 = kVar.f3098s;
        if (length != i10) {
            ah.j jVar = kVar.f3097r;
            jVar.I();
            int[] iArr3 = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                if (i11 >= iArr.length || (iF = iArr[i11]) == -1) {
                    iF = i11 == 0 ? 0 : gh.g.F(iArr3, (((long) 0) << 32) | (((long) i11) & 4294967295L)) + 1;
                }
                iArr3[i11] = iF;
                jVar.K(iF, i11);
                i11++;
            }
            iArr = iArr3;
        }
        if (iArr2.length != i10) {
            int[] iArr4 = new int[i10];
            int i12 = 0;
            while (i12 < i10) {
                iArr4[i12] = i12 < iArr2.length ? iArr2[i12] : i12 == 0 ? 0 : iArr4[i12 - 1];
                i12++;
            }
            iArr2 = iArr4;
        }
        o oVarG = gh.g.G(kVar, Math.round((zO || !zVar.f3180a) ? zVar.f3194o : ((Number) ((r.k) zVar.f3202w.f1208b).f18468b.getValue()).floatValue()), iArr, iArr2, true);
        zVar.f(oVarG, r1Var.O(), false);
        return oVarG;
    }
}
