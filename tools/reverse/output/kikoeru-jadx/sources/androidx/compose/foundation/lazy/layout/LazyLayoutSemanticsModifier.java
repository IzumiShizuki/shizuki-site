package androidx.compose.foundation.lazy.layout;

import b0.i1;
import b0.m1;
import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import i2.f;
import j1.p;
import jc.l;
import kotlin.Metadata;
import u.e1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/layout/LazyLayoutSemanticsModifier;", "Li2/a1;", "Lb0/m1;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class LazyLayoutSemanticsModifier extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ic.a f571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i1 f572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e1 f573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f574d;

    public LazyLayoutSemanticsModifier(ic.a aVar, i1 i1Var, e1 e1Var, boolean z10) {
        this.f571a = aVar;
        this.f572b = i1Var;
        this.f573c = e1Var;
        this.f574d = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LazyLayoutSemanticsModifier)) {
            return false;
        }
        LazyLayoutSemanticsModifier lazyLayoutSemanticsModifier = (LazyLayoutSemanticsModifier) obj;
        return this.f571a == lazyLayoutSemanticsModifier.f571a && l.a(this.f572b, lazyLayoutSemanticsModifier.f572b) && this.f573c == lazyLayoutSemanticsModifier.f573c && this.f574d == lazyLayoutSemanticsModifier.f574d;
    }

    @Override // i2.a1
    public final p h() {
        return new m1(this.f571a, this.f572b, this.f573c, this.f574d);
    }

    public final int hashCode() {
        return ((((this.f573c.hashCode() + ((this.f572b.hashCode() + (this.f571a.hashCode() * 31)) * 31)) * 31) + (this.f574d ? 1231 : 1237)) * 31) + 1237;
    }

    @Override // i2.a1
    public final void l(p pVar) {
        m1 m1Var = (m1) pVar;
        m1Var.f1303o = this.f571a;
        m1Var.f1304p = this.f572b;
        e1 e1Var = m1Var.f1305q;
        e1 e1Var2 = this.f573c;
        if (e1Var != e1Var2) {
            m1Var.f1305q = e1Var2;
            f.o(m1Var);
        }
        boolean z10 = m1Var.f1306r;
        boolean z11 = this.f574d;
        if (z10 == z11) {
            return;
        }
        m1Var.f1306r = z11;
        m1Var.B0();
        f.o(m1Var);
    }
}
