package de;

import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum j {
    VISIBILITY(0),
    MODALITY(1),
    OVERRIDE(2),
    ANNOTATIONS(3),
    INNER(4),
    MEMBER_KIND(5),
    DATA(6),
    INLINE(7),
    EXPECT(8),
    ACTUAL(9),
    CONST(10),
    LATEINIT(11),
    FUN(12),
    VALUE(13);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f5911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f5912c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5928a;

    static {
        j[] jVarArrValues = values();
        ArrayList arrayList = new ArrayList();
        for (j jVar : jVarArrValues) {
            if (jVar.f5928a) {
                arrayList.add(jVar);
            }
        }
        f5911b = vb.m.K0(arrayList);
        f5912c = vb.l.N0(values());
    }

    j(int i10) {
        this.f5928a = z;
    }
}
