package jd;

import java.util.List;
import java.util.ServiceLoader;
import jc.l;
import vb.m;

/* JADX INFO: loaded from: classes.dex */
public final class i implements ic.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f10841a = new i();

    @Override // ic.a
    public final Object b() {
        j jVar = j.f10842a;
        ServiceLoader serviceLoaderLoad = ServiceLoader.load(k.class, k.class.getClassLoader());
        l.d(serviceLoaderLoad, "load(...)");
        List listG0 = m.G0(serviceLoaderLoad);
        if (listG0.isEmpty()) {
            throw new IllegalStateException("No MetadataExtensions instances found in the classpath. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
        }
        return listG0;
    }
}
