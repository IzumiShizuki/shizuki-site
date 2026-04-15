package hd;

import i7.j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ g1[] f8390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ bc.b f8391c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f8392a;

    static {
        g1[] g1VarArr = {new g1(0, 0, "FINAL"), new g1(1, 1, "OPEN"), new g1(2, 2, "ABSTRACT"), new g1(3, 3, "SEALED")};
        f8390b = g1VarArr;
        f8391c = new bc.b(g1VarArr);
    }

    public g1(int i10, int i11, String str) {
        yd.c cVar = yd.d.f26175e;
        jc.l.d(cVar, "MODALITY");
        this.f8392a = new j1(cVar, i11);
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) f8390b.clone();
    }
}
