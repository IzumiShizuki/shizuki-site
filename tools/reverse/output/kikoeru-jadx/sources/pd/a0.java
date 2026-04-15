package pd;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements bf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f16994a = new a0();

    @Override // bf.b
    public final Iterable d(Object obj) {
        int i10 = c0.f16999p;
        Collection collectionI = ((yc.e) obj).Q().i();
        jc.l.d(collectionI, "getSupertypes(...)");
        return new df.o(0, df.m.f0(vb.m.R(collectionI), l.f17049f));
    }
}
