package hd;

import i7.j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h1[] f8395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ bc.b f8396c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f8397a;

    static {
        h1[] h1VarArr = {new h1(0, 0, "INTERNAL"), new h1(1, 1, "PRIVATE"), new h1(2, 2, "PROTECTED"), new h1(3, 3, "PUBLIC"), new h1(4, 4, "PRIVATE_TO_THIS"), new h1(5, 5, "LOCAL")};
        f8395b = h1VarArr;
        f8396c = new bc.b(h1VarArr);
    }

    public h1(int i10, int i11, String str) {
        yd.c cVar = yd.d.f26174d;
        jc.l.d(cVar, "VISIBILITY");
        this.f8397a = new j1(cVar, i11);
    }

    public static h1 valueOf(String str) {
        return (h1) Enum.valueOf(h1.class, str);
    }

    public static h1[] values() {
        return (h1[]) f8395b.clone();
    }
}
