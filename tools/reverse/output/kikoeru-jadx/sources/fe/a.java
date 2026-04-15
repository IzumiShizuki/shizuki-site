package fe;

import java.util.List;
import jc.l;
import le.o;
import se.a0;
import se.h0;
import se.k0;
import se.n0;
import se.w;
import se.w0;
import te.f;
import ue.h;
import vb.r;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a0 implements ve.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n0 f7047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f7048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h0 f7050e;

    public a(n0 n0Var, c cVar, boolean z10, h0 h0Var) {
        l.e(n0Var, "typeProjection");
        l.e(h0Var, "attributes");
        this.f7047b = n0Var;
        this.f7048c = cVar;
        this.f7049d = z10;
        this.f7050e = h0Var;
    }

    @Override // se.w0
    /* JADX INFO: renamed from: B */
    public final w0 v(f fVar) {
        l.e(fVar, "kotlinTypeRefiner");
        return new a(this.f7047b.d(fVar), this.f7048c, this.f7049d, this.f7050e);
    }

    @Override // se.a0
    /* JADX INFO: renamed from: D */
    public final a0 z(boolean z10) {
        if (z10 == this.f7049d) {
            return this;
        }
        return new a(this.f7047b, this.f7048c, z10, this.f7050e);
    }

    @Override // se.a0
    /* JADX INFO: renamed from: F */
    public final a0 C(h0 h0Var) {
        l.e(h0Var, "newAttributes");
        return new a(this.f7047b, this.f7048c, this.f7049d, h0Var);
    }

    @Override // se.w
    public final o n0() {
        return ue.l.a(h.f21621b, true, new String[0]);
    }

    @Override // se.w
    public final List q() {
        return r.f22819a;
    }

    @Override // se.w
    public final h0 r() {
        return this.f7050e;
    }

    @Override // se.w
    public final k0 t() {
        return this.f7048c;
    }

    @Override // se.a0
    public final String toString() {
        StringBuilder sb = new StringBuilder("Captured(");
        sb.append(this.f7047b);
        sb.append(')');
        sb.append(this.f7049d ? "?" : "");
        return sb.toString();
    }

    @Override // se.w
    public final boolean u() {
        return this.f7049d;
    }

    @Override // se.w
    public final w v(f fVar) {
        l.e(fVar, "kotlinTypeRefiner");
        return new a(this.f7047b.d(fVar), this.f7048c, this.f7049d, this.f7050e);
    }

    @Override // se.a0, se.w0
    public final w0 z(boolean z10) {
        if (z10 == this.f7049d) {
            return this;
        }
        return new a(this.f7047b, this.f7048c, z10, this.f7050e);
    }
}
