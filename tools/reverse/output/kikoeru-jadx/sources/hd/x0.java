package hd;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public gh.g f8488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8489c = new ArrayList(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x0 f8490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public x0 f8491e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t0 f8492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f8493g;

    public x0(int i10) {
        this.f8487a = i10;
        jd.k.f10844a.getClass();
        List listA = jd.j.a();
        ArrayList arrayList = new ArrayList(vb.n.K(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            ((kd.d) ((jd.k) it.next())).getClass();
            arrayList.add(new kd.f());
        }
        this.f8493g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!x0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        jc.l.c(obj, "null cannot be cast to non-null type kotlin.metadata.KmType");
        x0 x0Var = (x0) obj;
        if (this.f8487a != x0Var.f8487a) {
            return false;
        }
        gh.g gVar = this.f8488b;
        if (gVar == null) {
            jc.l.k("classifier");
            throw null;
        }
        gh.g gVar2 = x0Var.f8488b;
        if (gVar2 != null) {
            return gVar.equals(gVar2) && jc.l.a(this.f8489c, x0Var.f8489c) && jc.l.a(this.f8491e, x0Var.f8491e) && jc.l.a(this.f8490d, x0Var.f8490d) && jc.l.a(this.f8492f, x0Var.f8492f) && jc.l.a(this.f8493g, x0Var.f8493g);
        }
        jc.l.k("classifier");
        throw null;
    }

    public final int hashCode() {
        int i10 = this.f8487a * 31;
        gh.g gVar = this.f8488b;
        if (gVar != null) {
            return this.f8489c.hashCode() + ((gVar.hashCode() + i10) * 31);
        }
        jc.l.k("classifier");
        throw null;
    }
}
