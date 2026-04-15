package androidx.compose.foundation.lazy.layout;

import b0.m;
import b0.q;
import b0.r;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsModifierElement;", "Li2/a1;", "Lb0/q;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class LazyLayoutBeyondBoundsModifierElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f569c;

    public LazyLayoutBeyondBoundsModifierElement(r rVar, m mVar, e1 e1Var) {
        this.f567a = rVar;
        this.f568b = mVar;
        this.f569c = e1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutBeyondBoundsModifierElement)) {
            return false;
        }
        LazyLayoutBeyondBoundsModifierElement lazyLayoutBeyondBoundsModifierElement = (LazyLayoutBeyondBoundsModifierElement) obj;
        return l.a(this.f567a, lazyLayoutBeyondBoundsModifierElement.f567a) && l.a(this.f568b, lazyLayoutBeyondBoundsModifierElement.f568b) && this.f569c == lazyLayoutBeyondBoundsModifierElement.f569c;
    }

    @Override // i2.a1
    public final p h() {
        q qVar = new q();
        qVar.f1333o = this.f567a;
        qVar.f1334p = this.f568b;
        qVar.f1335q = this.f569c;
        return qVar;
    }

    public final int hashCode() {
        return this.f569c.hashCode() + ((((this.f568b.hashCode() + (this.f567a.hashCode() * 31)) * 31) + 1237) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        q qVar = (q) pVar;
        qVar.f1333o = this.f567a;
        qVar.f1334p = this.f568b;
        qVar.f1335q = this.f569c;
    }
}
