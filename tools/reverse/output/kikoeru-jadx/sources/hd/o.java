package hd;

import i7.j1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f8427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f8428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f8429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o f8430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f8431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f8432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final o f8433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ o[] f8434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ bc.b f8435j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f8436a;

    static {
        o oVar = new o(0, 0, "CLASS");
        f8427b = oVar;
        o oVar2 = new o(1, 1, "INTERFACE");
        f8428c = oVar2;
        o oVar3 = new o(2, 2, "ENUM_CLASS");
        f8429d = oVar3;
        o oVar4 = new o(3, 3, "ENUM_ENTRY");
        f8430e = oVar4;
        o oVar5 = new o(4, 4, "ANNOTATION_CLASS");
        f8431f = oVar5;
        o oVar6 = new o(5, 5, "OBJECT");
        f8432g = oVar6;
        o oVar7 = new o(6, 6, "COMPANION_OBJECT");
        f8433h = oVar7;
        o[] oVarArr = {oVar, oVar2, oVar3, oVar4, oVar5, oVar6, oVar7};
        f8434i = oVarArr;
        f8435j = new bc.b(oVarArr);
    }

    public o(int i10, int i11, String str) {
        yd.c cVar = yd.d.f26176f;
        jc.l.d(cVar, "CLASS_KIND");
        this.f8436a = new j1(cVar, i11);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f8434i.clone();
    }
}
