package androidx.compose.foundation.relocation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import e0.b;
import e0.c;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "Li2/a1;", "Le0/c;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class BringIntoViewRequesterElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f591a;

    public BringIntoViewRequesterElement(b bVar) {
        this.f591a = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return l.a(this.f591a, ((BringIntoViewRequesterElement) obj).f591a);
        }
        return false;
    }

    @Override // i2.a1
    public final p h() {
        c cVar = new c();
        cVar.f6049o = this.f591a;
        return cVar;
    }

    public final int hashCode() {
        return this.f591a.hashCode();
    }

    @Override // i2.a1
    public final void l(p pVar) {
        c cVar = (c) pVar;
        b bVar = cVar.f6049o;
        if (bVar != null) {
            bVar.f6048a.j(cVar);
        }
        b bVar2 = this.f591a;
        if (bVar2 != null) {
            bVar2.f6048a.b(cVar);
        }
        cVar.f6049o = bVar2;
    }
}
