package md;

import ee.l;
import ee.m;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ oe.m f15097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ LinkedHashSet f15098d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f15099e;

    public a(oe.m mVar, LinkedHashSet linkedHashSet, boolean z10) {
        this.f15097c = mVar;
        this.f15098d = linkedHashSet;
        this.f15099e = z10;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 == 2) {
            objArr[0] = "fromCurrent";
        } else if (i10 == 3) {
            objArr[0] = "member";
        } else if (i10 != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else if (i10 == 3 || i10 == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ee.m
    public final void b(yc.c cVar) {
        if (cVar == null) {
            a(0);
            throw null;
        }
        l.r(cVar, new bd.a(11, this));
        this.f15098d.add(cVar);
    }

    @Override // ee.m
    public final void d(yc.c cVar, yc.c cVar2) {
        if (cVar2 != null) {
            return;
        }
        a(2);
        throw null;
    }

    @Override // ee.m
    public final void p(yc.c cVar, Collection collection) {
        if (cVar == null) {
            a(3);
            throw null;
        }
        if (!this.f15099e || cVar.j() == 2) {
            cVar.H0(collection);
        }
    }
}
