package x2;

import com.tencent.bugly.beta.tinker.TinkerReport;
import j2.h0;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k f24560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f24561c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f24562d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f24563e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f24564f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f24565g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f24566a;

    static {
        k kVar = new k(100);
        k kVar2 = new k(TinkerReport.KEY_APPLIED_SUCC_COST_5S_LESS);
        k kVar3 = new k(TinkerReport.KEY_LOADED_MISMATCH_DEX);
        k kVar4 = new k(TinkerReport.KEY_LOADED_SUCC_COST_500_LESS);
        k kVar5 = new k(500);
        k kVar6 = new k(600);
        f24560b = kVar6;
        k kVar7 = new k(700);
        k kVar8 = new k(800);
        k kVar9 = new k(900);
        f24561c = kVar3;
        f24562d = kVar4;
        f24563e = kVar5;
        f24564f = kVar6;
        f24565g = kVar7;
        ud.b.x(kVar, kVar2, kVar3, kVar4, kVar5, kVar6, kVar7, kVar8, kVar9);
    }

    public k(int i10) {
        this.f24566a = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        z2.a.a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return jc.l.g(this.f24566a, ((k) obj).f24566a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.f24566a == ((k) obj).f24566a;
        }
        return false;
    }

    public final int hashCode() {
        return this.f24566a;
    }

    public final String toString() {
        return h0.m(new StringBuilder("FontWeight(weight="), this.f24566a, ')');
    }
}
