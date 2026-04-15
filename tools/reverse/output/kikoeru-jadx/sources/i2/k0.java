package i2;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2.g1 f8772a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f8774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f8775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f8776e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8777f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8778g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f8779h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f8781j;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8773b = true;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f8780i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public k0(a aVar, int i10) {
        this.f8781j = i10;
        this.f8772a = (g2.g1) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [ic.n, jc.j] */
    /* JADX WARN: Type inference failed for: r3v5, types: [g2.g1, i2.a] */
    public static final void a(k0 k0Var, g2.t tVar, int i10, g1 g1Var) {
        HashMap map = k0Var.f8780i;
        float f10 = i10;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f10)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f10)) & 4294967295L;
        while (true) {
            long jH1 = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (k0Var.f8781j) {
                    case 0:
                        q1.i0 i0Var = g1.M;
                        jH1 = g1Var.h1(jH1);
                        break;
                    default:
                        r0 r0VarK0 = g1Var.K0();
                        jc.l.b(r0VarK0);
                        long j10 = r0VarK0.f8832p;
                        jH1 = p1.b.i((((long) Float.floatToRawIntBits((int) (j10 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j10 >> 32))) << 32), jH1);
                        break;
                }
                g1Var = g1Var.f8704s;
                jc.l.b(g1Var);
                if (g1Var.equals(k0Var.f8772a.d())) {
                    int iRound = Math.round(tVar instanceof g2.t ? Float.intBitsToFloat((int) (jH1 & 4294967295L)) : Float.intBitsToFloat((int) (jH1 >> 32)));
                    if (map.containsKey(tVar)) {
                        int iIntValue = ((Number) vb.w.r(tVar, map)).intValue();
                        g2.t tVar2 = g2.c.f7162a;
                        iRound = ((Number) tVar.f7286a.q(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(tVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!k0Var.b(g1Var).containsKey(tVar));
            float fC = k0Var.c(g1Var, tVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(g1 g1Var) {
        switch (this.f8781j) {
            case 0:
                return g1Var.u0().i();
            default:
                r0 r0VarK0 = g1Var.K0();
                jc.l.b(r0VarK0);
                return r0VarK0.u0().i();
        }
    }

    public final int c(g1 g1Var, g2.t tVar) {
        switch (this.f8781j) {
            case 0:
                return g1Var.R(tVar);
            default:
                r0 r0VarK0 = g1Var.K0();
                jc.l.b(r0VarK0);
                return r0VarK0.R(tVar);
        }
    }

    public final boolean d() {
        return this.f8774c || this.f8776e || this.f8777f || this.f8778g;
    }

    public final boolean e() {
        h();
        return this.f8779h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [g2.g1, i2.a] */
    public final void f() {
        this.f8773b = true;
        ?? r0 = this.f8772a;
        a aVarG = r0.g();
        if (aVarG == null) {
            return;
        }
        if (this.f8774c) {
            aVarG.K();
        } else if (this.f8776e || this.f8775d) {
            aVarG.requestLayout();
        }
        if (this.f8777f) {
            r0.K();
        }
        if (this.f8778g) {
            r0.requestLayout();
        }
        aVarG.i().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [g2.g1, i2.a] */
    public final void g() {
        HashMap map = this.f8780i;
        map.clear();
        a0.f0 f0Var = new a0.f0(14, this);
        ?? r22 = this.f8772a;
        r22.l(f0Var);
        map.putAll(b(r22.d()));
        this.f8773b = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [g2.g1, i2.a] */
    /* JADX WARN: Type inference failed for: r1v1, types: [i2.a] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            g2.g1 r1 = r2.f8772a
            if (r0 == 0) goto L9
            goto L51
        L9:
            i2.a r0 = r1.g()
            if (r0 != 0) goto L10
            goto L53
        L10:
            i2.k0 r0 = r0.i()
            i2.a r1 = r0.f8779h
            if (r1 == 0) goto L23
            i2.k0 r0 = r1.i()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            i2.a r0 = r2.f8779h
            if (r0 == 0) goto L53
            i2.k0 r1 = r0.i()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            i2.a r1 = r0.g()
            if (r1 == 0) goto L41
            i2.k0 r1 = r1.i()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            i2.a r0 = r0.g()
            if (r0 == 0) goto L50
            i2.k0 r0 = r0.i()
            if (r0 == 0) goto L50
            i2.a r1 = r0.f8779h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f8779h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i2.k0.h():void");
    }
}
