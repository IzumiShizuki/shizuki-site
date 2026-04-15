package androidx.compose.material;

import a9.r;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import m0.f2;
import m0.x;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/DraggableAnchorsElement;", "T", "Li2/a1;", "Lm0/f2;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DraggableAnchorsElement<T> extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f665b;

    public DraggableAnchorsElement(x xVar, r rVar) {
        this.f664a = xVar;
        this.f665b = rVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraggableAnchorsElement)) {
            return false;
        }
        DraggableAnchorsElement draggableAnchorsElement = (DraggableAnchorsElement) obj;
        return l.a(this.f664a, draggableAnchorsElement.f664a) && this.f665b == draggableAnchorsElement.f665b;
    }

    @Override // i2.a1
    public final p h() {
        f2 f2Var = new f2();
        f2Var.f12971o = this.f664a;
        f2Var.f12972p = this.f665b;
        f2Var.f12973q = e1.f20882a;
        return f2Var;
    }

    public final int hashCode() {
        return e1.f20882a.hashCode() + ((this.f665b.hashCode() + (this.f664a.hashCode() * 31)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        f2 f2Var = (f2) pVar;
        f2Var.f12971o = this.f664a;
        f2Var.f12972p = this.f665b;
        f2Var.f12973q = e1.f20882a;
    }
}
