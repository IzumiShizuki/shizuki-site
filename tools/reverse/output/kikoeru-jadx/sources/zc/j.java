package zc;

import java.util.Map;
import se.w;
import x0.h1;
import yc.m0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc.i f26699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final be.c f26700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f26701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f26702d;

    public j(vc.i iVar, be.c cVar, Map map) {
        jc.l.e(iVar, "builtIns");
        jc.l.e(cVar, "fqName");
        this.f26699a = iVar;
        this.f26700b = cVar;
        this.f26701c = map;
        this.f26702d = ub.a.c(ub.i.f21540a, new h1(3, this));
    }

    @Override // zc.b
    public final be.c a() {
        return this.f26700b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ub.h] */
    @Override // zc.b
    public final w b() {
        Object value = this.f26702d.getValue();
        jc.l.d(value, "getValue(...)");
        return (w) value;
    }

    @Override // zc.b
    public final Map c() {
        return this.f26701c;
    }

    @Override // zc.b
    public final m0 m() {
        return m0.p0;
    }
}
