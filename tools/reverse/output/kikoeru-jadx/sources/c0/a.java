package c0;

import java.util.Collection;
import u.e1;
import x0.b1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b0.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f3036a;

    public a(z zVar) {
        this.f3036a = zVar;
    }

    @Override // b0.r
    public final int a() {
        return this.f3036a.g().f3124l;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // b0.r
    public final int b() {
        return ((r) vb.m.h0(this.f3036a.g().f3125m)).f3135a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.List] */
    @Override // b0.r
    public final int c() {
        int i10;
        z zVar = this.f3036a;
        int size = 0;
        if (zVar.g().f3125m.isEmpty()) {
            return 0;
        }
        o oVarG = zVar.g();
        o oVar = q.f3134a;
        e1 e1Var = oVarG.f3133u;
        long j10 = oVarG.f3126n;
        e1 e1Var2 = e1.f20882a;
        int i11 = e1Var == e1Var2 ? (int) (j10 & 4294967295L) : (int) (j10 >> 32);
        o oVarG2 = zVar.g();
        ?? r42 = oVarG2.f3125m;
        if (!r42.isEmpty()) {
            int size2 = ((Collection) r42).size();
            int i12 = 0;
            while (size < size2) {
                r rVar = (r) r42.get(size);
                i12 += (int) (oVarG2.f3133u == e1Var2 ? rVar.f3153s & 4294967295L : rVar.f3153s >> 32);
                size++;
            }
            size = (i12 / r42.size()) + oVarG2.f3131s;
        }
        if (size != 0 && (i10 = i11 / size) >= 1) {
            return i10;
        }
        return 1;
    }

    @Override // b0.r
    public final boolean d() {
        return !((Collection) this.f3036a.g().f3125m).isEmpty();
    }

    @Override // b0.r
    public final int e() {
        return ((b1) this.f3036a.f3182c.f3159e).e();
    }
}
