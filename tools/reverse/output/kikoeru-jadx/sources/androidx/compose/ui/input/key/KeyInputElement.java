package androidx.compose.ui.input.key;

import a2.e;
import i2.a1;
import ic.k;
import j1.p;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "Li2/a1;", "La2/e;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class KeyInputElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f703b;

    public KeyInputElement(k kVar, k kVar2) {
        this.f702a = kVar;
        this.f703b = kVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f702a == keyInputElement.f702a && this.f703b == keyInputElement.f703b;
    }

    @Override // i2.a1
    public final p h() {
        e eVar = new e();
        eVar.f192o = this.f702a;
        eVar.f193p = this.f703b;
        return eVar;
    }

    public final int hashCode() {
        k kVar = this.f702a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        k kVar2 = this.f703b;
        return iHashCode + (kVar2 != null ? kVar2.hashCode() : 0);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        e eVar = (e) pVar;
        eVar.f192o = this.f702a;
        eVar.f193p = this.f703b;
    }
}
