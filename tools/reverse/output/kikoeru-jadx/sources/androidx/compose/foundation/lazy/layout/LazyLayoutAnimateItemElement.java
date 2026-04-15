package androidx.compose.foundation.lazy.layout;

import b0.k;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import kotlin.Metadata;
import r.z0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutAnimateItemElement;", "Li2/a1;", "Lb0/k;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
public final /* data */ class LazyLayoutAnimateItemElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z0 f566c;

    public LazyLayoutAnimateItemElement(z0 z0Var, z0 z0Var2, z0 z0Var3) {
        this.f564a = z0Var;
        this.f565b = z0Var2;
        this.f566c = z0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutAnimateItemElement)) {
            return false;
        }
        LazyLayoutAnimateItemElement lazyLayoutAnimateItemElement = (LazyLayoutAnimateItemElement) obj;
        return this.f564a.equals(lazyLayoutAnimateItemElement.f564a) && this.f565b.equals(lazyLayoutAnimateItemElement.f565b) && this.f566c.equals(lazyLayoutAnimateItemElement.f566c);
    }

    @Override // i2.a1
    public final p h() {
        k kVar = new k();
        kVar.f1278o = this.f564a;
        kVar.f1279p = this.f565b;
        kVar.f1280q = this.f566c;
        return kVar;
    }

    public final int hashCode() {
        return this.f566c.hashCode() + ((this.f565b.hashCode() + (this.f564a.hashCode() * 31)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        k kVar = (k) pVar;
        kVar.f1278o = this.f564a;
        kVar.f1279p = this.f565b;
        kVar.f1280q = this.f566c;
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f564a + ", placementSpec=" + this.f565b + ", fadeOutSpec=" + this.f566c + ')';
    }
}
