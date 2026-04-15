package se;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f19959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f19960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te.b f19961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final te.e f19962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final te.f f19963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f19964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayDeque f19965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public bf.j f19966h;

    public j0(boolean z10, boolean z11, te.b bVar, te.e eVar, te.f fVar) {
        jc.l.e(bVar, "typeSystemContext");
        jc.l.e(eVar, "kotlinTypePreparator");
        jc.l.e(fVar, "kotlinTypeRefiner");
        this.f19959a = z10;
        this.f19960b = z11;
        this.f19961c = bVar;
        this.f19962d = eVar;
        this.f19963e = fVar;
    }

    public final void a() {
        ArrayDeque arrayDeque = this.f19965g;
        jc.l.b(arrayDeque);
        arrayDeque.clear();
        bf.j jVar = this.f19966h;
        jc.l.b(jVar);
        jVar.clear();
    }

    public boolean b(ve.d dVar, ve.d dVar2) {
        jc.l.e(dVar, "subType");
        return true;
    }

    public final void c() {
        if (this.f19965g == null) {
            this.f19965g = new ArrayDeque(4);
        }
        if (this.f19966h == null) {
            int i10 = bf.j.f2808c;
            this.f19966h = bf.m.e();
        }
    }

    public final w0 d(ve.d dVar) {
        jc.l.e(dVar, "type");
        return this.f19962d.c(dVar);
    }

    public final w e(ve.d dVar) {
        jc.l.e(dVar, "type");
        this.f19963e.getClass();
        return (w) dVar;
    }
}
