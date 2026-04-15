package ed;

import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k extends jc.j implements ic.k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f6504i = new k(1, r.class, "<init>", "<init>(Ljava/lang/reflect/Constructor;)V", 0);

    @Override // ic.k
    public final Object a(Object obj) {
        Constructor constructor = (Constructor) obj;
        jc.l.e(constructor, "p0");
        return new r(constructor);
    }
}
