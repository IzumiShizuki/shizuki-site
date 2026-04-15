package x0;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class n extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HashSet f24363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LinkedHashSet f24364e = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e1 f24365f = new e1(f1.k.f6633d, r0.f24437d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o f24366g;

    public n(o oVar, long j10, boolean z10, boolean z11, r.y1 y1Var) {
        this.f24366g = oVar;
        this.f24360a = j10;
        this.f24361b = z10;
        this.f24362c = z11;
    }

    @Override // x0.r
    public final void a(u uVar, ic.n nVar) {
        this.f24366g.f24376b.a(uVar, nVar);
    }

    @Override // x0.r
    public final void b() {
        o oVar = this.f24366g;
        oVar.A--;
    }

    @Override // x0.r
    public final boolean c() {
        return this.f24366g.f24376b.c();
    }

    @Override // x0.r
    public final boolean d() {
        return this.f24361b;
    }

    @Override // x0.r
    public final boolean e() {
        return this.f24362c;
    }

    @Override // x0.r
    public final long f() {
        return this.f24360a;
    }

    @Override // x0.r
    public final q g() {
        return this.f24366g.f24382h;
    }

    @Override // x0.r
    public final j1 h() {
        return (j1) this.f24365f.getValue();
    }

    @Override // x0.r
    public final yb.h i() {
        return this.f24366g.f24376b.i();
    }

    @Override // x0.r
    public final void j(u uVar) {
        o oVar = this.f24366g;
        oVar.f24376b.j(oVar.f24382h);
        oVar.f24376b.j(uVar);
    }

    @Override // x0.r
    public final u0 k(v0 v0Var) {
        return this.f24366g.f24376b.k(v0Var);
    }

    @Override // x0.r
    public final void l(Set set) {
        HashSet hashSet = this.f24363d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.f24363d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // x0.r
    public final void m(o oVar) {
        this.f24364e.add(oVar);
    }

    @Override // x0.r
    public final void n(u uVar) {
        this.f24366g.f24376b.n(uVar);
    }

    @Override // x0.r
    public final void o() {
        this.f24366g.A++;
    }

    @Override // x0.r
    public final void p(o oVar) {
        HashSet<Set> hashSet = this.f24363d;
        if (hashSet != null) {
            for (Set set : hashSet) {
                jc.l.c(oVar, "null cannot be cast to non-null type androidx.compose.runtime.ComposerImpl");
                set.remove(oVar.f24377c);
            }
        }
        LinkedHashSet linkedHashSet = this.f24364e;
        if ((linkedHashSet instanceof kc.a) && !(linkedHashSet instanceof kc.b)) {
            jc.c0.e(linkedHashSet, "kotlin.collections.MutableCollection");
            throw null;
        }
        linkedHashSet.remove(oVar);
    }

    @Override // x0.r
    public final void q(u uVar) {
        this.f24366g.f24376b.q(uVar);
    }

    public final void r() {
        LinkedHashSet<o> linkedHashSet = this.f24364e;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        HashSet hashSet = this.f24363d;
        if (hashSet != null) {
            for (o oVar : linkedHashSet) {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(oVar.f24377c);
                }
            }
        }
        linkedHashSet.clear();
    }
}
