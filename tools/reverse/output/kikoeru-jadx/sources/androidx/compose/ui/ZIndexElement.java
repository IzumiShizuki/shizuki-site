package androidx.compose.ui;

import i2.a1;
import j1.p;
import j1.t;
import j2.h0;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/ZIndexElement;", "Li2/a1;", "Lj1/t;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ZIndexElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f672a;

    public ZIndexElement(float f10) {
        this.f672a = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZIndexElement) && Float.compare(this.f672a, ((ZIndexElement) obj).f672a) == 0;
    }

    @Override // i2.a1
    public final p h() {
        t tVar = new t();
        tVar.f9706o = this.f672a;
        return tVar;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.f672a);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((t) pVar).f9706o = this.f672a;
    }

    public final String toString() {
        return h0.l(new StringBuilder("ZIndexElement(zIndex="), this.f672a, ')');
    }
}
