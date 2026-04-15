package e7;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends j0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Class f6325l;

    public f0(Class cls) {
        super(cls, 0);
        if (cls.isEnum()) {
            this.f6325l = cls;
            return;
        }
        throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
    }

    @Override // e7.j0, e7.k0
    public final String b() {
        return this.f6325l.getName();
    }

    @Override // e7.j0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Enum d(String str) {
        Object obj;
        Class cls = this.f6325l;
        Object[] enumConstants = cls.getEnumConstants();
        jc.l.d(enumConstants, "getEnumConstants(...)");
        int length = enumConstants.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                obj = null;
                break;
            }
            obj = enumConstants[i10];
            if (ef.u.d0(((Enum) obj).name(), str, true)) {
                break;
            }
            i10++;
        }
        Enum r42 = (Enum) obj;
        if (r42 != null) {
            return r42;
        }
        StringBuilder sbK = a0.c.K("Enum value ", str, " not found for type ");
        sbK.append(cls.getName());
        sbK.append('.');
        throw new IllegalArgumentException(sbK.toString());
    }
}
