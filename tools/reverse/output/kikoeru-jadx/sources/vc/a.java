package vc;

import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes.dex */
public final class a implements ic.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22825b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f22826c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22827a;

    public /* synthetic */ a(int i10) {
        this.f22827a = i10;
    }

    @Override // ic.a
    public final Object b() {
        switch (this.f22827a) {
            case 0:
                b bVar = b.f22828a;
                ServiceLoader serviceLoaderLoad = ServiceLoader.load(c.class, c.class.getClassLoader());
                jc.l.b(serviceLoaderLoad);
                c cVar = (c) vb.m.Z(serviceLoaderLoad);
                if (cVar != null) {
                    return cVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            default:
                e eVar = new e(new re.l("DefaultBuiltIns"));
                eVar.c();
                return eVar;
        }
    }
}
