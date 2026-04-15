package hd;

import i7.j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f1[] f8385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ bc.b f8386c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f8387a;

    static {
        f1[] f1VarArr = {new f1(0, 0, "DECLARATION"), new f1(1, 1, "FAKE_OVERRIDE"), new f1(2, 2, "DELEGATION"), new f1(3, 3, "SYNTHESIZED")};
        f8385b = f1VarArr;
        f8386c = new bc.b(f1VarArr);
    }

    public f1(int i10, int i11, String str) {
        yd.c cVar = yd.d.f26186p;
        jc.l.d(cVar, "MEMBER_KIND");
        this.f8387a = new j1(cVar, i11);
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) f8385b.clone();
    }
}
