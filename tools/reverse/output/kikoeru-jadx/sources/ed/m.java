package ed;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m extends jc.j implements ic.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final m f6506i = new m(1, u.class, "<init>", "<init>(Ljava/lang/reflect/Field;)V", 0);

    @Override // ic.k
    public final Object a(Object obj) {
        Field field = (Field) obj;
        jc.l.e(field, "p0");
        return new u(field);
    }
}
