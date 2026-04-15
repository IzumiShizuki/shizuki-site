package androidx.compose.foundation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import i2.m;
import j1.p;
import jc.l;
import kotlin.Metadata;
import s.q0;
import s.r0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "Li2/a1;", "Ls/q0;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class IndicationModifierElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f477b;

    public IndicationModifierElement(k kVar, r0 r0Var) {
        this.f476a = kVar;
        this.f477b = r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return l.a(this.f476a, indicationModifierElement.f476a) && l.a(this.f477b, indicationModifierElement.f477b);
    }

    @Override // i2.a1
    public final p h() {
        m mVarB = this.f477b.b(this.f476a);
        q0 q0Var = new q0();
        q0Var.f19265q = mVarB;
        q0Var.B0(mVarB);
        return q0Var;
    }

    public final int hashCode() {
        return this.f477b.hashCode() + (this.f476a.hashCode() * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        q0 q0Var = (q0) pVar;
        m mVarB = this.f477b.b(this.f476a);
        q0Var.C0(q0Var.f19265q);
        q0Var.f19265q = mVarB;
        q0Var.B0(mVarB);
    }
}
