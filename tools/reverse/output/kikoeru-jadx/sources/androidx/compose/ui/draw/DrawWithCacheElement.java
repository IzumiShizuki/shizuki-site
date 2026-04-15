package androidx.compose.ui.draw;

import i2.a1;
import ic.k;
import j1.p;
import kotlin.Metadata;
import n1.b;
import n1.c;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "Li2/a1;", "Ln1/b;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class DrawWithCacheElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f675a;

    public DrawWithCacheElement(k kVar) {
        this.f675a = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.f675a == ((DrawWithCacheElement) obj).f675a;
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        return new b(new c(), this.f675a);
    }

    public final int hashCode() {
        return this.f675a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        b bVar = (b) pVar;
        bVar.f15237q = this.f675a;
        bVar.B0();
    }
}
