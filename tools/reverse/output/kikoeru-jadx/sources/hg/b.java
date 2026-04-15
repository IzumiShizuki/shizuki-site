package hg;

import fa.j;
import jc.l;
import pc.u;
import pc.v;
import ub.p;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a f8626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f8627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f8628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f8629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f8630e;

    public b(ic.a aVar, Object obj, String str, v vVar) {
        l.e(obj, "default");
        l.e(str, "key");
        l.e(vVar, "type");
        this.f8626a = aVar;
        this.f8627b = obj;
        this.f8628c = str;
        this.f8629d = vVar;
        this.f8630e = ub.a.d(new j(this, 2));
    }

    public final Object a() {
        a aVarB = b();
        aVarB.getClass();
        Object objA = aVarB.f8623a.a(this);
        return objA == null ? this.f8627b : objA;
    }

    public final a b() {
        return (a) this.f8630e.getValue();
    }

    public final Object c(u uVar) {
        l.e(uVar, "property");
        return a();
    }

    public final void d(Object obj) {
        l.e(obj, "value");
        a aVarB = b();
        aVarB.getClass();
        gg.a aVar = aVarB.f8623a.f7542a;
        if (aVar != null) {
            aVar.b(this, obj);
        }
    }

    public final void e(Object obj, u uVar) {
        l.e(uVar, "property");
        l.e(obj, "value");
        d(obj);
    }
}
