package androidx.compose.ui.semantics;

import i2.a1;
import ic.k;
import j1.p;
import kotlin.Metadata;
import q2.c;
import q2.l;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/semantics/AppendedSemanticsElement;", "Li2/a1;", "Lq2/c;", "Lq2/l;", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AppendedSemanticsElement extends a1 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f727b;

    public AppendedSemanticsElement(k kVar, boolean z10) {
        this.f726a = z10;
        this.f727b = kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppendedSemanticsElement)) {
            return false;
        }
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) obj;
        return this.f726a == appendedSemanticsElement.f726a && this.f727b == appendedSemanticsElement.f727b;
    }

    @Override // i2.a1
    public final p h() {
        return new c(this.f726a, false, this.f727b);
    }

    public final int hashCode() {
        return this.f727b.hashCode() + ((this.f726a ? 1231 : 1237) * 31);
    }

    @Override // q2.l
    public final q2.k j() {
        q2.k kVar = new q2.k();
        kVar.f17632c = this.f726a;
        this.f727b.a(kVar);
        return kVar;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        c cVar = (c) pVar;
        cVar.f17590o = this.f726a;
        cVar.f17592q = this.f727b;
    }
}
