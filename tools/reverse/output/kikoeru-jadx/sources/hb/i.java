package hb;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class i implements eb.a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f8314c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.w f8315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f8316b = new ConcurrentHashMap();

    static {
        int i10 = 0;
        f8314c = new h(i10);
        new h(i10);
    }

    public i(g5.w wVar) {
        this.f8315a = wVar;
    }

    @Override // eb.a0
    public final eb.z a(eb.m mVar, lb.a aVar) {
        fb.a aVar2 = (fb.a) aVar.f12165a.getAnnotation(fb.a.class);
        if (aVar2 == null) {
            return null;
        }
        return b(this.f8315a, mVar, aVar, aVar2, true);
    }

    public final eb.z b(g5.w wVar, eb.m mVar, lb.a aVar, fb.a aVar2, boolean z10) {
        eb.z zVarA;
        Object objK = wVar.u(new lb.a(aVar2.value())).k();
        boolean zNullSafe = aVar2.nullSafe();
        if (objK instanceof eb.z) {
            zVarA = (eb.z) objK;
        } else {
            if (!(objK instanceof eb.a0)) {
                throw new IllegalArgumentException("Invalid attempt to bind an instance of " + objK.getClass().getName() + " as a @JsonAdapter for " + gb.d.k(aVar.f12166b) + ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
            }
            eb.a0 a0Var = (eb.a0) objK;
            if (z10) {
                eb.a0 a0Var2 = (eb.a0) this.f8316b.putIfAbsent(aVar.f12165a, a0Var);
                if (a0Var2 != null) {
                    a0Var = a0Var2;
                }
            }
            zVarA = a0Var.a(mVar, aVar);
        }
        return (zVarA == null || !zNullSafe) ? zVarA : new eb.k(zVarA, 2);
    }
}
