package i9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-83e7a383375a75708b939e02cd35029138ed7d2d39ea49fdd06cb269cd70c2ed */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.offline.k f9473a;

    public c(androidx.media3.exoplayer.offline.k kVar) {
        this.f9473a = kVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        androidx.media3.exoplayer.offline.k kVar = this.f9473a;
        try {
            if (objArr == null) {
                if (method != null) {
                    return method.invoke(kVar, null);
                }
            } else if (method != null) {
                return method.invoke(kVar, Arrays.copyOf(objArr, objArr.length));
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
