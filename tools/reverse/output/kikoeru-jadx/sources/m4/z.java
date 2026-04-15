package m4;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f14642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f14644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f14645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f14646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Serializable f14647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Cloneable f14648h;

    public z(w7.e eVar, t9.f fVar) {
        this.f14644d = eVar;
        this.f14645e = fVar;
        this.f14646f = new r5.p(17);
        this.f14647g = new LinkedHashMap();
        this.f14643c = true;
    }

    public void a() {
        w7.e eVar = (w7.e) this.f14644d;
        if (eVar.f().a1() != androidx.lifecycle.p.f795b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f14641a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ((t9.f) this.f14645e).b();
        eVar.f().W0(new eg.b(2, this));
        this.f14641a = true;
    }

    public z() {
        this.f14646f = ya.f1.f25977g;
        this.f14642b = true;
        ya.g0 g0Var = ya.i0.f25998b;
        this.f14647g = ya.a1.f25946e;
    }
}
