package androidx.compose.foundation;

import com.tencent.bugly.beta.tinker.TinkerReport;
import i2.a1;
import j1.p;
import jc.l;
import kotlin.Metadata;
import q.t0;
import q1.l0;
import q1.m;
import q1.q;
import q1.z;
import s.i;
import ub.v;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/BackgroundElement;", "Li2/a1;", "Ls/i;", "foundation_release"}, k = 1, mv = {1, TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART, 0}, xi = 48)
final class BackgroundElement extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f457c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l0 f458d;

    public BackgroundElement(long j10, z zVar, l0 l0Var, int i10) {
        j10 = (i10 & 1) != 0 ? q.f17575h : j10;
        zVar = (i10 & 2) != 0 ? null : zVar;
        this.f455a = j10;
        this.f456b = zVar;
        this.f457c = 1.0f;
        this.f458d = l0Var;
    }

    public final boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        return backgroundElement != null && q.c(this.f455a, backgroundElement.f455a) && l.a(this.f456b, backgroundElement.f456b) && this.f457c == backgroundElement.f457c && l.a(this.f458d, backgroundElement.f458d);
    }

    @Override // i2.a1
    public final p h() {
        i iVar = new i();
        iVar.f19170o = this.f455a;
        iVar.f19171p = this.f456b;
        iVar.f19172q = this.f457c;
        iVar.f19173r = this.f458d;
        iVar.f19174s = 9205357640488583168L;
        return iVar;
    }

    public final int hashCode() {
        int i10 = q.f17576i;
        int iA = v.a(this.f455a) * 31;
        m mVar = this.f456b;
        return this.f458d.hashCode() + t0.x(this.f457c, (iA + (mVar != null ? mVar.hashCode() : 0)) * 31, 31);
    }

    @Override // i2.a1
    public final void l(p pVar) {
        i iVar = (i) pVar;
        iVar.f19170o = this.f455a;
        iVar.f19171p = this.f456b;
        iVar.f19172q = this.f457c;
        iVar.f19173r = this.f458d;
    }
}
