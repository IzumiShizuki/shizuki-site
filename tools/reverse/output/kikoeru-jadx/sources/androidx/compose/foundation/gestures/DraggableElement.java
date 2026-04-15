package androidx.compose.foundation.gestures;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import ic.o;
import j1.p;
import jc.l;
import kotlin.Metadata;
import u.d;
import u.e1;
import u.n0;
import u.o0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "Li2/a1;", "Lu/n0;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final class DraggableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0 f508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o f513f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f514g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f515h;

    public DraggableElement(o0 o0Var, e1 e1Var, boolean z10, k kVar, boolean z11, o oVar, o oVar2, boolean z12) {
        this.f508a = o0Var;
        this.f509b = e1Var;
        this.f510c = z10;
        this.f511d = kVar;
        this.f512e = z11;
        this.f513f = oVar;
        this.f514g = oVar2;
        this.f515h = z12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return l.a(this.f508a, draggableElement.f508a) && this.f509b == draggableElement.f509b && this.f510c == draggableElement.f510c && l.a(this.f511d, draggableElement.f511d) && this.f512e == draggableElement.f512e && l.a(this.f513f, draggableElement.f513f) && l.a(this.f514g, draggableElement.f514g) && this.f515h == draggableElement.f515h;
    }

    @Override // i2.a1
    public final p h() {
        d dVar = d.f20858e;
        boolean z10 = this.f510c;
        k kVar = this.f511d;
        e1 e1Var = this.f509b;
        n0 n0Var = new n0(dVar, z10, kVar, e1Var);
        n0Var.f21013y = this.f508a;
        n0Var.f21014z = e1Var;
        n0Var.A = this.f512e;
        n0Var.B = this.f513f;
        n0Var.C = this.f514g;
        n0Var.D = this.f515h;
        return n0Var;
    }

    public final int hashCode() {
        int iHashCode = (((this.f509b.hashCode() + (this.f508a.hashCode() * 31)) * 31) + (this.f510c ? 1231 : 1237)) * 31;
        k kVar = this.f511d;
        return ((this.f514g.hashCode() + ((this.f513f.hashCode() + ((((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31) + (this.f512e ? 1231 : 1237)) * 31)) * 31)) * 31) + (this.f515h ? 1231 : 1237);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        boolean z10;
        boolean z11;
        n0 n0Var = (n0) pVar;
        d dVar = d.f20858e;
        o0 o0Var = n0Var.f21013y;
        o0 o0Var2 = this.f508a;
        if (l.a(o0Var, o0Var2)) {
            z10 = false;
        } else {
            n0Var.f21013y = o0Var2;
            z10 = true;
        }
        e1 e1Var = n0Var.f21014z;
        e1 e1Var2 = this.f509b;
        if (e1Var != e1Var2) {
            n0Var.f21014z = e1Var2;
            z10 = true;
        }
        boolean z12 = n0Var.D;
        boolean z13 = this.f515h;
        if (z12 != z13) {
            n0Var.D = z13;
            z11 = true;
        } else {
            z11 = z10;
        }
        n0Var.B = this.f513f;
        n0Var.C = this.f514g;
        n0Var.A = this.f512e;
        n0Var.M0(dVar, this.f510c, this.f511d, e1Var2, z11);
    }
}
