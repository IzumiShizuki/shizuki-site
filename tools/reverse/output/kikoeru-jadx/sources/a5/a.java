package a5;

import j6.d;
import k5.e;
import k5.k;
import m3.l;
import m4.q;
import p4.t;
import r5.b0;
import r5.n;
import t4.f;
import ud.s;
import ya.i0;
import z4.j;
import z4.m;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ f f201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f202i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ m f203j;

    public a(f fVar, int i10, m mVar) {
        this.f201h = fVar;
        this.f202i = i10;
        this.f203j = mVar;
    }

    @Override // p4.t
    public final Object d() {
        m mVar = this.f203j;
        i0 i0Var = mVar.f26438b;
        j jVar = mVar.f26441e;
        if (jVar == null) {
            return null;
        }
        q qVar = mVar.f26437a;
        String str = qVar.f14543m;
        l lVar = o6.j.f16266l0;
        n jVar2 = (str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new l6.j(lVar, 32) : new d(lVar, 2);
        e eVar = new e(jVar2, this.f202i, qVar);
        try {
            jVar.getClass();
            j jVarF = mVar.f();
            if (jVarF != null) {
                j jVarA = jVar.a(jVarF, ((z4.b) i0Var.get(0)).f26385a);
                f fVar = this.f201h;
                if (jVarA == null) {
                    new k(fVar, s.e(mVar, ((z4.b) i0Var.get(0)).f26385a, jVar, 0), mVar.f26437a, 0, null, eVar).i();
                } else {
                    jVarF = jVarA;
                }
                new k(fVar, s.e(mVar, ((z4.b) i0Var.get(0)).f26385a, jVarF, 0), mVar.f26437a, 0, null, eVar).i();
            }
            jVar2.a();
            b0 b0Var = eVar.f11053h;
            if (b0Var instanceof r5.j) {
                return (r5.j) b0Var;
            }
            return null;
        } catch (Throwable th2) {
            eVar.f11046a.a();
            throw th2;
        }
    }
}
