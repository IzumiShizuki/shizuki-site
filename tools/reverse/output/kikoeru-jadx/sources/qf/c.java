package qf;

import app.nekogram.translator.r;
import hf.n0;
import ic.o;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f18231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f18232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f18233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ac.i f18234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f18235f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f18236g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18237h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f18238i;

    public c(e eVar, Object obj, o oVar, o oVar2, r rVar, ac.i iVar, o oVar3) {
        this.f18238i = eVar;
        this.f18230a = obj;
        this.f18231b = oVar;
        this.f18232c = oVar2;
        this.f18233d = rVar;
        this.f18234e = iVar;
        this.f18235f = oVar3;
    }

    public final void a() {
        Object obj = this.f18236g;
        if (obj instanceof nf.r) {
            ((nf.r) obj).h(this.f18237h, this.f18238i.f18244a);
            return;
        }
        n0 n0Var = obj instanceof n0 ? (n0) obj : null;
        if (n0Var != null) {
            n0Var.a();
        }
    }
}
