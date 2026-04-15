package yc;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f26108b;

    public e1(String str, boolean z10) {
        this.f26107a = str;
        this.f26108b = z10;
    }

    public Integer a(e1 e1Var) {
        jc.l.e(e1Var, "visibility");
        wb.e eVar = d1.f26104a;
        if (this == e1Var) {
            return 0;
        }
        wb.e eVar2 = d1.f26104a;
        Integer num = (Integer) eVar2.get(this);
        Integer num2 = (Integer) eVar2.get(e1Var);
        if (num == null || num2 == null || num.equals(num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public String b() {
        return this.f26107a;
    }

    public final String toString() {
        return b();
    }

    public e1 c() {
        return this;
    }
}
