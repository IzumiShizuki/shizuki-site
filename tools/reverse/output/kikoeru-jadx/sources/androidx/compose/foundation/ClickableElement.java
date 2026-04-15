package androidx.compose.foundation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q2.h;
import s.q;
import s.r0;
import w.k;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/ClickableElement;", "Li2/a1;", "Ls/q;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class ClickableElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r0 f463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ic.a f467f;

    public ClickableElement(k kVar, r0 r0Var, boolean z10, String str, h hVar, ic.a aVar) {
        this.f462a = kVar;
        this.f463b = r0Var;
        this.f464c = z10;
        this.f465d = str;
        this.f466e = hVar;
        this.f467f = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ClickableElement.class != obj.getClass()) {
            return false;
        }
        ClickableElement clickableElement = (ClickableElement) obj;
        return l.a(this.f462a, clickableElement.f462a) && l.a(this.f463b, clickableElement.f463b) && this.f464c == clickableElement.f464c && l.a(this.f465d, clickableElement.f465d) && l.a(this.f466e, clickableElement.f466e) && this.f467f == clickableElement.f467f;
    }

    @Override // i2.a1
    public final p h() {
        return new q(this.f462a, this.f463b, this.f464c, this.f465d, this.f466e, this.f467f);
    }

    public final int hashCode() {
        k kVar = this.f462a;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        r0 r0Var = this.f463b;
        int iHashCode2 = (((iHashCode + (r0Var != null ? r0Var.hashCode() : 0)) * 31) + (this.f464c ? 1231 : 1237)) * 31;
        String str = this.f465d;
        int iHashCode3 = (iHashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        h hVar = this.f466e;
        return this.f467f.hashCode() + ((iHashCode3 + (hVar != null ? hVar.f17601a : 0)) * 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        ((q) pVar).L0(this.f462a, this.f463b, this.f464c, this.f465d, this.f466e, this.f467f);
    }
}
