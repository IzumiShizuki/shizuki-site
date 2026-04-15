package wd;

import com.tencent.bugly.beta.tinker.TinkerReport;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public enum d implements ce.q {
    f23608b("BYTE"),
    f23609c("CHAR"),
    f23610d("SHORT"),
    f23611e("INT"),
    f23612f("LONG"),
    f23613g("FLOAT"),
    f23614h("DOUBLE"),
    f23615i("BOOLEAN"),
    f23616j("STRING"),
    f23617k("CLASS"),
    f23618l("ENUM"),
    f23619m("ANNOTATION"),
    f23620n("ARRAY");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23622a;

    d(String str) {
        this.f23622a = i;
    }

    public static d b(int i10) {
        switch (i10) {
            case 0:
                return f23608b;
            case 1:
                return f23609c;
            case 2:
                return f23610d;
            case 3:
                return f23611e;
            case 4:
                return f23612f;
            case 5:
                return f23613g;
            case 6:
                return f23614h;
            case 7:
                return f23615i;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_DALVIK /* 8 */:
                return f23616j;
            case TinkerReport.KEY_CRASH_CAUSE_XPOSED_ART /* 9 */:
                return f23617k;
            case TinkerReport.KEY_APPLY_WITH_RETRY /* 10 */:
                return f23618l;
            case 11:
                return f23619m;
            case 12:
                return f23620n;
            default:
                return null;
        }
    }

    @Override // ce.q
    public final int a() {
        return this.f23622a;
    }
}
