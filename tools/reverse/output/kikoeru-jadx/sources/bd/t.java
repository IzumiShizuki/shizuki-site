package bd;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class t extends ee.m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f2668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AbstractCollection f2669d;

    public /* synthetic */ t(AbstractCollection abstractCollection, int i10) {
        this.f2668c = i10;
        this.f2669d = abstractCollection;
    }

    public static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "fromSuper";
        } else if (i10 != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // ee.m
    public final void b(yc.c cVar) {
        switch (this.f2668c) {
            case 0:
                if (cVar == null) {
                    a(0);
                    throw null;
                }
                ee.l.r(cVar, null);
                ((LinkedHashSet) this.f2669d).add(cVar);
                return;
            default:
                jc.l.e(cVar, "fakeOverride");
                ee.l.r(cVar, null);
                ((ArrayList) this.f2669d).add(cVar);
                return;
        }
    }

    @Override // ee.m
    public final void d(yc.c cVar, yc.c cVar2) {
        switch (this.f2668c) {
            case 0:
                if (cVar2 != null) {
                    return;
                }
                a(2);
                throw null;
            default:
                jc.l.e(cVar2, "fromCurrent");
                if (cVar2 instanceof z) {
                    ((z) cVar2).K1(yc.p.f26140a, cVar);
                    return;
                }
                return;
        }
    }
}
