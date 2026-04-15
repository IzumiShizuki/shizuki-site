package androidx.compose.foundation.text.input.internal;

import com.tencent.bugly.beta.tinker.TinkerReport;
import h0.u0;
import i2.a1;
import j0.c;
import j0.m;
import j1.p;
import jc.l;
import kotlin.Metadata;
import l0.l1;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyAdaptingPlatformTextInputModifier;", "Li2/a1;", "Lj0/m;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1 f636c;

    public LegacyAdaptingPlatformTextInputModifier(c cVar, u0 u0Var, l1 l1Var) {
        this.f634a = cVar;
        this.f635b = u0Var;
        this.f636c = l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) obj;
        return l.a(this.f634a, legacyAdaptingPlatformTextInputModifier.f634a) && l.a(this.f635b, legacyAdaptingPlatformTextInputModifier.f635b) && l.a(this.f636c, legacyAdaptingPlatformTextInputModifier.f636c);
    }

    @Override // i2.a1
    public final p h() {
        return new m(this.f634a, this.f635b, this.f636c);
    }

    public final int hashCode() {
        return this.f636c.hashCode() + ((this.f635b.hashCode() + (this.f634a.hashCode() * 31)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) throws Throwable {
        m mVar = (m) pVar;
        if (mVar.f9703n) {
            mVar.f9612o.c();
            mVar.f9612o.k(mVar);
        }
        c cVar = this.f634a;
        mVar.f9612o = cVar;
        if (mVar.f9703n) {
            if (cVar.f9586a != null) {
                x.a.c("Expected textInputModifierNode to be null");
            }
            cVar.f9586a = mVar;
        }
        mVar.f9613p = this.f635b;
        mVar.f9614q = this.f636c;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.f634a + ", legacyTextFieldState=" + this.f635b + ", textFieldSelectionManager=" + this.f636c + ')';
    }
}
