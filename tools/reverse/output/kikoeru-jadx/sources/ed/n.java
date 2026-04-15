package ed;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n extends jc.j implements ic.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f6507i = new n(1, x.class, "<init>", "<init>(Ljava/lang/reflect/Method;)V", 0);

    @Override // ic.k
    public final Object a(Object obj) {
        Method method = (Method) obj;
        jc.l.e(method, "p0");
        return new x(method);
    }
}
