package pc;

import java.lang.reflect.Type;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a0 extends jc.j implements ic.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a0 f16964i = new a0(1, f0.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // ic.k
    public final Object a(Object obj) {
        Type type = (Type) obj;
        jc.l.e(type, "p0");
        return f0.m(type);
    }
}
