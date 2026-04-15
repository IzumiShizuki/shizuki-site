package androidx.compose.foundation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import s.l1;
import s.o1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ScrollingLayoutElement;", "Li2/a1;", "Ls/l1;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final class ScrollingLayoutElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1 f489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f490b;

    public ScrollingLayoutElement(o1 o1Var, boolean z10) {
        this.f489a = o1Var;
        this.f490b = z10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return l.a(this.f489a, scrollingLayoutElement.f489a) && this.f490b == scrollingLayoutElement.f490b;
    }

    @Override // i2.a1
    public final p h() {
        l1 l1Var = new l1();
        l1Var.f19217o = this.f489a;
        l1Var.f19218p = this.f490b;
        return l1Var;
    }

    public final int hashCode() {
        return (((this.f489a.hashCode() * 31) + 1237) * 31) + (this.f490b ? 1231 : 1237);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        l1 l1Var = (l1) pVar;
        l1Var.f19217o = this.f489a;
        l1Var.f19218p = this.f490b;
    }
}
