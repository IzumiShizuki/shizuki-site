package se;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends l0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f19946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f19947d;

    public /* synthetic */ g0(int i10, Object obj) {
        this.f19946c = i10;
        this.f19947d = obj;
    }

    @Override // se.p0
    public boolean a() {
        switch (this.f19946c) {
            case 1:
                return false;
            default:
                return super.a();
        }
    }

    @Override // se.p0
    public boolean e() {
        switch (this.f19946c) {
            case 1:
                return ((Map) this.f19947d).isEmpty();
            default:
                return super.e();
        }
    }

    @Override // se.l0
    public final n0 g(k0 k0Var) {
        switch (this.f19946c) {
            case 0:
                jc.l.e(k0Var, "key");
                if (!((ArrayList) this.f19947d).contains(k0Var)) {
                    return null;
                }
                yc.h hVarH = k0Var.h();
                jc.l.c(hVarH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return u0.j((yc.q0) hVarH);
            default:
                jc.l.e(k0Var, "key");
                return (n0) ((Map) this.f19947d).get(k0Var);
        }
    }
}
