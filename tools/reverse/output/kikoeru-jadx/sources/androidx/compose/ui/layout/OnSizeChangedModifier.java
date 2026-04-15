package androidx.compose.ui.layout;

import g2.d1;
import i2.a1;
import ic.k;
import j1.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/layout/OnSizeChangedModifier;", "Li2/a1;", "Lg2/d1;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class OnSizeChangedModifier extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f714a;

    public OnSizeChangedModifier(k kVar) {
        this.f714a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnSizeChangedModifier) {
            return this.f714a == ((OnSizeChangedModifier) obj).f714a;
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        d1 d1Var = new d1();
        d1Var.f7166o = this.f714a;
        long j10 = Integer.MIN_VALUE;
        d1Var.f7167p = (j10 & 4294967295L) | (j10 << 32);
        return d1Var;
    }

    public final int hashCode() {
        return this.f714a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        d1 d1Var = (d1) pVar;
        d1Var.f7166o = this.f714a;
        long j10 = Integer.MIN_VALUE;
        d1Var.f7167p = (j10 & 4294967295L) | (j10 << 32);
    }
}
