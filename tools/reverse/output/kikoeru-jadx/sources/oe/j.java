package oe;

import java.util.ArrayList;
import wd.t0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements l, n, m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f16384b = new j(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f16385c = new j(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j f16386d = new j(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final j f16387e = new j(3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j f16388f = new j(4);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16389a;

    public /* synthetic */ j(int i10) {
        this.f16389a = i10;
    }

    public static yc.x e(wd.d0 d0Var) {
        int i10 = d0Var == null ? -1 : x.f16434a[d0Var.ordinal()];
        yc.x xVar = yc.x.f26155b;
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? xVar : yc.x.f26156c : yc.x.f26158e : yc.x.f26157d : xVar;
    }

    @Override // oe.m
    public void a(yc.c cVar) {
        if (cVar == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    @Override // oe.n
    public se.w c(t0 t0Var, String str, se.a0 a0Var, se.a0 a0Var2) {
        jc.l.e(t0Var, "proto");
        jc.l.e(str, "flexibleId");
        jc.l.e(a0Var, "lowerBound");
        jc.l.e(a0Var2, "upperBound");
        throw new IllegalArgumentException("This method should not be used.");
    }

    @Override // oe.l
    public Boolean d() {
        switch (this.f16389a) {
            case 1:
                return null;
            default:
                return Boolean.TRUE;
        }
    }

    @Override // oe.m
    public void b(yc.e eVar, ArrayList arrayList) {
    }
}
