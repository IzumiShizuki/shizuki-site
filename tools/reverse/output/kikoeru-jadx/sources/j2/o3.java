package j2;

import com.cnl.kikoeru.R;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements x0.q, androidx.lifecycle.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f9944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x0.u f9945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.lifecycle.q f9947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ic.n f9948e = j1.f9836a;

    public o3(v vVar, x0.u uVar) {
        this.f9944a = vVar;
        this.f9945b = uVar;
    }

    public final void a() {
        if (!this.f9946c) {
            this.f9946c = true;
            this.f9944a.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.q qVar = this.f9947d;
            if (qVar != null) {
                qVar.q1(this);
            }
        }
        this.f9945b.l();
    }

    public final void c(ic.n nVar) {
        this.f9944a.setOnViewTreeOwnersAvailable(new b0.o1(20, this, nVar));
    }

    @Override // androidx.lifecycle.v
    public final void i(androidx.lifecycle.x xVar, androidx.lifecycle.o oVar) {
        if (oVar == androidx.lifecycle.o.ON_DESTROY) {
            a();
        } else {
            if (oVar != androidx.lifecycle.o.ON_CREATE || this.f9946c) {
                return;
            }
            c(this.f9948e);
        }
    }
}
