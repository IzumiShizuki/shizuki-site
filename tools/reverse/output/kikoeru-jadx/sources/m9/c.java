package m9;

import androidx.lifecycle.s0;
import hf.l0;
import jc.a0;
import jc.o;
import jc.z;
import ka.q;
import lf.w0;
import pc.f0;
import pc.u;
import q.t0;
import x0.e1;
import x0.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c extends s0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ u[] f14988h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fg.f f14989b = g9.a.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hg.b f14990c = f0.P(gg.c.a(), "username", "", z.a(String.class));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hg.b f14991d = f0.P(gg.c.a(), "password", "", z.a(String.class));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final hg.b f14992e = (hg.b) a9.i.f231b.getValue();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final hg.b f14993f = (hg.b) a9.i.f233d.getValue();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f14994g = v.v(q.f11303a);

    static {
        o oVar = new o(c.class, "username", "getUsername()Ljava/lang/String;", 0);
        a0 a0Var = z.f10839a;
        f14988h = new u[]{a0Var.e(oVar), t0.G(c.class, "password", "getPassword()Ljava/lang/String;", 0, a0Var), t0.G(c.class, "token", "getToken()Ljava/lang/String;", 0, a0Var), t0.G(c.class, "recommenderUuid", "getRecommenderUuid()Ljava/lang/String;", 0, a0Var)};
    }

    public final Object w(String str, ac.i iVar) {
        pf.e eVar = l0.f8566a;
        return hf.a0.H(nf.n.f15850a, new w0(this, str, null, 5), iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(ic.a r6, ac.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m9.b
            if (r0 == 0) goto L13
            r0 = r7
            m9.b r0 = (m9.b) r0
            int r1 = r0.f14987f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f14987f = r1
            goto L18
        L13:
            m9.b r0 = new m9.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f14985d
            int r1 = r0.f14987f
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            ub.a.f(r7)
            goto L47
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            ub.a.f(r7)
            pf.e r7 = hf.l0.f8566a
            pf.d r7 = pf.d.f17138c
            androidx.lifecycle.r r1 = new androidx.lifecycle.r
            r3 = 9
            r4 = 0
            r1.<init>(r5, r6, r4, r3)
            r0.f14987f = r2
            java.lang.Object r7 = hf.a0.H(r7, r1, r0)
            zb.a r6 = zb.a.f26667a
            if (r7 != r6) goto L47
            return r6
        L47:
            ub.n r7 = (ub.n) r7
            java.lang.Object r6 = r7.f21546a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: m9.c.x(ic.a, ac.c):java.lang.Object");
    }
}
